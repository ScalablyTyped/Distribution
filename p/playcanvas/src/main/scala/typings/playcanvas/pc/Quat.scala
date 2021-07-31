package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Quat object.
  * @param [x] - The quaternion's x component. Default value 0. If x is an array of length 4, the array will be used to populate all components.
  * @param [y] - The quaternion's y component. Default value 0.
  * @param [z] - The quaternion's z component. Default value 0.
  * @param [w] - The quaternion's w component. Default value 1.
  */
@js.native
trait Quat extends StObject {
  
  /**
    * Copies the contents of a source quaternion to a destination quaternion.
    * @example
    * var src = new pc.Quat();
    var dst = new pc.Quat();
    dst.copy(src, src);
    console.log("The two quaternions are " + (src.equals(dst) ? "equal" : "different"));
    * @param rhs - The quaternion to be copied.
    * @returns Self for chaining.
    */
  def copy(rhs: Quat): Quat = js.native
  
  /**
    * Reports whether two quaternions are equal.
    * @example
    * var a = new pc.Quat();
    var b = new pc.Quat();
    console.log("The two quaternions are " + (a.equals(b) ? "equal" : "different"));
    * @param rhs - The quaternion to be compared against.
    * @returns True if the quaternions are equal and false otherwise.
    */
  def equals(rhs: Quat): Boolean = js.native
  
  /**
    * Gets the rotation axis and angle for a given
    quaternion. If a quaternion is created with
    setFromAxisAngle, this method will return the same
    values as provided in the original parameter list
    OR functionally equivalent values.
    * @example
    * var q = new pc.Quat();
    q.setFromAxisAngle(new pc.Vec3(0, 1, 0), 90);
    var v = new pc.Vec3();
    var angle = q.getAxisAngle(v);
    // Should output 90
    console.log(angle);
    // Should output [0, 1, 0]
    console.log(v.toString());
    * @param axis - The 3-dimensional vector to receive the axis of rotation.
    * @returns Angle, in degrees, of the rotation.
    */
  def getAxisAngle(axis: Vec3): Double = js.native
  
  /**
    * Converts the supplied quaternion to Euler angles.
    * @param [eulers] - The 3-dimensional vector to receive the Euler angles.
    * @returns The 3-dimensional vector holding the Euler angles that
    correspond to the supplied quaternion.
    */
  def getEulerAngles(): Vec3 = js.native
  def getEulerAngles(eulers: Vec3): Vec3 = js.native
  
  /**
    * Generates the inverse of the specified quaternion.
    * @example
    * // Create a quaternion rotated 180 degrees around the y-axis
    var rot = new pc.Quat().setFromEulerAngles(0, 180, 0);
    
    // Invert in place
    rot.invert();
    * @returns Self for chaining.
    */
  def invert(): Quat = js.native
  
  /**
    * Returns the magnitude of the specified quaternion.
    * @example
    * var q = new pc.Quat(0, 0, 0, 5);
    var len = q.length();
    // Should output 5
    console.log("The length of the quaternion is: " + len);
    * @returns The magnitude of the specified quaternion.
    */
  def length(): Double = js.native
  
  /**
    * Returns the magnitude squared of the specified quaternion.
    * @example
    * var q = new pc.Quat(3, 4, 0);
    var lenSq = q.lengthSq();
    // Should output 25
    console.log("The length squared of the quaternion is: " + lenSq);
    * @returns The magnitude of the specified quaternion.
    */
  def lengthSq(): Double = js.native
  
  /**
    * Returns the result of multiplying the specified quaternions together.
    * @example
    * var a = new pc.Quat().setFromEulerAngles(0, 30, 0);
    var b = new pc.Quat().setFromEulerAngles(0, 60, 0);
    
    // a becomes a 90 degree rotation around the Y axis
    // In other words, a = a * b
    a.mul(b);
    
    console.log("The result of the multiplication is: " + a.toString());
    * @param rhs - The quaternion used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul(rhs: Quat): Quat = js.native
  
  /**
    * Returns the result of multiplying the specified quaternions together.
    * @example
    * var a = new pc.Quat().setFromEulerAngles(0, 30, 0);
    var b = new pc.Quat().setFromEulerAngles(0, 60, 0);
    var r = new pc.Quat();
    
    // r is set to a 90 degree rotation around the Y axis
    // In other words, r = a * b
    r.mul2(a, b);
    
    console.log("The result of the multiplication is: " + r.toString());
    * @param lhs - The quaternion used as the first multiplicand of the operation.
    * @param rhs - The quaternion used as the second multiplicand of the operation.
    * @returns Self for chaining.
    */
  def mul2(lhs: Quat, rhs: Quat): Quat = js.native
  
  /**
    * Returns the specified quaternion converted in place to a unit quaternion.
    * @example
    * var v = new pc.Quat(0, 0, 0, 5);
    
    v.normalize();
    
    // Should output 0, 0, 0, 1
    console.log("The result of the vector normalization is: " + v.toString());
    * @returns The result of the normalization.
    */
  def normalize(): Quat = js.native
  
  /**
    * Sets the specified quaternion to the supplied numerical values.
    * @example
    * var q = new pc.Quat();
    q.set(1, 0, 0, 0);
    
    // Should output 1, 0, 0, 0
    console.log("The result of the vector set is: " + q.toString());
    * @param x - The x component of the quaternion.
    * @param y - The y component of the quaternion.
    * @param z - The z component of the quaternion.
    * @param w - The w component of the quaternion.
    * @returns Self for chaining.
    */
  def set(x: Double, y: Double, z: Double, w: Double): Quat = js.native
  
  /**
    * Sets a quaternion from an angular rotation around an axis.
    * @example
    * var q = new pc.Quat();
    q.setFromAxisAngle(pc.Vec3.UP, 90);
    * @param axis - World space axis around which to rotate.
    * @param angle - Angle to rotate around the given axis in degrees.
    * @returns Self for chaining.
    */
  def setFromAxisAngle(axis: Vec3, angle: Double): Quat = js.native
  
  /**
    * Sets a quaternion from Euler angles specified in XYZ order.
    * @example
    * var q = new pc.Quat();
    q.setFromEulerAngles(45, 90, 180);
    * @param ex - Angle to rotate around X axis in degrees.
    * @param ey - Angle to rotate around Y axis in degrees.
    * @param ez - Angle to rotate around Z axis in degrees.
    * @returns Self for chaining.
    */
  def setFromEulerAngles(ex: Double, ey: Double, ez: Double): Quat = js.native
  
  /**
    * Converts the specified 4x4 matrix to a quaternion. Note that since
    a quaternion is purely a representation for orientation, only the translational part
    of the matrix is lost.
    * @example
    * // Create a 4x4 rotation matrix of 180 degrees around the y-axis
    var rot = new pc.Mat4().setFromAxisAngle(pc.Vec3.UP, 180);
    
    // Convert to a quaternion
    var q = new pc.Quat().setFromMat4(rot);
    * @param m - The 4x4 matrix to convert.
    * @returns Self for chaining.
    */
  def setFromMat4(m: Mat4): Quat = js.native
  
  /**
    * Performs a spherical interpolation between two quaternions. The result of
    the interpolation is written to the quaternion calling the function.
    * @example
    * var q1 = new pc.Quat(-0.11, -0.15, -0.46, 0.87);
    var q2 = new pc.Quat(-0.21, -0.21, -0.67, 0.68);
    
    var result;
    result = new pc.Quat().slerp(q1, q2, 0);   // Return q1
    result = new pc.Quat().slerp(q1, q2, 0.5); // Return the midpoint interpolant
    result = new pc.Quat().slerp(q1, q2, 1);   // Return q2
    * @param lhs - The quaternion to interpolate from.
    * @param rhs - The quaternion to interpolate to.
    * @param alpha - The value controlling the interpolation in relation to the two input
    quaternions. The value is in the range 0 to 1, 0 generating q1, 1 generating q2 and anything
    in between generating a spherical interpolation between the two.
    * @returns Self for chaining.
    */
  def slerp(lhs: Quat, rhs: Quat, alpha: Double): Quat = js.native
  
  /**
    * Transforms a 3-dimensional vector by the specified quaternion.
    * @example
    * // Create a 3-dimensional vector
    var v = new pc.Vec3(1, 2, 3);
    
    // Create a 4x4 rotation matrix
    var q = new pc.Quat().setFromEulerAngles(10, 20, 30);
    
    var tv = q.transformVector(v);
    * @param vec - The 3-dimensional vector to be transformed.
    * @param [res] - An optional 3-dimensional vector to receive the result of the transformation.
    * @returns The input vector v transformed by the current instance.
    */
  def transformVector(vec: Vec3): Vec3 = js.native
  def transformVector(vec: Vec3, res: Vec3): Vec3 = js.native
  
  /**
    * The w component of the quaternion.
    * @example
    * var quat = new pc.Quat();
    
    // Get w
    var w = quat.w;
    
    // Set w
    quat.w = 0;
    */
  var w: Double = js.native
  
  /**
    * The x component of the quaternion.
    * @example
    * var quat = new pc.Quat();
    
    // Get x
    var x = quat.x;
    
    // Set x
    quat.x = 0;
    */
  var x: Double = js.native
  
  /**
    * The y component of the quaternion.
    * @example
    * var quat = new pc.Quat();
    
    // Get y
    var y = quat.y;
    
    // Set y
    quat.y = 0;
    */
  var y: Double = js.native
  
  /**
    * The z component of the quaternion.
    * @example
    * var quat = new pc.Quat();
    
    // Get z
    var z = quat.z;
    
    // Set z
    quat.z = 0;
    */
  var z: Double = js.native
}
