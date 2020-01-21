package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vector extends js.Object {
  /**
    *   The x component of the vector
    */
  var x: Double = js.native
  /**
    *   The y component of the vector
    */
  var y: Double = js.native
  /**
    *   The z component of the vector
    */
  var z: Double = js.native
  def add(value: js.Array[Double]): Vector = js.native
  /**
    *   Adds x, y, and z components to a vector, adds one
    *   vector to another, or adds two independent vectors
    *   together. The version of the method that adds two
    *   vectors together is a static method and returns a
    *   p5.Vector, the others acts directly on the vector.
    *   See the examples for more context.
    *   @param value the vector to add
    *   @chainable
    */
  def add(value: Vector): Vector = js.native
  /**
    *   Adds x, y, and z components to a vector, adds one
    *   vector to another, or adds two independent vectors
    *   together. The version of the method that adds two
    *   vectors together is a static method and returns a
    *   p5.Vector, the others acts directly on the vector.
    *   See the examples for more context.
    *   @param x the x component of the vector to be added
    *   @param [y] the y component of the vector to be
    *   added
    *   @param [z] the z component of the vector to be
    *   added
    *   @chainable
    */
  def add(x: Double): Vector = js.native
  def add(x: Double, y: Double): Vector = js.native
  def add(x: Double, y: Double, z: Double): Vector = js.native
  /**
    *   Calculates and returns the angle (in radians)
    *   between two vectors.
    *   @param value the x, y, and z components of a
    *   p5.Vector
    *   @return the angle between (in radians)
    */
  def angleBetween(value: Vector): Double = js.native
  /**
    *   Return a representation of this vector as a float
    *   array. This is only for temporary use. If used in
    *   any other fashion, the contents should be copied
    *   by using the p5.Vector.copy() method to copy into
    *   your own array.
    *   @return an Array with the 3 values
    */
  def array(): js.Array[Double] = js.native
  /**
    *   Gets a copy of the vector, returns a p5.Vector
    *   object.
    *   @return the copy of the p5.Vector object
    */
  def copy(): Vector = js.native
  /**
    *   Calculates and returns a vector composed of the
    *   cross product between two vectors. Both the static
    *   and non static methods return a new p5.Vector. See
    *   the examples for more context.
    *   @param v p5.Vector to be crossed
    *   @return p5.Vector composed of cross product
    */
  def cross(v: Vector): Vector = js.native
  /**
    *   Calculates the Euclidean distance between two
    *   points (considering a point as a vector object).
    *   @param v the x, y, and z coordinates of a
    *   p5.Vector
    *   @return the distance
    */
  def dist(v: Vector): Double = js.native
  /**
    *   Divide the vector by a scalar. The static version
    *   of this method creates a new p5.Vector while the
    *   non static version acts on the vector directly.
    *   See the examples for more context.
    *   @param n the number to divide the vector by
    *   @chainable
    */
  def div(n: Double): Vector = js.native
  /**
    *   Calculates the dot product of two vectors. The
    *   version of the method that computes the dot
    *   product of two independent vectors is a static
    *   method. See the examples for more context.
    *   @param value value component of the vector or a
    *   p5.Vector
    */
  def dot(value: Vector): Double = js.native
  /**
    *   Calculates the dot product of two vectors. The
    *   version of the method that computes the dot
    *   product of two independent vectors is a static
    *   method. See the examples for more context.
    *   @param x x component of the vector
    *   @param [y] y component of the vector
    *   @param [z] z component of the vector
    *   @return the dot product
    */
  def dot(x: Double): Double = js.native
  def dot(x: Double, y: Double): Double = js.native
  def dot(x: Double, y: Double, z: Double): Double = js.native
  /**
    *   Equality check against a p5.Vector
    *   @param [x] the x component of the vector
    *   @param [y] the y component of the vector
    *   @param [z] the z component of the vector
    *   @return whether the vectors are equals
    */
  def equals(): Boolean = js.native
  def equals(value: js.Array[_]): Boolean = js.native
  /**
    *   Equality check against a p5.Vector
    *   @param value the vector to compare
    */
  def equals(value: Vector): Boolean = js.native
  def equals(x: Double): Boolean = js.native
  def equals(x: Double, y: Double): Boolean = js.native
  def equals(x: Double, y: Double, z: Double): Boolean = js.native
  /**
    *   Calculate the angle of rotation for this vector
    *   (only 2D vectors)
    *   @return the angle of rotation
    */
  def heading(): Double = js.native
  /**
    *   Linear interpolate the vector to another vector
    *   @param v the p5.Vector to lerp to
    *   @param amt the amount of interpolation; some value
    *   between 0.0 (old vector) and 1.0 (new vector). 0.9
    *   is very near the new vector. 0.5 is halfway in
    *   between.
    *   @chainable
    */
  def lerp(v: Vector, amt: Double): Vector = js.native
  /**
    *   Linear interpolate the vector to another vector
    *   @param x the x component
    *   @param y the y component
    *   @param z the z component
    *   @param amt the amount of interpolation; some value
    *   between 0.0 (old vector) and 1.0 (new vector). 0.9
    *   is very near the new vector. 0.5 is halfway in
    *   between.
    *   @chainable
    */
  def lerp(x: Double, y: Double, z: Double, amt: Double): Vector = js.native
  /**
    *   Limit the magnitude of this vector to the value
    *   used for the max parameter.
    *   @param max the maximum magnitude for the vector
    *   @chainable
    */
  def limit(max: Double): Vector = js.native
  /**
    *   Calculates the magnitude (length) of the vector
    *   and returns the result as a float (this is simply
    *   the equation sqrt(xx + yy + z*z).)
    *   @return magnitude of the vector
    */
  def mag(): Double = js.native
  /**
    *   Calculates the squared magnitude of the vector and
    *   returns the result as a float (this is simply the
    *   equation (xx + yy + z*z).) Faster if the real
    *   length is not required in the case of comparing
    *   vectors, etc.
    *   @return squared magnitude of the vector
    */
  def magSq(): Double = js.native
  /**
    *   Multiply the vector by a scalar. The static
    *   version of this method creates a new p5.Vector
    *   while the non static version acts on the vector
    *   directly. See the examples for more context.
    *   @param n the number to multiply with the vector
    *   @chainable
    */
  def mult(n: Double): Vector = js.native
  /**
    *   Normalize the vector to length 1 (make it a unit
    *   vector).
    *   @return normalized p5.Vector
    */
  def normalize(): Vector = js.native
  /**
    *   Rotate the vector by an angle (only 2D vectors),
    *   magnitude remains the same
    *   @param angle the angle of rotation
    *   @chainable
    */
  def rotate(angle: Double): Vector = js.native
  /**
    *   Sets the x, y, and z component of the vector using
    *   two or three separate variables, the data from a
    *   p5.Vector, or the values from a float array.
    *   @param [x] the x component of the vector
    *   @param [y] the y component of the vector
    *   @param [z] the z component of the vector
    *   @chainable
    */
  def set(): Vector = js.native
  def set(value: js.Array[Double]): Vector = js.native
  /**
    *   Sets the x, y, and z component of the vector using
    *   two or three separate variables, the data from a
    *   p5.Vector, or the values from a float array.
    *   @param value the vector to set
    *   @chainable
    */
  def set(value: Vector): Vector = js.native
  def set(x: Double): Vector = js.native
  def set(x: Double, y: Double): Vector = js.native
  def set(x: Double, y: Double, z: Double): Vector = js.native
  /**
    *   Set the magnitude of this vector to the value used
    *   for the len parameter.
    *   @param len the new length for this vector
    *   @chainable
    */
  def setMag(len: Double): Vector = js.native
  def sub(value: js.Array[Double]): Vector = js.native
  /**
    *   Subtracts x, y, and z components from a vector,
    *   subtracts one vector from another, or subtracts
    *   two independent vectors. The version of the method
    *   that subtracts two vectors is a static method and
    *   returns a p5.Vector, the other acts directly on
    *   the vector. See the examples for more context.
    *   @param value the vector to subtract
    *   @chainable
    */
  def sub(value: Vector): Vector = js.native
  /**
    *   Subtracts x, y, and z components from a vector,
    *   subtracts one vector from another, or subtracts
    *   two independent vectors. The version of the method
    *   that subtracts two vectors is a static method and
    *   returns a p5.Vector, the other acts directly on
    *   the vector. See the examples for more context.
    *   @param x the x component of the vector to subtract
    *   @param [y] the y component of the vector to
    *   subtract
    *   @param [z] the z component of the vector to
    *   subtract
    *   @chainable
    */
  def sub(x: Double): Vector = js.native
  def sub(x: Double, y: Double): Vector = js.native
  def sub(x: Double, y: Double, z: Double): Vector = js.native
}

