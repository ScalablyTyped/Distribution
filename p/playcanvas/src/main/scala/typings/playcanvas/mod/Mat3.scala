package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 3x3 matrix.
  */
@JSImport("playcanvas", "Mat3")
@js.native
open class Mat3 () extends StObject {
  
  /**
    * Copies the contents of a source 3x3 matrix to a destination 3x3 matrix.
    *
    * @param {Mat3} rhs - A 3x3 matrix to be copied.
    * @returns {Mat3} Self for chaining.
    * @example
    * const src = new pc.Mat3().translate(10, 20, 30);
    * const dst = new pc.Mat3();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    */
  def copy(rhs: Mat3): Mat3 = js.native
  
  /**
    * Matrix elements in the form of a flat array.
    *
    * @type {Float32Array}
    */
  var data: js.typedarray.Float32Array = js.native
  
  /**
    * Reports whether two matrices are equal.
    *
    * @param {Mat3} rhs - The other matrix.
    * @returns {boolean} True if the matrices are equal and false otherwise.
    * @example
    * const a = new pc.Mat3().translate(10, 20, 30);
    * const b = new pc.Mat3();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Mat3): Boolean = js.native
  
  /**
    * Reports whether the specified matrix is the identity matrix.
    *
    * @returns {boolean} True if the matrix is identity and false otherwise.
    * @example
    * const m = new pc.Mat3();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def isIdentity(): Boolean = js.native
  
  /**
    * Copies the contents of a source array[9] to a destination 3x3 matrix.
    *
    * @param {number[]} src - An array[9] to be copied.
    * @returns {Mat3} Self for chaining.
    * @example
    * const dst = new pc.Mat3();
    * dst.set([0, 1, 2, 3, 4, 5, 6, 7, 8]);
    */
  def set(src: js.Array[Double]): Mat3 = js.native
  
  /**
    * Converts the specified 4x4 matrix to a Mat3.
    *
    * @param {import('./mat4.js').Mat4} m - The 4x4 matrix to convert.
    * @returns {Mat3} Self for chaining.
    */
  def setFromMat4(m: Mat4): Mat3 = js.native
  
  /**
    * Sets the matrix to the identity matrix.
    *
    * @returns {Mat3} Self for chaining.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def setIdentity(): Mat3 = js.native
  
  /**
    * Transforms a 3-dimensional vector by a 3x3 matrix.
    *
    * @param {Vec3} vec - The 3-dimensional vector to be transformed.
    * @param {Vec3} [res] - An optional 3-dimensional vector to receive the result of the
    * transformation.
    * @returns {Vec3} The input vector v transformed by the current instance.
    */
  def transformVector(vec: Vec3): Vec3 = js.native
  def transformVector(vec: Vec3, res: Vec3): Vec3 = js.native
  
  /**
    * Generates the transpose of the specified 3x3 matrix.
    *
    * @returns {Mat3} Self for chaining.
    * @example
    * const m = new pc.Mat3();
    *
    * // Transpose in place
    * m.transpose();
    */
  def transpose(): Mat3 = js.native
}
object Mat3 {
  
  /**
    * A constant matrix set to the identity.
    *
    * @type {Mat3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Mat3.IDENTITY")
  @js.native
  val IDENTITY: Mat3 = js.native
  
  /**
    * A constant matrix with all elements set to 0.
    *
    * @type {Mat3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Mat3.ZERO")
  @js.native
  val ZERO: Mat3 = js.native
}
