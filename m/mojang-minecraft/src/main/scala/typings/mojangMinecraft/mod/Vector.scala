package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Vector")
@js.native
open class Vector protected () extends StObject {
  /**
    * @remarks
    * Creates a new instance of an abstract vector.
    * @param x
    * X component of the vector.
    * @param y
    * Y component of the vector.
    * @param z
    * Z component of the vector.
    */
  def this(x: Double, y: Double, z: Double) = this()
  
  /**
    * @remarks
    * Compares this vector and another vector to one another.
    * @param other
    * Other vector to compare this vector to.
    * @returns
    * True if the two vectors are equal.
    */
  def equals(other: Vector): Boolean = js.native
  
  /**
    * @remarks
    * Returns the length of this vector.
    */
  def length(): Double = js.native
  
  /**
    * @remarks
    * Returns the squared length of this vector.
    */
  def lengthSquared(): Double = js.native
  
  /**
    * @remarks
    * Returns this vector as a normalized vector.
    */
  def normalized(): Vector = js.native
  
  /**
    * X component of this vector.
    */
  var x: Double = js.native
  
  /**
    * Y component of this vector.
    */
  var y: Double = js.native
  
  /**
    * Z component of this vector.
    */
  var z: Double = js.native
}
/* static members */
object Vector {
  
  @JSImport("mojang-minecraft", "Vector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @remarks
    * Returns the addition of these vectors.
    * @param a
    * @param b
    */
  inline def add(a: Vector, b: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * A constant vector that represents (0, 0, -1).
    */
  @JSImport("mojang-minecraft", "Vector.back")
  @js.native
  val back: Vector = js.native
  
  /**
    * @remarks
    * Returns the cross product of these two vectors.
    * @param a
    * @param b
    */
  inline def cross(a: Vector, b: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * @remarks
    * Returns the distance between two vectors.
    * @param a
    * @param b
    */
  inline def distance(a: Vector, b: Vector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * @remarks
    * Returns the component-wise division of these vectors.
    * @param a
    * @param b
    */
  inline def divide(a: Vector, b: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  inline def divide(a: Vector, b: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * A constant vector that represents (0, -1, 0).
    */
  @JSImport("mojang-minecraft", "Vector.down")
  @js.native
  val down: Vector = js.native
  
  /**
    * A constant vector that represents (0, 0, 1).
    */
  @JSImport("mojang-minecraft", "Vector.forward")
  @js.native
  val forward: Vector = js.native
  
  /**
    * A constant vector that represents (-1, 0, 0).
    */
  @JSImport("mojang-minecraft", "Vector.left")
  @js.native
  val left: Vector = js.native
  
  /**
    * @remarks
    * Returns the linear interpolation between a and b using t as
    * the control.
    * @param a
    * @param b
    * @param t
    */
  inline def lerp(a: Vector, b: Vector, t: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * @remarks
    * Returns a vector that is made from the largest components of
    * two vectors.
    * @param a
    * @param b
    */
  inline def max(a: Vector, b: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * @remarks
    * Returns a vector that is made from the smallest components
    * of two vectors.
    * @param a
    * @param b
    */
  inline def min(a: Vector, b: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * @remarks
    * Returns the component-wise product of these vectors.
    * @param a
    * @param b
    */
  inline def multiply(a: Vector, b: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  inline def multiply(a: Vector, b: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * A constant vector that represents (1, 1, 1).
    */
  @JSImport("mojang-minecraft", "Vector.one")
  @js.native
  val one: Vector = js.native
  
  /**
    * A constant vector that represents (1, 0, 0).
    */
  @JSImport("mojang-minecraft", "Vector.right")
  @js.native
  val right: Vector = js.native
  
  /**
    * @remarks
    * Returns the spherical linear interpolation between a and b
    * using s as the control.
    * @param a
    * @param b
    * @param s
    */
  inline def slerp(a: Vector, b: Vector, s: Double): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * @remarks
    * Returns the subtraction of these vectors.
    * @param a
    * @param b
    */
  inline def subtract(a: Vector, b: Vector): Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Vector]
  
  /**
    * A constant vector that represents (0, 1, 0).
    */
  @JSImport("mojang-minecraft", "Vector.up")
  @js.native
  val up: Vector = js.native
  
  /**
    * A constant vector that represents (0, 0, 0).
    */
  @JSImport("mojang-minecraft", "Vector.zero")
  @js.native
  val zero: Vector = js.native
}
