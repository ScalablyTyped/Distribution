package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2-dimensional vector.
  */
@JSImport("playcanvas", "Vec2")
@js.native
/**
  * Create a new Vec2 instance.
  *
  * @param {number|number[]} [x] - The x value. Defaults to 0. If x is an array of length 2, the
  * array will be used to populate all components.
  * @param {number} [y] - The y value. Defaults to 0.
  * @example
  * var v = new pc.Vec2(1, 2);
  */
open class Vec2 () extends StObject {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  
  /**
    * Adds a 2-dimensional vector to another in place.
    *
    * @param {Vec2} rhs - The vector to add to the specified vector.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    *
    * a.add(b);
    *
    * // Outputs [30, 30]
    * console.log("The result of the addition is: " + a.toString());
    */
  def add(rhs: Vec2): Vec2 = js.native
  
  /**
    * Adds two 2-dimensional vectors together and returns the result.
    *
    * @param {Vec2} lhs - The first vector operand for the addition.
    * @param {Vec2} rhs - The second vector operand for the addition.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    * var r = new pc.Vec2();
    *
    * r.add2(a, b);
    * // Outputs [30, 30]
    *
    * console.log("The result of the addition is: " + r.toString());
    */
  def add2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  
  /**
    * Adds a number to each element of a vector.
    *
    * @param {number} scalar - The number to add.
    * @returns {Vec2} Self for chaining.
    * @example
    * var vec = new pc.Vec2(3, 4);
    *
    * vec.addScalar(2);
    *
    * // Outputs [5, 6]
    * console.log("The result of the addition is: " + vec.toString());
    */
  def addScalar(scalar: Double): Vec2 = js.native
  
  /**
    * Each element is rounded up to the next largest integer.
    *
    * @returns {Vec2} Self for chaining.
    */
  def ceil(): Vec2 = js.native
  
  /**
    * Copies the contents of a source 2-dimensional vector to a destination 2-dimensional vector.
    *
    * @param {Vec2} rhs - A vector to copy to the specified vector.
    * @returns {Vec2} Self for chaining.
    * @example
    * var src = new pc.Vec2(10, 20);
    * var dst = new pc.Vec2();
    *
    * dst.copy(src);
    *
    * console.log("The two vectors are " + (dst.equals(src) ? "equal" : "different"));
    */
  def copy(rhs: Vec2): Vec2 = js.native
  
  /**
    * Returns the result of a cross product operation performed on the two specified 2-dimensional
    * vectors.
    *
    * @param {Vec2} rhs - The second 2-dimensional vector operand of the cross product.
    * @returns {number} The cross product of the two vectors.
    * @example
    * var right = new pc.Vec2(1, 0);
    * var up = new pc.Vec2(0, 1);
    * var crossProduct = right.cross(up);
    *
    * // Prints 1
    * console.log("The result of the cross product is: " + crossProduct);
    */
  def cross(rhs: Vec2): Double = js.native
  
  /**
    * Returns the distance between the two specified 2-dimensional vectors.
    *
    * @param {Vec2} rhs - The second 2-dimensional vector to test.
    * @returns {number} The distance between the two vectors.
    * @example
    * var v1 = new pc.Vec2(5, 10);
    * var v2 = new pc.Vec2(10, 20);
    * var d = v1.distance(v2);
    * console.log("The distance between v1 and v2 is: " + d);
    */
  def distance(rhs: Vec2): Double = js.native
  
  /**
    * Divides a 2-dimensional vector by another in place.
    *
    * @param {Vec2} rhs - The vector to divide the specified vector by.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(4, 9);
    * var b = new pc.Vec2(2, 3);
    *
    * a.div(b);
    *
    * // Outputs [2, 3]
    * console.log("The result of the division is: " + a.toString());
    */
  def div(rhs: Vec2): Vec2 = js.native
  
  /**
    * Divides one 2-dimensional vector by another and writes the result to the specified vector.
    *
    * @param {Vec2} lhs - The dividend vector (the vector being divided).
    * @param {Vec2} rhs - The divisor vector (the vector dividing the dividend).
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(4, 9);
    * var b = new pc.Vec2(2, 3);
    * var r = new pc.Vec2();
    *
    * r.div2(a, b);
    * // Outputs [2, 3]
    *
    * console.log("The result of the division is: " + r.toString());
    */
  def div2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  
  /**
    * Divides each element of a vector by a number.
    *
    * @param {number} scalar - The number to divide by.
    * @returns {Vec2} Self for chaining.
    * @example
    * var vec = new pc.Vec2(3, 6);
    *
    * vec.divScalar(3);
    *
    * // Outputs [1, 2]
    * console.log("The result of the division is: " + vec.toString());
    */
  def divScalar(scalar: Double): Vec2 = js.native
  
  /**
    * Returns the result of a dot product operation performed on the two specified 2-dimensional
    * vectors.
    *
    * @param {Vec2} rhs - The second 2-dimensional vector operand of the dot product.
    * @returns {number} The result of the dot product operation.
    * @example
    * var v1 = new pc.Vec2(5, 10);
    * var v2 = new pc.Vec2(10, 20);
    * var v1dotv2 = v1.dot(v2);
    * console.log("The result of the dot product is: " + v1dotv2);
    */
  def dot(rhs: Vec2): Double = js.native
  
  /**
    * Reports whether two vectors are equal.
    *
    * @param {Vec2} rhs - The vector to compare to the specified vector.
    * @returns {boolean} True if the vectors are equal and false otherwise.
    * @example
    * var a = new pc.Vec2(1, 2);
    * var b = new pc.Vec2(4, 5);
    * console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Vec2): Boolean = js.native
  
  /**
    * Each element is set to the largest integer less than or equal to its value.
    *
    * @returns {Vec2} Self for chaining.
    */
  def floor(): Vec2 = js.native
  
  /**
    * Returns the magnitude of the specified 2-dimensional vector.
    *
    * @returns {number} The magnitude of the specified 2-dimensional vector.
    * @example
    * var vec = new pc.Vec2(3, 4);
    * var len = vec.length();
    * // Outputs 5
    * console.log("The length of the vector is: " + len);
    */
  def length(): Double = js.native
  
  /**
    * Returns the magnitude squared of the specified 2-dimensional vector.
    *
    * @returns {number} The magnitude of the specified 2-dimensional vector.
    * @example
    * var vec = new pc.Vec2(3, 4);
    * var len = vec.lengthSq();
    * // Outputs 25
    * console.log("The length squared of the vector is: " + len);
    */
  def lengthSq(): Double = js.native
  
  /**
    * Returns the result of a linear interpolation between two specified 2-dimensional vectors.
    *
    * @param {Vec2} lhs - The 2-dimensional to interpolate from.
    * @param {Vec2} rhs - The 2-dimensional to interpolate to.
    * @param {number} alpha - The value controlling the point of interpolation. Between 0 and 1,
    * the linear interpolant will occur on a straight line between lhs and rhs. Outside of this
    * range, the linear interpolant will occur on a ray extrapolated from this line.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(0, 0);
    * var b = new pc.Vec2(10, 10);
    * var r = new pc.Vec2();
    *
    * r.lerp(a, b, 0);   // r is equal to a
    * r.lerp(a, b, 0.5); // r is 5, 5
    * r.lerp(a, b, 1);   // r is equal to b
    */
  def lerp(lhs: Vec2, rhs: Vec2, alpha: Double): Vec2 = js.native
  
  /**
    * Each element is assigned a value from rhs parameter if it is larger.
    *
    * @param {Vec2} rhs - The 2-dimensional vector used as the source of elements to compare to.
    * @returns {Vec2} Self for chaining.
    */
  def max(rhs: Vec2): Vec2 = js.native
  
  /**
    * Each element is assigned a value from rhs parameter if it is smaller.
    *
    * @param {Vec2} rhs - The 2-dimensional vector used as the source of elements to compare to.
    * @returns {Vec2} Self for chaining.
    */
  def min(rhs: Vec2): Vec2 = js.native
  
  /**
    * Multiplies a 2-dimensional vector to another in place.
    *
    * @param {Vec2} rhs - The 2-dimensional vector used as the second multiplicand of the operation.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(2, 3);
    * var b = new pc.Vec2(4, 5);
    *
    * a.mul(b);
    *
    * // Outputs 8, 15
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Vec2): Vec2 = js.native
  
  /**
    * Returns the result of multiplying the specified 2-dimensional vectors together.
    *
    * @param {Vec2} lhs - The 2-dimensional vector used as the first multiplicand of the operation.
    * @param {Vec2} rhs - The 2-dimensional vector used as the second multiplicand of the operation.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(2, 3);
    * var b = new pc.Vec2(4, 5);
    * var r = new pc.Vec2();
    *
    * r.mul2(a, b);
    *
    * // Outputs 8, 15
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  
  /**
    * Multiplies each element of a vector by a number.
    *
    * @param {number} scalar - The number to multiply by.
    * @returns {Vec2} Self for chaining.
    * @example
    * var vec = new pc.Vec2(3, 6);
    *
    * vec.mulScalar(3);
    *
    * // Outputs [9, 18]
    * console.log("The result of the multiplication is: " + vec.toString());
    */
  def mulScalar(scalar: Double): Vec2 = js.native
  
  /**
    * Returns this 2-dimensional vector converted to a unit vector in place. If the vector has a
    * length of zero, the vector's elements will be set to zero.
    *
    * @returns {Vec2} Self for chaining.
    * @example
    * var v = new pc.Vec2(25, 0);
    *
    * v.normalize();
    *
    * // Outputs 1, 0
    * console.log("The result of the vector normalization is: " + v.toString());
    */
  def normalize(): Vec2 = js.native
  
  /**
    * Each element is rounded up or down to the nearest integer.
    *
    * @returns {Vec2} Self for chaining.
    */
  def round(): Vec2 = js.native
  
  /**
    * Sets the specified 2-dimensional vector to the supplied numerical values.
    *
    * @param {number} x - The value to set on the first component of the vector.
    * @param {number} y - The value to set on the second component of the vector.
    * @returns {Vec2} Self for chaining.
    * @example
    * var v = new pc.Vec2();
    * v.set(5, 10);
    *
    * // Outputs 5, 10
    * console.log("The result of the vector set is: " + v.toString());
    */
  def set(x: Double, y: Double): Vec2 = js.native
  
  /**
    * Subtracts a 2-dimensional vector from another in place.
    *
    * @param {Vec2} rhs - The vector to subtract from the specified vector.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    *
    * a.sub(b);
    *
    * // Outputs [-10, -10]
    * console.log("The result of the subtraction is: " + a.toString());
    */
  def sub(rhs: Vec2): Vec2 = js.native
  
  /**
    * Subtracts two 2-dimensional vectors from one another and returns the result.
    *
    * @param {Vec2} lhs - The first vector operand for the subtraction.
    * @param {Vec2} rhs - The second vector operand for the subtraction.
    * @returns {Vec2} Self for chaining.
    * @example
    * var a = new pc.Vec2(10, 10);
    * var b = new pc.Vec2(20, 20);
    * var r = new pc.Vec2();
    *
    * r.sub2(a, b);
    *
    * // Outputs [-10, -10]
    * console.log("The result of the subtraction is: " + r.toString());
    */
  def sub2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  
  /**
    * Subtracts a number from each element of a vector.
    *
    * @param {number} scalar - The number to subtract.
    * @returns {Vec2} Self for chaining.
    * @example
    * var vec = new pc.Vec2(3, 4);
    *
    * vec.subScalar(2);
    *
    * // Outputs [1, 2]
    * console.log("The result of the subtraction is: " + vec.toString());
    */
  def subScalar(scalar: Double): Vec2 = js.native
  
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
}
object Vec2 {
  
  @JSImport("playcanvas", "Vec2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A constant vector set to [0, -1].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec2.DOWN")
  @js.native
  val DOWN: Vec2 = js.native
  
  /**
    * A constant vector set to [-1, 0].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec2.LEFT")
  @js.native
  val LEFT: Vec2 = js.native
  
  /**
    * A constant vector set to [1, 1].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec2.ONE")
  @js.native
  val ONE: Vec2 = js.native
  
  /**
    * A constant vector set to [1, 0].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec2.RIGHT")
  @js.native
  val RIGHT: Vec2 = js.native
  
  /**
    * A constant vector set to [0, 1].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec2.UP")
  @js.native
  val UP: Vec2 = js.native
  
  /**
    * A constant vector set to [0, 0].
    *
    * @type {Vec2}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Vec2.ZERO")
  @js.native
  val ZERO: Vec2 = js.native
  
  /**
    * Calculates the angle between two Vec2's in radians.
    *
    * @param {Vec2} lhs - The first vector operand for the calculation.
    * @param {Vec2} rhs - The second vector operand for the calculation.
    * @returns {number} The calculated angle in radians.
    * @ignore
    */
  /* static member */
  inline def angleRad(lhs: Vec2, rhs: Vec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleRad")(lhs.asInstanceOf[js.Any], rhs.asInstanceOf[js.Any])).asInstanceOf[Double]
}
