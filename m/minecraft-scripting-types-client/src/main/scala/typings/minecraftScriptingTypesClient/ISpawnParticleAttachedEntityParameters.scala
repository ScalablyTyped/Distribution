package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.ParticleEffect
import typings.minecraftScriptingTypesShared.VectorArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to create a particle effect that will follow an entity around. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
  */
@js.native
trait ISpawnParticleAttachedEntityParameters extends js.Object {
  
  /**
    * The identifier of the particle effect you want to attach to the entity. This is the same name you gave the effect in its JSON file
    */
  var effect: ParticleEffect = js.native
  
  /**
    * The entity object you want to attach the effect to
    */
  var entity: IEntity = js.native
  
  /**
    * The offset from the entity's "center" where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var offset: VectorArray = js.native
}
object ISpawnParticleAttachedEntityParameters {
  
  @scala.inline
  def apply(effect: ParticleEffect, entity: IEntity, offset: VectorArray): ISpawnParticleAttachedEntityParameters = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpawnParticleAttachedEntityParameters]
  }
  
  @scala.inline
  implicit class ISpawnParticleAttachedEntityParametersOps[Self <: ISpawnParticleAttachedEntityParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEffect(value: ParticleEffect): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: IEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: VectorArray): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
}
