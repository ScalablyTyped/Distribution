package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Matrix")
@js.native
class Matrix protected ()
  extends paperLib.paperNs.Matrix {
  /**
    * Creates a 2D affine transformation matrix
    * @param matrix - the matrix to copy the values from
    */
  def this(matrix: paperLib.paperNs.Matrix) = this()
  /**
    * Creates a 2D affine transformation matrix
    * @param array - the matrix values to initialize this matrix with
    */
  def this(values: js.Array[scala.Double]) = this()
  /**
    * Creates a 2D affine transform.
    * @param a - the a property of the transform
    * @param c - the c property of the transform
    * @param b - the b property of the transform
    * @param d - the d property of the transform
    * @param tx - the tx property of the transform
    * @param ty - the ty property of the transform
    */
  def this(a: scala.Double, c: scala.Double, b: scala.Double, d: scala.Double, tx: scala.Double, ty: scala.Double) = this()
}

