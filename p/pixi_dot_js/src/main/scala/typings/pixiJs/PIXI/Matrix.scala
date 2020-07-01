package typings.pixiJs.PIXI

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The PixiJS Matrix as a class makes it a lot faster.
  *
  * Here is a representation of it:
  * ```js
  * | a | c | tx|
  * | b | d | ty|
  * | 0 | 0 | 1 |
  * ```
  * @class
  * @memberof PIXI
  */
@js.native
trait Matrix extends js.Object {
  /**
    * @member {number} PIXI.Matrix#a
    * @default 1
    */
  var a: Double = js.native
  /**
    * @member {number} PIXI.Matrix#b
    * @default 0
    */
  var b: Double = js.native
  /**
    * @member {number} PIXI.Matrix#c
    * @default 0
    */
  var c: Double = js.native
  /**
    * @member {number} PIXI.Matrix#d
    * @default 1
    */
  var d: Double = js.native
  /**
    * @member {number} PIXI.Matrix#tx
    * @default 0
    */
  var tx: Double = js.native
  /**
    * @member {number} PIXI.Matrix#ty
    * @default 0
    */
  var ty: Double = js.native
  /**
    * Appends the given Matrix to this Matrix.
    *
    * @param {PIXI.Matrix} matrix - The matrix to append.
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def append(matrix: Matrix): Matrix = js.native
  /**
    * Get a new position with the current transformation applied.
    * Can be used to go from a child's coordinate space to the world coordinate space. (e.g. rendering)
    *
    * @param {PIXI.IPointData} pos - The origin
    * @param {PIXI.Point} [newPos] - The point that the new position is assigned to (allowed to be same as input)
    * @return {PIXI.Point} The new point, transformed through this matrix
    */
  @JSName("apply")
  def apply(pos: IPointData): Point = js.native
  @JSName("apply")
  def apply(pos: IPointData, newPos: Point): Point = js.native
  /**
    * Get a new position with the inverse of the current transformation applied.
    * Can be used to go from the world coordinate space to a child's coordinate space. (e.g. input)
    *
    * @param {PIXI.IPointData} pos - The origin
    * @param {PIXI.Point} [newPos] - The point that the new position is assigned to (allowed to be same as input)
    * @return {PIXI.Point} The new point, inverse-transformed through this matrix
    */
  def applyInverse(pos: IPointData): Point = js.native
  def applyInverse(pos: IPointData, newPos: Point): Point = js.native
  /**
    * Changes the values of the matrix to be the same as the ones in given matrix
    *
    * @param {PIXI.Matrix} matrix - The matrix to copy from.
    * @return {PIXI.Matrix} this
    */
  def copyFrom(matrix: Matrix): Matrix = js.native
  /**
    * Changes the values of the given matrix to be the same as the ones in this matrix
    *
    * @param {PIXI.Matrix} matrix - The matrix to copy to.
    * @return {PIXI.Matrix} The matrix given in parameter with its values updated.
    */
  def copyTo(matrix: Matrix): Matrix = js.native
  /**
    * Decomposes the matrix (x, y, scaleX, scaleY, and rotation) and sets the properties on to a transform.
    *
    * @param {PIXI.Transform} transform - The transform to apply the properties to.
    * @return {PIXI.Transform} The transform with the newly applied properties
    */
  def decompose(transform: Transform): Transform = js.native
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
  /**
    * Resets this Matrix to an identity (default) matrix.
    *
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def identity(): Matrix = js.native
  /**
    * Inverts this matrix
    *
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def invert(): Matrix = js.native
  /**
    * Prepends the given Matrix to this Matrix.
    *
    * @param {PIXI.Matrix} matrix - The matrix to prepend
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def prepend(matrix: Matrix): Matrix = js.native
  /**
    * Applies a rotation transformation to the matrix.
    *
    * @param {number} angle - The angle in radians.
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def rotate(angle: Double): Matrix = js.native
  /**
    * Applies a scale transformation to the matrix.
    *
    * @param {number} x - The amount to scale horizontally
    * @param {number} y - The amount to scale vertically
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def scale(x: Double, y: Double): Matrix = js.native
  /**
    * sets the matrix properties
    *
    * @param {number} a - Matrix component
    * @param {number} b - Matrix component
    * @param {number} c - Matrix component
    * @param {number} d - Matrix component
    * @param {number} tx - Matrix component
    * @param {number} ty - Matrix component
    *
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def set(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Matrix = js.native
  /**
    * Sets the matrix based on all the available properties
    *
    * @param {number} x - Position on the x axis
    * @param {number} y - Position on the y axis
    * @param {number} pivotX - Pivot on the x axis
    * @param {number} pivotY - Pivot on the y axis
    * @param {number} scaleX - Scale on the x axis
    * @param {number} scaleY - Scale on the y axis
    * @param {number} rotation - Rotation in radians
    * @param {number} skewX - Skew on the x axis
    * @param {number} skewY - Skew on the y axis
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
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
    * @param {boolean} transpose - Whether we need to transpose the matrix or not
    * @param {Float32Array} [out=new Float32Array(9)] - If provided the array will be assigned to out
    * @return {number[]} the newly created array which contains the matrix
    */
  def toArray(transpose: Boolean): js.Array[Double] = js.native
  def toArray(transpose: Boolean, out: Float32Array): js.Array[Double] = js.native
  /**
    * Translates the matrix on the x and y.
    *
    * @param {number} x - How much to translate x by
    * @param {number} y - How much to translate y by
    * @return {PIXI.Matrix} This matrix. Good for chaining method calls.
    */
  def translate(x: Double, y: Double): Matrix = js.native
}

