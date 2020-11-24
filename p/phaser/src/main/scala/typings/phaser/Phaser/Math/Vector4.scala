package typings.phaser.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of a vector in 4D space.
  * 
  * A four-component vector.
  */
@js.native
trait Vector4 extends js.Object {
  
  /**
    * Add a given Vector to this Vector. Addition is component-wise.
    * @param v The Vector to add to this Vector.
    */
  def add(v: Vector2): Vector4 = js.native
  def add(v: Vector3): Vector4 = js.native
  def add(v: Vector4): Vector4 = js.native
  
  /**
    * Copy the components of a given Vector into this Vector.
    * @param src The Vector to copy the components from.
    */
  def copy(src: Vector4): Vector4 = js.native
  
  /**
    * Calculate the distance between this Vector and the given Vector.
    * @param v The Vector to calculate the distance to.
    */
  def distance(v: Vector2): Double = js.native
  def distance(v: Vector3): Double = js.native
  def distance(v: Vector4): Double = js.native
  
  /**
    * Calculate the distance between this Vector and the given Vector, squared.
    * @param v The Vector to calculate the distance to.
    */
  def distanceSq(v: Vector2): Double = js.native
  def distanceSq(v: Vector3): Double = js.native
  def distanceSq(v: Vector4): Double = js.native
  
  /**
    * Perform a component-wise division between this Vector and the given Vector.
    * 
    * Divides this Vector by the given Vector.
    * @param v The Vector to divide this Vector by.
    */
  def divide(v: Vector2): Vector4 = js.native
  def divide(v: Vector3): Vector4 = js.native
  def divide(v: Vector4): Vector4 = js.native
  
  /**
    * Calculate the dot product of this Vector and the given Vector.
    * @param v The Vector4 to dot product with this Vector4.
    */
  def dot(v: Vector4): Double = js.native
  
  /**
    * Check whether this Vector is equal to a given Vector.
    * 
    * Performs a strict quality check against each Vector's components.
    * @param v The vector to check equality with.
    */
  def equals(v: Vector4): Boolean = js.native
  
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
    * @param v The Vector4 to interpolate towards.
    * @param t The interpolation percentage, between 0 and 1. Default 0.
    */
  def lerp(v: Vector4): Vector4 = js.native
  def lerp(v: Vector4, t: Double): Vector4 = js.native
  
  /**
    * Perform a component-wise multiplication between this Vector and the given Vector.
    * 
    * Multiplies this Vector by the given Vector.
    * @param v The Vector to multiply this Vector by.
    */
  def multiply(v: Vector2): Vector4 = js.native
  def multiply(v: Vector3): Vector4 = js.native
  def multiply(v: Vector4): Vector4 = js.native
  
  /**
    * Negate the `x`, `y`, `z` and `w` components of this Vector.
    */
  def negate(): Vector4 = js.native
  
  /**
    * Normalize this Vector.
    * 
    * Makes the vector a unit length vector (magnitude of 1) in the same direction.
    */
  def normalize(): Vector4 = js.native
  
  /**
    * Make this Vector the zero vector (0, 0, 0, 0).
    */
  def reset(): Vector4 = js.native
  
  /**
    * Scale this Vector by the given value.
    * @param scale The value to scale this Vector by.
    */
  def scale(scale: Double): Vector4 = js.native
  
  def set(x: js.Object, y: Double, z: Double, w: Double): Vector4 = js.native
  /**
    * Set the `x`, `y`, `z` and `w` components of the this Vector to the given `x`, `y`, `z` and `w` values.
    * @param x The x value to set for this Vector, or an object containing x, y, z and w components.
    * @param y The y value to set for this Vector.
    * @param z The z value to set for this Vector.
    * @param w The z value to set for this Vector.
    */
  def set(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  
  /**
    * Subtract the given Vector from this Vector. Subtraction is component-wise.
    * @param v The Vector to subtract from this Vector.
    */
  def subtract(v: Vector2): Vector4 = js.native
  def subtract(v: Vector3): Vector4 = js.native
  def subtract(v: Vector4): Vector4 = js.native
  
  /**
    * Transform this Vector with the given Matrix.
    * @param mat The Matrix4 to transform this Vector4 with.
    */
  def transformMat4(mat: Matrix4): Vector4 = js.native
  
  /**
    * Transform this Vector with the given Quaternion.
    * @param q The Quaternion to transform this Vector with.
    */
  def transformQuat(q: Quaternion): Vector4 = js.native
  
  /**
    * The w component of this Vector.
    */
  var w: Double = js.native
  
  /**
    * The x component of this Vector.
    */
  var x: Double = js.native
  
  /**
    * The y component of this Vector.
    */
  var y: Double = js.native
  
  /**
    * The z component of this Vector.
    */
  var z: Double = js.native
}
