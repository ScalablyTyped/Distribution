package typings.phaser.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a vector in 3D space.
  * 
  * A three-component vector.
  */
@js.native
trait Vector3 extends js.Object {
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
  /**
    * Add a given Vector to this Vector. Addition is component-wise.
    * @param v The Vector to add to this Vector.
    */
  def add(v: Vector2): Vector3 = js.native
  def add(v: Vector3): Vector3 = js.native
  /**
    * Copy the components of a given Vector into this Vector.
    * @param src The Vector to copy the components from.
    */
  def copy(src: Vector2): Vector3 = js.native
  def copy(src: Vector3): Vector3 = js.native
  /**
    * Calculate the cross (vector) product of this Vector (which will be modified) and the given Vector.
    * @param v The Vector to cross product with.
    */
  def cross(v: Vector3): Vector3 = js.native
  /**
    * Calculate the cross (vector) product of two given Vectors.
    * @param a The first Vector to multiply.
    * @param b The second Vector to multiply.
    */
  def crossVectors(a: Vector3, b: Vector3): Vector3 = js.native
  /**
    * Calculate the distance between this Vector and the given Vector.
    * @param v The Vector to calculate the distance to.
    */
  def distance(v: Vector2): Double = js.native
  def distance(v: Vector3): Double = js.native
  /**
    * Calculate the distance between this Vector and the given Vector, squared.
    * @param v The Vector to calculate the distance to.
    */
  def distanceSq(v: Vector2): Double = js.native
  def distanceSq(v: Vector3): Double = js.native
  /**
    * Perform a component-wise division between this Vector and the given Vector.
    * 
    * Divides this Vector by the given Vector.
    * @param v The Vector to divide this Vector by.
    */
  def divide(v: Vector2): Vector3 = js.native
  def divide(v: Vector3): Vector3 = js.native
  /**
    * Calculate the dot product of this Vector and the given Vector.
    * @param v The Vector3 to dot product with this Vector3.
    */
  def dot(v: Vector3): Double = js.native
  /**
    * Check whether this Vector is equal to a given Vector.
    * 
    * Performs a strict equality check against each Vector's components.
    * @param v The Vector3 to compare against.
    */
  def equals(v: Vector3): Boolean = js.native
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
    * @param v The Vector3 to interpolate towards.
    * @param t The interpolation percentage, between 0 and 1. Default 0.
    */
  def lerp(v: Vector3): Vector3 = js.native
  def lerp(v: Vector3, t: Double): Vector3 = js.native
  /**
    * Perform a component-wise multiplication between this Vector and the given Vector.
    * 
    * Multiplies this Vector by the given Vector.
    * @param v The Vector to multiply this Vector by.
    */
  def multiply(v: Vector2): Vector3 = js.native
  def multiply(v: Vector3): Vector3 = js.native
  /**
    * Negate the `x`, `y` and `z` components of this Vector.
    */
  def negate(): Vector3 = js.native
  /**
    * Normalize this Vector.
    * 
    * Makes the vector a unit length vector (magnitude of 1) in the same direction.
    */
  def normalize(): Vector3 = js.native
  /**
    * Multiplies this Vector3 by the specified matrix, applying a W divide. This is useful for projection,
    * e.g. unprojecting a 2D point into 3D space.
    * @param mat The Matrix4 to multiply this Vector3 with.
    */
  def project(mat: Matrix4): Vector3 = js.native
  /**
    * Make this Vector the zero vector (0, 0, 0).
    */
  def reset(): Vector3 = js.native
  /**
    * Scale this Vector by the given value.
    * @param scale The value to scale this Vector by.
    */
  def scale(scale: Double): Vector3 = js.native
  def set(x: js.Object): Vector3 = js.native
  def set(x: js.Object, y: js.UndefOr[scala.Nothing], z: Double): Vector3 = js.native
  def set(x: js.Object, y: Double): Vector3 = js.native
  def set(x: js.Object, y: Double, z: Double): Vector3 = js.native
  /**
    * Set the `x`, `y`, and `z` components of this Vector to the given `x`, `y`, and `z` values.
    * @param x The x value to set for this Vector, or an object containing x, y and z components.
    * @param y The y value to set for this Vector.
    * @param z The z value to set for this Vector.
    */
  def set(x: Double): Vector3 = js.native
  def set(x: Double, y: js.UndefOr[scala.Nothing], z: Double): Vector3 = js.native
  def set(x: Double, y: Double): Vector3 = js.native
  def set(x: Double, y: Double, z: Double): Vector3 = js.native
  /**
    * Subtract the given Vector from this Vector. Subtraction is component-wise.
    * @param v The Vector to subtract from this Vector.
    */
  def subtract(v: Vector2): Vector3 = js.native
  def subtract(v: Vector3): Vector3 = js.native
  /**
    * Transforms the coordinates of this Vector3 with the given Matrix4.
    * @param mat The Matrix4 to transform this Vector3 with.
    */
  def transformCoordinates(mat: Matrix4): Vector3 = js.native
  /**
    * Transform this Vector with the given Matrix.
    * @param mat The Matrix3 to transform this Vector3 with.
    */
  def transformMat3(mat: Matrix3): Vector3 = js.native
  /**
    * Transform this Vector with the given Matrix.
    * @param mat The Matrix4 to transform this Vector3 with.
    */
  def transformMat4(mat: Matrix4): Vector3 = js.native
  /**
    * Transform this Vector with the given Quaternion.
    * @param q The Quaternion to transform this Vector with.
    */
  def transformQuat(q: Quaternion): Vector3 = js.native
  /**
    * Unproject this point from 2D space to 3D space.
    * The point should have its x and y properties set to
    * 2D screen space, and the z either at 0 (near plane)
    * or 1 (far plane). The provided matrix is assumed to already
    * be combined, i.e. projection * view * model.
    * 
    * After this operation, this vector's (x, y, z) components will
    * represent the unprojected 3D coordinate.
    * @param viewport Screen x, y, width and height in pixels.
    * @param invProjectionView Combined projection and view matrix.
    */
  def unproject(viewport: Vector4, invProjectionView: Matrix4): Vector3 = js.native
  /**
    * Set this Vector to point up.
    * 
    * Sets the y component of the vector to 1, and the others to 0.
    */
  def up(): Vector3 = js.native
}

