package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Mat3
  * @class A 3x3 matrix.
  * @description Creates a new Mat3 object
  * @param {Number} [v0] The value in row 0, column 0. If v0 is an array of length 9, the array will be used to populate all components.
  * @param {Number} [v1] The value in row 1, column 0.
  * @param {Number} [v2] The value in row 2, column 0.
  * @param {Number} [v3] The value in row 0, column 1.
  * @param {Number} [v4] The value in row 1, column 1.
  * @param {Number} [v5] The value in row 2, column 1.
  * @param {Number} [v6] The value in row 0, column 2.
  * @param {Number} [v7] The value in row 1, column 2.
  * @param {Number} [v8] The value in row 2, column 2.
  */
@JSGlobal("pc.Mat3")
@js.native
class Mat3 protected () extends js.Object {
  def this(v0: js.Tuple9[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double
    ]) = this()
  def this(v0: scala.Double, v1: scala.Double, v2: scala.Double, v3: scala.Double, v4: scala.Double, v5: scala.Double, v6: scala.Double, v7: scala.Double, v8: scala.Double) = this()
  var data: stdLib.Float32Array = js.native
  /**
    * @function
    * @name pc.Mat3#copy
    * @description Copies the contents of a source 3x3 matrix to a destination 3x3 matrix.
    * @param {pc.Mat3} src A 3x3 matrix to be copied.
    * @returns {pc.Mat3} Self for chaining
    * @example
    * var src = new pc.Mat3().translate(10, 20, 30);
    * var dst = new pc.Mat3();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equal(dst) ? "equal" : "different"));
    */
  def copy(rhs: Mat3): this.type = js.native
  /**
    * @function
    * @name pc.Mat3#equals
    * @param {pc.Mat3} rhs The other matrix.
    * @description Reports whether two matrices are equal.
    * @returns {Boolean} true if the matrices are equal and false otherwise.
    * @example
    * var a = new pc.Mat3().translate(10, 20, 30);
    * var b = new pc.Mat3();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Mat3): scala.Boolean = js.native
  /**
    * @function
    * @name pc.Mat3#isIdentity
    * @description Reports whether the specified matrix is the identity matrix.
    * @returns {Boolean} true if the matrix is identity and false otherwise.
    * @example
    * var m = new pc.Mat3();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def isIdentity(): scala.Boolean = js.native
  /**
    * @function
    * @name pc.Mat3#setIdentity
    * @description Sets the matrix to the identity matrix.
    * @returns {pc.Mat3} Self for chaining.
    * @example
    * m.setIdentity();
    * console.log("The two matrices are " + (src.equal(dst) ? "equal" : "different"));
    */
  def setIdentity(): this.type = js.native
  /**
    * @function
    * @name pc.Mat3#transpose
    * @description Generates the transpose of the specified 3x3 matrix.
    * @returns {pc.Mat3} Self for chaining.
    * @example
    * var m = new pc.Mat3();
    *
    * // Transpose in place
    * m.transpose();
    */
  def transpose(): this.type = js.native
}

/**
  * @name pc.Mat3
  * @class A 3x3 matrix.
  * @description Creates a new Mat3 object
  * @param {Number} [v0] The value in row 0, column 0. If v0 is an array of length 9, the array will be used to populate all components.
  * @param {Number} [v1] The value in row 1, column 0.
  * @param {Number} [v2] The value in row 2, column 0.
  * @param {Number} [v3] The value in row 0, column 1.
  * @param {Number} [v4] The value in row 1, column 1.
  * @param {Number} [v5] The value in row 2, column 1.
  * @param {Number} [v6] The value in row 0, column 2.
  * @param {Number} [v7] The value in row 1, column 2.
  * @param {Number} [v8] The value in row 2, column 2.
  */
@JSGlobal("pc.Mat3")
@js.native
object Mat3 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Mat3
    * @name pc.Mat3.IDENTITY
    * @description A constant matrix set to the identity.
    */
  val IDENTITY: playcanvasLib.pcNs.Mat3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Mat3
    * @name pc.Mat3.ZERO
    * @description A constant matrix with all elements set to 0.
    */
  val ZERO: playcanvasLib.pcNs.Mat3 = js.native
}

