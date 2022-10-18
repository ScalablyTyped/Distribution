package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 2-dimensional vector.
  */
trait Vec2 extends StObject {
  
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
  def add(rhs: Vec2): Vec2
  
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
  def add2(lhs: Vec2, rhs: Vec2): Vec2
  
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
  def addScalar(scalar: Double): Vec2
  
  /**
    * Each element is rounded up to the next largest integer.
    *
    * @returns {Vec2} Self for chaining.
    */
  def ceil(): Vec2
  
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
  def copy(rhs: Vec2): Vec2
  
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
  def cross(rhs: Vec2): Double
  
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
  def distance(rhs: Vec2): Double
  
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
  def div(rhs: Vec2): Vec2
  
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
  def div2(lhs: Vec2, rhs: Vec2): Vec2
  
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
  def divScalar(scalar: Double): Vec2
  
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
  def dot(rhs: Vec2): Double
  
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
  def equals(rhs: Vec2): Boolean
  
  /**
    * Each element is set to the largest integer less than or equal to its value.
    *
    * @returns {Vec2} Self for chaining.
    */
  def floor(): Vec2
  
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
  def length(): Double
  
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
  def lengthSq(): Double
  
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
  def lerp(lhs: Vec2, rhs: Vec2, alpha: Double): Vec2
  
  /**
    * Each element is assigned a value from rhs parameter if it is larger.
    *
    * @param {Vec2} rhs - The 2-dimensional vector used as the source of elements to compare to.
    * @returns {Vec2} Self for chaining.
    */
  def max(rhs: Vec2): Vec2
  
  /**
    * Each element is assigned a value from rhs parameter if it is smaller.
    *
    * @param {Vec2} rhs - The 2-dimensional vector used as the source of elements to compare to.
    * @returns {Vec2} Self for chaining.
    */
  def min(rhs: Vec2): Vec2
  
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
  def mul(rhs: Vec2): Vec2
  
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
  def mul2(lhs: Vec2, rhs: Vec2): Vec2
  
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
  def mulScalar(scalar: Double): Vec2
  
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
  def normalize(): Vec2
  
  /**
    * Each element is rounded up or down to the nearest integer.
    *
    * @returns {Vec2} Self for chaining.
    */
  def round(): Vec2
  
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
  def set(x: Double, y: Double): Vec2
  
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
  def sub(rhs: Vec2): Vec2
  
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
  def sub2(lhs: Vec2, rhs: Vec2): Vec2
  
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
  def subScalar(scalar: Double): Vec2
  
  /**
    * The first component of the vector.
    *
    * @type {number}
    */
  var x: Double
  
  /**
    * The second component of the vector.
    *
    * @type {number}
    */
  var y: Double
}
object Vec2 {
  
  inline def apply(
    add: Vec2 => Vec2,
    add2: (Vec2, Vec2) => Vec2,
    addScalar: Double => Vec2,
    ceil: () => Vec2,
    copy: Vec2 => Vec2,
    cross: Vec2 => Double,
    distance: Vec2 => Double,
    div: Vec2 => Vec2,
    div2: (Vec2, Vec2) => Vec2,
    divScalar: Double => Vec2,
    dot: Vec2 => Double,
    equals_ : Vec2 => Boolean,
    floor: () => Vec2,
    length: () => Double,
    lengthSq: () => Double,
    lerp: (Vec2, Vec2, Double) => Vec2,
    max: Vec2 => Vec2,
    min: Vec2 => Vec2,
    mul: Vec2 => Vec2,
    mul2: (Vec2, Vec2) => Vec2,
    mulScalar: Double => Vec2,
    normalize: () => Vec2,
    round: () => Vec2,
    set: (Double, Double) => Vec2,
    sub: Vec2 => Vec2,
    sub2: (Vec2, Vec2) => Vec2,
    subScalar: Double => Vec2,
    x: Double,
    y: Double
  ): Vec2 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), add2 = js.Any.fromFunction2(add2), addScalar = js.Any.fromFunction1(addScalar), ceil = js.Any.fromFunction0(ceil), copy = js.Any.fromFunction1(copy), cross = js.Any.fromFunction1(cross), distance = js.Any.fromFunction1(distance), div = js.Any.fromFunction1(div), div2 = js.Any.fromFunction2(div2), divScalar = js.Any.fromFunction1(divScalar), dot = js.Any.fromFunction1(dot), floor = js.Any.fromFunction0(floor), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), lerp = js.Any.fromFunction3(lerp), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), mul = js.Any.fromFunction1(mul), mul2 = js.Any.fromFunction2(mul2), mulScalar = js.Any.fromFunction1(mulScalar), normalize = js.Any.fromFunction0(normalize), round = js.Any.fromFunction0(round), set = js.Any.fromFunction2(set), sub = js.Any.fromFunction1(sub), sub2 = js.Any.fromFunction2(sub2), subScalar = js.Any.fromFunction1(subScalar), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Vec2]
  }
  
  extension [Self <: Vec2](x: Self) {
    
    inline def setAdd(value: Vec2 => Vec2): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAdd2(value: (Vec2, Vec2) => Vec2): Self = StObject.set(x, "add2", js.Any.fromFunction2(value))
    
    inline def setAddScalar(value: Double => Vec2): Self = StObject.set(x, "addScalar", js.Any.fromFunction1(value))
    
    inline def setCeil(value: () => Vec2): Self = StObject.set(x, "ceil", js.Any.fromFunction0(value))
    
    inline def setCopy(value: Vec2 => Vec2): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setCross(value: Vec2 => Double): Self = StObject.set(x, "cross", js.Any.fromFunction1(value))
    
    inline def setDistance(value: Vec2 => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
    
    inline def setDiv(value: Vec2 => Vec2): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setDiv2(value: (Vec2, Vec2) => Vec2): Self = StObject.set(x, "div2", js.Any.fromFunction2(value))
    
    inline def setDivScalar(value: Double => Vec2): Self = StObject.set(x, "divScalar", js.Any.fromFunction1(value))
    
    inline def setDot(value: Vec2 => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: Vec2 => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFloor(value: () => Vec2): Self = StObject.set(x, "floor", js.Any.fromFunction0(value))
    
    inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    inline def setLengthSq(value: () => Double): Self = StObject.set(x, "lengthSq", js.Any.fromFunction0(value))
    
    inline def setLerp(value: (Vec2, Vec2, Double) => Vec2): Self = StObject.set(x, "lerp", js.Any.fromFunction3(value))
    
    inline def setMax(value: Vec2 => Vec2): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
    
    inline def setMin(value: Vec2 => Vec2): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMul(value: Vec2 => Vec2): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
    
    inline def setMul2(value: (Vec2, Vec2) => Vec2): Self = StObject.set(x, "mul2", js.Any.fromFunction2(value))
    
    inline def setMulScalar(value: Double => Vec2): Self = StObject.set(x, "mulScalar", js.Any.fromFunction1(value))
    
    inline def setNormalize(value: () => Vec2): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setRound(value: () => Vec2): Self = StObject.set(x, "round", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Double, Double) => Vec2): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSub(value: Vec2 => Vec2): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setSub2(value: (Vec2, Vec2) => Vec2): Self = StObject.set(x, "sub2", js.Any.fromFunction2(value))
    
    inline def setSubScalar(value: Double => Vec2): Self = StObject.set(x, "subScalar", js.Any.fromFunction1(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
