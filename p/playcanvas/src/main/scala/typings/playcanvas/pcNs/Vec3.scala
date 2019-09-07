package typings.playcanvas.pcNs

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Vec3
  * @classdesc A 3-dimensional vector.
  * @description Creates a new Vec3 object.
  * @param {Number|Number[]} [x] The x value. If x is an array of length 3, the array will be used to populate all components.
  * @param {Number} [y] The y value.
  * @param {Number} [z] The z value.
  * @example
  * var v = new pc.Vec3(1, 2, 3);
  */
@JSGlobal("pc.Vec3")
@js.native
class Vec3 () extends js.Object {
  def this(x: js.Array[Number]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Number], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.Array[Number], y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  /**
    * @name pc.Vec3#x
    * @type Number
    * @description The first component of the vector.
    * @example
    * var vec = new pc.Vec3(10, 20, 30);
    *
    * // Get x
    * var x = vec.x;
    *
    * // Set x
    * vec.x = 0;
    */
  var x: Double = js.native
  /**
    * @name pc.Vec3#y
    * @type Number
    * @description The second component of the vector.
    * @example
    * var vec = new pc.Vec3(10, 20, 30);
    *
    * // Get y
    * var y = vec.y;
    *
    * // Set y
    * vec.y = 0;
    */
  var y: Double = js.native
  /**
    * @name pc.Vec3#z
    * @type Number
    * @description The third component of the vector.
    * @example
    * var vec = new pc.Vec3(10, 20, 30);
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
    * @name pc.Vec3#add
    * @description Adds a 3-dimensional vector to another in place.
    * @param {pc.Vec3} rhs The vector to add to the specified vector.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    *
    * a.add(b);
    *
    * // Should output [30, 30, 30]
    * console.log("The result of the addition is: " + a.toString());
    */
  def add(rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#add2
    * @description Adds two 3-dimensional vectors together and returns the result.
    * @param {pc.Vec3} lhs The first vector operand for the addition.
    * @param {pc.Vec3} rhs The second vector operand for the addition.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    * var r = new pc.Vec3();
    *
    * r.add2(a, b);
    * // Should output [30, 30, 30]
    *
    * console.log("The result of the addition is: " + r.toString());
    */
  def add2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#copy
    * @description Copied the contents of a source 3-dimensional vector to a destination 3-dimensional vector.
    * @param {pc.Vec3} rhs A vector to copy to the specified vector.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var src = new pc.Vec3(10, 20, 30);
    * var dst = new pc.Vec3();
    *
    * dst.copy(src);
    *
    * console.log("The two vectors are " + (dst.equals(src) ? "equal" : "different"));
    */
  def copy(rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#cross
    * @description Returns the result of a cross product operation performed on the two specified 3-dimensional vectors.
    * @param {pc.Vec3} lhs The first 3-dimensional vector operand of the cross product.
    * @param {pc.Vec3} rhs The second 3-dimensional vector operand of the cross product.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var back = new pc.Vec3().cross(pc.Vec3.RIGHT, pc.Vec3.UP);
    *
    * // Should print the Z axis (i.e. [0, 0, 1])
    * console.log("The result of the cross product is: " + back.toString());
    */
  def cross(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#distance
    * @description Returns the distance between the two specified 3-dimensional vectors.
    * @param {pc.Vec3} rhs The second 3-dimensional vector to test.
    * @returns {Number} The distance between the two vectors.
    * @example
    * var v1 = new pc.Vec3(5, 10, 20);
    * var v2 = new pc.Vec3(10, 20, 40);
    * var d = v1.distance(v2);
    * console.log("The between v1 and v2 is: " + d);
    */
  def distance(rhs: Vec3): Double = js.native
  /**
    * @function
    * @name pc.Vec3#dot
    * @description Returns the result of a dot product operation performed on the two specified 3-dimensional vectors.
    * @param {pc.Vec3} rhs The second 3-dimensional vector operand of the dot product.
    * @returns {Number} The result of the dot product operation.
    * @example
    * var v1 = new pc.Vec3(5, 10, 20);
    * var v2 = new pc.Vec3(10, 20, 40);
    * var v1dotv2 = v1.dot(v2);
    * console.log("The result of the dot product is: " + v1dotv2);
    */
  def dot(rhs: Vec3): Double = js.native
  /**
    * @function
    * @name pc.Vec3#equals
    * @description Reports whether two vectors are equal.
    * @param {pc.Vec3} rhs The vector to compare to the specified vector.
    * @returns {Boolean} true if the vectors are equal and false otherwise.
    * @example
    * var a = new pc.Vec3(1, 2, 3);
    * var b = new pc.Vec3(4, 5, 6);
    * console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Vec3): Boolean = js.native
  /**
    * @function
    * @name pc.Vec3#length
    * @description Returns the magnitude of the specified 3-dimensional vector.
    * @returns {Number} The magnitude of the specified 3-dimensional vector.
    * @example
    * var vec = new pc.Vec3(3, 4, 0);
    * var len = vec.length();
    * // Should output 5
    * console.log("The length of the vector is: " + len);
    */
  def length(): Double = js.native
  /**
    * @function
    * @name pc.Vec3#lengthSq
    * @description Returns the magnitude squared of the specified 3-dimensional vector.
    * @returns {Number} The magnitude of the specified 3-dimensional vector.
    * @example
    * var vec = new pc.Vec3(3, 4, 0);
    * var len = vec.lengthSq();
    * // Should output 25
    * console.log("The length squared of the vector is: " + len);
    */
  def lengthSq(): Double = js.native
  /**
    * @function
    * @name pc.Vec3#lerp
    * @description Returns the result of a linear interpolation between two specified 3-dimensional vectors.
    * @param {pc.Vec3} lhs The 3-dimensional to interpolate from.
    * @param {pc.Vec3} rhs The 3-dimensional to interpolate to.
    * @param {Number} alpha The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    * will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    * a ray extrapolated from this line.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(0, 0, 0);
    * var b = new pc.Vec3(10, 10, 10);
    * var r = new pc.Vec3();
    *
    * r.lerp(a, b, 0);   // r is equal to a
    * r.lerp(a, b, 0.5); // r is 5, 5, 5
    * r.lerp(a, b, 1);   // r is equal to b
    */
  def lerp(lhs: Vec3, rhs: Vec3, alpha: Double): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#mul
    * @description Multiplies a 3-dimensional vector to another in place.
    * @param {pc.Vec3} rhs The 3-dimensional vector used as the second multiplicand of the operation.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(2, 3, 4);
    * var b = new pc.Vec3(4, 5, 6);
    *
    * a.mul(b);
    *
    * // Should output 8, 15, 24
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#mul2
    * @description Returns the result of multiplying the specified 3-dimensional vectors together.
    * @param {pc.Vec3} lhs The 3-dimensional vector used as the first multiplicand of the operation.
    * @param {pc.Vec3} rhs The 3-dimensional vector used as the second multiplicand of the operation.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(2, 3, 4);
    * var b = new pc.Vec3(4, 5, 6);
    * var r = new pc.Vec3();
    *
    * r.mul2(a, b);
    *
    * // Should output 8, 15, 24
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#normalize
    * @description Returns the specified 3-dimensional vector copied and converted to a unit vector.
    * If the vector has a length of zero, the vector's elements will be set to zero.
    * @returns {pc.Vec3} The result of the normalization.
    * @example
    * var v = new pc.Vec3(25, 0, 0);
    *
    * v.normalize();
    *
    * // Should output 1, 0, 0, 0
    * console.log("The result of the vector normalization is: " + v.toString());
    */
  def normalize(): Vec3 = js.native
  /**
    * @function
    * @name  pc.Vec3#project
    * @description Projects this 3-dimensional vector onto the specified vector.
    * @param {pc.Vec3} rhs The vector onto which the original vector will be projected on.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var v = new pc.Vec3(5, 5, 5);
    * var normal = new pc.Vec3(1, 0, 0);
    *
    * v.project(normal);
    *
    * // Should output 5, 0, 0
    * console.log("The result of the vector projection is: " + v.toString());
    */
  def project(rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#scale
    * @description Scales each dimension of the specified 3-dimensional vector by the supplied
    * scalar value.
    * @param {Number} scalar The value by which each vector component is multiplied.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var v = new pc.Vec3(2, 4, 8);
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
  def scale(scalar: Double): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#set
    * @description Sets the specified 3-dimensional vector to the supplied numerical values.
    * @param {Number} x The value to set on the first component of the vector.
    * @param {Number} y The value to set on the second component of the vector.
    * @param {Number} z The value to set on the third component of the vector.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var v = new pc.Vec3();
    * v.set(5, 10, 20);
    *
    * // Should output 5, 10, 20
    * console.log("The result of the vector set is: " + v.toString());
    */
  def set(x: Double, y: Double, z: Double): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#sub
    * @description Subtracts a 3-dimensional vector from another in place.
    * @param {pc.Vec3} rhs The vector to add to the specified vector.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    *
    * a.sub(b);
    *
    * // Should output [-10, -10, -10]
    * console.log("The result of the addition is: " + a.toString());
    */
  def sub(rhs: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Vec3#sub2
    * @description Subtracts two 3-dimensional vectors from one another and returns the result.
    * @param {pc.Vec3} lhs The first vector operand for the addition.
    * @param {pc.Vec3} rhs The second vector operand for the addition.
    * @returns {pc.Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    * var r = new pc.Vec3();
    *
    * r.sub2(a, b);
    *
    * // Should output [-10, -10, -10]
    * console.log("The result of the addition is: " + r.toString());
    */
  def sub2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
}

/* static members */
@JSGlobal("pc.Vec3")
@js.native
object Vec3 extends js.Object {
  /**
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.BACK
    * @description A constant vector set to [0, 0, 1].
    */
  val BACK: Vec3 = js.native
  /**
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.DOWN
    * @description A constant vector set to [0, -1, 0].
    */
  val DOWN: Vec3 = js.native
  /**
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.FORWARD
    * @description A constant vector set to [0, 0, -1].
    */
  val FORWARD: Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.LEFT
    * @description A constant vector set to [-1, 0, 0].
    */
  val LEFT: Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.ONE
    * @description A constant vector set to [1, 1, 1].
    */
  val ONE: Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.RIGHT
    * @description A constant vector set to [1, 0, 0].
    */
  val RIGHT: Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.UP
    * @description A constant vector set to [0, 1, 0].
    */
  val UP: Vec3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Vec3
    * @name pc.Vec3.ZERO
    * @description A constant vector set to [0, 0, 0].
    */
  val ZERO: Vec3 = js.native
}

