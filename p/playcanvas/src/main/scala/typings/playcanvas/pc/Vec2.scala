package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new Vec2 object.
  * @example
  * var v = new pc.Vec2(1, 2);
  * @param [x] - The x value. If x is an array of length 2, the array will be used to populate all components.
  * @param [y] - The y value.
  */
@js.native
trait Vec2 extends js.Object {
  /**
    * The first element of the vector.
    * @example
    * var vec = new pc.Vec2(10, 20);
    
    // Get x
    var x = vec.x;
    
    // Set x
    vec.x = 0;
    */
  var x: Double = js.native
  /**
    * The second element of the vector.
    * @example
    * var vec = new pc.Vec2(10, 20);
    
    // Get y
    var y = vec.y;
    
    // Set y
    vec.y = 0;
    */
  var y: Double = js.native
  /**
    * Adds a 2-dimensional vector to another in place.
    * @example
    * var a = new pc.Vec2(10, 10);
    var b = new pc.Vec2(20, 20);
    
    a.add(b);
    
    // Should output [30, 30]
    console.log("The result of the addition is: " + a.toString());
    * @param rhs - The vector to add to the specified vector.
    * @returns Self for chaining.
    */
  def add(rhs: Vec2): Vec2 = js.native
  /**
    * Adds two 2-dimensional vectors together and returns the result.
    * @example
    * var a = new pc.Vec2(10, 10);
    var b = new pc.Vec2(20, 20);
    var r = new pc.Vec2();
    
    r.add2(a, b);
    // Should output [30, 30]
    
    console.log("The result of the addition is: " + r.toString());
    * @param lhs - The first vector operand for the addition.
    * @param rhs - The second vector operand for the addition.
    * @returns Self for chaining.
    */
  def add2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  /**
    * Copied the contents of a source 2-dimensional vector to a destination 2-dimensional vector.
    * @example
    * var src = new pc.Vec2(10, 20);
    var dst = new pc.Vec2();
    
    dst.copy(src);
    
    console.log("The two vectors are " + (dst.equals(src) ? "equal" : "different"));
    * @param rhs - A vector to copy to the specified vector.
    * @returns Self for chaining.
    */
  def copy(rhs: Vec2): Vec2 = js.native
  /**
    * Returns the distance between the two specified 2-dimensional vectors.
    * @example
    * var v1 = new pc.Vec2(5, 10);
    var v2 = new pc.Vec2(10, 20);
    var d = v1.distance(v2);
    console.log("The between v1 and v2 is: " + d);
    * @param rhs - The second 2-dimensional vector to test.
    * @returns The distance between the two vectors.
    */
  def distance(rhs: Vec2): Double = js.native
  /**
    * Returns the result of a dot product operation performed on the two specified 2-dimensional vectors.
    * @example
    * var v1 = new pc.Vec2(5, 10);
    var v2 = new pc.Vec2(10, 20);
    var v1dotv2 = v1.dot(v2);
    console.log("The result of the dot product is: " + v1dotv2);
    * @param rhs - The second 2-dimensional vector operand of the dot product.
    * @returns The result of the dot product operation.
    */
  def dot(rhs: Vec2): Double = js.native
  /**
    * Reports whether two vectors are equal.
    * @example
    * var a = new pc.Vec2(1, 2);
    var b = new pc.Vec2(4, 5);
    console.log("The two vectors are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The vector to compare to the specified vector.
    * @returns True if the vectors are equal and false otherwise.
    */
  def equals(rhs: Vec2): Boolean = js.native
  /**
    * Returns the magnitude of the specified 2-dimensional vector.
    * @example
    * var vec = new pc.Vec2(3, 4);
    var len = vec.length();
    // Should output 5
    console.log("The length of the vector is: " + len);
    * @returns The magnitude of the specified 2-dimensional vector.
    */
  def length(): Double = js.native
  /**
    * Returns the magnitude squared of the specified 2-dimensional vector.
    * @example
    * var vec = new pc.Vec2(3, 4);
    var len = vec.lengthSq();
    // Should output 25
    console.log("The length squared of the vector is: " + len);
    * @returns The magnitude of the specified 2-dimensional vector.
    */
  def lengthSq(): Double = js.native
  /**
    * Returns the result of a linear interpolation between two specified 2-dimensional vectors.
    * @example
    * var a = new pc.Vec2(0, 0);
    var b = new pc.Vec2(10, 10);
    var r = new pc.Vec2();
    
    r.lerp(a, b, 0);   // r is equal to a
    r.lerp(a, b, 0.5); // r is 5, 5
    r.lerp(a, b, 1);   // r is equal to b
    * @param lhs - The 2-dimensional to interpolate from.
    * @param rhs - The 2-dimensional to interpolate to.
    * @param alpha - The value controlling the point of interpolation. Between 0 and 1, the linear interpolant
    will occur on a straight line between lhs and rhs. Outside of this range, the linear interpolant will occur on
    a ray extrapolated from this line.
    * @returns Self for chaining.
    */
  def lerp(lhs: Vec2, rhs: Vec2, alpha: Double): Vec2 = js.native
  /**
    * Multiplies a 2-dimensional vector to another in place.
    * @example
    * var a = new pc.Vec2(2, 3);
    var b = new pc.Vec2(4, 5);
    
    a.mul(b);
    
    // Should output 8, 15
    console.log("The result of the multiplication is: " + a.toString());
    * @param rhs - The 2-dimensional vector used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul(rhs: Vec2): Vec2 = js.native
  /**
    * Returns the result of multiplying the specified 2-dimensional vectors together.
    * @example
    * var a = new pc.Vec2(2, 3);
    var b = new pc.Vec2(4, 5);
    var r = new pc.Vec2();
    
    r.mul2(a, b);
    
    // Should output 8, 15
    console.log("The result of the multiplication is: " + r.toString());
    * @param lhs - The 2-dimensional vector used as the first multiplicand of the operation.
    * @param rhs - The 2-dimensional vector used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
  /**
    * Returns this 2-dimensional vector converted to a unit vector in place.
    If the vector has a length of zero, the vector's elements will be set to zero.
    * @example
    * var v = new pc.Vec2(25, 0);
    
    v.normalize();
    
    // Should output 1, 0
    console.log("The result of the vector normalization is: " + v.toString());
    * @returns Self for chaining.
    */
  def normalize(): Vec2 = js.native
  /**
    * Scales each component of the specified 2-dimensional vector by the supplied
    scalar value.
    * @example
    * var v = new pc.Vec2(2, 4);
    
    // Multiply by 2
    v.scale(2);
    
    // Negate
    v.scale(-1);
    
    // Divide by 2
    v.scale(0.5);
    * @param scalar - The value by which each vector component is multiplied.
    * @returns Self for chaining.
    */
  def scale(scalar: Double): Vec2 = js.native
  /**
    * Sets the specified 2-dimensional vector to the supplied numerical values.
    * @example
    * var v = new pc.Vec2();
    v.set(5, 10);
    
    // Should output 5, 10
    console.log("The result of the vector set is: " + v.toString());
    * @param x - The value to set on the first component of the vector.
    * @param y - The value to set on the second component of the vector.
    * @returns Self for chaining.
    */
  def set(x: Double, y: Double): Vec2 = js.native
  /**
    * Subtracts a 2-dimensional vector from another in place.
    * @example
    * var a = new pc.Vec2(10, 10);
    var b = new pc.Vec2(20, 20);
    
    a.sub(b);
    
    // Should output [-10, -10]
    console.log("The result of the addition is: " + a.toString());
    * @param rhs - The vector to add to the specified vector.
    * @returns Self for chaining.
    */
  def sub(rhs: Vec2): Vec2 = js.native
  /**
    * Subtracts two 2-dimensional vectors from one another and returns the result.
    * @example
    * var a = new pc.Vec2(10, 10);
    var b = new pc.Vec2(20, 20);
    var r = new pc.Vec2();
    
    r.sub2(a, b);
    
    // Should output [-10, -10]
    console.log("The result of the addition is: " + r.toString());
    * @param lhs - The first vector operand for the addition.
    * @param rhs - The second vector operand for the addition.
    * @returns Self for chaining.
    */
  def sub2(lhs: Vec2, rhs: Vec2): Vec2 = js.native
}

object Vec2 {
  @scala.inline
  def apply(
    add: Vec2 => Vec2,
    add2: (Vec2, Vec2) => Vec2,
    copy: Vec2 => Vec2,
    distance: Vec2 => Double,
    dot: Vec2 => Double,
    equals: Vec2 => Boolean,
    length: () => Double,
    lengthSq: () => Double,
    lerp: (Vec2, Vec2, Double) => Vec2,
    mul: Vec2 => Vec2,
    mul2: (Vec2, Vec2) => Vec2,
    normalize: () => Vec2,
    scale: Double => Vec2,
    set: (Double, Double) => Vec2,
    sub: Vec2 => Vec2,
    sub2: (Vec2, Vec2) => Vec2,
    x: Double,
    y: Double
  ): Vec2 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), add2 = js.Any.fromFunction2(add2), copy = js.Any.fromFunction1(copy), distance = js.Any.fromFunction1(distance), dot = js.Any.fromFunction1(dot), equals = js.Any.fromFunction1(equals), length = js.Any.fromFunction0(length), lengthSq = js.Any.fromFunction0(lengthSq), lerp = js.Any.fromFunction3(lerp), mul = js.Any.fromFunction1(mul), mul2 = js.Any.fromFunction2(mul2), normalize = js.Any.fromFunction0(normalize), scale = js.Any.fromFunction1(scale), set = js.Any.fromFunction2(set), sub = js.Any.fromFunction1(sub), sub2 = js.Any.fromFunction2(sub2), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vec2]
  }
  @scala.inline
  implicit class Vec2Ops[Self <: Vec2] (val x: Self) extends AnyVal {
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
    def setAdd(value: Vec2 => Vec2): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setAdd2(value: (Vec2, Vec2) => Vec2): Self = this.set("add2", js.Any.fromFunction2(value))
    @scala.inline
    def setCopy(value: Vec2 => Vec2): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def setDistance(value: Vec2 => Double): Self = this.set("distance", js.Any.fromFunction1(value))
    @scala.inline
    def setDot(value: Vec2 => Double): Self = this.set("dot", js.Any.fromFunction1(value))
    @scala.inline
    def setEquals(value: Vec2 => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setLengthSq(value: () => Double): Self = this.set("lengthSq", js.Any.fromFunction0(value))
    @scala.inline
    def setLerp(value: (Vec2, Vec2, Double) => Vec2): Self = this.set("lerp", js.Any.fromFunction3(value))
    @scala.inline
    def setMul(value: Vec2 => Vec2): Self = this.set("mul", js.Any.fromFunction1(value))
    @scala.inline
    def setMul2(value: (Vec2, Vec2) => Vec2): Self = this.set("mul2", js.Any.fromFunction2(value))
    @scala.inline
    def setNormalize(value: () => Vec2): Self = this.set("normalize", js.Any.fromFunction0(value))
    @scala.inline
    def setScale(value: Double => Vec2): Self = this.set("scale", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (Double, Double) => Vec2): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setSub(value: Vec2 => Vec2): Self = this.set("sub", js.Any.fromFunction1(value))
    @scala.inline
    def setSub2(value: (Vec2, Vec2) => Vec2): Self = this.set("sub2", js.Any.fromFunction2(value))
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

