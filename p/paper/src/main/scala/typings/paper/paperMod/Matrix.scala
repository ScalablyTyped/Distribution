package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Matrix")
@js.native
class Matrix protected ()
  extends typings.paper.paper.Matrix {
  /**
    * Creates a 2D affine transformation matrix
    * @param matrix - the matrix to copy the values from
    */
  def this(matrix: typings.paper.paper.Matrix) = this()
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
}

