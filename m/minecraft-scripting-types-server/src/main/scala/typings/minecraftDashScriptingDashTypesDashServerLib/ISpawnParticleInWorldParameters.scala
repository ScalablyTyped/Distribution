package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
  */
trait ISpawnParticleInWorldParameters extends js.Object {
  /**
    * The dimension in which you want to spawn the effect. Can be "overworld", "nether", or "the end"
    * @default overworld
    */
  var dimension: java.lang.String
  /**
    * The identifier of the particle effect you want to attach to spawn. This is the same name you gave the effect in its JSON file
    */
  var effect: minecraftDashScriptingDashTypesDashSharedLib.ParticleEffect
  /**
    * The position in the world where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var position: minecraftDashScriptingDashTypesDashSharedLib.VectorArray
}

object ISpawnParticleInWorldParameters {
  @scala.inline
  def apply(
    dimension: java.lang.String,
    effect: minecraftDashScriptingDashTypesDashSharedLib.ParticleEffect,
    position: minecraftDashScriptingDashTypesDashSharedLib.VectorArray
  ): ISpawnParticleInWorldParameters = {
    val __obj = js.Dynamic.literal(dimension = dimension, effect = effect.asInstanceOf[js.Any], position = position)
  
    __obj.asInstanceOf[ISpawnParticleInWorldParameters]
  }
}

