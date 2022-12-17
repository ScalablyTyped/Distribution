package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./mat4.js').Mat4} Mat4 */
/**
  * A quaternion.
  */
@JSImport("playcanvas", "Quat")
@js.native
/**
  * Create a new Quat instance.
  *
  * @param {number|number[]} [x] - The quaternion's x component. Defaults to 0. If x is an array
  * of length 4, the array will be used to populate all components.
  * @param {number} [y] - The quaternion's y component. Defaults to 0.
  * @param {number} [z] - The quaternion's z component. Defaults to 0.
  * @param {number} [w] - The quaternion's w component. Defaults to 1.
  */
open class Quat () extends StObject {
  def this(x: js.Array[Double]) = this()
  def this(x: Double) = this()
  def this(x: js.Array[Double], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Double, z: Unit, w: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Double, w: Double) = this()
  def this(x: js.Array[Double], y: Unit, z: Unit, w: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
  
  def conjugate(): Quat = js.native
  
  /**
    * Copies the contents of a source quaternion to a destination quaternion.
    *
    * @param {Quat} rhs - The quaternion to be copied.
    * @returns {Quat} Self for chaining.
    * @example
    * var src = new pc.Quat();
    * var dst = new pc.Quat();
    * dst.copy(src, src);
    * console.log("The two quaternions are " + (src.equals(dst) ? "equal" : "different"));
    */
  def copy(rhs: Quat): Quat = js.native
  
  /**
    * Reports whether two quaternions are equal.
    *
    * @param {Quat} rhs - The quaternion to be compared against.
    * @returns {boolean} True if the quaternions are equal and false otherwise.
    * @example
    * var a = new pc.Quat();
    * var b = new pc.Quat();
    * console.log("The two quaternions are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Quat): Boolean = js.native
  
  /**
    * Gets the rotation axis and angle for a given quaternion. If a quaternion is created with
    * `setFromAxisAngle`, this method will return the same values as provided in the original
    * parameter list OR functionally equivalent values.
    *
    * @param {Vec3} axis - The 3-dimensional vector to receive the axis of rotation.
    * @returns {number} Angle, in degrees, of the rotation.
    * @example
    * var q = new pc.Quat();
    * q.setFromAxisAngle(new pc.Vec3(0, 1, 0), 90);
    * var v = new pc.Vec3();
    * var angle = q.getAxisAngle(v);
    * // Outputs 90
    * console.log(angle);
    * // Outputs [0, 1, 0]
    * console.log(v.toString());
    */
  def getAxisAngle(axis: Vec3): Double = js.native
  
  /**
    * Converts the supplied quaternion to Euler angles.
    *
    * @param {Vec3} [eulers] - The 3-dimensional vector to receive the Euler angles.
    * @returns {Vec3} The 3-dimensional vector holding the Euler angles that
    * correspond to the supplied quaternion.
    */
  def getEulerAngles(): Vec3 = js.native
  def getEulerAngles(eulers: Vec3): Vec3 = js.native
  
  /**
    * Generates the inverse of the specified quaternion.
    *
    * @returns {Quat} Self for chaining.
    * @example
    * // Create a quaternion rotated 180 degrees around the y-axis
    * var rot = new pc.Quat().setFromEulerAngles(0, 180, 0);
    *
    * // Invert in place
    * rot.invert();
    */
  def invert(): Quat = js.native
  
  /**
    * Returns the magnitude of the specified quaternion.
    *
    * @returns {number} The magnitude of the specified quaternion.
    * @example
    * var q = new pc.Quat(0, 0, 0, 5);
    * var len = q.length();
    * // Outputs 5
    * console.log("The length of the quaternion is: " + len);
    */
  def length(): Double = js.native
  
  /**
    * Returns the magnitude squared of the specified quaternion.
    *
    * @returns {number} The magnitude of the specified quaternion.
    * @example
    * var q = new pc.Quat(3, 4, 0);
    * var lenSq = q.lengthSq();
    * // Outputs 25
    * console.log("The length squared of the quaternion is: " + lenSq);
    */
  def lengthSq(): Double = js.native
  
  /**
    * Returns the result of multiplying the specified quaternions together.
    *
    * @param {Quat} rhs - The quaternion used as the second multiplicand of the operation.
    * @returns {Quat} Self for chaining.
    * @example
    * var a = new pc.Quat().setFromEulerAngles(0, 30, 0);
    * var b = new pc.Quat().setFromEulerAngles(0, 60, 0);
    *
    * // a becomes a 90 degree rotation around the Y axis
    * // In other words, a = a * b
    * a.mul(b);
    *
    * console.log("The result of the multiplication is: " + a.toString());
    */
  def mul(rhs: Quat): Quat = js.native
  
  /**
    * Returns the result of multiplying the specified quaternions together.
    *
    * @param {Quat} lhs - The quaternion used as the first multiplicand of the operation.
    * @param {Quat} rhs - The quaternion used as the second multiplicand of the operation.
    * @returns {Quat} Self for chaining.
    * @example
    * var a = new pc.Quat().setFromEulerAngles(0, 30, 0);
    * var b = new pc.Quat().setFromEulerAngles(0, 60, 0);
    * var r = new pc.Quat();
    *
    * // r is set to a 90 degree rotation around the Y axis
    * // In other words, r = a * b
    * r.mul2(a, b);
    *
    * console.log("The result of the multiplication is: " + r.toString());
    */
  def mul2(lhs: Quat, rhs: Quat): Quat = js.native
  
  /**
    * Returns the specified quaternion converted in place to a unit quaternion.
    *
    * @returns {Quat} The result of the normalization.
    * @example
    * var v = new pc.Quat(0, 0, 0, 5);
    *
    * v.normalize();
    *
    * // Outputs 0, 0, 0, 1
    * console.log("The result of the vector normalization is: " + v.toString());
    */
  def normalize(): Quat = js.native
  
  /**
    * Sets the specified quaternion to the supplied numerical values.
    *
    * @param {number} x - The x component of the quaternion.
    * @param {number} y - The y component of the quaternion.
    * @param {number} z - The z component of the quaternion.
    * @param {number} w - The w component of the quaternion.
    * @returns {Quat} Self for chaining.
    * @example
    * var q = new pc.Quat();
    * q.set(1, 0, 0, 0);
    *
    * // Outputs 1, 0, 0, 0
    * console.log("The result of the vector set is: " + q.toString());
    */
  def set(x: Double, y: Double, z: Double, w: Double): Quat = js.native
  
  /**
    * Sets a quaternion from an angular rotation around an axis.
    *
    * @param {Vec3} axis - World space axis around which to rotate.
    * @param {number} angle - Angle to rotate around the given axis in degrees.
    * @returns {Quat} Self for chaining.
    * @example
    * var q = new pc.Quat();
    * q.setFromAxisAngle(pc.Vec3.UP, 90);
    */
  def setFromAxisAngle(axis: Vec3, angle: Double): Quat = js.native
  
  /**
    * Sets a quaternion from Euler angles specified in XYZ order.
    *
    * @param {number|Vec3} ex - Angle to rotate around X axis in degrees. If ex is a Vec3, the
    * three angles will be read from it instead.
    * @param {number} [ey] - Angle to rotate around Y axis in degrees.
    * @param {number} [ez] - Angle to rotate around Z axis in degrees.
    * @returns {Quat} Self for chaining.
    * @example
    * // Create a quaternion from 3 euler angles
    * var q = new pc.Quat();
    * q.setFromEulerAngles(45, 90, 180);
    *
    * // Create the same quaternion from a vector containing the same 3 euler angles
    * var v = new pc.Vec3(45, 90, 180);
    * var r = new pc.Quat();
    * r.setFromEulerAngles(v);
    */
  def setFromEulerAngles(ex: Double): Quat = js.native
  def setFromEulerAngles(ex: Double, ey: Double): Quat = js.native
  def setFromEulerAngles(ex: Double, ey: Double, ez: Double): Quat = js.native
  def setFromEulerAngles(ex: Double, ey: Unit, ez: Double): Quat = js.native
  def setFromEulerAngles(ex: Vec3): Quat = js.native
  def setFromEulerAngles(ex: Vec3, ey: Double): Quat = js.native
  def setFromEulerAngles(ex: Vec3, ey: Double, ez: Double): Quat = js.native
  def setFromEulerAngles(ex: Vec3, ey: Unit, ez: Double): Quat = js.native
  
  /**
    * Converts the specified 4x4 matrix to a quaternion. Note that since a quaternion is purely a
    * representation for orientation, only the translational part of the matrix is lost.
    *
    * @param {Mat4} m - The 4x4 matrix to convert.
    * @returns {Quat} Self for chaining.
    * @example
    * // Create a 4x4 rotation matrix of 180 degrees around the y-axis
    * var rot = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    *
    * // Convert to a quaternion
    * var q = new pc.Quat().setFromMat4(rot);
    */
  def setFromMat4(m: Mat4): Quat = js.native
  
  /**
    * Performs a spherical interpolation between two quaternions. The result of the interpolation
    * is written to the quaternion calling the function.
    *
    * @param {Quat} lhs - The quaternion to interpolate from.
    * @param {Quat} rhs - The quaternion to interpolate to.
    * @param {number} alpha - The value controlling the interpolation in relation to the two input
    * quaternions. The value is in the range 0 to 1, 0 generating q1, 1 generating q2 and anything
    * in between generating a spherical interpolation between the two.
    * @returns {Quat} Self for chaining.
    * @example
    * var q1 = new pc.Quat(-0.11, -0.15, -0.46, 0.87);
    * var q2 = new pc.Quat(-0.21, -0.21, -0.67, 0.68);
    *
    * var result;
    * result = new pc.Quat().slerp(q1, q2, 0);   // Return q1
    * result = new pc.Quat().slerp(q1, q2, 0.5); // Return the midpoint interpolant
    * result = new pc.Quat().slerp(q1, q2, 1);   // Return q2
    */
  def slerp(lhs: Quat, rhs: Quat, alpha: Double): Quat = js.native
  
  /**
    * Transforms a 3-dimensional vector by the specified quaternion.
    *
    * @param {Vec3} vec - The 3-dimensional vector to be transformed.
    * @param {Vec3} [res] - An optional 3-dimensional vector to receive the result of the transformation.
    * @returns {Vec3} The input vector v transformed by the current instance.
    * @example
    * // Create a 3-dimensional vector
    * var v = new pc.Vec3(1, 2, 3);
    *
    * // Create a 4x4 rotation matrix
    * var q = new pc.Quat().setFromEulerAngles(10, 20, 30);
    *
    * var tv = q.transformVector(v);
    */
  def transformVector(vec: Vec3): Vec3 = js.native
  def transformVector(vec: Vec3, res: Vec3): Vec3 = js.native
  
  /**
    * The w component of the quaternion.
    *
    * @type {number}
    */
  var w: Double = js.native
  
  /**
    * The x component of the quaternion.
    *
    * @type {number}
    */
  var x: Double = js.native
  
  /**
    * The y component of the quaternion.
    *
    * @type {number}
    */
  var y: Double = js.native
  
  /**
    * The z component of the quaternion.
    *
    * @type {number}
    */
  var z: Double = js.native
}
object Quat {
  
  /**
    * A constant quaternion set to [0, 0, 0, 1] (the identity).
    *
    * @type {Quat}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Quat.IDENTITY")
  @js.native
  val IDENTITY: Quat = js.native
  
  /**
    * A constant quaternion set to [0, 0, 0, 0].
    *
    * @type {Quat}
    * @readonly
    */
  /* static member */
  @JSImport("playcanvas", "Quat.ZERO")
  @js.native
  val ZERO: Quat = js.native
}
