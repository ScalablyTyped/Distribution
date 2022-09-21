package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 4-dimensional vector.
  */
@JSImport("playcanvas", "Vec4")
@js.native
/**
  * Creates a new Vec4 object.
  *
  * @param {number|number[]} [x] - The x value. Defaults to 0. If x is an array of length 4, the
  * array will be used to populate all components.
  * @param {number} [y] - The y value. Defaults to 0.
  * @param {number} [z] - The z value. Defaults to 0.
  * @param {number} [w] - The w value. Defaults to 0.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  */
open class Vec4 () extends StObject {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Unit, w: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Unit, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
  
  /**
    * Adds a 4-dimensional vector to another in place.
    *
    * @param {Vec4} rhs - The vector to add to the specified vector.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    *
    * a.add(b);
    *
    * // Outputs [30, 30, 30]
    * console.log("The result of the addition is: " + a.toString());
    */
  def add(rhs: Vec4): Vec4 = js.native
  
  /**
    * Adds two 4-dimensional vectors together and returns the result.
    *
    * @param {Vec4} lhs - The first vector operand for the addition.
    * @param {Vec4} rhs - The second vector operand for the addition.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    * var r = new pc.Vec4();
    *
    * r.add2(a, b);
    * // Outputs [30, 30, 30]
    *
    * console.log("The result of the addition is: " + r.toString());
    */
  def add2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  
  /**
    * Adds a number to each element of a vector.
    *
    * @param {number} scalar - The number to add.
    * @returns {Vec4} Self for chaining.
    * @example
    * var vec = new pc.Vec4(3, 4, 5, 6);
    *
    * vec.addScalar(2);
    *
    * // Outputs [5, 6, 7, 8]
    * console.log("The result of the addition is: " + vec.toString());
    */
  def addScalar(scalar: Double): Vec4 = js.native
  
  /**
    * Each element is rounded up to the next largest integer.
    *
    * @returns {Vec4} Self for chaining.
    */
  def ceil(): Vec4 = js.native
  
  /**
    * Copies the contents of a source 4-dimensional vector to a destination 4-dimensional vector.
    *
    * @param {Vec4} rhs - A vector to copy to the specified vector.
    * @returns {Vec4} Self for chaining.
    * @example
    * var src = new pc.Vec4(10, 20, 30, 40);
    * var dst = new pc.Vec4();
    *
    * dst.copy(src);
    *
    * console.log("The two vectors are " + (dst.equals(src) ? "equal" : "different"));
    */
  def copy(rhs: Vec4): Vec4 = js.native
  
  /**
    * Divides a 4-dimensional vector by another in place.
    *
    * @param {Vec4} rhs - The vector to divide the specified vector by.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(4, 9, 16, 25);
    * var b = new pc.Vec4(2, 3, 4, 5);
    *
    * a.div(b);
    *
    * // Outputs [2, 3, 4, 5]
    * console.log("The result of the division is: " + a.toString());
    */
  def div(rhs: Vec4): Vec4 = js.native
  
  /**
    * Divides one 4-dimensional vector by another and writes the result to the specified vector.
    *
    * @param {Vec4} lhs - The dividend vector (the vector being divided).
    * @param {Vec4} rhs - The divisor vector (the vector dividing the dividend).
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(4, 9, 16, 25);
    * var b = new pc.Vec4(2, 3, 4, 5);
    * var r = new pc.Vec4();
    *
    * r.div2(a, b);
    * // Outputs [2, 3, 4, 5]
    *
    * console.log("The result of the division is: " + r.toString());
    */
  def div2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  
  /**
    * Divides each element of a vector by a number.
    *
    * @param {number} scalar - The number to divide by.
    * @returns {Vec4} Self for chaining.
    * @example
    * var vec = new pc.Vec4(3, 6, 9, 12);
    *
    * vec.divScalar(3);
    *
    * // Outputs [1, 2, 3, 4]
    * console.log("The result of the division is: " + vec.toString());
    */
  def divScalar(scalar: Double): Vec4 = js.native
  
  /**
    * Returns the result of a dot product operation performed on the two specified 4-dimensional
    * vectors.
    *
    * @param {Vec4} rhs - The second 4-dimensional vector operand of the dot product.
    * @returns {number} The result of the dot product operation.
    * @example
    * var v1 = new pc.Vec4(5, 10, 20, 40);
    * var v2 = new pc.Vec4(10, 20, 40, 80);
    * var v1dotv2 = v1.dot(v2);
    * console.log("The result of the dot product is: " + v1dotv2);
    */
  def dot(rhs: Vec4): Double = js.native
  
  /**
    * Reports whether two vectors are equal.
    *
    * @param {Vec4} rhs - The vector to compare to the specified vector.
    * @returns {boolean} True if the vectors are equal and false otherwise.
    * @example
    * var a = new pc.Vec4(1, 2, 3, 4);
    * var b = new pc.Vec4(5, 6, 7, 8);
    * console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Vec4): Boolean = js.native
  
  /**
    * Each element is set to the largest integer less than or equal to its value.
    *
    * @returns {Vec4} Self for chaining.
    */
  def floor(): Vec4 = js.native
  
  /**
    * Returns the magnitude of the specified 4-dimensional vector.
    *
    * @returns {number} The magnitude of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0, 0);
    * var len = vec.length();
    * // Outputs 5
    * console.log("The length of the vector is: " + len);
    */
  def length(): Double = js.native
  
  /**
    * Returns the magnitude squared of the specified 4-dimensional vector.
    *
    * @returns {number} The magnitude of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0);
    * var len = vec.lengthSq();
    * // Outputs 25
    * console.log("The length squared of the vector is: " + len);
    */
  def lengthSq(): Double = js.native
  
  /**
    * Returns the result of a linear interpolation between two specified 4-dimensional vectors.
    *
    * @param {Vec4} lhs - The 4-dimensional to interpolate from.
    * @param {Vec4} rhs - The 4-dimensional to interpolate to.
    * @param {number} alpha - The value controlling the point of interpolation. Between 0 and 1,
    * the linear interpolant will occur on a straight line between lhs and rhs. Outside of this
    * range, the linear interpolant will occur on a ray extrapolated from this line.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(0, 0, 0, 0);
    * var b = new pc.Vec4(10, 10, 10, 10);
    * var r = new pc.Vec4();
    *
    * r.lerp(a, b, 0);   // r is equal to a
    * r.lerp(a, b, 0.5); // r is 5, 5, 5, 5
    * r.lerp(a, b, 1);   // r is equal to b
    */
  def lerp(lhs: Vec4, rhs: Vec4, alpha: Double): Vec4 = js.native
  
  /**
    * Each element is assigned a value from rhs parameter if it is larger.
    *
    * @param {Vec4} rhs - The 4-dimensional vector used as the source of elements to compare to.
    * @returns {Vec4} Self for chaining.
    */
  def max(rhs: Vec4): Vec4 = js.native
  
  /**
    * Each element is assigned a value from rhs parameter if it is smaller.
    *
    * @param {Vec4} rhs - The 4-dimensional vector used as the source of elements to compare to.
    * @returns {Vec4} Self for chaining.
    */
  def min(rhs: Vec4): Vec4 = js.native
  
  /**
    * Multiplies a 4-dimensional vector to another in place.
    *
    * @param {Vec4} rhs - The 4-dimensional vector used as the second multiplicand of the operation.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(2, 3, 4, 5);
    * var b = new pc.Vec4(4, 5, 6, 7);
    *
    * a.mul(b);
    *
    * // Outputs 8, 15, 24, 35
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Vec4): Vec4 = js.native
  
  /**
    * Returns the result of multiplying the specified 4-dimensional vectors together.
    *
    * @param {Vec4} lhs - The 4-dimensional vector used as the first multiplicand of the operation.
    * @param {Vec4} rhs - The 4-dimensional vector used as the second multiplicand of the operation.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(2, 3, 4, 5);
    * var b = new pc.Vec4(4, 5, 6, 7);
    * var r = new pc.Vec4();
    *
    * r.mul2(a, b);
    *
    * // Outputs 8, 15, 24, 35
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  
  /**
    * Multiplies each element of a vector by a number.
    *
    * @param {number} scalar - The number to multiply by.
    * @returns {Vec4} Self for chaining.
    * @example
    * var vec = new pc.Vec4(3, 6, 9, 12);
    *
    * vec.mulScalar(3);
    *
    * // Outputs [9, 18, 27, 36]
    * console.log("The result of the multiplication is: " + vec.toString());
    */
  def mulScalar(scalar: Double): Vec4 = js.native
  
  /**
    * Returns this 4-dimensional vector converted to a unit vector in place. If the vector has a
    * length of zero, the vector's elements will be set to zero.
    *
    * @returns {Vec4} Self for chaining.
    * @example
    * var v = new pc.Vec4(25, 0, 0, 0);
    *
    * v.normalize();
    *
    * // Outputs 1, 0, 0, 0
    * console.log("The result of the vector normalization is: " + v.toString());
    */
  def normalize(): Vec4 = js.native
  
  /**
    * Each element is rounded up or down to the nearest integer.
    *
    * @returns {Vec4} Self for chaining.
    */
  def round(): Vec4 = js.native
  
  /**
    * Sets the specified 4-dimensional vector to the supplied numerical values.
    *
    * @param {number} x - The value to set on the first component of the vector.
    * @param {number} y - The value to set on the second component of the vector.
    * @param {number} z - The value to set on the third component of the vector.
    * @param {number} w - The value to set on the fourth component of the vector.
    * @returns {Vec4} Self for chaining.
    * @example
    * var v = new pc.Vec4();
    * v.set(5, 10, 20, 40);
    *
    * // Outputs 5, 10, 20, 40
    * console.log("The result of the vector set is: " + v.toString());
    */
  def set(x: Double, y: Double, z: Double, w: Double): Vec4 = js.native
  
  /**
    * Subtracts a 4-dimensional vector from another in place.
    *
    * @param {Vec4} rhs - The vector to add to the specified vector.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    *
    * a.sub(b);
    *
    * // Outputs [-10, -10, -10, -10]
    * console.log("The result of the subtraction is: " + a.toString());
    */
  def sub(rhs: Vec4): Vec4 = js.native
  
  /**
    * Subtracts two 4-dimensional vectors from one another and returns the result.
    *
    * @param {Vec4} lhs - The first vector operand for the subtraction.
    * @param {Vec4} rhs - The second vector operand for the subtraction.
    * @returns {Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    * var r = new pc.Vec4();
    *
    * r.sub2(a, b);
    *
    * // Outputs [-10, -10, -10, -10]
    * console.log("The result of the subtraction is: " + r.toString());
    */
  def sub2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  
  /**
    * Subtracts a number from each element of a vector.
    *
    * @param {number} scalar - The number to subtract.
    * @returns {Vec4} Self for chaining.
    * @example
    * var vec = new pc.Vec4(3, 4, 5, 6);
    *
    * vec.subScalar(2);
    *
    * // Outputs [1, 2, 3, 4]
    * console.log("The result of the subtraction is: " + vec.toString());
    */
  def subScalar(scalar: Double): Vec4 = js.native
  
  /**
    * The fourth component of the vector.
    *
    * @type {number}
    */
  var w: Double = js.native
  
  /**
    * The first component of the vector.
    *
    * @type {number}
    */
  var x: Double = js.native
  
  /**
    * The second component of the vector.
    *
    * @type {number}
    */
  var y: Double = js.native
  
  /**
    * The third component of the vector.
    *
    * @type {number}
    */
  var z: Double = js.native
}
object Vec4 {
  
  /**
    * A constant vector set to [1, 1, 1, 1].
    *
    * @type {Vec4}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec4.ONE")
  @js.native
  val ONE: Vec4 = js.native
  
  /**
    * A constant vector set to [0, 0, 0, 0].
    *
    * @type {Vec4}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec4.ZERO")
  @js.native
  val ZERO: Vec4 = js.native
}
