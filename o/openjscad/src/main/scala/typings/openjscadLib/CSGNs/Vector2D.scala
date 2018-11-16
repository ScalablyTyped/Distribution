package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Vector2D")
@js.native
class Vector2D protected ()
  extends openjscadLib.CxG {
  def this(x: js.Array[scala.Double]) = this()
  def this(x: Vector2D) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def abs(): Vector2D = js.native
  def angle(): scala.Double = js.native
  def angleDegrees(): scala.Double = js.native
  def angleRadians(): scala.Double = js.native
  def cross(a: Vector2D): scala.Double = js.native
  def distanceTo(a: Vector2D): scala.Double = js.native
  def distanceToSquared(a: Vector2D): scala.Double = js.native
  def dividedBy(a: scala.Double): Vector2D = js.native
  def dot(a: Vector2D): scala.Double = js.native
  def equals(a: Vector2D): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def lengthSquared(): scala.Double = js.native
  def lerp(a: Vector2D, t: scala.Double): Vector2D = js.native
  def max(p: Vector2D): Vector2D = js.native
  def min(p: Vector2D): Vector2D = js.native
  def minus(a: Vector2D): Vector2D = js.native
  def multiply4x4(matrix4x4: Matrix4x4): Vector2D = js.native
  def negated(): Vector2D = js.native
  def normal(): Vector2D = js.native
  def plus(a: Vector2D): Vector2D = js.native
  def times(a: scala.Double): Vector2D = js.native
  def toVector3D(z: scala.Double): Vector3D = js.native
  def unit(): Vector2D = js.native
}

@JSGlobal("CSG.Vector2D")
@js.native
object Vector2D extends js.Object {
  def Create(x: scala.Double, y: scala.Double): openjscadLib.CSGNs.Vector2D = js.native
  def fromAngle(radians: scala.Double): openjscadLib.CSGNs.Vector2D = js.native
  def fromAngleDegrees(degrees: scala.Double): openjscadLib.CSGNs.Vector2D = js.native
  def fromAngleRadians(radians: scala.Double): openjscadLib.CSGNs.Vector2D = js.native
}

