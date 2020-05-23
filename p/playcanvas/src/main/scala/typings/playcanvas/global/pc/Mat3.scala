package typings.playcanvas.global.pc

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new identity Mat3 object.
  * @property data - Matrix elements in the form of a flat array.
  */
@JSGlobal("pc.Mat3")
@js.native
class Mat3 ()
  extends typings.playcanvas.pc.Mat3 {
  /**
    * Matrix elements in the form of a flat array.
    */
  /* CompleteClass */
  override var data: Float32Array = js.native
  /**
    * Copies the contents of a source 3x3 matrix to a destination 3x3 matrix.
    * @example
    * var src = new pc.Mat3().translate(10, 20, 30);
    var dst = new pc.Mat3();
    dst.copy(src);
    console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    * @param rhs - A 3x3 matrix to be copied.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def copy(rhs: typings.playcanvas.pc.Mat3): typings.playcanvas.pc.Mat3 = js.native
  /**
    * Reports whether two matrices are equal.
    * @example
    * var a = new pc.Mat3().translate(10, 20, 30);
    var b = new pc.Mat3();
    console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The other matrix.
    * @returns True if the matrices are equal and false otherwise.
    */
  /* CompleteClass */
  override def equals(rhs: typings.playcanvas.pc.Mat3): Boolean = js.native
  /**
    * Reports whether the specified matrix is the identity matrix.
    * @example
    * var m = new pc.Mat3();
    console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns True if the matrix is identity and false otherwise.
    */
  /* CompleteClass */
  override def isIdentity(): Boolean = js.native
  /**
    * Copies the contents of a source array[9] to a destination 3x3 matrix.
    * @example
    * var dst = new pc.Mat3();
    dst.set([0, 1, 2, 3, 4, 5, 6, 7, 8]);
    * @param src - An array[9] to be copied.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def set(src: js.Array[Double]): typings.playcanvas.pc.Mat3 = js.native
  /**
    * Sets the matrix to the identity matrix.
    * @example
    * m.setIdentity();
    console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def setIdentity(): typings.playcanvas.pc.Mat3 = js.native
  /**
    * Generates the transpose of the specified 3x3 matrix.
    * @example
    * var m = new pc.Mat3();
    
    // Transpose in place
    m.transpose();
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def transpose(): typings.playcanvas.pc.Mat3 = js.native
}

/* static members */
@JSGlobal("pc.Mat3")
@js.native
object Mat3 extends js.Object {
  /**
    * A constant matrix set to the identity.
    */
  val IDENTITY: typings.playcanvas.pc.Mat3 = js.native
  /**
    * A constant matrix with all elements set to 0.
    */
  val ZERO: typings.playcanvas.pc.Mat3 = js.native
}

