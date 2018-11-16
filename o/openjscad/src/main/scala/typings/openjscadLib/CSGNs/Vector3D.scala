package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Vector3D")
@js.native
class Vector3D protected ()
  extends openjscadLib.CxG {
  def this(v2: js.Array[scala.Double]) = this()
  def this(v2: Vector2D) = this()
  def this(v3: Vector3D) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  def abs(): Vector3D = js.native
  def cross(a: Vector3D): Vector3D = js.native
  def distanceTo(a: Vector3D): scala.Double = js.native
  def distanceToSquared(a: Vector3D): scala.Double = js.native
  def dividedBy(a: scala.Double): Vector3D = js.native
  def dot(a: Vector3D): scala.Double = js.native
  def equals(a: Vector3D): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def lengthSquared(): scala.Double = js.native
  def lerp(a: Vector3D, t: scala.Double): Vector3D = js.native
  def max(p: Vector3D): Vector3D = js.native
  def min(p: Vector3D): Vector3D = js.native
  def minus(a: Vector3D): Vector3D = js.native
  def multiply4x4(matrix4x4: Matrix4x4): Vector3D = js.native
  def negated(): Vector3D = js.native
  def plus(a: Vector3D): Vector3D = js.native
  def randomNonParallelVector(): Vector3D = js.native
  def times(a: scala.Double): Vector3D = js.native
  def unit(): Vector3D = js.native
}

@JSGlobal("CSG.Vector3D")
@js.native
object Vector3D extends js.Object {
  def Create(x: scala.Double, y: scala.Double, z: scala.Double): openjscadLib.CSGNs.Vector3D = js.native
}

