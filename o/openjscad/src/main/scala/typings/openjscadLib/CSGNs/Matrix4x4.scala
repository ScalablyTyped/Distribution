package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Matrix4x4")
@js.native
class Matrix4x4 () extends js.Object {
  def this(elements: js.Array[scala.Double]) = this()
  var elements: js.Array[scala.Double] = js.native
  def isMirroring(): scala.Boolean = js.native
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
  def mirroring(plane: openjscadLib.CSGNs.Plane): openjscadLib.CSGNs.Matrix4x4 = js.native
  def rotation(
    rotationCenter: openjscadLib.CSGNs.Vector3D,
    rotationAxis: openjscadLib.CSGNs.Vector3D,
    degrees: scala.Double
  ): openjscadLib.CSGNs.Matrix4x4 = js.native
  def rotationX(degrees: scala.Double): openjscadLib.CSGNs.Matrix4x4 = js.native
  def rotationY(degrees: scala.Double): openjscadLib.CSGNs.Matrix4x4 = js.native
  def rotationZ(degrees: scala.Double): openjscadLib.CSGNs.Matrix4x4 = js.native
  def scaling(v: js.Array[scala.Double]): openjscadLib.CSGNs.Matrix4x4 = js.native
  def scaling(v: openjscadLib.CSGNs.Vector3D): openjscadLib.CSGNs.Matrix4x4 = js.native
  def translation(v: js.Array[scala.Double]): openjscadLib.CSGNs.Matrix4x4 = js.native
  def translation(v: openjscadLib.CSGNs.Vector3D): openjscadLib.CSGNs.Matrix4x4 = js.native
  def unity(): openjscadLib.CSGNs.Matrix4x4 = js.native
}

