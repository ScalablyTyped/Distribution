package typings.minecraftDashScriptingDashTypesDashClient

import typings.minecraftDashScriptingDashTypesDashShared.ParticleEffect
import typings.minecraftDashScriptingDashTypesDashShared.VectorArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to create a static particle effect in the world. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further. Unlike the server version of the event, the client version will spawn the particle in the dimension the player is currently in.
  */
trait ISpawnParticleInWorldParameters extends js.Object {
  /**
    * The identifier of the particle effect you want to attach to spawn. This is the same name you gave the effect in its JSON file
    */
  var effect: ParticleEffect
  /**
    * The position in the world where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var position: VectorArray
}

object ISpawnParticleInWorldParameters {
  @scala.inline
  def apply(effect: ParticleEffect, position: VectorArray): ISpawnParticleInWorldParameters = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpawnParticleInWorldParameters]
  }
}

