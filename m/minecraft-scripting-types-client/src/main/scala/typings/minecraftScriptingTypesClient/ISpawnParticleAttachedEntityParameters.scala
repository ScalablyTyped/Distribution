package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.ParticleEffect
import typings.minecraftScriptingTypesShared.VectorArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to create a particle effect that will follow an entity around. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
  */
trait ISpawnParticleAttachedEntityParameters extends StObject {
  
  /**
    * The identifier of the particle effect you want to attach to the entity. This is the same name you gave the effect in its JSON file
    */
  var effect: ParticleEffect
  
  /**
    * The entity object you want to attach the effect to
    */
  var entity: IEntity
  
  /**
    * The offset from the entity's "center" where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var offset: VectorArray
}
object ISpawnParticleAttachedEntityParameters {
  
  inline def apply(effect: ParticleEffect, entity: IEntity, offset: VectorArray): ISpawnParticleAttachedEntityParameters = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpawnParticleAttachedEntityParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISpawnParticleAttachedEntityParameters] (val x: Self) extends AnyVal {
    
    inline def setEffect(value: ParticleEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: VectorArray): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
