package typings.paper.paper

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * An affine transformation matrix performs a linear mapping from 2D
  *     coordinates to other 2D coordinates that preserves the "straightness" and
  *     "parallelness" of lines.
  * 
  * Such a coordinate transformation can be represented by a 3 row by 3
  * column matrix with an implied last row of `[ 0 0 1 ]`. This matrix
  * transforms source coordinates `(x, y)` into destination coordinates `(x',y')`
  * by considering them to be a column vector and multiplying the coordinate
  * vector by the matrix according to the following process:
  * 
  *     [ x ]   [ a  c  tx ] [ x ]   [ a * x + c * y + tx ]
  *     [ y ] = [ b  d  ty ] [ y ] = [ b * x + d * y + ty ]
  *     [ 1 ]   [ 0  0  1  ] [ 1 ]   [         1          ]
  * 
  * Note the locations of b and c.
  * 
  * This class is optimized for speed and minimizes calculations based on its
  * knowledge of the underlying matrix (as opposed to say simply performing
  * matrix multiplication).
  */
@JSGlobal("paper.Matrix")
@js.native
/** 
  * Creates a 2D affine transformation matrix that describes the identity
  * transformation.
  */
class Matrix () extends js.Object {
  /** 
    * Creates a 2D affine transformation matrix.
    * 
    * @param matrix - the matrix to copy the values from
    */
  def this(matrix: Matrix) = this()
  /** 
    * Creates a 2D affine transformation matrix.
    * 
    * @param values - the matrix values to initialize this matrix with
    */
  def this(values: js.Array[Double]) = this()
  /** 
    * Creates a 2D affine transformation matrix.
    * 
    * @param a - the a property of the transform
    * @param b - the b property of the transform
    * @param c - the c property of the transform
    * @param d - the d property of the transform
    * @param tx - the tx property of the transform
    * @param ty - the ty property of the transform
    */
  def this(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double) = this()
  /** 
    * The value that affects the transformation along the x axis when scaling
    * or rotating, positioned at (0, 0) in the transformation matrix.
    */
  var a: Double | Null = js.native
  /** 
    * The value that affects the transformation along the y axis when rotating
    * or skewing, positioned at (1, 0) in the transformation matrix.
    */
  var b: Double | Null = js.native
  /** 
    * The value that affects the transformation along the x axis when rotating
    * or skewing, positioned at (0, 1) in the transformation matrix.
    */
  var c: Double | Null = js.native
  /** 
    * The value that affects the transformation along the y axis when scaling
    * or rotating, positioned at (1, 1) in the transformation matrix.
    */
  var d: Double | Null = js.native
  /** 
    * The rotation angle of the matrix, if it can be decomposed.
    * 
    * @see #decompose()
    */
  val rotation: Double = js.native
  /** 
    * The scaling values of the matrix, if it can be decomposed.
    * 
    * @see #decompose()
    */
  val scaling: Point = js.native
  /** 
    * The translation of the matrix as a vector.
    */
  val translation: Point = js.native
  /** 
    * The distance by which to translate along the x axis, positioned at (2, 0)
    * in the transformation matrix.
    */
  var tx: Double | Null = js.native
  /** 
    * The distance by which to translate along the y axis, positioned at (2, 1)
    * in the transformation matrix.
    */
  var ty: Double | Null = js.native
  /** 
    * The matrix values as an array, in the same sequence as they are passed
    * to {@link #initialize}.
    */
  val values: js.Array[Double] = js.native
  /** 
    * Appends the specified matrix to this matrix. This is the equivalent of
    * multiplying `(this matrix) * (specified matrix)`.
    * 
    * @param matrix - the matrix to append
    * 
    * @return this matrix, modified
    */
  def append(matrix: Matrix): Matrix = js.native
  /** 
    * Returns a new matrix as the result of appending the specified matrix to
    * this matrix. This is the equivalent of multiplying
    * `(this matrix) * (specified matrix)`.
    * 
    * @param matrix - the matrix to append
    * 
    * @return the newly created matrix
    */
  def appended(matrix: Matrix): Matrix = js.native
  /** 
    * Attempts to apply the matrix to the content of item that it belongs to,
    * meaning its transformation is baked into the item's content or children.
    * 
    * @param recursively - controls whether to apply transformations
    * recursively on children
    * 
    * @return true if the matrix was applied
    */
  @JSName("apply")
  def apply(): Boolean = js.native
  @JSName("apply")
  def apply(recursively: Boolean): Boolean = js.native
  /** 
    * Applies this matrix to the specified Canvas Context.
    */
  def applyToContext(ctx: CanvasRenderingContext2D): Unit = js.native
  /** 
    * Decomposes the affine transformation described by this matrix into
    * `scaling`, `rotation` and `skewing`, and returns an object with
    * these properties.
    * 
    * @return the decomposed matrix
    */
  def decompose(): js.Object = js.native
  /** 
    * Checks whether the two matrices describe the same transformation.
    * 
    * @param matrix - the matrix to compare this matrix to
    * 
    * @return true if the matrices are equal
    */
  def equals(matrix: Matrix): Boolean = js.native
  /** 
    * Inverse transforms a point and returns the result.
    * 
    * @param point - the point to be transformed
    */
  def inverseTransform(point: Point): Point = js.native
  /** 
    * Inverts the matrix, causing it to perform the opposite transformation.
    * If the matrix is not invertible (in which case {@link #isSingular}
    * returns true), `null` is returned.
    * 
    * @return this matrix, or `null`, if the matrix is singular.
    */
  def invert(): Matrix = js.native
  /** 
    * Creates a new matrix that is the inversion of this matrix, causing it to
    * perform the opposite transformation. If the matrix is not invertible (in
    * which case {@link #isSingular} returns true), `null` is returned.
    * 
    * @return this matrix, or `null`, if the matrix is singular.
    */
  def inverted(): Matrix = js.native
  /** 
    * @return whether this matrix is the identity matrix
    */
  def isIdentity(): Boolean = js.native
  /** 
    * Checks whether the matrix is invertible. A matrix is not invertible if
    * the determinant is 0 or any value is infinite or NaN.
    * 
    * @return whether the matrix is invertible
    */
  def isInvertible(): Boolean = js.native
  /** 
    * Checks whether the matrix is singular or not. Singular matrices cannot be
    * inverted.
    * 
    * @return whether the matrix is singular
    */
  def isSingular(): Boolean = js.native
  /** 
    * Prepends the specified matrix to this matrix. This is the equivalent of
    * multiplying `(specified matrix) * (this matrix)`.
    * 
    * @param matrix - the matrix to prepend
    * 
    * @return this matrix, modified
    */
  def prepend(matrix: Matrix): Matrix = js.native
  /** 
    * Returns a new matrix as the result of prepending the specified matrix
    * to this matrix. This is the equivalent of multiplying
    * `(specified matrix) * (this matrix)`.
    * 
    * @param matrix - the matrix to prepend
    * 
    * @return the newly created matrix
    */
  def prepended(matrix: Matrix): Matrix = js.native
  /** 
    * Resets the matrix by setting its values to the ones of the identity
    * matrix that results in no transformation.
    */
  def reset(): Unit = js.native
  /** 
    * Concatenates this matrix with a rotation transformation around an
    * anchor point.
    * 
    * @param angle - the angle of rotation measured in degrees
    * @param center - the anchor point to rotate around
    * 
    * @return this affine transform
    */
  def rotate(angle: Double, center: Point): Matrix = js.native
  /** 
    * Concatenates this matrix with a rotation transformation around an
    * anchor point.
    * 
    * @param angle - the angle of rotation measured in degrees
    * @param x - the x coordinate of the anchor point
    * @param y - the y coordinate of the anchor point
    * 
    * @return this affine transform
    */
  def rotate(angle: Double, x: Double, y: Double): Matrix = js.native
  /** 
    * Concatenates this matrix with a scaling transformation.
    * 
    * @param hor - the horizontal scaling factor
    * @param ver - the vertical scaling factor
    * @param center - the center for the scaling transformation
    * 
    * @return this affine transform
    */
  def scale(hor: Double, ver: Double): Matrix = js.native
  def scale(hor: Double, ver: Double, center: Point): Matrix = js.native
  /** 
    * Concatenates this matrix with a scaling transformation.
    * 
    * @param scale - the scaling factor
    * @param center - the center for the scaling transformation
    * 
    * @return this affine transform
    */
  def scale(scale: Double): Matrix = js.native
  def scale(scale: Double, center: Point): Matrix = js.native
  /** 
    * Sets the matrix to the passed values. Note that any sequence of
    * parameters that is supported by the various {@link Matrix} constructors
    * also work for calls of `set()`.
    */
  def set(values: js.Any*): Point = js.native
  /** 
    * Concatenates this matrix with a shear transformation.
    * 
    * @param hor - the horizontal shear factor
    * @param ver - the vertical shear factor
    * @param center - the center for the shear transformation
    * 
    * @return this affine transform
    */
  def shear(hor: Double, ver: Double): Matrix = js.native
  def shear(hor: Double, ver: Double, center: Point): Matrix = js.native
  /** 
    * Concatenates this matrix with a shear transformation.
    * 
    * @param shear - the shear factor in x and y direction
    * @param center - the center for the shear transformation
    * 
    * @return this affine transform
    */
  def shear(shear: Point): Matrix = js.native
  def shear(shear: Point, center: Point): Matrix = js.native
  /** 
    * Concatenates this matrix with a skew transformation.
    * 
    * @param hor - the horizontal skew angle in degrees
    * @param ver - the vertical skew angle in degrees
    * @param center - the center for the skew transformation
    * 
    * @return this affine transform
    */
  def skew(hor: Double, ver: Double): Matrix = js.native
  def skew(hor: Double, ver: Double, center: Point): Matrix = js.native
  /** 
    * Concatenates this matrix with a skew transformation.
    * 
    * @param skew - the skew angles in x and y direction in degrees
    * @param center - the center for the skew transformation
    * 
    * @return this affine transform
    */
  def skew(skew: Point): Matrix = js.native
  def skew(skew: Point, center: Point): Matrix = js.native
  /** 
    * Transforms a point and returns the result.
    * 
    * @param point - the point to be transformed
    * 
    * @return the transformed point
    */
  def transform(point: Point): Point = js.native
  /** 
    * Transforms an array of coordinates by this matrix and stores the results
    * into the destination array, which is also returned.
    * 
    * @param src - the array containing the source points
    * as x, y value pairs
    * @param dst - the array into which to store the transformed
    * point pairs
    * @param count - the number of points to transform
    * 
    * @return the dst array, containing the transformed coordinates
    */
  def transform(src: js.Array[Double], dst: js.Array[Double], count: Double): js.Array[Double] = js.native
  /** 
    * Concatenates this matrix with a translate transformation.
    * 
    * @param dx - the distance to translate in the x direction
    * @param dy - the distance to translate in the y direction
    * 
    * @return this affine transform
    */
  def translate(dx: Double, dy: Double): Matrix = js.native
  /** 
    * Concatenates this matrix with a translate transformation.
    * 
    * @param point - the vector to translate by
    * 
    * @return this affine transform
    */
  def translate(point: Point): Matrix = js.native
}

