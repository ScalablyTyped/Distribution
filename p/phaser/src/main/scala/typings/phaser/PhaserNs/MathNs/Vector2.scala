package typings.phaser.PhaserNs.MathNs

import typings.phaser.PhaserNs.TypesNs.MathNs.Vector2Like
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a vector in 2D space.
  * 
  * A two-component vector.
  */
@JSGlobal("Phaser.Math.Vector2")
@js.native
/**
  * 
  * @param x The x component, or an object with `x` and `y` properties.
  * @param y The y component.
  */
class Vector2 () extends js.Object {
  def this(x: Double) = this()
  def this(x: Vector2Like) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Vector2Like, y: Double) = this()
  /**
    * The x component of this Vector.
    */
  var x: Double = js.native
  /**
    * The y component of this Vector.
    */
  var y: Double = js.native
  /**
    * Add a given Vector to this Vector. Addition is component-wise.
    * @param src The Vector to add to this Vector.
    */
  def add(src: Vector2): Vector2 = js.native
  /**
    * Calculate the angle between this Vector and the positive x-axis, in radians.
    */
  def angle(): Double = js.native
  /**
    * Copy the components of a given Vector into this Vector.
    * @param src The Vector to copy the components from.
    */
  def copy(src: Vector2): Vector2 = js.native
  /**
    * Calculate the cross product of this Vector and the given Vector.
    * @param src The Vector2 to cross with this Vector2.
    */
  def cross(src: Vector2): Double = js.native
  /**
    * Calculate the distance between this Vector and the given Vector.
    * @param src The Vector to calculate the distance to.
    */
  def distance(src: Vector2): Double = js.native
  /**
    * Calculate the distance between this Vector and the given Vector, squared.
    * @param src The Vector to calculate the distance to.
    */
  def distanceSq(src: Vector2): Double = js.native
  /**
    * Perform a component-wise division between this Vector and the given Vector.
    * 
    * Divides this Vector by the given Vector.
    * @param src The Vector to divide this Vector by.
    */
  def divide(src: Vector2): Vector2 = js.native
  /**
    * Calculate the dot product of this Vector and the given Vector.
    * @param src The Vector2 to dot product with this Vector2.
    */
  def dot(src: Vector2): Double = js.native
  /**
    * Check whether this Vector is equal to a given Vector.
    * 
    * Performs a strict equality check against each Vector's components.
    * @param v The vector to compare with this Vector.
    */
  def equals(v: Vector2): Boolean = js.native
  /**
    * Calculate the length (or magnitude) of this Vector.
    */
  def length(): Double = js.native
  /**
    * Calculate the length of this Vector squared.
    */
  def lengthSq(): Double = js.native
  /**
    * Linearly interpolate between this Vector and the given Vector.
    * 
    * Interpolates this Vector towards the given Vector.
    * @param src The Vector2 to interpolate towards.
    * @param t The interpolation percentage, between 0 and 1. Default 0.
    */
  def lerp(src: Vector2): Vector2 = js.native
  def lerp(src: Vector2, t: Double): Vector2 = js.native
  /**
    * Perform a component-wise multiplication between this Vector and the given Vector.
    * 
    * Multiplies this Vector by the given Vector.
    * @param src The Vector to multiply this Vector by.
    */
  def multiply(src: Vector2): Vector2 = js.native
  /**
    * Negate the `x` and `y` components of this Vector.
    */
  def negate(): Vector2 = js.native
  /**
    * Normalize this Vector.
    * 
    * Makes the vector a unit length vector (magnitude of 1) in the same direction.
    */
  def normalize(): Vector2 = js.native
  /**
    * Right-hand normalize (make unit length) this Vector.
    */
  def normalizeRightHand(): Vector2 = js.native
  /**
    * Make this Vector the zero vector (0, 0).
    */
  def reset(): Vector2 = js.native
  /**
    * Scale this Vector by the given value.
    * @param value The value to scale this Vector by.
    */
  def scale(value: Double): Vector2 = js.native
  /**
    * Set the `x` and `y` components of the this Vector to the given `x` and `y` values.
    * @param x The x value to set for this Vector.
    * @param y The y value to set for this Vector. Default x.
    */
  def set(x: Double): Vector2 = js.native
  def set(x: Double, y: Double): Vector2 = js.native
  /**
    * Set the component values of this Vector from a given Vector2Like object.
    * @param obj The object containing the component values to set for this Vector.
    */
  def setFromObject(obj: Vector2Like): Vector2 = js.native
  /**
    * This method is an alias for `Vector2.set`.
    * @param x The x value to set for this Vector.
    * @param y The y value to set for this Vector. Default x.
    */
  def setTo(x: Double): Vector2 = js.native
  def setTo(x: Double, y: Double): Vector2 = js.native
  /**
    * Sets the `x` and `y` values of this object from a given polar coordinate.
    * @param azimuth The angular coordinate, in radians.
    * @param radius The radial coordinate (length). Default 1.
    */
  def setToPolar(azimuth: Double): Vector2 = js.native
  def setToPolar(azimuth: Double, radius: Double): Vector2 = js.native
  /**
    * Subtract the given Vector from this Vector. Subtraction is component-wise.
    * @param src The Vector to subtract from this Vector.
    */
  def subtract(src: Vector2): Vector2 = js.native
  /**
    * Transform this Vector with the given Matrix.
    * @param mat The Matrix3 to transform this Vector2 with.
    */
  def transformMat3(mat: Matrix3): Vector2 = js.native
  /**
    * Transform this Vector with the given Matrix.
    * @param mat The Matrix4 to transform this Vector2 with.
    */
  def transformMat4(mat: Matrix4): Vector2 = js.native
}

/* static members */
@JSGlobal("Phaser.Math.Vector2")
@js.native
object Vector2 extends js.Object {
  /**
    * A static down Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val DOWN: Vector2 = js.native
  /**
    * A static left Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val LEFT: Vector2 = js.native
  /**
    * A static one Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ONE: Vector2 = js.native
  /**
    * A static right Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val RIGHT: Vector2 = js.native
  /**
    * A static up Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val UP: Vector2 = js.native
  /**
    * A static zero Vector2 for use by reference.
    * 
    * This constant is meant for comparison operations and should not be modified directly.
    */
  val ZERO: Vector2 = js.native
}

