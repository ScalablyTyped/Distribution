package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Vector")
@js.native
class Vector ()
  extends p5Lib.p5Mod.p5Ns.Vector

@JSImport("p5", "Vector")
@js.native
object Vector extends js.Object {
  /**
       *   Adds x, y, and z components to a vector, adds one
       *   vector to another, or adds two independent vectors
       *   together. The version of the method that adds two
       *   vectors together is a static method and returns a
       *   p5.Vector, the others acts directly on the vector.
       *   See the examples for more context.
       *   @param v1 a p5.Vector to add
       *   @param v2 a p5.Vector to add
       *   @return the resulting p5.Vector
       */
  def add(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector): p5Lib.p5Mod.Vector = js.native
  /**
       *   Adds x, y, and z components to a vector, adds one
       *   vector to another, or adds two independent vectors
       *   together. The version of the method that adds two
       *   vectors together is a static method and returns a
       *   p5.Vector, the others acts directly on the vector.
       *   See the examples for more context.
       *   @param v1 a p5.Vector to add
       *   @param v2 a p5.Vector to add
       *   @param target the vector to receive the result
       */
  def add(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector, target: p5Lib.p5Mod.Vector): scala.Unit = js.native
  /**
       *   Calculates and returns a vector composed of the
       *   cross product between two vectors. Both the static
       *   and non static methods return a new p5.Vector. See
       *   the examples for more context.
       *   @param v1 the first p5.Vector
       *   @param v2 the second p5.Vector
       *   @return the cross product
       */
  def cross(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector): scala.Double = js.native
  /**
       *   Calculates the Euclidean distance between two
       *   points (considering a point as a vector object).
       *   @param v1 the first p5.Vector
       *   @param v2 the second p5.Vector
       *   @return the distance
       */
  def dist(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector): scala.Double = js.native
  /**
       *   Divide the vector by a scalar. The static version
       *   of this method creates a new p5.Vector while the
       *   non static version acts on the vector directly.
       *   See the examples for more context.
       *   @param v the vector to divide
       *   @param n the number to divide the vector by
       *   @return the resulting new p5.Vector
       */
  def div(v: p5Lib.p5Mod.Vector, n: scala.Double): p5Lib.p5Mod.Vector = js.native
  /**
       *   Divide the vector by a scalar. The static version
       *   of this method creates a new p5.Vector while the
       *   non static version acts on the vector directly.
       *   See the examples for more context.
       *   @param v the vector to divide
       *   @param n the number to divide the vector by
       *   @param target if undefined a new vector will be
       *   created
       */
  def div(v: p5Lib.p5Mod.Vector, n: scala.Double, target: p5Lib.p5Mod.Vector): scala.Unit = js.native
  /**
       *   Calculates the dot product of two vectors. The
       *   version of the method that computes the dot
       *   product of two independent vectors is a static
       *   method. See the examples for more context.
       *   @param v1 the first p5.Vector
       *   @param v2 the second p5.Vector
       *   @return the dot product
       */
  def dot(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector): scala.Double = js.native
  /**
       *   Make a new 2D vector from an angle
       *   @param angle the desired angle, in radians
       *   @param [length] the length of the new vector
       *   (defaults to 1)
       *   @return the new p5.Vector object
       */
  def fromAngle(angle: scala.Double): p5Lib.p5Mod.Vector = js.native
  /**
       *   Make a new 2D vector from an angle
       *   @param angle the desired angle, in radians
       *   @param [length] the length of the new vector
       *   (defaults to 1)
       *   @return the new p5.Vector object
       */
  def fromAngle(angle: scala.Double, length: scala.Double): p5Lib.p5Mod.Vector = js.native
  /**
       *   Make a new 3D vector from a pair of ISO spherical
       *   angles
       *   @param theta the polar angle, in radians (zero is
       *   up)
       *   @param phi the azimuthal angle, in radians (zero
       *   is out of the screen)
       *   @param [length] the length of the new vector
       *   (defaults to 1)
       *   @return the new p5.Vector object
       */
  def fromAngles(theta: scala.Double, phi: scala.Double): p5Lib.p5Mod.Vector = js.native
  /**
       *   Make a new 3D vector from a pair of ISO spherical
       *   angles
       *   @param theta the polar angle, in radians (zero is
       *   up)
       *   @param phi the azimuthal angle, in radians (zero
       *   is out of the screen)
       *   @param [length] the length of the new vector
       *   (defaults to 1)
       *   @return the new p5.Vector object
       */
  def fromAngles(theta: scala.Double, phi: scala.Double, length: scala.Double): p5Lib.p5Mod.Vector = js.native
  /**
       *   Linear interpolate the vector to another vector
       *   @param amt the amount of interpolation; some value
       *   between 0.0 (old vector) and 1.0 (new vector). 0.9
       *   is very near the new vector. 0.5 is halfway in
       *   between.
       *   @return the lerped value
       */
  def lerp(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector, amt: scala.Double): scala.Double = js.native
  /**
       *   Linear interpolate the vector to another vector
       *   @param amt the amount of interpolation; some value
       *   between 0.0 (old vector) and 1.0 (new vector). 0.9
       *   is very near the new vector. 0.5 is halfway in
       *   between.
       *   @param target if undefined a new vector will be
       *   created
       */
  def lerp(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector, amt: scala.Double, target: p5Lib.p5Mod.Vector): scala.Unit = js.native
  /**
       *   Calculates the magnitude (length) of the vector
       *   and returns the result as a float (this is simply
       *   the equation sqrt(xx + yy + z*z).)
       *   @param vecT the vector to return the magnitude of
       *   @return the magnitude of vecT
       */
  def mag(vecT: p5Lib.p5Mod.Vector): scala.Double = js.native
  /**
       *   Multiply the vector by a scalar. The static
       *   version of this method creates a new p5.Vector
       *   while the non static version acts on the vector
       *   directly. See the examples for more context.
       *   @param v the vector to multiply
       *   @param n the number to multiply with the vector
       *   @return the resulting new p5.Vector
       */
  def mult(v: p5Lib.p5Mod.Vector, n: scala.Double): p5Lib.p5Mod.Vector = js.native
  /**
       *   Multiply the vector by a scalar. The static
       *   version of this method creates a new p5.Vector
       *   while the non static version acts on the vector
       *   directly. See the examples for more context.
       *   @param v the vector to multiply
       *   @param n the number to multiply with the vector
       *   @param target if undefined a new vector will be
       *   created
       */
  def mult(v: p5Lib.p5Mod.Vector, n: scala.Double, target: p5Lib.p5Mod.Vector): scala.Unit = js.native
  /**
       *   Make a new 2D unit vector from a random angle
       *   @return the new p5.Vector object
       */
  def random2D(): p5Lib.p5Mod.Vector = js.native
  /**
       *   Make a new random 3D unit vector.
       *   @return the new p5.Vector object
       */
  def random3D(): p5Lib.p5Mod.Vector = js.native
  /**
       *   Subtracts x, y, and z components from a vector,
       *   subtracts one vector from another, or subtracts
       *   two independent vectors. The version of the method
       *   that subtracts two vectors is a static method and
       *   returns a p5.Vector, the other acts directly on
       *   the vector. See the examples for more context.
       *   @param v1 a p5.Vector to subtract from
       *   @param v2 a p5.Vector to subtract
       *   @return the resulting p5.Vector
       */
  def sub(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector): p5Lib.p5Mod.Vector = js.native
  /**
       *   Subtracts x, y, and z components from a vector,
       *   subtracts one vector from another, or subtracts
       *   two independent vectors. The version of the method
       *   that subtracts two vectors is a static method and
       *   returns a p5.Vector, the other acts directly on
       *   the vector. See the examples for more context.
       *   @param v1 a p5.Vector to subtract from
       *   @param v2 a p5.Vector to subtract
       *   @param target if undefined a new vector will be
       *   created
       */
  def sub(v1: p5Lib.p5Mod.Vector, v2: p5Lib.p5Mod.Vector, target: p5Lib.p5Mod.Vector): scala.Unit = js.native
}

