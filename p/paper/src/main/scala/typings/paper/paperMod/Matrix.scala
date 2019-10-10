package typings.paper.paperMod

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
@JSImport("paper", "Matrix")
@js.native
/** 
  * Creates a 2D affine transformation matrix that describes the identity
  * transformation.
  */
class Matrix ()
  extends typings.paper.paper.Matrix {
  /** 
    * Creates a 2D affine transformation matrix.
    * 
    * @param matrix - the matrix to copy the values from
    */
  def this(matrix: typings.paper.paper.Matrix) = this()
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
}

