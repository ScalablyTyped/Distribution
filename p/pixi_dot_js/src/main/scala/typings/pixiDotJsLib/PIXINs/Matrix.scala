package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Matrix")
@js.native
class Matrix protected () extends js.Object {
  def this(a: js.UndefOr[scala.Double], b: js.UndefOr[scala.Double], c: js.UndefOr[scala.Double], d: js.UndefOr[scala.Double], tx: js.UndefOr[scala.Double], ty: js.UndefOr[scala.Double]) = this()
  var a: scala.Double = js.native
  var b: scala.Double = js.native
  var c: scala.Double = js.native
  var d: scala.Double = js.native
  var tx: scala.Double = js.native
  var ty: scala.Double = js.native
  def append(matrix: Matrix): Matrix = js.native
  @JSName("apply")
  def apply(pos: Point): Point = js.native
  @JSName("apply")
  def apply(pos: Point, newPos: Point): Point = js.native
  def applyInverse(pos: Point): Point = js.native
  def applyInverse(pos: Point, newPos: Point): Point = js.native
  def copy(matrix: Matrix): Matrix = js.native
  def decompose(transform: TransformBase): TransformBase = js.native
  def fromArray(array: js.Array[scala.Double]): scala.Unit = js.native
  def identity(): Matrix = js.native
  def invert(): Matrix = js.native
  def prepend(matrix: Matrix): Matrix = js.native
  def rotate(angle: scala.Double): Matrix = js.native
  def scale(x: scala.Double, y: scala.Double): Matrix = js.native
  def set(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    tx: scala.Double,
    ty: scala.Double
  ): Matrix = js.native
  def setTransform(
    x: scala.Double,
    y: scala.Double,
    pivotX: scala.Double,
    pivotY: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    rotation: scala.Double,
    skewX: scala.Double,
    skewY: scala.Double
  ): Matrix = js.native
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(transpose: scala.Boolean): js.Array[scala.Double] = js.native
  def toArray(transpose: scala.Boolean, out: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def translate(x: scala.Double, y: scala.Double): Matrix = js.native
}

/* static members */
@JSGlobal("PIXI.Matrix")
@js.native
object Matrix extends js.Object {
  var IDENTITY: pixiDotJsLib.PIXINs.Matrix = js.native
  var TEMP_MATRIX: pixiDotJsLib.PIXINs.Matrix = js.native
}

