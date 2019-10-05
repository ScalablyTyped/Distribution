package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Matrix4x4")
@js.native
class Matrix4x4 () extends js.Object {
  def this(elements: js.Array[Double]) = this()
  var elements: js.Array[Double] = js.native
  def isMirroring(): Boolean = js.native
  def leftMultiply1x2Vector(v: Vector2D): Vector2D = js.native
  def leftMultiply1x3Vector(v: Vector3D): Vector3D = js.native
  def minus(m: Matrix4x4): Matrix4x4 = js.native
  def multiply(m: Matrix4x4): Matrix4x4 = js.native
  def plus(m: Matrix4x4): Matrix4x4 = js.native
  def rightMultiply1x2Vector(v: Vector2D): Vector2D = js.native
  def rightMultiply1x3Vector(v: Vector3D): Vector3D = js.native
}

/* static members */
@JSGlobal("CSG.Matrix4x4")
@js.native
object Matrix4x4 extends js.Object {
  def mirroring(plane: Plane): Matrix4x4 = js.native
  def rotation(rotationCenter: Vector3D, rotationAxis: Vector3D, degrees: Double): Matrix4x4 = js.native
  def rotationX(degrees: Double): Matrix4x4 = js.native
  def rotationY(degrees: Double): Matrix4x4 = js.native
  def rotationZ(degrees: Double): Matrix4x4 = js.native
  def scaling(v: js.Array[Double]): Matrix4x4 = js.native
  def scaling(v: Vector3D): Matrix4x4 = js.native
  def translation(v: js.Array[Double]): Matrix4x4 = js.native
  def translation(v: Vector3D): Matrix4x4 = js.native
  def unity(): Matrix4x4 = js.native
}

