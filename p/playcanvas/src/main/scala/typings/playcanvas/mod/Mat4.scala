package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 4x4 matrix.
  */
@JSImport("playcanvas", "Mat4")
@js.native
open class Mat4 () extends StObject {
  
  /**
    * Adds the specified 4x4 matrix to the current instance.
    *
    * @param {Mat4} rhs - The 4x4 matrix used as the second operand of the addition.
    * @returns {Mat4} Self for chaining.
    * @example
    * const m = new pc.Mat4();
    *
    * m.add(pc.Mat4.ONE);
    *
    * console.log("The result of the addition is: " + m.toString());
    */
  def add(rhs: Mat4): Mat4 = js.native
  
  /**
    * Adds the specified 4x4 matrices together and stores the result in the current instance.
    *
    * @param {Mat4} lhs - The 4x4 matrix used as the first operand of the addition.
    * @param {Mat4} rhs - The 4x4 matrix used as the second operand of the addition.
    * @returns {Mat4} Self for chaining.
    * @example
    * const m = new pc.Mat4();
    *
    * m.add2(pc.Mat4.IDENTITY, pc.Mat4.ONE);
    *
    * console.log("The result of the addition is: " + m.toString());
    */
  def add2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  
  /**
    * Copies the contents of a source 4x4 matrix to a destination 4x4 matrix.
    *
    * @param {Mat4} rhs - A 4x4 matrix to be copied.
    * @returns {Mat4} Self for chaining.
    * @example
    * const src = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * const dst = new pc.Mat4();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    */
  def copy(rhs: Mat4): Mat4 = js.native
  
  /**
    * Matrix elements in the form of a flat array.
    *
    * @type {Float32Array}
    */
  var data: js.typedarray.Float32Array = js.native
  
  /**
    * Reports whether two matrices are equal.
    *
    * @param {Mat4} rhs - The other matrix.
    * @returns {boolean} True if the matrices are equal and false otherwise.
    * @example
    * const a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * const b = new pc.Mat4();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Mat4): Boolean = js.native
  
  /**
    * Extracts the Euler angles equivalent to the rotational portion of the specified matrix. The
    * returned Euler angles are in XYZ order an in degrees.
    *
    * @param {Vec3} [eulers] - A 3-d vector to receive the Euler angles.
    * @returns {Vec3} A 3-d vector containing the Euler angles.
    * @example
    * // Create a 4x4 rotation matrix of 45 degrees around the y-axis
    * const m = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 45);
    *
    * const eulers = m.getEulerAngles();
    */
  def getEulerAngles(): Vec3 = js.native
  def getEulerAngles(eulers: Vec3): Vec3 = js.native
  
  /**
    * Extracts the scale component from the specified 4x4 matrix.
    *
    * @param {Vec3} [scale] - Vector to receive the scale.
    * @returns {Vec3} The scale in X, Y and Z of the specified 4x4 matrix.
    * @example
    * // Query the scale component
    * const scale = m.getScale();
    */
  def getScale(): Vec3 = js.native
  def getScale(scale: Vec3): Vec3 = js.native
  
  /**
    * Extracts the translational component from the specified 4x4 matrix.
    *
    * @param {Vec3} [t] - The vector to receive the translation of the matrix.
    * @returns {Vec3} The translation of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * const m = new pc.Mat4();
    *
    * // Query the translation component
    * const t = new pc.Vec3();
    * m.getTranslation(t);
    */
  def getTranslation(): Vec3 = js.native
  def getTranslation(t: Vec3): Vec3 = js.native
  
  /**
    * Extracts the x-axis from the specified 4x4 matrix.
    *
    * @param {Vec3} [x] - The vector to receive the x axis of the matrix.
    * @returns {Vec3} The x-axis of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * const m = new pc.Mat4();
    *
    * // Query the x-axis component
    * const x = new pc.Vec3();
    * m.getX(x);
    */
  def getX(): Vec3 = js.native
  def getX(x: Vec3): Vec3 = js.native
  
  /**
    * Extracts the y-axis from the specified 4x4 matrix.
    *
    * @param {Vec3} [y] - The vector to receive the y axis of the matrix.
    * @returns {Vec3} The y-axis of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * const m = new pc.Mat4();
    *
    * // Query the y-axis component
    * const y = new pc.Vec3();
    * m.getY(y);
    */
  def getY(): Vec3 = js.native
  def getY(y: Vec3): Vec3 = js.native
  
  /**
    * Extracts the z-axis from the specified 4x4 matrix.
    *
    * @param {Vec3} [z] - The vector to receive the z axis of the matrix.
    * @returns {Vec3} The z-axis of the specified 4x4 matrix.
    * @example
    * // Create a 4x4 matrix
    * const m = new pc.Mat4();
    *
    * // Query the z-axis component
    * const z = new pc.Vec3();
    * m.getZ(z);
    */
  def getZ(): Vec3 = js.native
  def getZ(z: Vec3): Vec3 = js.native
  
  /**
    * Sets the specified matrix to its inverse.
    *
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 rotation matrix of 180 degrees around the y-axis
    * const rot = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    *
    * // Invert in place
    * rot.invert();
    */
  def invert(): Mat4 = js.native
  
  def invertTo3x3(res: Any): Mat4 = js.native
  
  /**
    * Reports whether the specified matrix is the identity matrix.
    *
    * @returns {boolean} True if the matrix is identity and false otherwise.
    * @example
    * const m = new pc.Mat4();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def isIdentity(): Boolean = js.native
  
  /**
    * Multiplies the current instance by the specified 4x4 matrix.
    *
    * @param {Mat4} rhs - The 4x4 matrix used as the second multiplicand of the operation.
    * @returns {Mat4} Self for chaining.
    * @example
    * const a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * const b = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    *
    * // a = a * b
    * a.mul(b);
    *
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Mat4): Mat4 = js.native
  
  /**
    * Multiplies the specified 4x4 matrices together and stores the result in the current
    * instance.
    *
    * @param {Mat4} lhs - The 4x4 matrix used as the first multiplicand of the operation.
    * @param {Mat4} rhs - The 4x4 matrix used as the second multiplicand of the operation.
    * @returns {Mat4} Self for chaining.
    * @example
    * const a = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    * const b = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    * const r = new pc.Mat4();
    *
    * // r = a * b
    * r.mul2(a, b);
    *
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  
  /**
    * Multiplies the specified 4x4 matrices together and stores the result in the current
    * instance. This function assumes the matrices are affine transformation matrices, where the
    * upper left 3x3 elements are a rotation matrix, and the bottom left 3 elements are
    * translation. The rightmost column is assumed to be [0, 0, 0, 1]. The parameters are not
    * verified to be in the expected format. This function is faster than general
    * {@link Mat4#mul2}.
    *
    * @param {Mat4} lhs - The affine transformation 4x4 matrix used as the first multiplicand of
    * the operation.
    * @param {Mat4} rhs - The affine transformation 4x4 matrix used as the second multiplicand of
    * the operation.
    * @returns {Mat4} Self for chaining.
    */
  def mulAffine2(lhs: Mat4, rhs: Mat4): Mat4 = js.native
  
  /**
    * -1 if the the matrix has an odd number of negative scales (mirrored); 1 otherwise.
    *
    * @type {number}
    * @ignore
    */
  def scaleSign: Double = js.native
  
  /**
    * Sets matrix data from an array.
    *
    * @param {number[]} src - Source array. Must have 16 values.
    * @returns {Mat4} Self for chaining.
    */
  def set(src: js.Array[Double]): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a rotation matrix equivalent to a rotation around an axis. The
    * axis must be normalized (unit length) and the angle must be specified in degrees.
    *
    * @param {Vec3} axis - The normalized axis vector around which to rotate.
    * @param {number} angle - The angle of rotation in degrees.
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 rotation matrix
    * const rm = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 90);
    */
  def setFromAxisAngle(axis: Vec3, angle: Double): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a rotation matrix defined by Euler angles. The Euler angles are
    * specified in XYZ order and in degrees.
    *
    * @param {number} ex - Angle to rotate around X axis in degrees.
    * @param {number} ey - Angle to rotate around Y axis in degrees.
    * @param {number} ez - Angle to rotate around Z axis in degrees.
    * @returns {Mat4} Self for chaining.
    * @example
    * const m = new pc.Mat4();
    * m.setFromEulerAngles(45, 90, 180);
    */
  def setFromEulerAngles(ex: Double, ey: Double, ez: Double): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a perspective projection matrix. The function's parameters
    * define the shape of a frustum.
    *
    * @param {number} left - The x-coordinate for the left edge of the camera's projection plane
    * in eye space.
    * @param {number} right - The x-coordinate for the right edge of the camera's projection plane
    * in eye space.
    * @param {number} bottom - The y-coordinate for the bottom edge of the camera's projection
    * plane in eye space.
    * @param {number} top - The y-coordinate for the top edge of the camera's projection plane in
    * eye space.
    * @param {number} znear - The near clip plane in eye coordinates.
    * @param {number} zfar - The far clip plane in eye coordinates.
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 perspective projection matrix
    * const f = pc.Mat4().setFrustum(-2, 2, -1, 1, 1, 1000);
    * @ignore
    */
  def setFrustum(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Mat4 = js.native
  
  /**
    * Sets the specified matrix to the identity matrix.
    *
    * @returns {Mat4} Self for chaining.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def setIdentity(): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a viewing matrix derived from an eye point, a target point and
    * an up vector. The matrix maps the target point to the negative z-axis and the eye point to
    * the origin, so that when you use a typical projection matrix, the center of the scene maps
    * to the center of the viewport. Similarly, the direction described by the up vector projected
    * onto the viewing plane is mapped to the positive y-axis so that it points upward in the
    * viewport. The up vector must not be parallel to the line of sight from the eye to the
    * reference point.
    *
    * @param {Vec3} position - 3-d vector holding view position.
    * @param {Vec3} target - 3-d vector holding reference point.
    * @param {Vec3} up - 3-d vector holding the up direction.
    * @returns {Mat4} Self for chaining.
    * @example
    * const position = new pc.Vec3(10, 10, 10);
    * const target = new pc.Vec3(0, 0, 0);
    * const up = new pc.Vec3(0, 1, 0);
    * const m = new pc.Mat4().setLookAt(position, target, up);
    */
  def setLookAt(position: Vec3, target: Vec3, up: Vec3): Mat4 = js.native
  
  /**
    * Sets the specified matrix to an orthographic projection matrix. The function's parameters
    * define the shape of a cuboid-shaped frustum.
    *
    * @param {number} left - The x-coordinate for the left edge of the camera's projection plane
    * in eye space.
    * @param {number} right - The x-coordinate for the right edge of the camera's projection plane
    * in eye space.
    * @param {number} bottom - The y-coordinate for the bottom edge of the camera's projection
    * plane in eye space.
    * @param {number} top - The y-coordinate for the top edge of the camera's projection plane in
    * eye space.
    * @param {number} near - The near clip plane in eye coordinates.
    * @param {number} far - The far clip plane in eye coordinates.
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 orthographic projection matrix
    * const ortho = pc.Mat4().ortho(-2, 2, -2, 2, 1, 1000);
    */
  def setOrtho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a perspective projection matrix. The function's parameters
    * define the shape of a frustum.
    *
    * @param {number} fov - The frustum's field of view in degrees. The fovIsHorizontal parameter
    * controls whether this is a vertical or horizontal field of view. By default, it's a vertical
    * field of view.
    * @param {number} aspect - The aspect ratio of the frustum's projection plane
    * (width / height).
    * @param {number} znear - The near clip plane in eye coordinates.
    * @param {number} zfar - The far clip plane in eye coordinates.
    * @param {boolean} [fovIsHorizontal=false] - Set to true to treat the fov as horizontal
    * (x-axis) and false for vertical (y-axis). Defaults to false.
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 perspective projection matrix
    * const persp = pc.Mat4().setPerspective(45, 16 / 9, 1, 1000);
    */
  def setPerspective(fov: Double, aspect: Double, znear: Double, zfar: Double): Mat4 = js.native
  def setPerspective(fov: Double, aspect: Double, znear: Double, zfar: Double, fovIsHorizontal: Boolean): Mat4 = js.native
  
  /**
    * Sets the matrix to a reflection matrix, which can be used as a mirror transformation by the
    * plane.
    *
    * @param {Vec3} normal - The normal of the plane to reflect by.
    * @param {number} distance - The distance of plane to reflect by.
    * @returns {Mat4} Self for chaining.
    */
  def setReflection(normal: Vec3, distance: Double): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a scale matrix.
    *
    * @param {number} x - The x-component of the scale.
    * @param {number} y - The y-component of the scale.
    * @param {number} z - The z-component of the scale.
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 scale matrix
    * const sm = new pc.Mat4().setScale(10, 10, 10);
    * @ignore
    */
  def setScale(x: Double, y: Double, z: Double): Mat4 = js.native
  
  /**
    * Sets the specified matrix to the concatenation of a translation, a quaternion rotation and a
    * scale.
    *
    * @param {Vec3} t - A 3-d vector translation.
    * @param {import('./quat.js').Quat} r - A quaternion rotation.
    * @param {Vec3} s - A 3-d vector scale.
    * @returns {Mat4} Self for chaining.
    * @example
    * const t = new pc.Vec3(10, 20, 30);
    * const r = new pc.Quat();
    * const s = new pc.Vec3(2, 2, 2);
    *
    * const m = new pc.Mat4();
    * m.setTRS(t, r, s);
    */
  def setTRS(t: Vec3, r: Quat, s: Vec3): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a translation matrix.
    *
    * @param {number} x - The x-component of the translation.
    * @param {number} y - The y-component of the translation.
    * @param {number} z - The z-component of the translation.
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 translation matrix
    * const tm = new pc.Mat4().setTranslate(10, 10, 10);
    * @ignore
    */
  def setTranslate(x: Double, y: Double, z: Double): Mat4 = js.native
  
  /**
    * Sets the specified matrix to a matrix transforming a normalized view volume (in range of
    * -1 .. 1) to their position inside a viewport (in range of 0 .. 1). This encapsulates a
    * scaling to the size of the viewport and a translation to the position of the viewport.
    *
    * @param {number} x - The x-component of the position of the viewport (in 0..1 range).
    * @param {number} y - The y-component of the position of the viewport (in 0..1 range).
    * @param {number} width - The width of the viewport (in 0..1 range).
    * @param {number} height - The height of the viewport (in 0..1 range).
    * @returns {Mat4} Self for chaining.
    * @example
    * // Create a 4x4 viewport matrix which scales normalized view volume to full texture viewport
    * const vm = new pc.Mat4().setViewport(0, 0, 1, 1);
    * @ignore
    */
  def setViewport(x: Double, y: Double, width: Double, height: Double): Mat4 = js.native
  
  /**
    * Transforms a 3-dimensional point by a 4x4 matrix.
    *
    * @param {Vec3} vec - The 3-dimensional point to be transformed.
    * @param {Vec3} [res] - An optional 3-dimensional point to receive the result of the
    * transformation.
    * @returns {Vec3} The input point v transformed by the current instance.
    * @example
    * // Create a 3-dimensional point
    * const v = new pc.Vec3(1, 2, 3);
    *
    * // Create a 4x4 rotation matrix
    * const m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * const tv = m.transformPoint(v);
    */
  def transformPoint(vec: Vec3): Vec3 = js.native
  def transformPoint(vec: Vec3, res: Vec3): Vec3 = js.native
  
  /**
    * Transforms a 4-dimensional vector by a 4x4 matrix.
    *
    * @param {Vec4} vec - The 4-dimensional vector to be transformed.
    * @param {Vec4} [res] - An optional 4-dimensional vector to receive the result of the
    * transformation.
    * @returns {Vec4} The input vector v transformed by the current instance.
    * @example
    * // Create an input 4-dimensional vector
    * const v = new pc.Vec4(1, 2, 3, 4);
    *
    * // Create an output 4-dimensional vector
    * const result = new pc.Vec4();
    *
    * // Create a 4x4 rotation matrix
    * const m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * m.transformVec4(v, result);
    */
  def transformVec4(vec: Vec4): Vec4 = js.native
  def transformVec4(vec: Vec4, res: Vec4): Vec4 = js.native
  
  /**
    * Transforms a 3-dimensional vector by a 4x4 matrix.
    *
    * @param {Vec3} vec - The 3-dimensional vector to be transformed.
    * @param {Vec3} [res] - An optional 3-dimensional vector to receive the result of the
    * transformation.
    * @returns {Vec3} The input vector v transformed by the current instance.
    * @example
    * // Create a 3-dimensional vector
    * const v = new pc.Vec3(1, 2, 3);
    *
    * // Create a 4x4 rotation matrix
    * const m = new pc.Mat4().setFromEulerAngles(10, 20, 30);
    *
    * const tv = m.transformVector(v);
    */
  def transformVector(vec: Vec3): Vec3 = js.native
  def transformVector(vec: Vec3, res: Vec3): Vec3 = js.native
  
  /**
    * Sets the specified matrix to its transpose.
    *
    * @returns {Mat4} Self for chaining.
    * @example
    * const m = new pc.Mat4();
    *
    * // Transpose in place
    * m.transpose();
    */
  def transpose(): Mat4 = js.native
}
object Mat4 {
  
  @JSImport("playcanvas", "Mat4")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A constant matrix set to the identity.
    *
    * @type {Mat4}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Mat4.IDENTITY")
  @js.native
  val IDENTITY: Mat4 = js.native
  
  /**
    * A constant matrix with all elements set to 0.
    *
    * @type {Mat4}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Mat4.ZERO")
  @js.native
  val ZERO: Mat4 = js.native
  
  /* static member */
  inline def getPerspectiveHalfSize(halfSize: Any, fov: Any, aspect: Any, znear: Any, fovIsHorizontal: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_getPerspectiveHalfSize")(halfSize.asInstanceOf[js.Any], fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], fovIsHorizontal.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
