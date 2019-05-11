package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows accessing the mass, density, and center of mass of a Matter-enabled Game Object. Should be used as a mixin and not directly.
  */
trait Mass extends js.Object {
  /**
    * The body's center of mass.
    */
  val centerOfMass: phaserLib.PhaserNs.MathNs.Vector2
  /**
    * Sets density of the body.
    * @param value The new density of the body.
    */
  def setDensity(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * Sets the mass of the Game Object's Matter Body.
    * @param value The new mass of the body.
    */
  def setMass(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Mass {
  @scala.inline
  def apply(
    centerOfMass: phaserLib.PhaserNs.MathNs.Vector2,
    setDensity: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    setMass: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Mass = {
    val __obj = js.Dynamic.literal(centerOfMass = centerOfMass, setDensity = js.Any.fromFunction1(setDensity), setMass = js.Any.fromFunction1(setMass))
  
    __obj.asInstanceOf[Mass]
  }
}

