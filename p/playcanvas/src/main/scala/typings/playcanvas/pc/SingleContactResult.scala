package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SingleContactResult
  * @classdesc Object holding the result of a contact between two rigid bodies
  * @description Create a new SingleContactResult
  * @param {pc.Entity} a The first entity involved in the contact
  * @param {pc.Entity} b The second entity involved in the contact
  * @param {pc.ContactPoint} contactPoint The contact point between the two entities
  * @property {pc.Entity} a The first entity involved in the contact
  * @property {pc.Entity} b The second entity involved in the contact
  * @property {pc.Vec3} localPointA The point on Entity A where the contact occurred, relative to A
  * @property {pc.Vec3} localPointB The point on Entity B where the contact occurred, relative to B
  * @property {pc.Vec3} pointA The point on Entity A where the contact occurred, in world space
  * @property {pc.Vec3} pointB The point on Entity B where the contact occurred, in world space
  * @property {pc.Vec3} normal The normal vector of the contact on Entity B, in world space
  */
@JSGlobal("pc.SingleContactResult")
@js.native
class SingleContactResult protected () extends js.Object {
  def this(a: Entity, b: Entity, contactPoint: ContactPoint) = this()
  /**
    * The first entity involved in the contact
    */
  var a: Entity = js.native
  /**
    * The second entity involved in the contact
    */
  var b: Entity = js.native
  /**
    * The point on Entity A where the contact occurred, relative to A
    */
  var localPointA: Vec3 = js.native
  /**
    * The point on Entity B where the contact occurred, relative to B
    */
  var localPointB: Vec3 = js.native
  /**
    * The normal vector of the contact on Entity B, in world space
    */
  var normal: Vec3 = js.native
  /**
    * The point on Entity A where the contact occurred, in world space
    */
  var pointA: Vec3 = js.native
  /**
    * The point on Entity B where the contact occurred, in world space
    */
  var pointB: Vec3 = js.native
}

