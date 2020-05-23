package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new Vec4 object.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  * @param [x] - The x value. If x is an array of length 4, the array will be used to populate all components.
  * @param [y] - The y value.
  * @param [z] - The z value.
  * @param [w] - The w value.
  */
@JSImport("playcanvas", "Vec4")
@js.native
class Vec4 ()
  extends typings.playcanvas.pc.Vec4 {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  /**
    * The fourth component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get w
    var w = vec.w;
    
    // Set w
    vec.w = 0;
    */
  /* CompleteClass */
  override var w: Double = js.native
  /**
    * The first component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get x
    var x = vec.x;
    
    // Set x
    vec.x = 0;
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * The second component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get y
    var y = vec.y;
    
    // Set y
    vec.y = 0;
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * The third component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get z
    var z = vec.z;
    
    // Set z
    vec.z = 0;
    */
  /* CompleteClass */
  override var z: Double = js.native
  /**
    * Adds a 4-dimensional vector to another in place.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    var b = new pc.Vec4(20, 20, 20, 20);
    
    a.add(b);
    
    // Should output [30, 30, 30]
    console.log("The result of the addition is: " + a.toString());
    * @param rhs - The vector to add to the specified vector.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def add(rhs: typings.playcanvas.pc.Vec4): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Adds two 4-dimensional vectors together and returns the result.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    var b = new pc.Vec4(20, 20, 20, 20);
    var r = new pc.Vec4();
    
    r.add2(a, b);
    // Should output [30, 30, 30]
    
    console.log("The result of the addition is: " + r.toString());
    * @param lhs - The first vector operand for the addition.
    * @param rhs - The second vector operand for the addition.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def add2(lhs: typings.playcanvas.pc.Vec4, rhs: typings.playcanvas.pc.Vec4): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Copied the contents of a source 4-dimensional vector to a destination 4-dimensional vector.
    * @example
    * var src = new pc.Vec4(10, 20, 30, 40);
    var dst = new pc.Vec4();
    
    dst.copy(src);
    
    console.log("The two vectors are " + (dst.equals(src) ? "equal" : "different"));
    * @param rhs - A vector to copy to the specified vector.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def copy(rhs: typings.playcanvas.pc.Vec4): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Returns the result of a dot product operation performed on the two specified 4-dimensional vectors.
    * @example
    * var v1 = new pc.Vec4(5, 10, 20, 40);
    var v2 = new pc.Vec4(10, 20, 40, 80);
    var v1dotv2 = v1.dot(v2);
    console.log("The result of the dot product is: " + v1dotv2);
    * @param rhs - The second 4-dimensional vector operand of the dot product.
    * @returns The result of the dot product operation.
    */
  /* CompleteClass */
  override def dot(rhs: typings.playcanvas.pc.Vec4): Double = js.native
  /**
    * Reports whether two vectors are equal.
    * @example
    * var a = new pc.Vec4(1, 2, 3, 4);
    var b = new pc.Vec4(5, 6, 7, 8);
    console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The vector to compare to the specified vector.
    * @returns True if the vectors are equal and false otherwise.
    */
  /* CompleteClass */
  override def equals(rhs: typings.playcanvas.pc.Vec4): Boolean = js.native
  /**
    * Returns the magnitude of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0, 0);
    var len = vec.length();
    // Should output 5
    console.log("The length of the vector is: " + len);
    * @returns The magnitude of the specified 4-dimensional vector.
    */
  /* CompleteClass */
  override def length(): Double = js.native
  /**
    * Returns the magnitude squared of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0);
    var len = vec.lengthSq();
    // Should output 25
    console.log("The length squared of the vector is: " + len);
    * @returns The magnitude of the specified 4-dimensional vector.
    */
  /* CompleteClass */
  override def lengthSq(): Double = js.native
  /**
    * Returns the result of a linear interpolation between two specified 4-dimensional vectors.
    * @example
    * var a = new pc.Vec4(0, 0, 0, 0);
    var b = new pc.Vec4(10, 10, 10, 10);
    var r = new pc.Vec4();
    
    r.lerp(a, b, 0);   // r is equal to a
    r.lerp(a, b, 0.5); // r is 5, 5, 5, 5
    r.lerp(a, b, 1);   // r is equal to b
    * @param lhs - The 4-dimensional to interpolate from.
    * @param rhs - The 4-dimensional to interpolate to.
    * @param alpha - The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    a ray extrapolated from this line.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def lerp(lhs: typings.playcanvas.pc.Vec4, rhs: typings.playcanvas.pc.Vec4, alpha: Double): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Multiplies a 4-dimensional vector to another in place.
    * @example
    * var a = new pc.Vec4(2, 3, 4, 5);
    var b = new pc.Vec4(4, 5, 6, 7);
    
    a.mul(b);
    
    // Should output 8, 15, 24, 35
    console.log("The result of the multiplication is: " + a.toString());
    * @param rhs - The 4-dimensional vector used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def mul(rhs: typings.playcanvas.pc.Vec4): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Returns the result of multiplying the specified 4-dimensional vectors together.
    * @example
    * var a = new pc.Vec4(2, 3, 4, 5);
    var b = new pc.Vec4(4, 5, 6, 7);
    var r = new pc.Vec4();
    
    r.mul2(a, b);
    
    // Should output 8, 15, 24, 35
    console.log("The result of the multiplication is: " + r.toString());
    * @param lhs - The 4-dimensional vector used as the first multiplicand of the operation.
    * @param rhs - The 4-dimensional vector used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def mul2(lhs: typings.playcanvas.pc.Vec4, rhs: typings.playcanvas.pc.Vec4): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Returns this 4-dimensional vector converted to a unit vector in place.
    If the vector has a length of zero, the vector's elements will be set to zero.
    * @example
    * var v = new pc.Vec4(25, 0, 0, 0);
    
    v.normalize();
    
    // Should output 1, 0, 0, 0
    console.log("The result of the vector normalization is: " + v.toString());
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def normalize(): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Scales each dimension of the specified 4-dimensional vector by the supplied
    scalar value.
    * @example
    * var v = new pc.Vec4(2, 4, 8, 16);
    
    // Multiply by 2
    v.scale(2);
    
    // Negate
    v.scale(-1);
    
    // Divide by 2
    v.scale(0.5);
    * @param scalar - The value by which each vector component is multiplied.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def scale(scalar: Double): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Sets the specified 4-dimensional vector to the supplied numerical values.
    * @example
    * var v = new pc.Vec4();
    v.set(5, 10, 20, 40);
    
    // Should output 5, 10, 20, 40
    console.log("The result of the vector set is: " + v.toString());
    * @param x - The value to set on the first component of the vector.
    * @param y - The value to set on the second component of the vector.
    * @param z - The value to set on the third component of the vector.
    * @param w - The value to set on the fourth component of the vector.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def set(x: Double, y: Double, z: Double, w: Double): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Subtracts a 4-dimensional vector from another in place.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    var b = new pc.Vec4(20, 20, 20, 20);
    
    a.sub(b);
    
    // Should output [-10, -10, -10, -10]
    console.log("The result of the subtraction is: " + a.toString());
    * @param rhs - The vector to add to the specified vector.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def sub(rhs: typings.playcanvas.pc.Vec4): typings.playcanvas.pc.Vec4 = js.native
  /**
    * Subtracts two 4-dimensional vectors from one another and returns the result.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    var b = new pc.Vec4(20, 20, 20, 20);
    var r = new pc.Vec4();
    
    r.sub2(a, b);
    
    // Should output [-10, -10, -10, -10]
    console.log("The result of the subtraction is: " + r.toString());
    * @param lhs - The first vector operand for the subtraction.
    * @param rhs - The second vector operand for the subtraction.
    * @returns Self for chaining.
    */
  /* CompleteClass */
  override def sub2(lhs: typings.playcanvas.pc.Vec4, rhs: typings.playcanvas.pc.Vec4): typings.playcanvas.pc.Vec4 = js.native
}

/* static members */
@JSImport("playcanvas", "Vec4")
@js.native
object Vec4 extends js.Object {
  /**
    * A constant vector set to [1, 1, 1, 1].
    */
  val ONE: typings.playcanvas.pc.Vec4 = js.native
  /**
    * A constant vector set to [0, 0, 0, 0].
    */
  val ZERO: typings.playcanvas.pc.Vec4 = js.native
}

