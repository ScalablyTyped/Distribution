package typings.paper.paper

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Matrix")
@js.native
class Matrix protected () extends Base {
  /**
    * Creates a 2D affine transformation matrix
    * @param matrix - the matrix to copy the values from
    */
  def this(matrix: Matrix) = this()
  /**
    * Creates a 2D affine transformation matrix
    * @param array - the matrix values to initialize this matrix with
    */
  def this(values: js.Array[Double]) = this()
  /**
    * Creates a 2D affine transform.
    * @param a - the a property of the transform
    * @param c - the c property of the transform
    * @param b - the b property of the transform
    * @param d - the d property of the transform
    * @param tx - the tx property of the transform
    * @param ty - the ty property of the transform
    */
  def this(a: Double, c: Double, b: Double, d: Double, tx: Double, ty: Double) = this()
  /**
    * The value that affects the transformation along the x axis when scaling or rotating, positioned at (0, 0) in the transformation matrix.
    */
  var a: Double = js.native
  /**
    * The value that affects the transformation along the x axis when rotating or skewing, positioned at (0, 1) in the transformation matrix.
    */
  var b: Double = js.native
  /**
    * The value that affects the transformation along the y axis when rotating or skewing, positioned at (1, 0) in the transformation matrix.
    */
  var c: Double = js.native
  /**
    * The value that affects the transformation along the y axis when scaling or rotating, positioned at (1, 1) in the transformation matrix.
    */
  var d: Double = js.native
  /**
    * The rotation angle of the matrix, if it can be decomposed.
    * Read only.
    */
  val rotation: Double = js.native
  /**
    * The scaling values of the matrix, if it can be decomposed.
    * Read only.
    */
  val scaling: Point = js.native
  /**
    * The translation of the matrix as a vector.
    * Read only.
    */
  val translation: Point = js.native
  /**
    * The distance by which to translate along the x axis, positioned at (2, 0) in the transformation matrix.
    */
  var tx: Double = js.native
  /**
    * The distance by which to translate along the y axis, positioned at (2, 1) in the transformation matrix.
    */
  var ty: Double = js.native
  /**
    * The transform values as an array, in the same sequence as they are passed to initialize(a, c,b,d,tx,ty).
    * Read only.
    */
  val values: js.Array[Double] = js.native
  /**
    * Prepends the specified matrix to this matrix. This is the equivalent of multiplying (specified matrix) * (this matrix).
    * @param mx - the transform to concatenate
    */
  def append(mx: Matrix): Matrix = js.native
  /**
    * Returns a new matrix as the result of appending the specified matrix to this matrix. This is the equivalent of multiplying (this matrix) * (specified matrix).
    * @param mx - the transform to concatenate
    */
  def appended(mx: Matrix): Matrix = js.native
  /**
    * Attempts to apply the matrix to the content of item that it belongs to, meaning its transformation is baked into the item's content or children.
    * @param recursively - controls whether to apply transformations recursively on children
    */
  @JSName("apply")
  def apply(recursively: Boolean): Boolean = js.native
  /**
    * Applies this matrix to the specified Canvas Context.
    * @param ctx -
    */
  def applyToContext(ctx: CanvasRenderingContext2D): Unit = js.native
  /**
    * Returns a new instance of the result of the concatenation of the given affine transform with this transform.
    * @param mx - the transform to concatenate
    */
  def chain(mx: Matrix): Matrix = js.native
  /**
    * Concatenates the given affine transform to this transform.
    * @param mx - the transform to concatenate
    */
  def concatenate(mx: Matrix): Matrix = js.native
  /**
    * Attempts to decompose the affine transformation described by this matrix into scaling, rotation and shearing, and returns an object with these properties if it succeeded, null otherwise.
    */
  def decompose(): js.Any = js.native
  /**
    * Checks whether the two matrices describe the same transformation.
    * @param matrix - the matrix to compare this matrix to
    */
  def equals(matrix: Matrix): Boolean = js.native
  /**
    * Inverse transforms a point and returns the result.
    * @param point - the point to be transformed
    */
  def inverseTransform(point: Point): Point = js.native
  /**
    * Inverts the matrix, causing it to perform the opposite transformation. If the matrix is not invertible (in which case isSingular() returns true), null is returned.
    */
  def invert(): Matrix = js.native
  /**
    * Creates the inversion of the transformation of the matrix and returns it as a new instance. If the matrix is not invertible (in which case isSingular() returns true), null is returned.
    */
  def inverted(): Matrix = js.native
  /**
    * Returns whether this transform is the identity transform
    */
  def isIdentity(): Boolean = js.native
  /**
    * Returns whether the transform is invertible. A transform is not invertible if the determinant is 0 or any value is non-finite or NaN.
    */
  def isInvertible(): Boolean = js.native
  /**
    * Checks whether the matrix is singular or not. Singular matrices cannot be inverted.
    */
  def isSingular(): Boolean = js.native
  /**
    * Pre-concatenates the given affine transform to this transform.
    * @param mx - the transform to preconcatenate
    */
  def preConcatenate(mx: Matrix): Matrix = js.native
  /**
    * Pre-concatenates the given affine transform to this transform.
    * @param mx - the transform to preconcatenate
    */
  def prepend(mx: Matrix): Matrix = js.native
  /**
    * Returns a new matrix as the result of prepending the specified matrix to this matrix. This is the equivalent of multiplying (specified matrix) s* (this matrix).
    * @param mx - the transform to concatenate
    */
  def prepended(mx: Matrix): Matrix = js.native
  /**
    * Resets the matrix by setting its values to the ones of the identity matrix that results in no transformation.
    */
  def reset(): Unit = js.native
  /**
    * Concatenates this transform with a rotation transformation around an anchor point.
    * @param angle - the angle of rotation measured in degrees
    * @param center - the anchor point to rotate around
    */
  def rotate(angle: Double, center: Point): Matrix = js.native
  /**
    * Concatenates this transform with a rotation transformation around an anchor point.
    * @param angle - the angle of rotation measured in degrees
    * @param x - the x coordinate of the anchor point
    * @param y - the y coordinate of the anchor point
    */
  def rotate(angle: Double, x: Double, y: Double): Matrix = js.native
  /**
    * Concatenates this transform with a scaling transformation.
    * @param hor - the horizontal scaling factor
    * @param ver - the vertical scaling factor
    * @param center [optional] - the center for the scaling transformation
    */
  def scale(hor: Double, ver: Double): Matrix = js.native
  def scale(hor: Double, ver: Double, center: Point): Matrix = js.native
  /**
    * Concatenates this transform with a scaling transformation.
    * @param scale - the scaling factor
    * @param center [optional] - the center for the scaling transformation
    */
  def scale(scale: Double): Matrix = js.native
  def scale(scale: Double, center: Point): Matrix = js.native
  /**
    * Sets this transform to the matrix defaults
    */
  def set(): Matrix = js.native
  /**
    * Sets this transform to the matrix specified by the 6 values.
    * @param a - the a property of the transform
    * @param c - the c property of the transform
    * @param b - the b property of the transform
    * @param d - the d property of the transform
    * @param tx - the tx property of the transform
    * @param ty - the ty property of the transform
    */
  def set(a: Double, c: Double, b: Double, d: Double, tx: Double, ty: Double): Matrix = js.native
  /**
    * Sets a 2D affine transformation matrix
    * @param matrix - the matrix to set the values from
    */
  def set(matrix: Matrix): Matrix = js.native
  /**
    * Sets a 2D affine transformation matrix
    * @param array - the matrix values to set this matrix with
    */
  def set(values: js.Array[Double]): Matrix = js.native
  /**
    * Concatenates this transform with a shear transformation.
    * @param hor - the horizontal shear factor
    * @param ver - the vertical shear factor
    * @param center [optional] - the center for the shear transformation
    */
  def shear(hor: Double, ver: Double): Matrix = js.native
  def shear(hor: Double, ver: Double, center: Point): Matrix = js.native
  /**
    * Concatenates this transform with a shear transformation.
    * @param shear - the shear factor in x and y direction
    * @param center [optional] - the center for the shear transformation
    */
  def shear(shear: Point): Matrix = js.native
  def shear(shear: Point, center: Point): Matrix = js.native
  /**
    * Concatenates this transform with a skew transformation.
    * @param hor - the horizontal skew angle in degrees
    * @param ver - the vertical skew angle in degrees
    * @param center [optional] - the center for the skew transformation
    */
  def skew(hor: Double, ver: Double): Matrix = js.native
  def skew(hor: Double, ver: Double, center: Point): Matrix = js.native
  /**
    * Concatenates this transform with a skew transformation.
    * @param skew - the skew angles in x and y direction in degrees
    * @param center [optional] - the center for the skew transformation
    */
  def skew(skew: Point): Matrix = js.native
  def skew(skew: Point, center: Point): Matrix = js.native
  /**
    * Transforms a point and returns the result.
    * @param point - the point to be transformed
    */
  def transform(point: Point): Point = js.native
  /**
    * Transforms an array of coordinates by this matrix and stores the results into the destination array, which is also returned.
    * @param src - the array containing the source points as x, y value pairs
    * @param dst - the array into which to store the transformed point pairs
    * @param count - the number of points to transform
    */
  def transform(src: js.Array[Double], dst: js.Array[Double], count: Double): js.Array[Double] = js.native
  /**
    * Concatenates this transform with a translate transformation.
    * @param dx - the distance to translate in the x direction
    * @param dy - the distance to translate in the y direction
    */
  def translate(dx: Double, dy: Double): Matrix = js.native
  /**
    * Concatenates this transform with a translate transformation.
    * @param point - the vector to translate by
    */
  def translate(point: Point): Matrix = js.native
}

