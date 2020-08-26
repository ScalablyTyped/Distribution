package typings.playcanvas.pc

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new identity Mat4 object.
  * @property data - Matrix elements in the form of a flat array.
  */
@js.native
trait Mat4 extends js.Object {
  /**
    * Matrix elements in the form of a flat array.
    */
  var data: Float32Array = js.native
  /**
    * Adds the specified 4x4 matrix to the current instance.
    * @example
    * var m = new pc.Mat4();
    *
    * m.add(pc.Mat4.ONE);
    *
    * console.log("The result of the addition is: " + m.toString());
    * @param rhs - The 4x4 matrix used as the second operand of the addition.
    * @returns Self for chaining.
    */
  def add(rhs: Mat4): Mat4 = js.native
  /**
    * Adds the specified 4x4 matrices together and stores the result in
    * the current instance.
    * @example
    * var m = new pc.Mat4();
    *
    * m.add2(pc.Mat4.IDENTITY, pc.Mat4.ONE);
    *
    * console.log("The result of the addition is: " + m.toString());
    * @param lhs - The 4x4 matrix used as the first operand of the addition.
    * @param rhs - The 4x4 matrix used as the second operand of the addition.
    * @returns Self for chaining.
    */
  def add2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  /**
    * Copies the contents of a source 4x4 matrix to a destination 4x4 matrix.
    * @example
    * var src = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var dst = new pc.Mat4();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    * @param rhs - A 4x4 matrix to be copied.
    * @returns Self for chaining.
    */
  def copy(rhs: Mat4): Mat4 = js.native
  /**
    * Reports whether two matrices are equal.
    * @example
    * var a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var b = new pc.Mat4();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The other matrix.
    * @returns True if the matrices are equal and false otherwise.
    */
  def equals(rhs: Mat4): Boolean = js.native
  /**
    * Extracts the Euler angles equivalent to the rotational portion
    * of the specified matrix. The returned Euler angles are in XYZ order an in degrees.
    * @example
    * // Create a 4x4 rotation matrix of 45 degrees around the y-axis
    * var m = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 45);
    *
    * var eulers = m.getEulerAngles();
    * @param [eulers] - A 3-d vector to receive the Euler angles.
    * @returns A 3-d vector containing the Euler angles.
    */
  def getEulerAngles(): Vec3 = js.native
  def getEulerAngles(eulers: Vec3): Vec3 = js.native
  /**
    * Extracts the scale component from the specified 4x4 matrix.
    * @example
    * // Create a 4x4 scale matrix
    * var m = new pc.Mat4().scale(2, 3, 4);
    *
    * // Query the scale component
    * var scale = m.getScale();
    * @param [scale] - Vector to receive the scale.
    * @returns The scale in X, Y and Z of the specified 4x4 matrix.
    */
  def getScale(): Vec3 = js.native
  def getScale(scale: Vec3): Vec3 = js.native
  /**
    * Extracts the translational component from the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var t = new pc.Vec3();
    * m.getTranslation(t);
    * @param [t] - The vector to receive the translation of the matrix.
    * @returns The translation of the specified 4x4 matrix.
    */
  def getTranslation(): Vec3 = js.native
  def getTranslation(t: Vec3): Vec3 = js.native
  /**
    * Extracts the x-axis from the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var x = new pc.Vec3();
    * m.getX(x);
    * @param [x] - The vector to receive the x axis of the matrix.
    * @returns The x-axis of the specified 4x4 matrix.
    */
  def getX(): Vec3 = js.native
  def getX(x: Vec3): Vec3 = js.native
  /**
    * Extracts the y-axis from the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var y = new pc.Vec3();
    * m.getY(y);
    * @param [y] - The vector to receive the y axis of the matrix.
    * @returns The y-axis of the specified 4x4 matrix.
    */
  def getY(): Vec3 = js.native
  def getY(y: Vec3): Vec3 = js.native
  /**
    * Extracts the z-axis from the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var z = new pc.Vec3();
    * m.getZ(z);
    * @param [z] - The vector to receive the z axis of the matrix.
    * @returns The z-axis of the specified 4x4 matrix.
    */
  def getZ(): Vec3 = js.native
  def getZ(z: Vec3): Vec3 = js.native
  /**
    * Sets the specified matrix to its inverse.
    * @example
    * // Create a 4x4 rotation matrix of 180 degrees around the y-axis
    * var rot = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    *
    * // Invert in place
    * rot.invert();
    * @returns Self for chaining.
    */
  def invert(): Mat4 = js.native
  /**
    * Reports whether the specified matrix is the identity matrix.
    * @example
    * var m = new pc.Mat4();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns True if the matrix is identity and false otherwise.
    */
  def isIdentity(): Boolean = js.native
  /**
    * Multiplies the current instance by the specified 4x4 matrix.
    * @example
    * var a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var b = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    *
    * // a = a * b
    * a.mul(b);
    *
    * console.log("The result of the multiplication is: " + a.toString());
    * @param rhs - The 4x4 matrix used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul(rhs: Mat4): Mat4 = js.native
  /**
    * Multiplies the specified 4x4 matrices together and stores the result in
    * the current instance.
    * @example
    * var a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var b = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    * var r = new pc.Mat4();
    *
    * // r = a * b
    * r.mul2(a, b);
    *
    * console.log("The result of the multiplication is: " + r.toString());
    * @param lhs - The 4x4 matrix used as the first multiplicand of the operation.
    * @param rhs - The 4x4 matrix used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  /**
    * Multiplies the specified 4x4 matrices together and stores the result in
    * the current instance. This function assumes the matrices are affine transformation matrices, where the upper left 3x3 elements
    * are a rotation matrix, and the bottom left 3 elements are translation. The rightmost column is assumed to be [0, 0, 0, 1]. The parameters
    * are not verified to be in the expected format. This function is faster than general {@link pc.Mat4#mul2}.
    * @param lhs - The affine transformation 4x4 matrix used as the first multiplicand of the operation.
    * @param rhs - The affine transformation 4x4 matrix used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mulAffine2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  /**
    * Sets matrix data from an array.
    * @param src - Source array. Must have 16 values.
    * @returns Self for chaining.
    */
  def set(src: js.Array[Double]): Mat4 = js.native
  /**
    * Sets the specified matrix to a rotation matrix equivalent to a rotation around
    * an axis. The axis must be normalized (unit length) and the angle must be specified in degrees.
    * @example
    * // Create a 4x4 rotation matrix
    * var rm = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 90);
    * @param axis - The normalized axis vector around which to rotate.
    * @param angle - The angle of rotation in degrees.
    * @returns Self for chaining.
    */
  def setFromAxisAngle(axis: Vec3, angle: Double): Mat4 = js.native
  /**
    * Sets the specified matrix to a rotation matrix defined by
    * Euler angles. The Euler angles are specified in XYZ order and in degrees.
    * @example
    * var m = new pc.Mat4();
    * m.setFromEulerAngles(45, 90, 180);
    * @param ex - Angle to rotate around X axis in degrees.
    * @param ey - Angle to rotate around Y axis in degrees.
    * @param ez - Angle to rotate around Z axis in degrees.
    * @returns Self for chaining.
    */
  def setFromEulerAngles(ex: Double, ey: Double, ez: Double): Mat4 = js.native
  /**
    * Sets the specified matrix to the identity matrix.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    * @returns Self for chaining.
    */
  def setIdentity(): Mat4 = js.native
  /**
    * Sets the specified matrix to a viewing matrix derived from an eye point, a target point
    * and an up vector. The matrix maps the target point to the negative z-axis and the eye point to the
    * origin, so that when you use a typical projection matrix, the center of the scene maps to the center
    * of the viewport. Similarly, the direction described by the up vector projected onto the viewing plane
    * is mapped to the positive y-axis so that it points upward in the viewport. The up vector must not be
    * parallel to the line of sight from the eye to the reference point.
    * @example
    * var position = new pc.Vec3(10, 10, 10);
    * var target = new pc.Vec3(0, 0, 0);
    * var up = new pc.Vec3(0, 1, 0);
    * var m = new pc.Mat4().setLookAt(position, target, up);
    * @param position - 3-d vector holding view position.
    * @param target - 3-d vector holding reference point.
    * @param up - 3-d vector holding the up direction.
    * @returns Self for chaining.
    */
  def setLookAt(position: Vec3, target: Vec3, up: Vec3): Mat4 = js.native
  /**
    * Sets the specified matrix to an orthographic projection matrix. The function's parameters
    * define the shape of a cuboid-shaped frustum.
    * @example
    * // Create a 4x4 orthographic projection matrix
    * var ortho = pc.Mat4().ortho(-2, 2, -2, 2, 1, 1000);
    * @param left - The x-coordinate for the left edge of the camera's projection plane in eye space.
    * @param right - The x-coordinate for the right edge of the camera's projection plane in eye space.
    * @param bottom - The y-coordinate for the bottom edge of the camera's projection plane in eye space.
    * @param top - The y-coordinate for the top edge of the camera's projection plane in eye space.
    * @param near - The near clip plane in eye coordinates.
    * @param far - The far clip plane in eye coordinates.
    * @returns Self for chaining.
    */
  def setOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Mat4 = js.native
  /**
    * Sets the specified matrix to a perspective projection matrix. The function's
    * parameters define the shape of a frustum.
    * @example
    * // Create a 4x4 perspective projection matrix
    * var persp = pc.Mat4().setPerspective(45, 16 / 9, 1, 1000);
    * @param fov - The frustum's field of view in degrees. The fovIsHorizontal parameter
    * controls whether this is a vertical or horizontal field of view. By default, it's a vertical
    * field of view.
    * @param aspect - The aspect ratio of the frustum's projection plane (width / height).
    * @param znear - The near clip plane in eye coordinates.
    * @param zfar - The far clip plane in eye coordinates.
    * @param [fovIsHorizontal = false] - Set to true to treat the fov as horizontal (x-axis)
    * and false for vertical (y-axis). Defaults to false.
    * @returns Self for chaining.
    */
  def setPerspective(fov: Double, aspect: Double, znear: Double, zfar: Double): Mat4 = js.native
  def setPerspective(fov: Double, aspect: Double, znear: Double, zfar: Double, fovIsHorizontal: Boolean): Mat4 = js.native
  /**
    * Sets the specified matrix to the concatenation of a translation, a
    * quaternion rotation and a scale.
    * @example
    * var t = new pc.Vec3(10, 20, 30);
    * var r = new pc.Quat();
    * var s = new pc.Vec3(2, 2, 2);
    *
    * var m = new pc.Mat4();
    * m.setTRS(t, r, s);
    * @param t - A 3-d vector translation.
    * @param r - A quaternion rotation.
    * @param s - A 3-d vector scale.
    * @returns Self for chaining.
    */
  def setTRS(t: Vec3, r: Quat, s: Vec3): Mat4 = js.native
  /**
    * Transforms a 3-dimensional point by a 4x4 matrix.
    * @example
    * // Create a 3-dimensional point
    * var v = new pc.Vec3(1, 2, 3);
    *
    * // Create a 4x4 rotation matrix
    * var m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * var tv = m.transformPoint(v);
    * @param vec - The 3-dimensional point to be transformed.
    * @param [res] - An optional 3-dimensional point to receive the result of the transformation.
    * @returns The input point v transformed by the current instance.
    */
  def transformPoint(vec: Vec3): Vec3 = js.native
  def transformPoint(vec: Vec3, res: Vec3): Vec3 = js.native
  /**
    * Transforms a 4-dimensional vector by a 4x4 matrix.
    * @example
    * // Create an input 4-dimensional vector
    * var v = new pc.Vec4(1, 2, 3, 4);
    *
    * // Create an output 4-dimensional vector
    * var result = new pc.Vec4();
    *
    * // Create a 4x4 rotation matrix
    * var m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * m.transformVec4(v, result);
    * @param vec - The 4-dimensional vector to be transformed.
    * @param [res] - An optional 4-dimensional vector to receive the result of the transformation.
    * @returns The input vector v transformed by the current instance.
    */
  def transformVec4(vec: Vec4): Vec4 = js.native
  def transformVec4(vec: Vec4, res: Vec4): Vec4 = js.native
  /**
    * Transforms a 3-dimensional vector by a 4x4 matrix.
    * @example
    * // Create a 3-dimensional vector
    * var v = new pc.Vec3(1, 2, 3);
    *
    * // Create a 4x4 rotation matrix
    * var m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * var tv = m.transformVector(v);
    * @param vec - The 3-dimensional vector to be transformed.
    * @param [res] - An optional 3-dimensional vector to receive the result of the transformation.
    * @returns The input vector v transformed by the current instance.
    */
  def transformVector(vec: Vec3): Vec3 = js.native
  def transformVector(vec: Vec3, res: Vec3): Vec3 = js.native
  /**
    * Sets the specified matrix to its transpose.
    * @example
    * var m = new pc.Mat4();
    *
    * // Transpose in place
    * m.transpose();
    * @returns Self for chaining.
    */
  def transpose(): Mat4 = js.native
}

