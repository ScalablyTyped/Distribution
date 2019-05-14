package typings
package popmotionLib.libAnimationsPhysicsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsInterface extends js.Object {
  def set(v: scala.Double): PhysicsInterface
  def setAcceleration(v: scala.Double): PhysicsInterface
  def setFriction(v: scala.Double): PhysicsInterface
  def setSpringStrength(v: scala.Double): PhysicsInterface
  def setSpringTarget(v: scala.Double): PhysicsInterface
  def setVelocity(v: scala.Double): PhysicsInterface
  def stop(): scala.Unit
}

object PhysicsInterface {
  @scala.inline
  def apply(
    set: scala.Double => PhysicsInterface,
    setAcceleration: scala.Double => PhysicsInterface,
    setFriction: scala.Double => PhysicsInterface,
    setSpringStrength: scala.Double => PhysicsInterface,
    setSpringTarget: scala.Double => PhysicsInterface,
    setVelocity: scala.Double => PhysicsInterface,
    stop: () => scala.Unit
  ): PhysicsInterface = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), setAcceleration = js.Any.fromFunction1(setAcceleration), setFriction = js.Any.fromFunction1(setFriction), setSpringStrength = js.Any.fromFunction1(setSpringStrength), setSpringTarget = js.Any.fromFunction1(setSpringTarget), setVelocity = js.Any.fromFunction1(setVelocity), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[PhysicsInterface]
  }
}

