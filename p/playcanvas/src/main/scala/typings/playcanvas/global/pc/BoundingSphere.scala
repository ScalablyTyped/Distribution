package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding sphere is a volume for facilitating fast intersection testing.
  */
@JSGlobal("pc.BoundingSphere")
@js.native
/**
  * Creates a new BoundingSphere instance.
  *
  * @param {Vec3} [center] - The world space coordinate marking the center of the sphere. The
  * constructor takes a reference of this parameter.
  * @param {number} [radius] - The radius of the bounding sphere. Defaults to 0.5.
  * @example
  * // Create a new bounding sphere centered on the origin with a radius of 0.5
  * var sphere = new pc.BoundingSphere();
  */
open class BoundingSphere ()
  extends typings.playcanvas.mod.BoundingSphere {
  def this(center: typings.playcanvas.mod.Vec3) = this()
  def this(center: Unit, radius: Double) = this()
  def this(center: typings.playcanvas.mod.Vec3, radius: Double) = this()
}
