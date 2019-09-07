package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.BoundingBox
  * @description Create a new axis-aligned bounding box.
  * @classdesc Axis-Aligned Bounding Box.
  * @param {pc.Vec3} [center] Center of box. The constructor takes a reference of this parameter.
  * @param {pc.Vec3} [halfExtents] Half the distance across the box in each axis. The constructor takes a reference of this parameter.
  */
@JSImport("playcanvas", "BoundingBox")
@js.native
class BoundingBox ()
  extends typings.playcanvas.pcNs.BoundingBox {
  def this(center: typings.playcanvas.pcNs.Vec3) = this()
  def this(center: typings.playcanvas.pcNs.Vec3, halfExtents: typings.playcanvas.pcNs.Vec3) = this()
}

