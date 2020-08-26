package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix4 extends js.Object {
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
  @scala.inline
  implicit class Matrix4Ops[Self <: Matrix4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCopy(value: () => Matrix4): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setDeterminant(value: () => Double): Self = this.set("determinant", js.Any.fromFunction0(value))
    @scala.inline
    def setIdentity(value: () => Matrix4): Self = this.set("identity", js.Any.fromFunction0(value))
    @scala.inline
    def setInvert(value: () => Matrix4): Self = this.set("invert", js.Any.fromFunction0(value))
    @scala.inline
    def setLookAt(value: (Vector3, Vector3, Vector3) => Matrix4): Self = this.set("lookAt", js.Any.fromFunction3(value))
    @scala.inline
    def setMultiply(value: Matrix4 => Matrix4): Self = this.set("multiply", js.Any.fromFunction1(value))
    @scala.inline
    def setMultiplyLeft(value: Matrix4 => Matrix4): Self = this.set("multiplyLeft", js.Any.fromFunction1(value))
    @scala.inline
    def setOrtho(value: (Double, Double, Double, Double, Double, Double) => Matrix4): Self = this.set("ortho", js.Any.fromFunction6(value))
    @scala.inline
    def setOrtho2d(value: (Double, Double, Double, Double) => Matrix4): Self = this.set("ortho2d", js.Any.fromFunction4(value))
    @scala.inline
    def setProjection(value: (Double, Double, Double, Double) => Matrix4): Self = this.set("projection", js.Any.fromFunction4(value))
    @scala.inline
    def setSet(value: ArrayLike[Double] => Matrix4): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setTemp(value: Float32Array): Self = this.set("temp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslate(value: (Double, Double, Double) => Matrix4): Self = this.set("translate", js.Any.fromFunction3(value))
    @scala.inline
    def setTranspose(value: () => Matrix4): Self = this.set("transpose", js.Any.fromFunction0(value))
    @scala.inline
    def setValues(value: Float32Array): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

