package typings.phaser.PhaserNs.MathNs

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A four-dimensional matrix.
  */
@JSGlobal("Phaser.Math.Matrix4")
@js.native
/**
  * 
  * @param m Optional Matrix4 to copy values from.
  */
class Matrix4 () extends js.Object {
  def this(m: Matrix4) = this()
  /**
    * The matrix values.
    */
  var `val`: Float32Array = js.native
  /**
    * Calculate the adjoint, or adjugate, of this Matrix.
    */
  def adjoint(): Matrix4 = js.native
  /**
    * Copy the values of a given Matrix into this Matrix.
    * @param src The Matrix to copy the values from.
    */
  def copy(src: Matrix4): Matrix4 = js.native
  /**
    * Calculate the determinant of this Matrix.
    */
  def determinant(): Double = js.native
  /**
    * Set the values of this Matrix from the given array.
    * @param a The array to copy the values from.
    */
  def fromArray(a: js.Array[_]): Matrix4 = js.native
  /**
    * Set the values of this Matrix from the given Quaternion.
    * @param q The Quaternion to set the values of this Matrix from.
    */
  def fromQuat(q: Quaternion): Matrix4 = js.native
  /**
    * Set the values of this Matrix from the given rotation Quaternion and translation Vector.
    * @param q The Quaternion to set rotation from.
    * @param v The Vector to set translation from.
    */
  def fromRotationTranslation(q: Quaternion, v: Vector3): Matrix4 = js.native
  /**
    * Generate a frustum matrix with the given bounds.
    * @param left The left bound of the frustum.
    * @param right The right bound of the frustum.
    * @param bottom The bottom bound of the frustum.
    * @param top The top bound of the frustum.
    * @param near The near bound of the frustum.
    * @param far The far bound of the frustum.
    */
  def frustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  /**
    * Reset this Matrix to an identity (default) matrix.
    */
  def identity(): Matrix4 = js.native
  /**
    * Invert this Matrix.
    */
  def invert(): Matrix4 = js.native
  /**
    * Generate a look-at matrix with the given eye position, focal point, and up axis.
    * @param eye Position of the viewer
    * @param center Point the viewer is looking at
    * @param up vec3 pointing up.
    */
  def lookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4 = js.native
  /**
    * Derive a rotation matrix around the given axis.
    * @param axis The rotation axis.
    * @param angle The rotation angle in radians.
    */
  def makeRotationAxis(axis: Vector3, angle: Double): Matrix4 = js.native
  def makeRotationAxis(axis: Vector4, angle: Double): Matrix4 = js.native
  /**
    * Multiply this Matrix by the given Matrix.
    * @param src The Matrix to multiply this Matrix by.
    */
  def multiply(src: Matrix4): Matrix4 = js.native
  /**
    * [description]
    * @param src [description]
    */
  def multiplyLocal(src: Matrix4): Matrix4 = js.native
  /**
    * Generate an orthogonal projection matrix with the given bounds.
    * @param left The left bound of the frustum.
    * @param right The right bound of the frustum.
    * @param bottom The bottom bound of the frustum.
    * @param top The top bound of the frustum.
    * @param near The near bound of the frustum.
    * @param far The far bound of the frustum.
    */
  def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4 = js.native
  /**
    * Generate a perspective projection matrix with the given bounds.
    * @param fovy Vertical field of view in radians
    * @param aspect Aspect ratio. Typically viewport width  /height.
    * @param near Near bound of the frustum.
    * @param far Far bound of the frustum.
    */
  def perspective(fovy: Double, aspect: Double, near: Double, far: Double): Matrix4 = js.native
  /**
    * Generate a perspective projection matrix with the given bounds.
    * @param width The width of the frustum.
    * @param height The height of the frustum.
    * @param near Near bound of the frustum.
    * @param far Far bound of the frustum.
    */
  def perspectiveLH(width: Double, height: Double, near: Double, far: Double): Matrix4 = js.native
  /**
    * Apply a rotation transformation to this Matrix.
    * @param rad The angle in radians to rotate by.
    * @param axis The axis to rotate upon.
    */
  def rotate(rad: Double, axis: Vector3): Matrix4 = js.native
  /**
    * Rotate this matrix on its X axis.
    * @param rad The angle in radians to rotate by.
    */
  def rotateX(rad: Double): Matrix4 = js.native
  /**
    * Rotate this matrix on its Y axis.
    * @param rad The angle to rotate by, in radians.
    */
  def rotateY(rad: Double): Matrix4 = js.native
  /**
    * Rotate this matrix on its Z axis.
    * @param rad The angle to rotate by, in radians.
    */
  def rotateZ(rad: Double): Matrix4 = js.native
  /**
    * Apply a scale transformation to this Matrix.
    * 
    * Uses the `x`, `y` and `z` components of the given Vector to scale the Matrix.
    * @param v The Vector to scale this Matrix with.
    */
  def scale(v: Vector3): Matrix4 = js.native
  def scale(v: Vector4): Matrix4 = js.native
  /**
    * Apply a scale transformation to this Matrix.
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def scaleXYZ(x: Double, y: Double, z: Double): Matrix4 = js.native
  /**
    * Set the scaling values of this Matrix.
    * @param x The x scaling value.
    * @param y The y scaling value.
    * @param z The z scaling value.
    */
  def scaling(x: Double, y: Double, z: Double): Matrix4 = js.native
  /**
    * This method is an alias for `Matrix4.copy`.
    * @param src The Matrix to set the values of this Matrix's from.
    */
  def set(src: Matrix4): Matrix4 = js.native
  /**
    * Generate a world matrix from the given rotation, position, scale, view matrix and projection matrix.
    * @param rotation The rotation of the world matrix.
    * @param position The position of the world matrix.
    * @param scale The scale of the world matrix.
    * @param viewMatrix The view matrix.
    * @param projectionMatrix The projection matrix.
    */
  def setWorldMatrix(rotation: Vector3, position: Vector3, scale: Vector3): Matrix4 = js.native
  def setWorldMatrix(rotation: Vector3, position: Vector3, scale: Vector3, viewMatrix: Matrix4): Matrix4 = js.native
  def setWorldMatrix(
    rotation: Vector3,
    position: Vector3,
    scale: Vector3,
    viewMatrix: Matrix4,
    projectionMatrix: Matrix4
  ): Matrix4 = js.native
  /**
    * Translate this Matrix using the given Vector.
    * @param v The Vector to translate this Matrix with.
    */
  def translate(v: Vector3): Matrix4 = js.native
  def translate(v: Vector4): Matrix4 = js.native
  /**
    * Translate this Matrix using the given values.
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  def translateXYZ(x: Double, y: Double, z: Double): Matrix4 = js.native
  /**
    * Transpose this Matrix.
    */
  def transpose(): Matrix4 = js.native
  /**
    * Set the `x`, `y` and `z` values of this Matrix.
    * @param x The x value.
    * @param y The y value.
    * @param z The z value.
    */
  def xyz(x: Double, y: Double, z: Double): Matrix4 = js.native
  /**
    * Set the values of this matrix from the given `yaw`, `pitch` and `roll` values.
    * @param yaw [description]
    * @param pitch [description]
    * @param roll [description]
    */
  def yawPitchRoll(yaw: Double, pitch: Double, roll: Double): Matrix4 = js.native
  /**
    * Reset this Matrix.
    * 
    * Sets all values to `0`.
    */
  def zero(): Matrix4 = js.native
}

