package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.ParticleEffect
import typings.minecraftScriptingTypesShared.VectorArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to create a static particle effect in the world. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further. Unlike the server version of the event, the client version will spawn the particle in the dimension the player is currently in.
  */
@js.native
trait ISpawnParticleInWorldParameters extends StObject {
  
  /**
    * The identifier of the particle effect you want to attach to spawn. This is the same name you gave the effect in its JSON file
    */
  var effect: ParticleEffect = js.native
  
  /**
    * The position in the world where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var position: VectorArray = js.native
}
object ISpawnParticleInWorldParameters {
  
  @scala.inline
  def apply(effect: ParticleEffect, position: VectorArray): ISpawnParticleInWorldParameters = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpawnParticleInWorldParameters]
  }
  
  @scala.inline
  implicit class ISpawnParticleInWorldParametersMutableBuilder[Self <: ISpawnParticleInWorldParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: ParticleEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: VectorArray): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
