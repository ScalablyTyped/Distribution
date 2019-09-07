package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.RaycastResult
  * @classdesc Object holding the result of a successful raycast hit
  * @description Create a new RaycastResult
  * @param {pc.Entity} entity The entity that was hit
  * @param {pc.Vec3} point The point at which the ray hit the entity in world space
  * @param {pc.Vec3} normal The normal vector of the surface where the ray hit in world space.
  * @property {pc.Entity} entity The entity that was hit
  * @property {pc.Vec3} point The point at which the ray hit the entity in world space
  * @property {pc.Vec3} normal The normal vector of the surface where the ray hit in world space.
  */
@JSGlobal("pc.RaycastResult")
@js.native
class RaycastResult protected () extends js.Object {
  def this(entity: Entity, point: Vec3, normal: Vec3) = this()
  /**
    * The entity that was hit
    */
  var entity: Entity = js.native
  /**
    * The normal vector of the surface where the ray hit in world space.
    */
  var normal: Vec3 = js.native
  /**
    * The point at which the ray hit the entity in world space
    */
  var point: Vec3 = js.native
}

