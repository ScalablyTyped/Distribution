package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new oriented box.
  * @property [worldTransform] - The world transform of the OBB.
  * @param [worldTransform] - Transform that has the orientation and position of the box. Scale is assumed to be one.
  * @param [halfExtents] - Half the distance across the box in each local axis. The constructor takes a reference of this parameter.
  */
@JSGlobal("pc.OrientedBox")
@js.native
class OrientedBox ()
  extends typings.playcanvas.pc.OrientedBox {
  def this(worldTransform: typings.playcanvas.pc.Mat4) = this()
  def this(worldTransform: js.UndefOr[scala.Nothing], halfExtents: typings.playcanvas.pc.Vec3) = this()
  def this(worldTransform: typings.playcanvas.pc.Mat4, halfExtents: typings.playcanvas.pc.Vec3) = this()
}
