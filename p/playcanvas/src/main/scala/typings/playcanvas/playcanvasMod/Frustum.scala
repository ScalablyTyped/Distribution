package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Frustum
  * @classdesc A frustum is a shape that defines the viewing space of a camera.
  * @description Creates a new frustum shape.
  * @example
  * // Create a new frustum equivalent to one held by a camera component
  * var projectionMatrix = entity.camera.projectionMatrix;
  * var viewMatrix = entity.camera.viewMatrix;
  * var frustum = new pc.Frustum(projectionMatrix, viewMatrix);
  * @param {pc.Mat4} projectionMatrix The projection matrix describing the shape of the frustum.
  * @param {pc.Mat4} viewMatrix The inverse of the world transformation matrix for the frustum.
  */
@JSImport("playcanvas", "Frustum")
@js.native
class Frustum protected ()
  extends typings.playcanvas.pcNs.Frustum {
  def this(projectionMatrix: typings.playcanvas.pcNs.Mat4, viewMatrix: typings.playcanvas.pcNs.Mat4) = this()
}

