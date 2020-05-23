package typings.phaser.global.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.Matrix4")
@js.native
class Matrix4 ()
  extends typings.phaser.spine.webgl.Matrix4 {
  /* CompleteClass */
  override var temp: Float32Array = js.native
  /* CompleteClass */
  override var values: Float32Array = js.native
  /* CompleteClass */
  override def copy(): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def determinant(): Double = js.native
  /* CompleteClass */
  override def identity(): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def invert(): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def lookAt(
    position: typings.phaser.spine.webgl.Vector3,
    direction: typings.phaser.spine.webgl.Vector3,
    up: typings.phaser.spine.webgl.Vector3
  ): this.type = js.native
  /* CompleteClass */
  override def multiply(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def multiplyLeft(matrix: typings.phaser.spine.webgl.Matrix4): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def ortho2d(x: Double, y: Double, width: Double, height: Double): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def set(values: ArrayLike[Double]): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def translate(x: Double, y: Double, z: Double): typings.phaser.spine.webgl.Matrix4 = js.native
  /* CompleteClass */
  override def transpose(): typings.phaser.spine.webgl.Matrix4 = js.native
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

