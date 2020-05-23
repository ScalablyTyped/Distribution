package typings.phaser.Phaser.GameObjects.Components

import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Math.Vector2
import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Matrix used for display transformations for rendering.
  * 
  * It is represented like so:
  * 
  * ```
  * | a | c | tx |
  * | b | d | ty |
  * | 0 | 0 | 1  |
  * ```
  */
@js.native
trait TransformMatrix extends js.Object {
  /**
    * The Scale X value.
    */
  var a: Double = js.native
  /**
    * The Skew Y value.
    */
  var b: Double = js.native
  /**
    * The Skew X value.
    */
  var c: Double = js.native
  /**
    * The Scale Y value.
    */
  var d: Double = js.native
  /**
    * The decomposed matrix.
    */
  var decomposedMatrix: js.Object = js.native
  /**
    * The Translate X value.
    */
  var e: Double = js.native
  /**
    * The Translate Y value.
    */
  var f: Double = js.native
  /**
    * The matrix values.
    */
  var matrix: Float32Array = js.native
  /**
    * The rotation of the Matrix. Value is in radians.
    */
  val rotation: Double = js.native
  /**
    * The rotation of the Matrix, normalized to be within the Phaser right-handed
    * clockwise rotation space. Value is in radians.
    */
  val rotationNormalized: Double = js.native
  /**
    * The decomposed horizontal scale of the Matrix. This value is always positive.
    */
  val scaleX: Double = js.native
  /**
    * The decomposed vertical scale of the Matrix. This value is always positive.
    */
  val scaleY: Double = js.native
  /**
    * The Translate X value.
    */
  var tx: Double = js.native
  /**
    * The Translate Y value.
    */
  var ty: Double = js.native
  /**
    * Apply the identity, translate, rotate and scale operations on the Matrix.
    * @param x The horizontal translation.
    * @param y The vertical translation.
    * @param rotation The angle of rotation in radians.
    * @param scaleX The horizontal scale.
    * @param scaleY The vertical scale.
    */
  def applyITRS(x: Double, y: Double, rotation: Double, scaleX: Double, scaleY: Double): this.type = js.native
  /**
    * Takes the `x` and `y` values and returns a new position in the `output` vector that is the inverse of
    * the current matrix with its transformation applied.
    * 
    * Can be used to translate points from world to local space.
    * @param x The x position to translate.
    * @param y The y position to translate.
    * @param output A Vector2, or point-like object, to store the results in.
    */
  def applyInverse(x: Double, y: Double): Vector2 = js.native
  def applyInverse(x: Double, y: Double, output: Vector2): Vector2 = js.native
  /**
    * Set the values of this Matrix to copy those of the matrix given.
    * @param src The source Matrix to copy from.
    */
  def copyFrom(src: TransformMatrix): this.type = js.native
  /**
    * Set the values of this Matrix to copy those of the array given.
    * Where array indexes 0, 1, 2, 3, 4 and 5 are mapped to a, b, c, d, e and f.
    * @param src The array of values to set into this matrix.
    */
  def copyFromArray(src: js.Array[_]): this.type = js.native
  /**
    * Copy the values in this Matrix to the array given.
    * 
    * Where array indexes 0, 1, 2, 3, 4 and 5 are mapped to a, b, c, d, e and f.
    * @param out The array to copy the matrix values in to.
    */
  def copyToArray(): js.Array[_] = js.native
  def copyToArray(out: js.Array[_]): js.Array[_] = js.native
  /**
    * Copy the values from this Matrix to the given Canvas Rendering Context.
    * This will use the Context.transform method.
    * @param ctx The Canvas Rendering Context to copy the matrix values to.
    */
  def copyToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D = js.native
  /**
    * Decompose this Matrix into its translation, scale and rotation values using QR decomposition.
    * 
    * The result must be applied in the following order to reproduce the current matrix:
    * 
    * translate -> rotate -> scale
    */
  def decomposeMatrix(): js.Object = js.native
  /**
    * Destroys this Transform Matrix.
    */
  def destroy(): Unit = js.native
  /**
    * Returns a string that can be used in a CSS Transform call as a `matrix` property.
    */
  def getCSSMatrix(): String = js.native
  /**
    * Returns the X component of this matrix multiplied by the given values.
    * This is the same as `x * a + y * c + e`.
    * @param x The x value.
    * @param y The y value.
    */
  def getX(x: Double, y: Double): Double = js.native
  /**
    * Returns the Y component of this matrix multiplied by the given values.
    * This is the same as `x * b + y * d + f`.
    * @param x The x value.
    * @param y The y value.
    */
  def getY(x: Double, y: Double): Double = js.native
  /**
    * Invert the Matrix.
    */
  def invert(): this.type = js.native
  /**
    * Reset the Matrix to an identity matrix.
    */
  def loadIdentity(): this.type = js.native
  /**
    * Multiply this Matrix by the given Matrix.
    * 
    * If an `out` Matrix is given then the results will be stored in it.
    * If it is not given, this matrix will be updated in place instead.
    * Use an `out` Matrix if you do not wish to mutate this matrix.
    * @param rhs The Matrix to multiply by.
    * @param out An optional Matrix to store the results in.
    */
  def multiply(rhs: TransformMatrix): this.type | TransformMatrix = js.native
  def multiply(rhs: TransformMatrix, out: TransformMatrix): this.type | TransformMatrix = js.native
  /**
    * Multiply this Matrix by the matrix given, including the offset.
    * 
    * The offsetX is added to the tx value: `offsetX * a + offsetY * c + tx`.
    * The offsetY is added to the ty value: `offsetY * b + offsetY * d + ty`.
    * @param src The source Matrix to copy from.
    * @param offsetX Horizontal offset to factor in to the multiplication.
    * @param offsetY Vertical offset to factor in to the multiplication.
    */
  def multiplyWithOffset(src: TransformMatrix, offsetX: Double, offsetY: Double): this.type = js.native
  /**
    * Rotate the Matrix.
    * @param angle The angle of rotation in radians.
    */
  def rotate(angle: Double): this.type = js.native
  /**
    * Scale the Matrix.
    * @param x The horizontal scale value.
    * @param y The vertical scale value.
    */
  def scale(x: Double, y: Double): this.type = js.native
  /**
    * Copy the values from this Matrix to the given Canvas Rendering Context.
    * This will use the Context.setTransform method.
    * @param ctx The Canvas Rendering Context to copy the matrix values to.
    */
  def setToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D = js.native
  /**
    * Set the values of this Matrix.
    * @param a The Scale X value.
    * @param b The Shear Y value.
    * @param c The Shear X value.
    * @param d The Scale Y value.
    * @param tx The Translate X value.
    * @param ty The Translate Y value.
    */
  def setTransform(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): this.type = js.native
  /**
    * Transform the Matrix.
    * @param a The Scale X value.
    * @param b The Shear Y value.
    * @param c The Shear X value.
    * @param d The Scale Y value.
    * @param tx The Translate X value.
    * @param ty The Translate Y value.
    */
  def transform(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): this.type = js.native
  def transformPoint(x: Double, y: Double, point: js.Object): Point | Vector2 | js.Object = js.native
  /**
    * Transform a point using this Matrix.
    * @param x The x coordinate of the point to transform.
    * @param y The y coordinate of the point to transform.
    * @param point The Point object to store the transformed coordinates.
    */
  def transformPoint(x: Double, y: Double, point: Point): Point | Vector2 | js.Object = js.native
  def transformPoint(x: Double, y: Double, point: Vector2): Point | Vector2 | js.Object = js.native
  /**
    * Translate the Matrix.
    * @param x The horizontal translation value.
    * @param y The vertical translation value.
    */
  def translate(x: Double, y: Double): this.type = js.native
}

