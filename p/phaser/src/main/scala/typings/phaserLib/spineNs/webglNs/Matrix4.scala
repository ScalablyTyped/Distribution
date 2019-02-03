package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Matrix4")
@js.native
class Matrix4 () extends js.Object {
  var temp: stdLib.Float32Array = js.native
  var values: stdLib.Float32Array = js.native
  def copy(): Matrix4 = js.native
  def determinant(): scala.Double = js.native
  def identity(): Matrix4 = js.native
  def invert(): Matrix4 = js.native
  def lookAt(position: Vector3, direction: Vector3, up: Vector3): this.type = js.native
  def multiply(matrix: Matrix4): Matrix4 = js.native
  def multiplyLeft(matrix: Matrix4): Matrix4 = js.native
  def ortho(
    left: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    top: scala.Double,
    near: scala.Double,
    far: scala.Double
  ): Matrix4 = js.native
  def ortho2d(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Matrix4 = js.native
  def projection(near: scala.Double, far: scala.Double, fovy: scala.Double, aspectRatio: scala.Double): Matrix4 = js.native
  def set(values: phaserLib.spineNs.ArrayLike[scala.Double]): Matrix4 = js.native
  def translate(x: scala.Double, y: scala.Double, z: scala.Double): Matrix4 = js.native
  def transpose(): Matrix4 = js.native
}

/* static members */
@JSGlobal("spine.webgl.Matrix4")
@js.native
object Matrix4 extends js.Object {
  var tmpMatrix: js.Any = js.native
  var xAxis: js.Any = js.native
  var yAxis: js.Any = js.native
  var zAxis: js.Any = js.native
  def initTemps(): scala.Unit = js.native
}

