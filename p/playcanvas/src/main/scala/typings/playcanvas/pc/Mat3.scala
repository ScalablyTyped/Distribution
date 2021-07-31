package typings.playcanvas.pc

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new identity Mat3 object.
  * @property data - Matrix elements in the form of a flat array.
  */
trait Mat3 extends StObject {
  
  /**
    * Copies the contents of a source 3x3 matrix to a destination 3x3 matrix.
    * @example
    * var src = new pc.Mat3().translate(10, 20, 30);
    * var dst = new pc.Mat3();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    * @param rhs - A 3x3 matrix to be copied.
    * @returns Self for chaining.
    */
  def copy(rhs: Mat3): Mat3
  
  /**
    * Matrix elements in the form of a flat array.
    */
  var data: Float32Array
  
  /**
    * Reports whether two matrices are equal.
    * @example
    * var a = new pc.Mat3().translate(10, 20, 30);
    * var b = new pc.Mat3();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The other matrix.
    * @returns True if the matrices are equal and false otherwise.
    */
  def equals(rhs: Mat3): Boolean
  
  /**
    * Reports whether the specified matrix is the identity matrix.
    * @example
    * var m = new pc.Mat3();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns True if the matrix is identity and false otherwise.
    */
  def isIdentity(): Boolean
  
  /**
    * Copies the contents of a source array[9] to a destination 3x3 matrix.
    * @example
    * var dst = new pc.Mat3();
    * dst.set([0, 1, 2, 3, 4, 5, 6, 7, 8]);
    * @param src - An array[9] to be copied.
    * @returns Self for chaining.
    */
  def set(src: js.Array[Double]): Mat3
  
  /**
    * Sets the matrix to the identity matrix.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns Self for chaining.
    */
  def setIdentity(): Mat3
  
  /**
    * Generates the transpose of the specified 3x3 matrix.
    * @example
    * var m = new pc.Mat3();
    *
    * // Transpose in place
    * m.transpose();
    * @returns Self for chaining.
    */
  def transpose(): Mat3
}
object Mat3 {
  
  @scala.inline
  def apply(
    copy: Mat3 => Mat3,
    data: Float32Array,
    equals_ : Mat3 => Boolean,
    isIdentity: () => Boolean,
    set: js.Array[Double] => Mat3,
    setIdentity: () => Mat3,
    transpose: () => Mat3
  ): Mat3 = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), data = data.asInstanceOf[js.Any], isIdentity = js.Any.fromFunction0(isIdentity), set = js.Any.fromFunction1(set), setIdentity = js.Any.fromFunction0(setIdentity), transpose = js.Any.fromFunction0(transpose))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Mat3]
  }
  
  @scala.inline
  implicit class Mat3MutableBuilder[Self <: Mat3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: Mat3 => Mat3): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setData(value: Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_(value: Mat3 => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIdentity(value: () => Boolean): Self = StObject.set(x, "isIdentity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: js.Array[Double] => Mat3): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdentity(value: () => Mat3): Self = StObject.set(x, "setIdentity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTranspose(value: () => Mat3): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
  }
}
