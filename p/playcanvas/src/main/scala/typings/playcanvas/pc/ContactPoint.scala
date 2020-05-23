package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new ContactPoint.
  * @property localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @property localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @property point - The point on the entity where the contact occurred, in world space.
  * @property pointOther - The point on the other entity where the contact occurred, in world space.
  * @property normal - The normal vector of the contact on the other entity, in world space.
  * @param localPoint - The point on the entity where the contact occurred, relative to the entity.
  * @param localPointOther - The point on the other entity where the contact occurred, relative to the other entity.
  * @param point - The point on the entity where the contact occurred, in world space.
  * @param pointOther - The point on the other entity where the contact occurred, in world space.
  * @param normal - The normal vector of the contact on the other entity, in world space.
  */
trait ContactPoint extends js.Object {
  /**
    * The point on the entity where the contact occurred, relative to the entity.
    */
  var localPoint: Vec3
  /**
    * The point on the other entity where the contact occurred, relative to the other entity.
    */
  var localPointOther: Vec3
  /**
    * The normal vector of the contact on the other entity, in world space.
    */
  var normal: Vec3
  /**
    * The point on the entity where the contact occurred, in world space.
    */
  var point: Vec3
  /**
    * The point on the other entity where the contact occurred, in world space.
    */
  var pointOther: Vec3
}

object ContactPoint {
  @scala.inline
  def apply(localPoint: Vec3, localPointOther: Vec3, normal: Vec3, point: Vec3, pointOther: Vec3): ContactPoint = {
    val __obj = js.Dynamic.literal(localPoint = localPoint.asInstanceOf[js.Any], localPointOther = localPointOther.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointOther = pointOther.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPoint]
  }
}

