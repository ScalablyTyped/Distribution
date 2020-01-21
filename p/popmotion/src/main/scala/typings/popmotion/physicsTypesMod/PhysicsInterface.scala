package typings.popmotion.physicsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsInterface extends js.Object {
  def set(v: Double): PhysicsInterface
  def setAcceleration(v: Double): PhysicsInterface
  def setFriction(v: Double): PhysicsInterface
  def setSpringStrength(v: Double): PhysicsInterface
  def setSpringTarget(v: Double): PhysicsInterface
  def setVelocity(v: Double): PhysicsInterface
  def stop(): Unit
}

object PhysicsInterface {
  @scala.inline
  def apply(
    set: Double => PhysicsInterface,
    setAcceleration: Double => PhysicsInterface,
    setFriction: Double => PhysicsInterface,
    setSpringStrength: Double => PhysicsInterface,
    setSpringTarget: Double => PhysicsInterface,
    setVelocity: Double => PhysicsInterface,
    stop: () => Unit
  ): PhysicsInterface = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), setAcceleration = js.Any.fromFunction1(setAcceleration), setFriction = js.Any.fromFunction1(setFriction), setSpringStrength = js.Any.fromFunction1(setSpringStrength), setSpringTarget = js.Any.fromFunction1(setSpringTarget), setVelocity = js.Any.fromFunction1(setVelocity), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[PhysicsInterface]
  }
}

