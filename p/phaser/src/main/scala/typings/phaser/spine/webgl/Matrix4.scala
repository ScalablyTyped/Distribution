package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matrix4 extends js.Object {
  var temp: Float32Array
  var values: Float32Array
  def copy(): Matrix4
  def determinant(): Double
  def identity(): Matrix4
  def invert(): Matrix4
  def lookAt(position: Vector3, direction: Vector3, up: Vector3): this.type
  def multiply(matrix: Matrix4): Matrix4
  def multiplyLeft(matrix: Matrix4): Matrix4
  def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4
  def ortho2d(x: Double, y: Double, width: Double, height: Double): Matrix4
  def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): Matrix4
  def set(values: ArrayLike[Double]): Matrix4
  def translate(x: Double, y: Double, z: Double): Matrix4
  def transpose(): Matrix4
}

object Matrix4 {
  @scala.inline
  def apply(
    copy: () => Matrix4,
    determinant: () => Double,
    identity: () => Matrix4,
    invert: () => Matrix4,
    lookAt: (Vector3, Vector3, Vector3) => Matrix4,
    multiply: Matrix4 => Matrix4,
    multiplyLeft: Matrix4 => Matrix4,
    ortho: (Double, Double, Double, Double, Double, Double) => Matrix4,
    ortho2d: (Double, Double, Double, Double) => Matrix4,
    projection: (Double, Double, Double, Double) => Matrix4,
    set: ArrayLike[Double] => Matrix4,
    temp: Float32Array,
    translate: (Double, Double, Double) => Matrix4,
    transpose: () => Matrix4,
    values: Float32Array
  ): Matrix4 = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), determinant = js.Any.fromFunction0(determinant), identity = js.Any.fromFunction0(identity), invert = js.Any.fromFunction0(invert), lookAt = js.Any.fromFunction3(lookAt), multiply = js.Any.fromFunction1(multiply), multiplyLeft = js.Any.fromFunction1(multiplyLeft), ortho = js.Any.fromFunction6(ortho), ortho2d = js.Any.fromFunction4(ortho2d), projection = js.Any.fromFunction4(projection), set = js.Any.fromFunction1(set), temp = temp.asInstanceOf[js.Any], translate = js.Any.fromFunction3(translate), transpose = js.Any.fromFunction0(transpose), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix4]
  }
}

