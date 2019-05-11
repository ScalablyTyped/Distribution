package typings
package phaserLib.PhaserNs.PhysicsNs.MatterNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component to set restitution on objects.
  */
trait Bounce extends js.Object {
  /**
    * Sets the restitution on the physics object.
    * @param value A Number that defines the restitution (elasticity) of the body. The value is always positive and is in the range (0, 1). A value of 0 means collisions may be perfectly inelastic and no bouncing may occur. A value of 0.8 means the body may bounce back with approximately 80% of its kinetic energy. Note that collision response is based on pairs of bodies, and that restitution values are combined with the following formula: `Math.max(bodyA.restitution, bodyB.restitution)`
    */
  def setBounce(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject
}

object Bounce {
  @scala.inline
  def apply(setBounce: scala.Double => phaserLib.PhaserNs.GameObjectsNs.GameObject): Bounce = {
    val __obj = js.Dynamic.literal(setBounce = js.Any.fromFunction1(setBounce))
  
    __obj.asInstanceOf[Bounce]
  }
}

