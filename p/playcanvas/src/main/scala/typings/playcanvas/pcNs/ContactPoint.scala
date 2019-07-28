package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.ContactPoint
  * @class Object holding the result of a contact between two Entities.
  * @description Create a new ContactPoint
  * @param {pc.Vec3} localPoint The point on the entity where the contact occurred, relative to the entity
  * @param {pc.Vec3} localPointOther The point on the other entity where the contact occurred, relative to the other entity
  * @param {pc.Vec3} point The point on the entity where the contact occurred, in world space
  * @param {pc.Vec3} pointOther The point on the other entity where the contact occurred, in world space
  * @param {pc.Vec3} normal The normal vector of the contact on the other entity, in world space
  * @property {pc.Vec3} localPoint The point on the entity where the contact occurred, relative to the entity
  * @property {pc.Vec3} localPointOther The point on the other entity where the contact occurred, relative to the other entity
  * @property {pc.Vec3} point The point on the entity where the contact occurred, in world space
  * @property {pc.Vec3} pointOther The point on the other entity where the contact occurred, in world space
  * @property {pc.Vec3} normal The normal vector of the contact on the other entity, in world space
  */
@JSGlobal("pc.ContactPoint")
@js.native
class ContactPoint protected () extends js.Object {
  def this(localPoint: Vec3, localPointOther: Vec3, point: Vec3, pointOther: Vec3, normal: Vec3) = this()
  var localPoint: Vec3 = js.native
  var localPointOther: Vec3 = js.native
  var normal: Vec3 = js.native
  var point: Vec3 = js.native
  var pointOther: Vec3 = js.native
}

