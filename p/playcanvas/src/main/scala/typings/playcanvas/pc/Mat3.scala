package typings.playcanvas.pc

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new identity Mat3 object.
  * @property data - Matrix elements in the form of a flat array.
  */
@js.native
trait Mat3 extends js.Object {
  
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
  def copy(rhs: Mat3): Mat3 = js.native
  
  /**
    * Matrix elements in the form of a flat array.
    */
  var data: Float32Array = js.native
  
  /**
    * Reports whether two matrices are equal.
    * @example
    * var a = new pc.Mat3().translate(10, 20, 30);
    * var b = new pc.Mat3();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The other matrix.
    * @returns True if the matrices are equal and false otherwise.
    */
  def equals(rhs: Mat3): Boolean = js.native
  
  /**
    * Reports whether the specified matrix is the identity matrix.
    * @example
    * var m = new pc.Mat3();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns True if the matrix is identity and false otherwise.
    */
  def isIdentity(): Boolean = js.native
  
  /**
    * Copies the contents of a source array[9] to a destination 3x3 matrix.
    * @example
    * var dst = new pc.Mat3();
    * dst.set([0, 1, 2, 3, 4, 5, 6, 7, 8]);
    * @param src - An array[9] to be copied.
    * @returns Self for chaining.
    */
  def set(src: js.Array[Double]): Mat3 = js.native
  
  /**
    * Sets the matrix to the identity matrix.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns Self for chaining.
    */
  def setIdentity(): Mat3 = js.native
  
  /**
    * Generates the transpose of the specified 3x3 matrix.
    * @example
    * var m = new pc.Mat3();
    *
    * // Transpose in place
    * m.transpose();
    * @returns Self for chaining.
    */
  def transpose(): Mat3 = js.native
}
object Mat3 {
  
  @scala.inline
  def apply(
    copy: Mat3 => Mat3,
    data: Float32Array,
    equals: Mat3 => Boolean,
    isIdentity: () => Boolean,
    set: js.Array[Double] => Mat3,
    setIdentity: () => Mat3,
    transpose: () => Mat3
  ): Mat3 = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), data = data.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), isIdentity = js.Any.fromFunction0(isIdentity), set = js.Any.fromFunction1(set), setIdentity = js.Any.fromFunction0(setIdentity), transpose = js.Any.fromFunction0(transpose))
    __obj.asInstanceOf[Mat3]
  }
  
  @scala.inline
  implicit class Mat3Ops[Self <: Mat3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopy(value: Mat3 => Mat3): Self = this.set("copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setData(value: Float32Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: Mat3 => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsIdentity(value: () => Boolean): Self = this.set("isIdentity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: js.Array[Double] => Mat3): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIdentity(value: () => Mat3): Self = this.set("setIdentity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTranspose(value: () => Mat3): Self = this.set("transpose", js.Any.fromFunction0(value))
  }
}
