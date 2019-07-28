package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Matrix")
@js.native
class Matrix protected () extends js.Object {
  def this(
    a: js.UndefOr[Double],
    b: js.UndefOr[Double],
    c: js.UndefOr[Double],
    d: js.UndefOr[Double],
    tx: js.UndefOr[Double],
    ty: js.UndefOr[Double]
  ) = this()
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native
  def append(matrix: Matrix): Matrix = js.native
  @JSName("apply")
  def apply(pos: Point): Point = js.native
  @JSName("apply")
  def apply(pos: Point, newPos: Point): Point = js.native
  def applyInverse(pos: Point): Point = js.native
  def applyInverse(pos: Point, newPos: Point): Point = js.native
  def copy(matrix: Matrix): Matrix = js.native
  def decompose(transform: TransformBase): TransformBase = js.native
  def fromArray(array: js.Array[Double]): Unit = js.native
  def identity(): Matrix = js.native
  def invert(): Matrix = js.native
  def prepend(matrix: Matrix): Matrix = js.native
  def rotate(angle: Double): Matrix = js.native
  def scale(x: Double, y: Double): Matrix = js.native
  def set(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix = js.native
  def setTransform(
    x: Double,
    y: Double,
    pivotX: Double,
    pivotY: Double,
    scaleX: Double,
    scaleY: Double,
    rotation: Double,
    skewX: Double,
    skewY: Double
  ): Matrix = js.native
  def toArray(): js.Array[Double] = js.native
  def toArray(transpose: Boolean): js.Array[Double] = js.native
  def toArray(transpose: Boolean, out: js.Array[Double]): js.Array[Double] = js.native
  def translate(x: Double, y: Double): Matrix = js.native
}

/* static members */
@JSGlobal("PIXI.Matrix")
@js.native
object Matrix extends js.Object {
  var IDENTITY: Matrix = js.native
  var TEMP_MATRIX: Matrix = js.native
}

