package typings.playcanvas.pc

import typings.std.Float32Array
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Mat3
  * @classdesc A 3x3 matrix.
  * @description Creates a new identity Mat3 object.
  * @property {Float32Array} data Matrix elements in the form of a flat array.
  */
@JSGlobal("pc.Mat3")
@js.native
class Mat3 () extends js.Object {
  /**
    * Matrix elements in the form of a flat array.
    */
  var data: Float32Array = js.native
  /**
    * @function
    * @name pc.Mat3#copy
    * @description Copies the contents of a source 3x3 matrix to a destination 3x3 matrix.
    * @param {pc.Mat3} rhs A 3x3 matrix to be copied.
    * @returns {pc.Mat3} Self for chaining
    * @example
    * var src = new pc.Mat3().translate(10, 20, 30);
    * var dst = new pc.Mat3();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    */
  def copy(rhs: Mat3): Mat3 = js.native
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
  def equals(rhs: Mat3): Boolean = js.native
  /**
    * @function
    * @name pc.Mat3#isIdentity
    * @description Reports whether the specified matrix is the identity matrix.
    * @returns {Boolean} true if the matrix is identity and false otherwise.
    * @example
    * var m = new pc.Mat3();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def isIdentity(): Boolean = js.native
  /**
    * @function
    * @name pc.Mat3#set
    * @description Copies the contents of a source array[9] to a destination 3x3 matrix.
    * @param {Number[]} src An array[9] to be copied.
    * @returns {pc.Mat3} Self for chaining
    * @example
    * var dst = new pc.Mat3();
    * dst.set([0, 1, 2, 3, 4, 5, 6, 7, 8]);
    */
  def set(src: js.Array[Number]): Mat3 = js.native
  /**
    * @function
    * @name pc.Mat3#setIdentity
    * @description Sets the matrix to the identity matrix.
    * @returns {pc.Mat3} Self for chaining.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def setIdentity(): Mat3 = js.native
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
  def transpose(): Mat3 = js.native
}

/* static members */
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
  val IDENTITY: Mat3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Mat3
    * @name pc.Mat3.ZERO
    * @description A constant matrix with all elements set to 0.
    */
  val ZERO: Mat3 = js.native
}

