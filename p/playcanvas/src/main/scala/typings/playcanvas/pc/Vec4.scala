package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Vec4 object.
  * @example
  * var v = new pc.Vec4(1, 2, 3, 4);
  * @param [x] - The x value. If x is an array of length 4, the array will be used to populate all components.
  * @param [y] - The y value.
  * @param [z] - The z value.
  * @param [w] - The w value.
  */
@js.native
trait Vec4 extends StObject {
  
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
  def add(rhs: Vec4): Vec4 = js.native
  
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
  def add2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  
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
  def copy(rhs: Vec4): Vec4 = js.native
  
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
  def dot(rhs: Vec4): Double = js.native
  
  /**
    * Reports whether two vectors are equal.
    * @example
    * var a = new pc.Vec4(1, 2, 3, 4);
    var b = new pc.Vec4(5, 6, 7, 8);
    console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The vector to compare to the specified vector.
    * @returns True if the vectors are equal and false otherwise.
    */
  def equals(rhs: Vec4): Boolean = js.native
  
  /**
    * Returns the magnitude of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0, 0);
    var len = vec.length();
    // Should output 5
    console.log("The length of the vector is: " + len);
    * @returns The magnitude of the specified 4-dimensional vector.
    */
  def length(): Double = js.native
  
  /**
    * Returns the magnitude squared of the specified 4-dimensional vector.
    * @example
    * var vec = new pc.Vec4(3, 4, 0);
    var len = vec.lengthSq();
    // Should output 25
    console.log("The length squared of the vector is: " + len);
    * @returns The magnitude of the specified 4-dimensional vector.
    */
  def lengthSq(): Double = js.native
  
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
  def lerp(lhs: Vec4, rhs: Vec4, alpha: Double): Vec4 = js.native
  
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
  def mul(rhs: Vec4): Vec4 = js.native
  
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
  def mul2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  
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
  def normalize(): Vec4 = js.native
  
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
  def scale(scalar: Double): Vec4 = js.native
  
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
  def set(x: Double, y: Double, z: Double, w: Double): Vec4 = js.native
  
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
  def sub(rhs: Vec4): Vec4 = js.native
  
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
  def sub2(lhs: Vec4, rhs: Vec4): Vec4 = js.native
  
  /**
    * The fourth component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get w
    var w = vec.w;
    
    // Set w
    vec.w = 0;
    */
  var w: Double = js.native
  
  /**
    * The first component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get x
    var x = vec.x;
    
    // Set x
    vec.x = 0;
    */
  var x: Double = js.native
  
  /**
    * The second component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get y
    var y = vec.y;
    
    // Set y
    vec.y = 0;
    */
  var y: Double = js.native
  
  /**
    * The third component of the vector.
    * @example
    * var vec = new pc.Vec4(10, 20, 30, 40);
    
    // Get z
    var z = vec.z;
    
    // Set z
    vec.z = 0;
    */
  var z: Double = js.native
}
object Vec4 {
  
  @scala.inline
  def apply(
    add: Vec4 => Vec4,
    add2: (Vec4, Vec4) => Vec4,
    copy: Vec4 => Vec4,
    dot: Vec4 => Double,
    equals_ : Vec4 => Boolean,
    length: () => Double,
    lengthSq: () => Double,
    lerp: (Vec4, Vec4, Double) => Vec4,
    mul: Vec4 => Vec4,
    mul2: (Vec4, Vec4) => Vec4,
    normalize: () => Vec4,
    scale: Double => Vec4,
    set: (Double, Double, Double, Double) => Vec4,
    sub: Vec4 => Vec4,
    sub2: (Vec4, Vec4) => Vec4,
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): Vec4 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), add2 = js.Any.fromFunction2(add2), copy = js.Any.fromFunction1(copy), dot = js.Any.fromFunction1(dot), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), lerp = js.Any.fromFunction3(lerp), mul = js.Any.fromFunction1(mul), mul2 = js.Any.fromFunction2(mul2), normalize = js.Any.fromFunction0(normalize), scale = js.Any.fromFunction1(scale), set = js.Any.fromFunction4(set), sub = js.Any.fromFunction1(sub), sub2 = js.Any.fromFunction2(sub2), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Vec4]
  }
  
  @scala.inline
  implicit class Vec4MutableBuilder[Self <: Vec4] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Vec4 => Vec4): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd2(value: (Vec4, Vec4) => Vec4): Self = StObject.set(x, "add2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopy(value: Vec4 => Vec4): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDot(value: Vec4 => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_(value: Vec4 => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLengthSq(value: () => Double): Self = StObject.set(x, "lengthSq", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLerp(value: (Vec4, Vec4, Double) => Vec4): Self = StObject.set(x, "lerp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMul(value: Vec4 => Vec4): Self = StObject.set(x, "mul", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMul2(value: (Vec4, Vec4) => Vec4): Self = StObject.set(x, "mul2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNormalize(value: () => Vec4): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScale(value: Double => Vec4): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double, Double) => Vec4): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSub(value: Vec4 => Vec4): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSub2(value: (Vec4, Vec4) => Vec4): Self = StObject.set(x, "sub2", js.Any.fromFunction2(value))
    
    @scala.inline
    def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
