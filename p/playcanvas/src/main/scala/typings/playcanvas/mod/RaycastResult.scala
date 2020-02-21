package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.RaycastResult
  * @classdesc Object holding the result of a successful raycast hit.
  * @description Create a new RaycastResult.
  * @param {pc.Entity} entity - The entity that was hit.
  * @param {pc.Vec3} point - The point at which the ray hit the entity in world space.
  * @param {pc.Vec3} normal - The normal vector of the surface where the ray hit in world space.
  * @property {pc.Entity} entity The entity that was hit.
  * @property {pc.Vec3} point The point at which the ray hit the entity in world space.
  * @property {pc.Vec3} normal The normal vector of the surface where the ray hit in world space.
  */
@JSImport("playcanvas", "RaycastResult")
@js.native
class RaycastResult protected ()
  extends typings.playcanvas.pc.RaycastResult {
  def this(
    entity: typings.playcanvas.pc.Entity,
    point: typings.playcanvas.pc.Vec3,
    normal: typings.playcanvas.pc.Vec3
  ) = this()
}

