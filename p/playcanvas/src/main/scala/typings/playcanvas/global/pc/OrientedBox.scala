package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Oriented Box.
  */
@JSGlobal("pc.OrientedBox")
@js.native
/**
  * Create a new OrientedBox instance.
  *
  * @param {Mat4} [worldTransform] - Transform that has the orientation and position of the box.
  * Scale is assumed to be one.
  * @param {Vec3} [halfExtents] - Half the distance across the box in each local axis. The
  * constructor takes a reference of this parameter.
  */
open class OrientedBox ()
  extends typings.playcanvas.mod.OrientedBox {
  def this(worldTransform: typings.playcanvas.mod.Mat4) = this()
  def this(worldTransform: Unit, halfExtents: typings.playcanvas.mod.Vec3) = this()
  def this(worldTransform: typings.playcanvas.mod.Mat4, halfExtents: typings.playcanvas.mod.Vec3) = this()
}
