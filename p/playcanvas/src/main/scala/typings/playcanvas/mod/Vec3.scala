package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 3-dimensional vector.
  */
@JSImport("playcanvas", "Vec3")
@js.native
/**
  * Creates a new Vec3 object.
  *
  * @param {number|number[]} [x] - The x value. Defaults to 0. If x is an array of length 3, the
  * array will be used to populate all components.
  * @param {number} [y] - The y value. Defaults to 0.
  * @param {number} [z] - The z value. Defaults to 0.
  * @example
  * var v = new pc.Vec3(1, 2, 3);
  */
open class Vec3 () extends StObject {
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
  
  /**
    * Adds a 3-dimensional vector to another in place.
    *
    * @param {Vec3} rhs - The vector to add to the specified vector.
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    *
    * a.add(b);
    *
    * // Outputs [30, 30, 30]
    * console.log("The result of the addition is: " + a.toString());
    */
  def add(rhs: Vec3): Vec3 = js.native
  
  /**
    * Adds two 3-dimensional vectors together and returns the result.
    *
    * @param {Vec3} lhs - The first vector operand for the addition.
    * @param {Vec3} rhs - The second vector operand for the addition.
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    * var r = new pc.Vec3();
    *
    * r.add2(a, b);
    * // Outputs [30, 30, 30]
    *
    * console.log("The result of the addition is: " + r.toString());
    */
  def add2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Adds a number to each element of a vector.
    *
    * @param {number} scalar - The number to add.
    * @returns {Vec3} Self for chaining.
    * @example
    * var vec = new pc.Vec3(3, 4, 5);
    *
    * vec.addScalar(2);
    *
    * // Outputs [5, 6, 7]
    * console.log("The result of the addition is: " + vec.toString());
    */
  def addScalar(scalar: Double): Vec3 = js.native
  
  /**
    * Each element is rounded up to the next largest integer.
    *
    * @returns {Vec3} Self for chaining.
    */
  def ceil(): Vec3 = js.native
  
  /**
    * Copies the contents of a source 3-dimensional vector to a destination 3-dimensional vector.
    *
    * @param {Vec3} rhs - A vector to copy to the specified vector.
    * @returns {Vec3} Self for chaining.
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
    * Returns the result of a cross product operation performed on the two specified 3-dimensional
    * vectors.
    *
    * @param {Vec3} lhs - The first 3-dimensional vector operand of the cross product.
    * @param {Vec3} rhs - The second 3-dimensional vector operand of the cross product.
    * @returns {Vec3} Self for chaining.
    * @example
    * var back = new pc.Vec3().cross(pc.Vec3.RIGHT, pc.Vec3.UP);
    *
    * // Prints the Z axis (i.e. [0, 0, 1])
    * console.log("The result of the cross product is: " + back.toString());
    */
  def cross(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Returns the distance between the two specified 3-dimensional vectors.
    *
    * @param {Vec3} rhs - The second 3-dimensional vector to test.
    * @returns {number} The distance between the two vectors.
    * @example
    * var v1 = new pc.Vec3(5, 10, 20);
    * var v2 = new pc.Vec3(10, 20, 40);
    * var d = v1.distance(v2);
    * console.log("The distance between v1 and v2 is: " + d);
    */
  def distance(rhs: Vec3): Double = js.native
  
  /**
    * Divides a 3-dimensional vector by another in place.
    *
    * @param {Vec3} rhs - The vector to divide the specified vector by.
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(4, 9, 16);
    * var b = new pc.Vec3(2, 3, 4);
    *
    * a.div(b);
    *
    * // Outputs [2, 3, 4]
    * console.log("The result of the division is: " + a.toString());
    */
  def div(rhs: Vec3): Vec3 = js.native
  
  /**
    * Divides one 3-dimensional vector by another and writes the result to the specified vector.
    *
    * @param {Vec3} lhs - The dividend vector (the vector being divided).
    * @param {Vec3} rhs - The divisor vector (the vector dividing the dividend).
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(4, 9, 16);
    * var b = new pc.Vec3(2, 3, 4);
    * var r = new pc.Vec3();
    *
    * r.div2(a, b);
    * // Outputs [2, 3, 4]
    *
    * console.log("The result of the division is: " + r.toString());
    */
  def div2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Divides each element of a vector by a number.
    *
    * @param {number} scalar - The number to divide by.
    * @returns {Vec3} Self for chaining.
    * @example
    * var vec = new pc.Vec3(3, 6, 9);
    *
    * vec.divScalar(3);
    *
    * // Outputs [1, 2, 3]
    * console.log("The result of the division is: " + vec.toString());
    */
  def divScalar(scalar: Double): Vec3 = js.native
  
  /**
    * Returns the result of a dot product operation performed on the two specified 3-dimensional
    * vectors.
    *
    * @param {Vec3} rhs - The second 3-dimensional vector operand of the dot product.
    * @returns {number} The result of the dot product operation.
    * @example
    * var v1 = new pc.Vec3(5, 10, 20);
    * var v2 = new pc.Vec3(10, 20, 40);
    * var v1dotv2 = v1.dot(v2);
    * console.log("The result of the dot product is: " + v1dotv2);
    */
  def dot(rhs: Vec3): Double = js.native
  
  /**
    * Reports whether two vectors are equal.
    *
    * @param {Vec3} rhs - The vector to compare to the specified vector.
    * @returns {boolean} True if the vectors are equal and false otherwise.
    * @example
    * var a = new pc.Vec3(1, 2, 3);
    * var b = new pc.Vec3(4, 5, 6);
    * console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Vec3): Boolean = js.native
  
  /**
    * Each element is set to the largest integer less than or equal to its value.
    *
    * @returns {Vec3} Self for chaining.
    */
  def floor(): Vec3 = js.native
  
  /**
    * Returns the magnitude of the specified 3-dimensional vector.
    *
    * @returns {number} The magnitude of the specified 3-dimensional vector.
    * @example
    * var vec = new pc.Vec3(3, 4, 0);
    * var len = vec.length();
    * // Outputs 5
    * console.log("The length of the vector is: " + len);
    */
  def length(): Double = js.native
  
  /**
    * Returns the magnitude squared of the specified 3-dimensional vector.
    *
    * @returns {number} The magnitude of the specified 3-dimensional vector.
    * @example
    * var vec = new pc.Vec3(3, 4, 0);
    * var len = vec.lengthSq();
    * // Outputs 25
    * console.log("The length squared of the vector is: " + len);
    */
  def lengthSq(): Double = js.native
  
  /**
    * Returns the result of a linear interpolation between two specified 3-dimensional vectors.
    *
    * @param {Vec3} lhs - The 3-dimensional to interpolate from.
    * @param {Vec3} rhs - The 3-dimensional to interpolate to.
    * @param {number} alpha - The value controlling the point of interpolation. Between 0 and 1,
    * the linear interpolant will occur on a straight line between lhs and rhs. Outside of this
    * range, the linear interpolant will occur on a ray extrapolated from this line.
    * @returns {Vec3} Self for chaining.
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
    * Each element is assigned a value from rhs parameter if it is larger.
    *
    * @param {Vec3} rhs - The 3-dimensional vector used as the source of elements to compare to.
    * @returns {Vec3} Self for chaining.
    */
  def max(rhs: Vec3): Vec3 = js.native
  
  /**
    * Each element is assigned a value from rhs parameter if it is smaller.
    *
    * @param {Vec3} rhs - The 3-dimensional vector used as the source of elements to compare to.
    * @returns {Vec3} Self for chaining.
    */
  def min(rhs: Vec3): Vec3 = js.native
  
  /**
    * Multiplies a 3-dimensional vector to another in place.
    *
    * @param {Vec3} rhs - The 3-dimensional vector used as the second multiplicand of the operation.
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(2, 3, 4);
    * var b = new pc.Vec3(4, 5, 6);
    *
    * a.mul(b);
    *
    * // Outputs 8, 15, 24
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Vec3): Vec3 = js.native
  
  /**
    * Returns the result of multiplying the specified 3-dimensional vectors together.
    *
    * @param {Vec3} lhs - The 3-dimensional vector used as the first multiplicand of the operation.
    * @param {Vec3} rhs - The 3-dimensional vector used as the second multiplicand of the operation.
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(2, 3, 4);
    * var b = new pc.Vec3(4, 5, 6);
    * var r = new pc.Vec3();
    *
    * r.mul2(a, b);
    *
    * // Outputs 8, 15, 24
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Multiplies each element of a vector by a number.
    *
    * @param {number} scalar - The number to multiply by.
    * @returns {Vec3} Self for chaining.
    * @example
    * var vec = new pc.Vec3(3, 6, 9);
    *
    * vec.mulScalar(3);
    *
    * // Outputs [9, 18, 27]
    * console.log("The result of the multiplication is: " + vec.toString());
    */
  def mulScalar(scalar: Double): Vec3 = js.native
  
  /**
    * Returns this 3-dimensional vector converted to a unit vector in place. If the vector has a
    * length of zero, the vector's elements will be set to zero.
    *
    * @returns {Vec3} Self for chaining.
    * @example
    * var v = new pc.Vec3(25, 0, 0);
    *
    * v.normalize();
    *
    * // Outputs 1, 0, 0
    * console.log("The result of the vector normalization is: " + v.toString());
    */
  def normalize(): Vec3 = js.native
  
  /**
    * Projects this 3-dimensional vector onto the specified vector.
    *
    * @param {Vec3} rhs - The vector onto which the original vector will be projected on.
    * @returns {Vec3} Self for chaining.
    * @example
    * var v = new pc.Vec3(5, 5, 5);
    * var normal = new pc.Vec3(1, 0, 0);
    *
    * v.project(normal);
    *
    * // Outputs 5, 0, 0
    * console.log("The result of the vector projection is: " + v.toString());
    */
  def project(rhs: Vec3): Vec3 = js.native
  
  /**
    * Each element is rounded up or down to the nearest integer.
    *
    * @returns {Vec3} Self for chaining.
    */
  def round(): Vec3 = js.native
  
  /**
    * Sets the specified 3-dimensional vector to the supplied numerical values.
    *
    * @param {number} x - The value to set on the first component of the vector.
    * @param {number} y - The value to set on the second component of the vector.
    * @param {number} z - The value to set on the third component of the vector.
    * @returns {Vec3} Self for chaining.
    * @example
    * var v = new pc.Vec3();
    * v.set(5, 10, 20);
    *
    * // Outputs 5, 10, 20
    * console.log("The result of the vector set is: " + v.toString());
    */
  def set(x: Double, y: Double, z: Double): Vec3 = js.native
  
  /**
    * Subtracts a 3-dimensional vector from another in place.
    *
    * @param {Vec3} rhs - The vector to subtract from the specified vector.
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    *
    * a.sub(b);
    *
    * // Outputs [-10, -10, -10]
    * console.log("The result of the subtraction is: " + a.toString());
    */
  def sub(rhs: Vec3): Vec3 = js.native
  
  /**
    * Subtracts two 3-dimensional vectors from one another and returns the result.
    *
    * @param {Vec3} lhs - The first vector operand for the subtraction.
    * @param {Vec3} rhs - The second vector operand for the subtraction.
    * @returns {Vec3} Self for chaining.
    * @example
    * var a = new pc.Vec3(10, 10, 10);
    * var b = new pc.Vec3(20, 20, 20);
    * var r = new pc.Vec3();
    *
    * r.sub2(a, b);
    *
    * // Outputs [-10, -10, -10]
    * console.log("The result of the subtraction is: " + r.toString());
    */
  def sub2(lhs: Vec3, rhs: Vec3): Vec3 = js.native
  
  /**
    * Subtracts a number from each element of a vector.
    *
    * @param {number} scalar - The number to subtract.
    * @returns {Vec3} Self for chaining.
    * @example
    * var vec = new pc.Vec3(3, 4, 5);
    *
    * vec.subScalar(2);
    *
    * // Outputs [1, 2, 3]
    * console.log("The result of the subtraction is: " + vec.toString());
    */
  def subScalar(scalar: Double): Vec3 = js.native
  
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
object Vec3 {
  
  /**
    * A constant vector set to [0, 0, 1].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.BACK")
  @js.native
  val BACK: Vec3 = js.native
  
  /**
    * A constant vector set to [0, -1, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.DOWN")
  @js.native
  val DOWN: Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, -1].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.FORWARD")
  @js.native
  val FORWARD: Vec3 = js.native
  
  /**
    * A constant vector set to [-1, 0, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.LEFT")
  @js.native
  val LEFT: Vec3 = js.native
  
  /**
    * A constant vector set to [1, 1, 1].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.ONE")
  @js.native
  val ONE: Vec3 = js.native
  
  /**
    * A constant vector set to [1, 0, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.RIGHT")
  @js.native
  val RIGHT: Vec3 = js.native
  
  /**
    * A constant vector set to [0, 1, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.UP")
  @js.native
  val UP: Vec3 = js.native
  
  /**
    * A constant vector set to [0, 0, 0].
    *
    * @type {Vec3}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec3.ZERO")
  @js.native
  val ZERO: Vec3 = js.native
}
