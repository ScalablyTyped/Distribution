package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Axis-Aligned Bounding Box.
  */
@JSGlobal("pc.BoundingBox")
@js.native
/**
  * Create a new BoundingBox instance. The bounding box is axis-aligned.
  *
  * @param {Vec3} [center] - Center of box. The constructor takes a reference of this parameter.
  * @param {Vec3} [halfExtents] - Half the distance across the box in each axis. The constructor
  * takes a reference of this parameter. Defaults to 0.5 on each axis.
  */
open class BoundingBox ()
  extends typings.playcanvas.mod.BoundingBox {
  def this(center: typings.playcanvas.mod.Vec3) = this()
  def this(center: Unit, halfExtents: typings.playcanvas.mod.Vec3) = this()
  def this(center: typings.playcanvas.mod.Vec3, halfExtents: typings.playcanvas.mod.Vec3) = this()
}
