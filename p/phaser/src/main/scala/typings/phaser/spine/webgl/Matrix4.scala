package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Matrix4")
@js.native
class Matrix4 () extends js.Object {
  var temp: Float32Array = js.native
  var values: Float32Array = js.native
  def copy(): Matrix4 = js.native
  def determinant(): Double = js.native
  def identity(): Matrix4 = js.native
  def invert(): Matrix4 = js.native
  def lookAt(position: Vector3, direction: Vector3, up: Vector3): this.type = js.native
  def multiply(matrix: Matrix4): Matrix4 = js.native
  def multiplyLeft(matrix: Matrix4): Matrix4 = js.native
  def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  def ortho2d(x: Double, y: Double, width: Double, height: Double): Matrix4 = js.native
  def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): Matrix4 = js.native
  def set(values: ArrayLike[Double]): Matrix4 = js.native
  def translate(x: Double, y: Double, z: Double): Matrix4 = js.native
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
  def initTemps(): Unit = js.native
}

