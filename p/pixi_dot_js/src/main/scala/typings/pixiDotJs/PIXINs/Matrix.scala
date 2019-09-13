package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The PixiJS Matrix class as an object, which makes it a lot faster,
  * here is a representation of it :
  * | a | c | tx|
  * | b | d | ty|
  * | 0 | 0 | 1 |
  */
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
  /**
    * Get a new position with the current transformation applied.
    * Can be used to go from a child"s coordinate space to the world coordinate space. (e.g. rendering)
    *
    * @param pos - The origin
    * @param [newPos] - The point that the new position is assigned to (allowed to be same as input)
    * @return The new point, transformed through this matrix
    */
  @JSName("apply")
  def apply(pos: Point): Point = js.native
  @JSName("apply")
  def apply(pos: Point, newPos: Point): Point = js.native
  def applyInverse(pos: Point): Point = js.native
  def applyInverse(pos: Point, newPos: Point): Point = js.native
  def copy(matrix: Matrix): Matrix = js.native
  def decompose(transform: TransformBase): TransformBase = js.native
  /**
    * Creates a Matrix object based on the given array. The Element to Matrix mapping order is as follows:
    *
    * a = array[0]
    * b = array[1]
    * c = array[3]
    * d = array[4]
    * tx = array[2]
    * ty = array[5]
    *
    * @param {number[]} array - The array that the matrix will be populated from.
    */
  def fromArray(array: js.Array[Double]): Unit = js.native
  def identity(): Matrix = js.native
  def invert(): Matrix = js.native
  def prepend(matrix: Matrix): Matrix = js.native
  def rotate(angle: Double): Matrix = js.native
  def scale(x: Double, y: Double): Matrix = js.native
  /**
    * sets the matrix properties
    *
    * @param a - Matrix component
    * @param b - Matrix component
    * @param c - Matrix component
    * @param d - Matrix component
    * @param tx - Matrix component
    * @param ty - Matrix component
    *
    * @return This matrix. Good for chaining method calls.
    */
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
  /**
    * Creates an array from the current Matrix object.
    *
    * @param transpose - Whether we need to transpose the matrix or not
    * @param [out=new Float32Array(9)] - If provided the array will be assigned to out
    * @return the newly created array which contains the matrix
    */
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

