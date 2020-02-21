package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Vec4
  * @classdesc A 4-dimensional vector.
  * @description Creates a new Vec4 object.
  * @param {number|number[]} [x] - The x value. If x is an array of length 4, the array will be used to populate all components.
  * @param {number} [y] - The y value.
  * @param {number} [z] - The z value.
  * @param {number} [w] - The w value.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  */
@JSGlobal("pc.Vec4")
@js.native
class Vec4 () extends js.Object {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  /**
    * @field
    * @name pc.Vec4#w
    * @type {number}
    * @description The fourth component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    *
    * // Get w
    * var w = vec.w;
    *
    * // Set w
    * vec.w = 0;
    */
  var w: Double = js.native
  /**
    * @field
    * @name pc.Vec4#x
    * @type {number}
    * @description The first component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    *
    * // Get x
    * var x = vec.x;
    *
    * // Set x
    * vec.x = 0;
    */
  var x: Double = js.native
  /**
    * @field
    * @name pc.Vec4#y
    * @type {number}
    * @description The second component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    *
    * // Get y
    * var y = vec.y;
    *
    * // Set y
    * vec.y = 0;
    */
  var y: Double = js.native
  /**
    * @field
    * @name pc.Vec4#z
    * @type {number}
    * @description The third component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    *
    * // Get z
    * var z = vec.z;
    *
    * // Set z
    * vec.z = 0;
    */
  var z: Double = js.native
  /**
    * @function
    * @name pc.Vec4#add
    * @description Adds a 4-dimensional vector to another in place.
    * @param {pc.Vec4} rhs - The vector to add to the specified vector.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    *
    * a.add(b);
    *
    * // Should output [30, 30, 30]
    * console.log("The result of the addition is: " + a.toString());
    */
  def add(rhs: Vec4): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#add2
    * @description Adds two 4-dimensional vectors together and returns the result.
    * @param {pc.Vec4} lhs - The first vector operand for the addition.
    * @param {pc.Vec4} rhs - The second vector operand for the addition.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    * var r = new pc.Vec4();
    *
    * r.add2(a, b);
    * // Should output [30, 30, 30]
    *
    * console.log("The result of the addition is: " + r.toString());
    */
  def add2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#copy
    * @description Copied the contents of a source 4-dimensional vector to a destination 4-dimensional vector.
    * @param {pc.Vec4} rhs - A vector to copy to the specified vector.
    * @returns {pc.Vec4} Self for chaining.
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
    * @function
    * @name pc.Vec4#dot
    * @description Returns the result of a dot product operation performed on the two specified 4-dimensional vectors.
    * @param {pc.Vec4} rhs - The second 4-dimensional vector operand of the dot product.
    * @returns {number} The result of the dot product operation.
    * @example
    * var v1 = new pc.Vec4(5, 10, 20, 40);
    * var v2 = new pc.Vec4(10, 20, 40, 80);
    * var v1dotv2 = v1.dot(v2);
    * console.log("The result of the dot product is: " + v1dotv2);
    */
  def dot(rhs: Vec4): Double = js.native
  /**
    * @function
    * @name pc.Vec4#equals
    * @description Reports whether two vectors are equal.
    * @param {pc.Vec4} rhs - The vector to compare to the specified vector.
    * @returns {boolean} True if the vectors are equal and false otherwise.
    * @example
    * var a = new pc.Vec4(1, 2, 3, 4);
    * var b = new pc.Vec4(5, 6, 7, 8);
    * console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Vec4): Boolean = js.native
  /**
    * @function
    * @name pc.Vec4#length
    * @description Returns the magnitude of the specified 4-dimensional vector.
    * @returns {number} The magnitude of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0, 0);
    * var len = vec.length();
    * // Should output 5
    * console.log("The length of the vector is: " + len);
    */
  def length(): Double = js.native
  /**
    * @function
    * @name pc.Vec4#lengthSq
    * @description Returns the magnitude squared of the specified 4-dimensional vector.
    * @returns {number} The magnitude of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0);
    * var len = vec.lengthSq();
    * // Should output 25
    * console.log("The length squared of the vector is: " + len);
    */
  def lengthSq(): Double = js.native
  /**
    * @function
    * @name pc.Vec4#lerp
    * @description Returns the result of a linear interpolation between two specified 4-dimensional vectors.
    * @param {pc.Vec4} lhs - The 4-dimensional to interpolate from.
    * @param {pc.Vec4} rhs - The 4-dimensional to interpolate to.
    * @param {number} alpha - The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    * will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    * a ray extrapolated from this line.
    * @returns {pc.Vec4} Self for chaining.
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
    * @function
    * @name pc.Vec4#mul
    * @description Multiplies a 4-dimensional vector to another in place.
    * @param {pc.Vec4} rhs - The 4-dimensional vector used as the second multiplicand of the operation.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(2, 3, 4, 5);
    * var b = new pc.Vec4(4, 5, 6, 7);
    *
    * a.mul(b);
    *
    * // Should output 8, 15, 24, 35
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Vec4): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#mul2
    * @description Returns the result of multiplying the specified 4-dimensional vectors together.
    * @param {pc.Vec4} lhs - The 4-dimensional vector used as the first multiplicand of the operation.
    * @param {pc.Vec4} rhs - The 4-dimensional vector used as the second multiplicand of the operation.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(2, 3, 4, 5);
    * var b = new pc.Vec4(4, 5, 6, 7);
    * var r = new pc.Vec4();
    *
    * r.mul2(a, b);
    *
    * // Should output 8, 15, 24, 35
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#normalize
    * @description Returns this 4-dimensional vector converted to a unit vector in place.
    * If the vector has a length of zero, the vector's elements will be set to zero.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var v = new pc.Vec4(25, 0, 0, 0);
    *
    * v.normalize();
    *
    * // Should output 1, 0, 0, 0
    * console.log("The result of the vector normalization is: " + v.toString());
    */
  def normalize(): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#scale
    * @description Scales each dimension of the specified 4-dimensional vector by the supplied
    * scalar value.
    * @param {number} scalar - The value by which each vector component is multiplied.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var v = new pc.Vec4(2, 4, 8, 16);
    *
    * // Multiply by 2
    * v.scale(2);
    *
    * // Negate
    * v.scale(-1);
    *
    * // Divide by 2
    * v.scale(0.5);
    */
  def scale(scalar: Double): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#set
    * @description Sets the specified 4-dimensional vector to the supplied numerical values.
    * @param {number} x - The value to set on the first component of the vector.
    * @param {number} y - The value to set on the second component of the vector.
    * @param {number} z - The value to set on the third component of the vector.
    * @param {number} w - The value to set on the fourth component of the vector.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var v = new pc.Vec4();
    * v.set(5, 10, 20, 40);
    *
    * // Should output 5, 10, 20, 40
    * console.log("The result of the vector set is: " + v.toString());
    */
  def set(x: Double, y: Double, z: Double, w: Double): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#sub
    * @description Subtracts a 4-dimensional vector from another in place.
    * @param {pc.Vec4} rhs - The vector to add to the specified vector.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    *
    * a.sub(b);
    *
    * // Should output [-10, -10, -10, -10]
    * console.log("The result of the subtraction is: " + a.toString());
    */
  def sub(rhs: Vec4): Vec4 = js.native
  /**
    * @function
    * @name pc.Vec4#sub2
    * @description Subtracts two 4-dimensional vectors from one another and returns the result.
    * @param {pc.Vec4} lhs - The first vector operand for the subtraction.
    * @param {pc.Vec4} rhs - The second vector operand for the subtraction.
    * @returns {pc.Vec4} Self for chaining.
    * @example
    * var a = new pc.Vec4(10, 10, 10, 10);
    * var b = new pc.Vec4(20, 20, 20, 20);
    * var r = new pc.Vec4();
    *
    * r.sub2(a, b);
    *
    * // Should output [-10, -10, -10, -10]
    * console.log("The result of the subtraction is: " + r.toString());
    */
  def sub2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
}

/* static members */
@JSGlobal("pc.Vec4")
@js.native
object Vec4 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec4.ONE
    * @type {pc.Vec4}
    * @description A constant vector set to [1, 1, 1, 1].
    */
  val ONE: Vec4 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Vec4.ZERO
    * @type {pc.Vec4}
    * @description A constant vector set to [0, 0, 0, 0].
    */
  val ZERO: Vec4 = js.native
}

