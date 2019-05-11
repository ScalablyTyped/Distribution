package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component to apply force to Matter.js bodies.
  */
trait Force extends js.Object {
  /**
    * Applies a force to a body.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForce(force: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * Applies a force to a body from a given position.
    * @param position The position in which the force comes from.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForceFrom(position: phaserLib.PhaserNs.MathNs.Vector2, force: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * Apply thrust to the forward position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrust(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * Apply thrust to the back position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustBack(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * Apply thrust to the left position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustLeft(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
  /**
    * Apply thrust to the right position of the body.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustRight(speed: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Force {
  @scala.inline
  def apply(
    applyForce: phaserLib.PhaserNs.MathNs.Vector2 => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    applyForceFrom: (phaserLib.PhaserNs.MathNs.Vector2, phaserLib.PhaserNs.MathNs.Vector2) => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    thrust: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    thrustBack: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    thrustLeft: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject,
    thrustRight: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): Force = {
    val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction1(applyForce), applyForceFrom = js.Any.fromFunction2(applyForceFrom), thrust = js.Any.fromFunction1(thrust), thrustBack = js.Any.fromFunction1(thrustBack), thrustLeft = js.Any.fromFunction1(thrustLeft), thrustRight = js.Any.fromFunction1(thrustRight))
  
    __obj.asInstanceOf[Force]
  }
}

