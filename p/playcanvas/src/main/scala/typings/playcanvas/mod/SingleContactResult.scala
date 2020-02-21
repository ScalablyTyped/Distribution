package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SingleContactResult
  * @classdesc Object holding the result of a contact between two rigid bodies.
  * @description Create a new SingleContactResult.
  * @param {pc.Entity} a - The first entity involved in the contact.
  * @param {pc.Entity} b - The second entity involved in the contact.
  * @param {pc.ContactPoint} contactPoint - The contact point between the two entities.
  * @property {pc.Entity} a The first entity involved in the contact.
  * @property {pc.Entity} b The second entity involved in the contact.
  * @property {pc.Vec3} localPointA The point on Entity A where the contact occurred, relative to A.
  * @property {pc.Vec3} localPointB The point on Entity B where the contact occurred, relative to B.
  * @property {pc.Vec3} pointA The point on Entity A where the contact occurred, in world space.
  * @property {pc.Vec3} pointB The point on Entity B where the contact occurred, in world space.
  * @property {pc.Vec3} normal The normal vector of the contact on Entity B, in world space.
  */
@JSImport("playcanvas", "SingleContactResult")
@js.native
class SingleContactResult protected ()
  extends typings.playcanvas.pc.SingleContactResult {
  def this(
    a: typings.playcanvas.pc.Entity,
    b: typings.playcanvas.pc.Entity,
    contactPoint: typings.playcanvas.pc.ContactPoint
  ) = this()
}

