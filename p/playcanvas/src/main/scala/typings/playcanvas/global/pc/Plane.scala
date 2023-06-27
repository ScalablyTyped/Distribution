package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An infinite plane. Internally it's represented in a parametric equation form:
  * ax + by + cz + distance = 0.
  */
@JSGlobal("pc.Plane")
@js.native
/**
  * Create a new Plane instance.
  *
  * @param {Vec3} [normal] - Normal of the plane. The constructor copies this parameter. Defaults
  * to {@link Vec3.UP}.
  * @param {number} [distance] - The distance from the plane to the origin, along its normal.
  * Defaults to 0.
  */
open class Plane ()
  extends typings.playcanvas.mod.Plane {
  def this(normal: typings.playcanvas.mod.Vec3) = this()
  def this(normal: Unit, distance: Double) = this()
  def this(normal: typings.playcanvas.mod.Vec3, distance: Double) = this()
}
