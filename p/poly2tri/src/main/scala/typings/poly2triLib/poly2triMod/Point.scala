package typings
package poly2triLib.poly2triMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("poly2tri", "Point")
@js.native
/**
  * Construct a point
  * @example
  *      const point = new poly2tri.Point(150, 150);
  * @param x    coordinate (0 if undefined)
  * @param y    coordinate (0 if undefined)
  */
class Point () extends XY {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  /** x coordinate */
  /* CompleteClass */
  override var x: scala.Double = js.native
  /** y coordinate */
  /* CompleteClass */
  override var y: scala.Double = js.native
  /**
    * Add another Point object to this instance. (component-wise)
    * @param n - Point object.
    * @return this (for chaining)
    */
  def add(n: XY): Point = js.native
  /**
    * Test this Point object with another for equality.
    * @param p - any "Point like" object with {x,y}
    * @return `true` if same x and y coordinates, `false` otherwise.
    */
  def equals(p: XY): scala.Boolean = js.native
  /**
    * Return the distance of this Point instance from the origin.
    * @return distance
    */
  def length(): scala.Double = js.native
  /**
    * Multiply this Point instance by a scalar. (component-wise)
    * @param s   scalar.
    * @return this (for chaining)
    */
  def mul(s: scala.Double): Point = js.native
  /**
    * Negate this Point instance. (component-wise)
    * @return this (for chaining)
    */
  def negate(): Point = js.native
  /**
    * Normalize this Point instance (as a vector).
    * @return The original distance of this instance from the origo.
    */
  def normalize(): scala.Double = js.native
  /**
    * Set the coordinates of this instance.
    * @param {number} x   coordinate
    * @param {number} y   coordinate
    * @return this (for chaining)
    */
  def set(x: scala.Double, y: scala.Double): Point = js.native
  /**
    * Set this Point instance to the origin `(0; 0)`
    * @return this (for chaining)
    */
  def set_zero(): Point = js.native
  /**
    * Subtract this Point instance with another point given. (component-wise)
    * @param n - Point object.
    * @return this (for chaining)
    */
  def sub(n: XY): Point = js.native
  /**
    * JSON output, only coordinates
    * @example
    *      JSON.stringify(new poly2tri.Point(1,2))
    *      // → '{"x":1,"y":2}'
    */
  def toJSON(): js.Any = js.native
}

@JSImport("poly2tri", "Point")
@js.native
object Point extends js.Object {
  /**
    * Add two points component-wise and return the result as a new Point object.
    * @param a - any "Point like" object with {x,y}
    * @param b - any "Point like" object with {x,y}
    * @return the resulting Point object.
    */
  def add(a: poly2triLib.poly2triMod.XY, b: poly2triLib.poly2triMod.XY): poly2triLib.poly2triMod.Point = js.native
  /**
    * Compare two points component-wise. Ordered by y axis first, then x axis.
    * @param a - point object with {x,y}
    * @param b - point object with {x,y}
    * @return `< 0` if `a < b` ; `> 0` if `a > b` ; `0` otherwise.
    */
  def compare(a: poly2triLib.poly2triMod.XY, b: poly2triLib.poly2triMod.XY): scala.Double = js.native
  /**
    * Perform the cross product on either two points (result is a scalar)
    * or a point and a scalar (result is a point).
    * This function requires two parameters, either may be a Point object or a
    * number.
    * @param  a - Point object or scalar.
    * @param  b - Point object or scalar.
    * @return a Point object or a number, depending on the parameters.
    */
  def cross(a: poly2triLib.poly2triMod.XY, b: poly2triLib.poly2triMod.XY): scala.Double = js.native
  def cross(a: poly2triLib.poly2triMod.XY, b: scala.Double): poly2triLib.poly2triMod.Point = js.native
  def cross(a: scala.Double, b: poly2triLib.poly2triMod.XY): poly2triLib.poly2triMod.Point = js.native
  def cross(a: scala.Double, b: scala.Double): scala.Double = js.native
  /**
    * Peform the dot product on two vectors.
    * @param a - any "Point like" object with {x,y}
    * @param b - any "Point like" object with {x,y}
    * @return the dot product
    */
  def dot(a: poly2triLib.poly2triMod.XY, b: poly2triLib.poly2triMod.XY): scala.Double = js.native
  /**
    * Test two Point objects for equality.
    * @param a - point object with {x,y}
    * @param b - point object with {x,y}
    * @return `true` if `a == b`, `false` otherwise.
    */
  def equals(a: poly2triLib.poly2triMod.XY, b: poly2triLib.poly2triMod.XY): scala.Boolean = js.native
  /**
    * Multiply a point by a scalar and return the result as a new Point object.
    * @param s - the scalar
    * @param p - any "Point like" object with {x,y}
    * @return the resulting Point object.
    */
  def mul(s: scala.Double, p: poly2triLib.poly2triMod.XY): poly2triLib.poly2triMod.Point = js.native
  /**
    * Negate a point component-wise and return the result as a new Point object.
    * @param p - any "Point like" object with {x,y}
    * @return the resulting Point object.
    */
  def negate(p: poly2triLib.poly2triMod.XY): poly2triLib.poly2triMod.Point = js.native
  /**
    * Subtract two points component-wise and return the result as a new Point object.
    * @param a - any "Point like" object with {x,y}
    * @param b - any "Point like" object with {x,y}
    * @return the resulting Point object.
    */
  def sub(a: poly2triLib.poly2triMod.XY, b: poly2triLib.poly2triMod.XY): poly2triLib.poly2triMod.Point = js.native
  /**
    * Point pretty printing. Delegates to the point's custom "toString()" method if exists,
    * else simply prints x and y coordinates.
    * @example
    *      xy.toString({x:5, y:42})
    *      // → "(5;42)"
    * @example
    *      xy.toString({x:5,y:42,toString:function() {return this.x+":"+this.y;}})
    *      // → "5:42"
    * @param p - point object with {x,y}
    * @returns `"(x;y)"`
    */
  def toString(p: poly2triLib.poly2triMod.XY): java.lang.String = js.native
}

