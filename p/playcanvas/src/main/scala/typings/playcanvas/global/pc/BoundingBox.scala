package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new axis-aligned bounding box.
  * @property center - Center of box.
  * @property halfExtents - Half the distance across the box in each axis.
  * @param [center] - Center of box. The constructor takes a reference of this parameter.
  * @param [halfExtents] - Half the distance across the box in each axis. The constructor takes a reference of this parameter.
  */
@JSGlobal("pc.BoundingBox")
@js.native
class BoundingBox ()
  extends typings.playcanvas.pc.BoundingBox {
  def this(center: typings.playcanvas.pc.Vec3) = this()
  def this(center: js.UndefOr[scala.Nothing], halfExtents: typings.playcanvas.pc.Vec3) = this()
  def this(center: typings.playcanvas.pc.Vec3, halfExtents: typings.playcanvas.pc.Vec3) = this()
}
