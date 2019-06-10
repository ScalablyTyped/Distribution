package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This controls the entity's ability to teleport itself (similar to the Enderman). If you wish to teleport the entity once use the Position component instead.
  */
trait ITeleportComponent extends js.Object {
  /**
    * Modifies the chance that the entity will teleport if the entity is in darkness
    * @default 0.01
    */
  var darkTeleportChance: scala.Double
  /**
    * Modifies the chance that the entity will teleport if the entity is in daylight
    * @default 0.01
    */
  var lightTeleportChance: scala.Double
  /**
    * Maximum amount of time in seconds between random teleports
    * @default 20.0
    */
  var maxRandomTeleportTime: scala.Double
  /**
    * Minimum amount of time in seconds between random teleports
    * @default 0.0
    */
  var minRandomTeleportTime: scala.Double
  /**
    * Entity will teleport to a random position within the area defined by this cube
    * @default [32.0, 16.0, 32.0]
    */
  var randomTeleportCube: minecraftDashScriptingDashTypesDashSharedLib.VectorArray
  /**
    * If true, the entity will teleport randomly
    * @default true
    */
  var randomTeleports: scala.Boolean
  /**
    * Maximum distance the entity will teleport when chasing a target
    * @default 16.0
    */
  var targetDistance: scala.Double
  /**
    * The chance that the entity will teleport between 0.0 and 1.0. 1.0 means 100%
    * @default 1.0
    */
  var target_teleport_chance: scala.Double
}

object ITeleportComponent {
  @scala.inline
  def apply(
    darkTeleportChance: scala.Double,
    lightTeleportChance: scala.Double,
    maxRandomTeleportTime: scala.Double,
    minRandomTeleportTime: scala.Double,
    randomTeleportCube: minecraftDashScriptingDashTypesDashSharedLib.VectorArray,
    randomTeleports: scala.Boolean,
    targetDistance: scala.Double,
    target_teleport_chance: scala.Double
  ): ITeleportComponent = {
    val __obj = js.Dynamic.literal(darkTeleportChance = darkTeleportChance, lightTeleportChance = lightTeleportChance, maxRandomTeleportTime = maxRandomTeleportTime, minRandomTeleportTime = minRandomTeleportTime, randomTeleportCube = randomTeleportCube, randomTeleports = randomTeleports, targetDistance = targetDistance, target_teleport_chance = target_teleport_chance)
  
    __obj.asInstanceOf[ITeleportComponent]
  }
}

