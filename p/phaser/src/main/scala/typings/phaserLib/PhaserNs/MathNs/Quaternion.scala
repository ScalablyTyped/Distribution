package typings
package phaserLib.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quaternion.
  */
@JSGlobal("Phaser.Math.Quaternion")
@js.native
/**
  * 
  * @param x The x component.
  * @param y The y component.
  * @param z The z component.
  * @param w The w component.
  */
class Quaternion () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  /**
    * The w component of this Quaternion.
    */
  var w: scala.Double = js.native
  /**
    * The x component of this Quaternion.
    */
  var x: scala.Double = js.native
  /**
    * The y component of this Quaternion.
    */
  var y: scala.Double = js.native
  /**
    * The z component of this Quaternion.
    */
  var z: scala.Double = js.native
  /**
    * Add a given Quaternion or Vector to this Quaternion. Addition is component-wise.
    * @param v The Quaternion or Vector to add to this Quaternion.
    */
  def add(v: Quaternion): Quaternion = js.native
  def add(v: Vector4): Quaternion = js.native
  /**
    * Create a unit (or rotation) Quaternion from its x, y, and z components.
    * 
    * Sets the w component.
    */
  def calculateW(): Quaternion = js.native
  /**
    * Convert this Quaternion into its conjugate.
    * 
    * Sets the x, y and z components.
    */
  def conjugate(): Quaternion = js.native
  /**
    * Copy the components of a given Quaternion or Vector into this Quaternion.
    * @param src The Quaternion or Vector to copy the components from.
    */
  def copy(src: Quaternion): Quaternion = js.native
  def copy(src: Vector4): Quaternion = js.native
  /**
    * Calculate the dot product of this Quaternion and the given Quaternion or Vector.
    * @param v The Quaternion or Vector to dot product with this Quaternion.
    */
  def dot(v: Quaternion): scala.Double = js.native
  def dot(v: Vector4): scala.Double = js.native
  /**
    * Convert the given Matrix into this Quaternion.
    * @param mat The Matrix to convert from.
    */
  def fromMat3(mat: Matrix3): Quaternion = js.native
  /**
    * Reset this Matrix to an identity (default) Quaternion.
    */
  def identity(): Quaternion = js.native
  /**
    * Invert this Quaternion.
    */
  def invert(): Quaternion = js.native
  /**
    * Calculate the length of this Quaternion.
    */
  def length(): scala.Double = js.native
  /**
    * Calculate the length of this Quaternion squared.
    */
  def lengthSq(): scala.Double = js.native
  /**
    * Linearly interpolate this Quaternion towards the given Quaternion or Vector.
    * @param v The Quaternion or Vector to interpolate towards.
    * @param t The percentage of interpolation. Default 0.
    */
  def lerp(v: Quaternion): Quaternion = js.native
  def lerp(v: Quaternion, t: scala.Double): Quaternion = js.native
  def lerp(v: Vector4): Quaternion = js.native
  def lerp(v: Vector4, t: scala.Double): Quaternion = js.native
  /**
    * Multiply this Quaternion by the given Quaternion or Vector.
    * @param b The Quaternion or Vector to multiply this Quaternion by.
    */
  def multiply(b: Quaternion): Quaternion = js.native
  def multiply(b: Vector4): Quaternion = js.native
  /**
    * Normalize this Quaternion.
    */
  def normalize(): Quaternion = js.native
  /**
    * Rotate this Quaternion on the X axis.
    * @param rad The rotation angle in radians.
    */
  def rotateX(rad: scala.Double): Quaternion = js.native
  /**
    * Rotate this Quaternion on the Y axis.
    * @param rad The rotation angle in radians.
    */
  def rotateY(rad: scala.Double): Quaternion = js.native
  /**
    * Rotate this Quaternion on the Z axis.
    * @param rad The rotation angle in radians.
    */
  def rotateZ(rad: scala.Double): Quaternion = js.native
  /**
    * [description]
    * @param a [description]
    * @param b [description]
    */
  def rotationTo(a: Vector3, b: Vector3): Quaternion = js.native
  /**
    * Scale this Quaternion by the given value.
    * @param scale The value to scale this Quaternion by.
    */
  def scale(scale: scala.Double): Quaternion = js.native
  /**
    * Set the components of this Quaternion.
    * @param x The x component, or an object containing x, y, z, and w components. Default 0.
    * @param y The y component. Default 0.
    * @param z The z component. Default 0.
    * @param w The w component. Default 0.
    */
  def set(): Quaternion = js.native
  def set(x: js.Object): Quaternion = js.native
  def set(x: js.Object, y: scala.Double): Quaternion = js.native
  def set(x: js.Object, y: scala.Double, z: scala.Double): Quaternion = js.native
  def set(x: js.Object, y: scala.Double, z: scala.Double, w: scala.Double): Quaternion = js.native
  def set(x: scala.Double): Quaternion = js.native
  def set(x: scala.Double, y: scala.Double): Quaternion = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double): Quaternion = js.native
  def set(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Quaternion = js.native
  /**
    * Set the axes of this Quaternion.
    * @param view The view axis.
    * @param right The right axis.
    * @param up The upwards axis.
    */
  def setAxes(view: Vector3, right: Vector3, up: Vector3): Quaternion = js.native
  /**
    * Set the axis angle of this Quaternion.
    * @param axis The axis.
    * @param rad The angle in radians.
    */
  def setAxisAngle(axis: Vector3, rad: scala.Double): Quaternion = js.native
  /**
    * Smoothly linearly interpolate this Quaternion towards the given Quaternion or Vector.
    * @param b The Quaternion or Vector to interpolate towards.
    * @param t The percentage of interpolation.
    */
  def slerp(b: Quaternion, t: scala.Double): Quaternion = js.native
  def slerp(b: Vector4, t: scala.Double): Quaternion = js.native
  /**
    * Subtract a given Quaternion or Vector from this Quaternion. Subtraction is component-wise.
    * @param v The Quaternion or Vector to subtract from this Quaternion.
    */
  def subtract(v: Quaternion): Quaternion = js.native
  def subtract(v: Vector4): Quaternion = js.native
}

