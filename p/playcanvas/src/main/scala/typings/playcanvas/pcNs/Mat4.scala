package typings.playcanvas.pcNs

import typings.std.Float32Array
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Mat4
  * @classdesc A 4x4 matrix.
  * @description Creates a new identity Mat4 object.
  * @property {Float32Array} data Matrix elements in the form of a flat array.
  */
@JSGlobal("pc.Mat4")
@js.native
class Mat4 () extends js.Object {
  /**
    * Matrix elements in the form of a flat array.
    */
  var data: Float32Array = js.native
  /**
    * @function
    * @name pc.Mat4#add
    * @description Adds the specified 4x4 matrix to the current instance.
    * @param {pc.Mat4} rhs The 4x4 matrix used as the second operand of the addition.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var m = new pc.Mat4();
    *
    * m.add(pc.Mat4.ONE);
    *
    * console.log("The result of the addition is: " a.toString());
    */
  def add(rhs: Mat4): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#add2
    * @description Adds the specified 4x4 matrices together and stores the result in
    * the current instance.
    * @param {pc.Mat4} lhs The 4x4 matrix used as the first operand of the addition.
    * @param {pc.Mat4} rhs The 4x4 matrix used as the second operand of the addition.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var m = new pc.Mat4();
    *
    * m.add2(pc.Mat4.IDENTITY, pc.Mat4.ONE);
    *
    * console.log("The result of the addition is: " a.toString());
    */
  def add2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#copy
    * @description Copies the contents of a source 4x4 matrix to a destination 4x4 matrix.
    * @param {pc.Mat4} rhs A 4x4 matrix to be copied.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var src = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var dst = new pc.Mat4();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    */
  def copy(rhs: Mat4): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#equals
    * @description Reports whether two matrices are equal.
    * @param {pc.Mat4} rhs The other matrix.
    * @returns {Boolean} true if the matrices are equal and false otherwise.
    * @example
    * var a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var b = new pc.Mat4();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Mat4): Boolean = js.native
  /**
    * @function
    * @name pc.Mat4#getEulerAngles
    * @description Extracts the Euler angles equivalent to the rotational portion
    * of the specified matrix. The returned Euler angles are in XYZ order an in degrees.
    * @param {pc.Vec3} [eulers] A 3-d vector to receive the Euler angles.
    * @returns {pc.Vec3} A 3-d vector containing the Euler angles.
    * @example
    * // Create a 4x4 rotation matrix of 45 degrees around the y-axis
    * var m = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 45);
    *
    * var eulers = m.getEulerAngles();
    */
  def getEulerAngles(): Vec3 = js.native
  def getEulerAngles(eulers: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#getScale
    * @description Extracts the scale component from the specified 4x4 matrix.
    * @param {pc.Vec3} [scale] Vector to receive the scale.
    * @returns {pc.Vec3} The scale in X, Y and Z of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 scale matrix
    * var m = new pc.Mat4().scale(2, 3, 4);
    *
    * // Query the scale component
    * var scale = m.getScale();
    */
  def getScale(): Vec3 = js.native
  def getScale(scale: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#getTranslation
    * @description Extracts the translational component from the specified 4x4 matrix.
    * @param {pc.Vec3} [t] The vector to receive the translation of the matrix.
    * @returns {pc.Vec3} The translation of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var t = new pc.Vec3();
    * m.getTranslation(t);
    */
  def getTranslation(): Vec3 = js.native
  def getTranslation(t: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#getX
    * @description Extracts the x-axis from the specified 4x4 matrix.
    * @param {pc.Vec3} [x] The vector to receive the x axis of the matrix.
    * @returns {pc.Vec3} The x-axis of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var x = new pc.Vec3();
    * m.getX(x);
    */
  def getX(): Vec3 = js.native
  def getX(x: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#getY
    * @description Extracts the y-axis from the specified 4x4 matrix.
    * @param {pc.Vec3} [y] The vector to receive the y axis of the matrix.
    * @returns {pc.Vec3} The y-axis of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var y = new pc.Vec3();
    * m.getY(y);
    */
  def getY(): Vec3 = js.native
  def getY(y: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#getZ
    * @description Extracts the z-axis from the specified 4x4 matrix.
    * @param {pc.Vec3} [z] The vector to receive the z axis of the matrix.
    * @returns {pc.Vec3} The z-axis of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * var m = new pc.Mat4();
    *
    * // Query the z-axis component
    * var z = new pc.Vec3();
    * m.getZ(z);
    */
  def getZ(): Vec3 = js.native
  def getZ(z: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#invert
    * @description Sets the specified matrix to its inverse.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * // Create a 4x4 rotation matrix of 180 degrees around the y-axis
    * var rot = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    *
    * // Invert in place
    * rot.invert();
    */
  def invert(): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#isIdentity
    * @description Reports whether the specified matrix is the identity matrix.
    * @returns {Boolean} true if the matrix is identity and false otherwise.
    * @example
    * var m = new pc.Mat4();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def isIdentity(): Boolean = js.native
  /**
    * @function
    * @name pc.Mat4#mul
    * @description Multiplies the current instance by the specified 4x4 matrix.
    * @param {pc.Mat4} rhs The 4x4 matrix used as the second multiplicand of the operation.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var b = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    *
    * // a = a * b
    * a.mul(b);
    *
    * console.log("The result of the multiplication is: " a.toString());
    */
  def mul(rhs: Mat4): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#mul2
    * @description Multiplies the specified 4x4 matrices together and stores the result in
    * the current instance.
    * @param {pc.Mat4} lhs The 4x4 matrix used as the first multiplicand of the operation.
    * @param {pc.Mat4} rhs The 4x4 matrix used as the second multiplicand of the operation.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * var b = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    * var r = new pc.Mat4();
    *
    * // r = a * b
    * r.mul2(a, b);
    *
    * console.log("The result of the multiplication is: " r.toString());
    */
  def mul2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#set
    * @description Sets matrix data from an array.
    * @param {Number[]} src Source array. Must have 16 values.
    * @returns {pc.Mat4} Self for chaining.
    */
  def set(src: js.Array[Number]): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#setFromAxisAngle
    * @description Sets the specified matrix to a rotation matrix equivalent to a rotation around
    * an axis. The axis must be normalized (unit length) and the angle must be specified in degrees.
    * @param {pc.Vec3} axis The normalized axis vector around which to rotate.
    * @param {Number} angle The angle of rotation in degrees.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * // Create a 4x4 rotation matrix
    * var rm = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 90);
    */
  def setFromAxisAngle(axis: Vec3, angle: Double): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#setFromEulerAngles
    * @description Sets the specified matrix to a rotation matrix defined by
    * Euler angles. The Euler angles are specified in XYZ order and in degrees.
    * @param {Number} ex Angle to rotate around X axis in degrees.
    * @param {Number} ey Angle to rotate around Y axis in degrees.
    * @param {Number} ez Angle to rotate around Z axis in degrees.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var m = new pc.Mat4();
    * m.setFromEulerAngles(45, 90, 180);
    */
  def setFromEulerAngles(ex: Double, ey: Double, ez: Double): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#setIdentity
    * @description Sets the specified matrix to the identity matrix.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def setIdentity(): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#setLookAt
    * @description Sets the specified matrix to a viewing matrix derived from an eye point, a target point
    * and an up vector. The matrix maps the target point to the negative z-axis and the eye point to the
    * origin, so that when you use a typical projection matrix, the center of the scene maps to the center
    * of the viewport. Similarly, the direction described by the up vector projected onto the viewing plane
    * is mapped to the positive y-axis so that it points upward in the viewport. The up vector must not be
    * parallel to the line of sight from the eye to the reference point.
    * @param {pc.Vec3} position 3-d vector holding view position.
    * @param {pc.Vec3} target 3-d vector holding reference point.
    * @param {pc.Vec3} up 3-d vector holding the up direction.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var position = new pc.Vec3(10, 10, 10);
    * var target = new pc.Vec3(0, 0, 0);
    * var up = new pc.Vec3(0, 1, 0);
    * var m = new pc.Mat4().setLookAt(position, target, up);
    */
  def setLookAt(position: Vec3, target: Vec3, up: Vec3): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#setOrtho
    * @description Sets the specified matrix to an orthographic projection matrix. The function's parameters
    * define the shape of a cuboid-shaped frustum.
    * @param {Number} left The x-coordinate for the left edge of the camera's projection plane in eye space.
    * @param {Number} right The x-coordinate for the right edge of the camera's projection plane in eye space.
    * @param {Number} bottom The y-coordinate for the bottom edge of the camera's projection plane in eye space.
    * @param {Number} top The y-coordinate for the top edge of the camera's projection plane in eye space.
    * @param {Number} near The near clip plane in eye coordinates.
    * @param {Number} far The far clip plane in eye coordinates.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * // Create a 4x4 orthographic projection matrix
    * var ortho = pc.Mat4().ortho(-2, 2, -2, 2, 1, 1000);
    */
  def setOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#setPerspective
    * @description Sets the specified matrix to a perspective projection matrix. The function's
    * parameters define the shape of a frustum.
    * @param {Number} fov The frustum's field of view in degrees. The fovIsHorizontal parameter
    * controls whether this is a vertical or horizontal field of view. By default, it's a vertical
    * field of view.
    * @param {Number} aspect The aspect ratio of the frustum's projection plane (width / height).
    * @param {Number} znear The near clip plane in eye coordinates.
    * @param {Number} zfar The far clip plane in eye coordinates.
    * @param {Boolean} [fovIsHorizontal=false] Set to true to treat the fov as horizontal (x-axis)
    * and false for vertical (y-axis). Defaults to false.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * // Create a 4x4 perspective projection matrix
    * var persp = pc.Mat4().setPerspective(45, 16 / 9, 1, 1000);
    */
  def setPerspective(fov: Double, aspect: Double, znear: Double, zfar: Double): Mat4 = js.native
  def setPerspective(fov: Double, aspect: Double, znear: Double, zfar: Double, fovIsHorizontal: Boolean): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#setTRS
    * @description Sets the specified matrix to the concatenation of a translation, a
    * quaternion rotation and a scale.
    * @param {pc.Vec3} t A 3-d vector translation.
    * @param {pc.Quat} r A quaternion rotation.
    * @param {pc.Vec3} s A 3-d vector scale.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var t = new pc.Vec3(10, 20, 30);
    * var r = new pc.Quat();
    * var s = new pc.Vec3(2, 2, 2);
    *
    * var m = new pc.Mat4();
    * m.setTRS(t, r, s);
    */
  def setTRS(t: Vec3, r: Quat, s: Vec3): Mat4 = js.native
  /**
    * @function
    * @name pc.Mat4#transformPoint
    * @description Transforms a 3-dimensional point by a 4x4 matrix.
    * @param {pc.Vec3} vec The 3-dimensional point to be transformed.
    * @param {pc.Vec3} [res] An optional 3-dimensional point to receive the result of the transformation.
    * @returns {pc.Vec3} The input point v transformed by the current instance.
    * @example
    * // Create a 3-dimensional point
    * var v = new pc.Vec3(1, 2, 3);
    *
    * // Create a 4x4 rotation matrix
    * var m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * var tv = m.transformPoint(v);
    */
  def transformPoint(vec: Vec3): Vec3 = js.native
  def transformPoint(vec: Vec3, res: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#transformVec4
    * @description Transforms a 4-dimensional vector by a 4x4 matrix.
    * @param {pc.Vec4} vec The 4-dimensional vector to be transformed.
    * @param {pc.Vec4} [res] An optional 4-dimensional vector to receive the result of the transformation.
    * @returns {pc.Vec4} The input vector v transformed by the current instance.
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
    */
  def transformVec4(vec: Vec4): Vec4 = js.native
  def transformVec4(vec: Vec4, res: Vec4): Vec4 = js.native
  /**
    * @function
    * @name pc.Mat4#transformVector
    * @description Transforms a 3-dimensional vector by a 4x4 matrix.
    * @param {pc.Vec3} vec The 3-dimensional vector to be transformed.
    * @param {pc.Vec3} [res] An optional 3-dimensional vector to receive the result of the transformation.
    * @returns {pc.Vec3} The input vector v transformed by the current instance.
    * @example
    * // Create a 3-dimensional vector
    * var v = new pc.Vec3(1, 2, 3);
    *
    * // Create a 4x4 rotation matrix
    * var m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * var tv = m.transformVector(v);
    */
  def transformVector(vec: Vec3): Vec3 = js.native
  def transformVector(vec: Vec3, res: Vec3): Vec3 = js.native
  /**
    * @function
    * @name pc.Mat4#transpose
    * @description Sets the specified matrix to its transpose.
    * @returns {pc.Mat4} Self for chaining.
    * @example
    * var m = new pc.Mat4();
    *
    * // Transpose in place
    * m.transpose();
    */
  def transpose(): Mat4 = js.native
}

/* static members */
@JSGlobal("pc.Mat4")
@js.native
object Mat4 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Mat4
    * @name pc.Mat4.IDENTITY
    * @description A constant matrix set to the identity.
    */
  val IDENTITY: Mat4 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @type pc.Mat4
    * @name pc.Mat4.ZERO
    * @description A constant matrix with all elements set to 0.
    */
  val ZERO: Mat4 = js.native
}

