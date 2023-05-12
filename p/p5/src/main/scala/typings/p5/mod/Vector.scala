package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vector extends StObject {
  
  def add(value: js.Array[Double]): Vector = js.native
  /**
    *   Adds x, y, and z components to a vector, adds one
    *   vector to another, or adds two independent vectors
    *   together. The version of the method that adds two
    *   vectors together is a static method and returns a
    *   p5.Vector, the others act directly on the vector.
    *   Additionally, you may provide arguments to this
    *   method as an array. See the examples for more
    *   context.
    *   @param value The vector to add
    *   @chainable
    */
  def add(value: Vector): Vector = js.native
  /**
    *   Adds x, y, and z components to a vector, adds one
    *   vector to another, or adds two independent vectors
    *   together. The version of the method that adds two
    *   vectors together is a static method and returns a
    *   p5.Vector, the others act directly on the vector.
    *   Additionally, you may provide arguments to this
    *   method as an array. See the examples for more
    *   context.
    *   @param x The x component of the vector to be added
    *   @param [y] The y component of the vector to be
    *   added
    *   @param [z] The z component of the vector to be
    *   added
    *   @chainable
    */
  def add(x: Double): Vector = js.native
  def add(x: Double, y: Double): Vector = js.native
  def add(x: Double, y: Double, z: Double): Vector = js.native
  def add(x: Double, y: Unit, z: Double): Vector = js.native
  
  /**
    *   Calculates and returns the angle between two
    *   vectors. This method will take the current
    *   angleMode into consideration, and give the angle
    *   in radians or degrees accordingly.
    *   @param value The x, y, and z components of a
    *   p5.Vector
    *   @return The angle between
    */
  def angleBetween(value: Vector): Double = js.native
  
  /**
    *   Return a representation of this vector as a float
    *   array. This is only for temporary use. If used in
    *   any other fashion, the contents should be copied
    *   by using the p5.Vector.copy() method to copy into
    *   your own vector.
    *   @return An Array with the 3 values
    */
  def array(): js.Array[Double] = js.native
  
  /**
    *   Gets a copy of the vector, returns a p5.Vector
    *   object.
    *   @return A copy of the p5.Vector object
    */
  def copy(): Vector = js.native
  
  /**
    *   Calculates and returns a vector composed of the
    *   cross product between two vectors. Both the static
    *   and non-static methods return a new p5.Vector. See
    *   the examples for more context.
    *   @param v p5.Vector to be crossed
    *   @return p5.Vector composed of cross product
    */
  def cross(v: Vector): Vector = js.native
  
  /**
    *   Calculates the Euclidean distance between two
    *   points (considering a point as a vector object).
    *   If you are looking to calculate distance between 2
    *   points see dist()
    *   @param v The x, y, and z coordinates of a
    *   p5.Vector
    *   @return The distance
    */
  def dist(v: Vector): Double = js.native
  
  /**
    *   Divides the vector by a scalar, divides a vector
    *   by the x, y, and z arguments, or divides the x, y,
    *   and z components of two vectors against each
    *   other. When dividing a vector by a scalar, the x,
    *   y, and z components of the vector are all divided
    *   by the scalar. When dividing a vector by a vector,
    *   the x, y, z components of the source vector are
    *   treated as the dividend, and the x, y, z
    *   components of the argument is treated as the
    *   divisor. (For example, with two vectors a and b:
    *   a.x / b.x, a.y / b.y, a.z / b.z.) If any component
    *   of the second vector is 0, a division by 0 error
    *   will be logged, unless both two vectors have 0 in
    *   their z components, in which case only the x and y
    *   components will be divided. The static version of
    *   this method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   method as an array. See the examples for more
    *   context.
    *   @param arr The array to divide the components of
    *   the vector by
    *   @chainable
    */
  def div(arr: js.Array[Double]): Vector = js.native
  /**
    *   Divides the vector by a scalar, divides a vector
    *   by the x, y, and z arguments, or divides the x, y,
    *   and z components of two vectors against each
    *   other. When dividing a vector by a scalar, the x,
    *   y, and z components of the vector are all divided
    *   by the scalar. When dividing a vector by a vector,
    *   the x, y, z components of the source vector are
    *   treated as the dividend, and the x, y, z
    *   components of the argument is treated as the
    *   divisor. (For example, with two vectors a and b:
    *   a.x / b.x, a.y / b.y, a.z / b.z.) If any component
    *   of the second vector is 0, a division by 0 error
    *   will be logged, unless both two vectors have 0 in
    *   their z components, in which case only the x and y
    *   components will be divided. The static version of
    *   this method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   method as an array. See the examples for more
    *   context.
    *   @param n The number to divide the vector by
    *   @chainable
    */
  def div(n: Double): Vector = js.native
  /**
    *   Divides the vector by a scalar, divides a vector
    *   by the x, y, and z arguments, or divides the x, y,
    *   and z components of two vectors against each
    *   other. When dividing a vector by a scalar, the x,
    *   y, and z components of the vector are all divided
    *   by the scalar. When dividing a vector by a vector,
    *   the x, y, z components of the source vector are
    *   treated as the dividend, and the x, y, z
    *   components of the argument is treated as the
    *   divisor. (For example, with two vectors a and b:
    *   a.x / b.x, a.y / b.y, a.z / b.z.) If any component
    *   of the second vector is 0, a division by 0 error
    *   will be logged, unless both two vectors have 0 in
    *   their z components, in which case only the x and y
    *   components will be divided. The static version of
    *   this method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   method as an array. See the examples for more
    *   context.
    *   @param v The vector to divide the components of
    *   the original vector by
    *   @chainable
    */
  def div(v: Vector): Vector = js.native
  /**
    *   Divides the vector by a scalar, divides a vector
    *   by the x, y, and z arguments, or divides the x, y,
    *   and z components of two vectors against each
    *   other. When dividing a vector by a scalar, the x,
    *   y, and z components of the vector are all divided
    *   by the scalar. When dividing a vector by a vector,
    *   the x, y, z components of the source vector are
    *   treated as the dividend, and the x, y, z
    *   components of the argument is treated as the
    *   divisor. (For example, with two vectors a and b:
    *   a.x / b.x, a.y / b.y, a.z / b.z.) If any component
    *   of the second vector is 0, a division by 0 error
    *   will be logged, unless both two vectors have 0 in
    *   their z components, in which case only the x and y
    *   components will be divided. The static version of
    *   this method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   method as an array. See the examples for more
    *   context.
    *   @param x The number to divide with the x component
    *   of the vector
    *   @param y The number to divide with the y component
    *   of the vector
    *   @param [z] The number to divide with the z
    *   component of the vector
    *   @chainable
    */
  def div(x: Double, y: Double): Vector = js.native
  def div(x: Double, y: Double, z: Double): Vector = js.native
  
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
    *   @param x The x component of the vector
    *   @param [y] The y component of the vector
    *   @param [z] The z component of the vector
    *   @return The dot product
    */
  def dot(x: Double): Double = js.native
  def dot(x: Double, y: Double): Double = js.native
  def dot(x: Double, y: Double, z: Double): Double = js.native
  def dot(x: Double, y: Unit, z: Double): Double = js.native
  
  /**
    *   Equality check against a p5.Vector.
    *   @param [x] The x component of the vector
    *   @param [y] The y component of the vector
    *   @param [z] The z component of the vector
    *   @return Whether the vectors are equal
    */
  def equals(): Boolean = js.native
  def equals(value: js.Array[Any]): Boolean = js.native
  /**
    *   Equality check against a p5.Vector.
    *   @param value The vector to compare
    */
  def equals(value: Vector): Boolean = js.native
  def equals(x: Double): Boolean = js.native
  def equals(x: Double, y: Double): Boolean = js.native
  def equals(x: Double, y: Double, z: Double): Boolean = js.native
  def equals(x: Double, y: Unit, z: Double): Boolean = js.native
  def equals(x: Unit, y: Double): Boolean = js.native
  def equals(x: Unit, y: Double, z: Double): Boolean = js.native
  def equals(x: Unit, y: Unit, z: Double): Boolean = js.native
  
  /**
    *   Calculate the angle of rotation for this vector
    *   (only 2D vectors). p5.Vectors created using
    *   createVector() will take the current angleMode()
    *   into consideration, and give the angle in radians
    *   or degrees accordingly.
    *   @return The angle of rotation
    */
  def heading(): Double = js.native
  
  /**
    *   Linear interpolate the vector to another vector.
    *   @param v The p5.Vector to lerp to
    *   @param amt The amount of interpolation; some value
    *   between 0.0 (old vector) and 1.0 (new vector). 0.9
    *   is very near the new vector. 0.5 is halfway in
    *   between.
    *   @chainable
    */
  def lerp(v: Vector, amt: Double): Vector = js.native
  /**
    *   Linear interpolate the vector to another vector.
    *   @param x The x component
    *   @param y The y component
    *   @param z The z component
    *   @param amt The amount of interpolation; some value
    *   between 0.0 (old vector) and 1.0 (new vector). 0.9
    *   is very near the new vector. 0.5 is halfway in
    *   between.
    *   @chainable
    */
  def lerp(x: Double, y: Double, z: Double, amt: Double): Vector = js.native
  
  /**
    *   Limit the magnitude of this vector to the value
    *   used for the max parameter.
    *   @param max The maximum magnitude for the vector
    *   @chainable
    */
  def limit(max: Double): Vector = js.native
  
  /**
    *   Calculates the magnitude (length) of the vector
    *   and returns the result as a float. (This is simply
    *   the equation sqrt(x*x + y*y + z*z).)
    *   @return The magnitude of the vector
    */
  def mag(): Double = js.native
  
  /**
    *   Calculates the squared magnitude of the vector and
    *   returns the result as a float. (This is simply the
    *   equation x*x + y*y + z*z.) Faster if the real
    *   length is not required in the case of comparing
    *   vectors, etc.
    *   @return The squared magnitude of the vector
    */
  def magSq(): Double = js.native
  
  /**
    *   Multiplies the vector by a scalar, multiplies the
    *   x, y, and z components from a vector, or
    *   multiplies the x, y, and z components of two
    *   independent vectors. When multiplying a vector by
    *   a scalar, the x, y, and z components of the vector
    *   are all multiplied by the scalar. When multiplying
    *   a vector by a vector, the x, y, z components of
    *   both vectors are multiplied by each other (for
    *   example, with two vectors a and b: a.x * b.x, a.y
    *   * b.y, a.z * b.z). The static version of this
    *   method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   function as an array. See the examples for more
    *   context.
    *   @param arr The array to multiply with the
    *   components of the vector
    *   @chainable
    */
  def mult(arr: js.Array[Double]): Vector = js.native
  /**
    *   Multiplies the vector by a scalar, multiplies the
    *   x, y, and z components from a vector, or
    *   multiplies the x, y, and z components of two
    *   independent vectors. When multiplying a vector by
    *   a scalar, the x, y, and z components of the vector
    *   are all multiplied by the scalar. When multiplying
    *   a vector by a vector, the x, y, z components of
    *   both vectors are multiplied by each other (for
    *   example, with two vectors a and b: a.x * b.x, a.y
    *   * b.y, a.z * b.z). The static version of this
    *   method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   function as an array. See the examples for more
    *   context.
    *   @param n The number to multiply with the vector
    *   @chainable
    */
  def mult(n: Double): Vector = js.native
  /**
    *   Multiplies the vector by a scalar, multiplies the
    *   x, y, and z components from a vector, or
    *   multiplies the x, y, and z components of two
    *   independent vectors. When multiplying a vector by
    *   a scalar, the x, y, and z components of the vector
    *   are all multiplied by the scalar. When multiplying
    *   a vector by a vector, the x, y, z components of
    *   both vectors are multiplied by each other (for
    *   example, with two vectors a and b: a.x * b.x, a.y
    *   * b.y, a.z * b.z). The static version of this
    *   method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   function as an array. See the examples for more
    *   context.
    *   @param v The vector to multiply with the
    *   components of the original vector
    *   @chainable
    */
  def mult(v: Vector): Vector = js.native
  /**
    *   Multiplies the vector by a scalar, multiplies the
    *   x, y, and z components from a vector, or
    *   multiplies the x, y, and z components of two
    *   independent vectors. When multiplying a vector by
    *   a scalar, the x, y, and z components of the vector
    *   are all multiplied by the scalar. When multiplying
    *   a vector by a vector, the x, y, z components of
    *   both vectors are multiplied by each other (for
    *   example, with two vectors a and b: a.x * b.x, a.y
    *   * b.y, a.z * b.z). The static version of this
    *   method creates a new p5.Vector while the
    *   non-static version acts on the vector directly.
    *   Additionally, you may provide arguments to this
    *   function as an array. See the examples for more
    *   context.
    *   @param x The number to multiply with the x
    *   component of the vector
    *   @param y The number to multiply with the y
    *   component of the vector
    *   @param [z] The number to multiply with the z
    *   component of the vector
    *   @chainable
    */
  def mult(x: Double, y: Double): Vector = js.native
  def mult(x: Double, y: Double, z: Double): Vector = js.native
  
  /**
    *   Normalize the vector to length 1 (make it a unit
    *   vector).
    *   @return The normalized p5.Vector
    */
  def normalize(): Vector = js.native
  
  /**
    *   Reflect a vector about a normal to a line in 2D,
    *   or about a normal to a plane in 3D.
    *   @param surfaceNormal the p5.Vector to reflect
    *   about.
    *   @chainable
    */
  def reflect(surfaceNormal: Vector): Vector = js.native
  
  def rem(value: js.Array[Double]): Vector = js.native
  /**
    *   Gives the remainder of a vector when it is divided
    *   by another vector. See examples for more context.
    *   @param value The divisor vector
    *   @chainable
    */
  def rem(value: Vector): Vector = js.native
  /**
    *   Gives the remainder of a vector when it is divided
    *   by another vector. See examples for more context.
    *   @param x The x component of divisor vector
    *   @param y The y component of divisor vector
    *   @param z The z component of divisor vector
    *   @chainable
    */
  def rem(x: Double, y: Double, z: Double): Vector = js.native
  
  /**
    *   Rotate the vector by an angle (only 2D vectors);
    *   magnitude remains the same.
    *   @param angle The angle of rotation
    *   @chainable
    */
  def rotate(angle: Double): Vector = js.native
  
  /**
    *   Sets the x, y, and z components of the vector
    *   using two or three separate variables, the data
    *   from a p5.Vector, or the values from a float
    *   array.
    *   @param [x] The x component of the vector
    *   @param [y] The y component of the vector
    *   @param [z] The z component of the vector
    *   @chainable
    */
  def set(): Vector = js.native
  def set(value: js.Array[Double]): Vector = js.native
  /**
    *   Sets the x, y, and z components of the vector
    *   using two or three separate variables, the data
    *   from a p5.Vector, or the values from a float
    *   array.
    *   @param value The vector to set
    *   @chainable
    */
  def set(value: Vector): Vector = js.native
  def set(x: Double): Vector = js.native
  def set(x: Double, y: Double): Vector = js.native
  def set(x: Double, y: Double, z: Double): Vector = js.native
  def set(x: Double, y: Unit, z: Double): Vector = js.native
  def set(x: Unit, y: Double): Vector = js.native
  def set(x: Unit, y: Double, z: Double): Vector = js.native
  def set(x: Unit, y: Unit, z: Double): Vector = js.native
  
  /**
    *   Rotate the vector to a specific angle (only 2D
    *   vectors); magnitude remains the same.
    *   @param angle The angle of rotation
    *   @chainable
    */
  def setHeading(angle: Double): Vector = js.native
  
  /**
    *   Set the magnitude of this vector to the value used
    *   for the len parameter.
    *   @param len The new length for this vector
    *   @chainable
    */
  def setMag(len: Double): Vector = js.native
  
  def sub(value: js.Array[Double]): Vector = js.native
  /**
    *   Subtracts x, y, and z components from a vector,
    *   subtracts one vector from another, or subtracts
    *   two independent vectors. The version of the method
    *   that subtracts two vectors is a static method and
    *   returns a p5.Vector, the others act directly on
    *   the vector. Additionally, you may provide
    *   arguments to this method as an array. See the
    *   examples for more context.
    *   @param value the vector to subtract
    *   @chainable
    */
  def sub(value: Vector): Vector = js.native
  /**
    *   Subtracts x, y, and z components from a vector,
    *   subtracts one vector from another, or subtracts
    *   two independent vectors. The version of the method
    *   that subtracts two vectors is a static method and
    *   returns a p5.Vector, the others act directly on
    *   the vector. Additionally, you may provide
    *   arguments to this method as an array. See the
    *   examples for more context.
    *   @param x The x component of the vector to subtract
    *   @param [y] The y component of the vector to
    *   subtract
    *   @param [z] The z component of the vector to
    *   subtract
    *   @chainable
    */
  def sub(x: Double): Vector = js.native
  def sub(x: Double, y: Double): Vector = js.native
  def sub(x: Double, y: Double, z: Double): Vector = js.native
  def sub(x: Double, y: Unit, z: Double): Vector = js.native
  
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
}
