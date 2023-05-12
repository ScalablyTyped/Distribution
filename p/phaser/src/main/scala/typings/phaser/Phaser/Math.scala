package typings.phaser.Phaser

import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Math {
  
  trait Euler extends StObject
  
  /**
    * A three-dimensional matrix.
    * 
    * Defaults to the identity matrix when instantiated.
    */
  @js.native
  trait Matrix3 extends StObject {
    
    /**
      * Calculate the adjoint, or adjugate, of this Matrix.
      */
    def adjoint(): Matrix3 = js.native
    
    /**
      * Copy the values of a given Matrix into this Matrix.
      * @param src The Matrix to copy the values from.
      */
    def copy(src: Matrix3): Matrix3 = js.native
    
    /**
      * Calculate the determinant of this Matrix.
      */
    def determinant(): Double = js.native
    
    /**
      * Set the values of this Matrix from the given array.
      * @param a The array to copy the values from.
      */
    def fromArray(a: js.Array[Any]): Matrix3 = js.native
    
    /**
      * Copy the values of a given Matrix4 into this Matrix3.
      * @param m The Matrix4 to copy the values from.
      */
    def fromMat4(m: Matrix4): Matrix3 = js.native
    
    /**
      * Set the values of this Matrix from the given Quaternion.
      * @param q The Quaternion to set the values of this Matrix from.
      */
    def fromQuat(q: Quaternion): Matrix3 = js.native
    
    /**
      * Reset this Matrix to an identity (default) matrix.
      */
    def identity(): Matrix3 = js.native
    
    /**
      * Invert this Matrix.
      */
    def invert(): Matrix3 = js.native
    
    /**
      * Multiply this Matrix by the given Matrix.
      * @param src The Matrix to multiply this Matrix by.
      */
    def multiply(src: Matrix3): Matrix3 = js.native
    
    /**
      * Set the values of this Matrix3 to be normalized from the given Matrix4.
      * @param m The Matrix4 to normalize the values from.
      */
    def normalFromMat4(m: Matrix4): Matrix3 = js.native
    
    /**
      * Apply a rotation transformation to this Matrix.
      * @param rad The angle in radians to rotate by.
      */
    def rotate(rad: Double): Matrix3 = js.native
    
    /**
      * Apply a scale transformation to this Matrix.
      * 
      * Uses the `x` and `y` components of the given Vector to scale the Matrix.
      * @param v The Vector to scale this Matrix with.
      */
    def scale(v: Vector2): Matrix3 = js.native
    def scale(v: Vector3): Matrix3 = js.native
    def scale(v: Vector4): Matrix3 = js.native
    
    /**
      * This method is an alias for `Matrix3.copy`.
      * @param src The Matrix to set the values of this Matrix's from.
      */
    def set(src: Matrix3): Matrix3 = js.native
    
    /**
      * Translate this Matrix using the given Vector.
      * @param v The Vector to translate this Matrix with.
      */
    def translate(v: Vector2): Matrix3 = js.native
    def translate(v: Vector3): Matrix3 = js.native
    def translate(v: Vector4): Matrix3 = js.native
    
    /**
      * Transpose this Matrix.
      */
    def transpose(): Matrix3 = js.native
    
    /**
      * The matrix values.
      */
    var `val`: js.typedarray.Float32Array = js.native
  }
  
  /**
    * A four-dimensional matrix.
    * 
    * Adapted from [gl-matrix](https://github.com/toji/gl-matrix) by toji
    * and [vecmath](https://github.com/mattdesl/vecmath) by mattdesl
    */
  @js.native
  trait Matrix4 extends StObject {
    
    /**
      * Calculate the adjoint, or adjugate, of this Matrix.
      */
    def adjoint(): this.type = js.native
    
    /**
      * Copy the values of a given Matrix into this Matrix.
      * @param src The Matrix to copy the values from.
      */
    def copy(src: Matrix4): this.type = js.native
    
    /**
      * Calculate the determinant of this Matrix.
      */
    def determinant(): Double = js.native
    
    /**
      * Set the values of this Matrix from the given array.
      * @param a The array to copy the values from. Must have at least 16 elements.
      */
    def fromArray(a: js.Array[Double]): this.type = js.native
    
    /**
      * Set the values of this Matrix from the given Quaternion.
      * @param q The Quaternion to set the values of this Matrix from.
      */
    def fromQuat(q: Quaternion): this.type = js.native
    
    /**
      * Set the values of this Matrix from the given rotation Quaternion and translation Vector.
      * @param q The Quaternion to set rotation from.
      * @param v The Vector to set translation from.
      */
    def fromRotationTranslation(q: Quaternion, v: Vector3): this.type = js.native
    
    /**
      * Takes the rotation and position vectors and builds this Matrix4 from them.
      * @param rotation The rotation vector.
      * @param position The position vector.
      * @param translateFirst Should the operation translate then rotate (`true`), or rotate then translate? (`false`)
      */
    def fromRotationXYTranslation(rotation: Vector3, position: Vector3, translateFirst: Boolean): this.type = js.native
    
    /**
      * Generate a frustum matrix with the given bounds.
      * @param left The left bound of the frustum.
      * @param right The right bound of the frustum.
      * @param bottom The bottom bound of the frustum.
      * @param top The top bound of the frustum.
      * @param near The near bound of the frustum.
      * @param far The far bound of the frustum.
      */
    def frustum(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type = js.native
    
    /**
      * Copies the given Matrix4 into this Matrix and then inverses it.
      * @param m The Matrix4 to invert into this Matrix4.
      */
    def getInverse(m: Matrix4): this.type = js.native
    
    /**
      * Returns the maximum axis scale from this Matrix4.
      */
    def getMaxScaleOnAxis(): Double = js.native
    
    /**
      * Reset this Matrix to an identity (default) matrix.
      */
    def identity(): this.type = js.native
    
    /**
      * Invert this Matrix.
      */
    def invert(): this.type = js.native
    
    /**
      * Generate a look-at matrix with the given eye position, focal point, and up axis.
      * @param eye Position of the viewer
      * @param center Point the viewer is looking at
      * @param up vec3 pointing up.
      */
    def lookAt(eye: Vector3, center: Vector3, up: Vector3): this.type = js.native
    
    /**
      * Generate a right-handed look-at matrix with the given eye position, target and up axis.
      * @param eye Position of the viewer.
      * @param target Point the viewer is looking at.
      * @param up vec3 pointing up.
      */
    def lookAtRH(eye: Vector3, target: Vector3, up: Vector3): this.type = js.native
    
    /**
      * Derive a rotation matrix around the given axis.
      * @param axis The rotation axis.
      * @param angle The rotation angle in radians.
      */
    def makeRotationAxis(axis: Vector3, angle: Double): this.type = js.native
    def makeRotationAxis(axis: Vector4, angle: Double): this.type = js.native
    
    /**
      * Multiply this Matrix by the given Matrix.
      * @param src The Matrix to multiply this Matrix by.
      */
    def multiply(src: Matrix4): this.type = js.native
    
    /**
      * Multiply the values of this Matrix4 by those given in the `src` argument.
      * @param src The source Matrix4 that this Matrix4 is multiplied by.
      */
    def multiplyLocal(src: Matrix4): this.type = js.native
    
    /**
      * Multiplies the two given Matrix4 objects and stores the results in this Matrix.
      * @param a The first Matrix4 to multiply.
      * @param b The second Matrix4 to multiply.
      */
    def multiplyMatrices(a: Matrix4, b: Matrix4): this.type = js.native
    
    /**
      * Multiplies this Matrix4 by the given `src` Matrix4 and stores the results in the `out` Matrix4.
      * @param src The Matrix4 to multiply with this one.
      * @param out The receiving Matrix.
      */
    def multiplyToMat4(src: Matrix4, out: Matrix4): Matrix4 = js.native
    
    /**
      * Generate an orthogonal projection matrix with the given bounds.
      * @param left The left bound of the frustum.
      * @param right The right bound of the frustum.
      * @param bottom The bottom bound of the frustum.
      * @param top The top bound of the frustum.
      * @param near The near bound of the frustum.
      * @param far The far bound of the frustum.
      */
    def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): this.type = js.native
    
    /**
      * Generate a perspective projection matrix with the given bounds.
      * @param fovy Vertical field of view in radians
      * @param aspect Aspect ratio. Typically viewport width  /height.
      * @param near Near bound of the frustum.
      * @param far Far bound of the frustum.
      */
    def perspective(fovy: Double, aspect: Double, near: Double, far: Double): this.type = js.native
    
    /**
      * Generate a perspective projection matrix with the given bounds.
      * @param width The width of the frustum.
      * @param height The height of the frustum.
      * @param near Near bound of the frustum.
      * @param far Far bound of the frustum.
      */
    def perspectiveLH(width: Double, height: Double, near: Double, far: Double): this.type = js.native
    
    /**
      * Multiplies the given Matrix4 object with this Matrix.
      * 
      * This is the same as calling `multiplyMatrices(m, this)`.
      * @param m The Matrix4 to multiply with this one.
      */
    def premultiply(m: Matrix4): this.type = js.native
    
    /**
      * Apply a rotation transformation to this Matrix.
      * @param rad The angle in radians to rotate by.
      * @param axis The axis to rotate upon.
      */
    def rotate(rad: Double, axis: Vector3): this.type = js.native
    
    /**
      * Rotate this matrix on its X axis.
      * @param rad The angle in radians to rotate by.
      */
    def rotateX(rad: Double): this.type = js.native
    
    /**
      * Rotate this matrix on its Y axis.
      * @param rad The angle to rotate by, in radians.
      */
    def rotateY(rad: Double): this.type = js.native
    
    /**
      * Rotate this matrix on its Z axis.
      * @param rad The angle to rotate by, in radians.
      */
    def rotateZ(rad: Double): this.type = js.native
    
    /**
      * Apply a scale transformation to this Matrix.
      * 
      * Uses the `x`, `y` and `z` components of the given Vector to scale the Matrix.
      * @param v The Vector to scale this Matrix with.
      */
    def scale(v: Vector3): this.type = js.native
    def scale(v: Vector4): this.type = js.native
    
    /**
      * Apply a scale transformation to this Matrix.
      * @param x The x component.
      * @param y The y component.
      * @param z The z component.
      */
    def scaleXYZ(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Set the scaling values of this Matrix.
      * @param x The x scaling value.
      * @param y The y scaling value.
      * @param z The z scaling value.
      */
    def scaling(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * This method is an alias for `Matrix4.copy`.
      * @param src The Matrix to set the values of this Matrix's from.
      */
    def set(src: Matrix4): this.type = js.native
    
    /**
      * Sets all values of this Matrix4.
      * @param m00 The m00 value.
      * @param m01 The m01 value.
      * @param m02 The m02 value.
      * @param m03 The m03 value.
      * @param m10 The m10 value.
      * @param m11 The m11 value.
      * @param m12 The m12 value.
      * @param m13 The m13 value.
      * @param m20 The m20 value.
      * @param m21 The m21 value.
      * @param m22 The m22 value.
      * @param m23 The m23 value.
      * @param m30 The m30 value.
      * @param m31 The m31 value.
      * @param m32 The m32 value.
      * @param m33 The m33 value.
      */
    def setValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m03: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m13: Double,
      m20: Double,
      m21: Double,
      m22: Double,
      m23: Double,
      m30: Double,
      m31: Double,
      m32: Double,
      m33: Double
    ): this.type = js.native
    
    /**
      * Generate a world matrix from the given rotation, position, scale, view matrix and projection matrix.
      * @param rotation The rotation of the world matrix.
      * @param position The position of the world matrix.
      * @param scale The scale of the world matrix.
      * @param viewMatrix The view matrix.
      * @param projectionMatrix The projection matrix.
      */
    def setWorldMatrix(rotation: Vector3, position: Vector3, scale: Vector3): this.type = js.native
    def setWorldMatrix(rotation: Vector3, position: Vector3, scale: Vector3, viewMatrix: Unit, projectionMatrix: Matrix4): this.type = js.native
    def setWorldMatrix(rotation: Vector3, position: Vector3, scale: Vector3, viewMatrix: Matrix4): this.type = js.native
    def setWorldMatrix(
      rotation: Vector3,
      position: Vector3,
      scale: Vector3,
      viewMatrix: Matrix4,
      projectionMatrix: Matrix4
    ): this.type = js.native
    
    /**
      * Generates a transform matrix based on the given position, scale and rotation.
      * @param position The position vector.
      * @param scale The scale vector.
      * @param rotation The rotation quaternion.
      */
    def transform(position: Vector3, scale: Vector3, rotation: Quaternion): this.type = js.native
    
    /**
      * Translate this Matrix using the given Vector.
      * @param v The Vector to translate this Matrix with.
      */
    def translate(v: Vector3): this.type = js.native
    def translate(v: Vector4): this.type = js.native
    
    /**
      * Translate this Matrix using the given values.
      * @param x The x component.
      * @param y The y component.
      * @param z The z component.
      */
    def translateXYZ(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Transpose this Matrix.
      */
    def transpose(): this.type = js.native
    
    /**
      * The matrix values.
      */
    var `val`: js.typedarray.Float32Array = js.native
    
    /**
      * Set the `x`, `y` and `z` values of this Matrix.
      * @param x The x value.
      * @param y The y value.
      * @param z The z value.
      */
    def xyz(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Set the values of this matrix from the given `yaw`, `pitch` and `roll` values.
      * @param yaw The yaw value.
      * @param pitch The pitch value.
      * @param roll The roll value.
      */
    def yawPitchRoll(yaw: Double, pitch: Double, roll: Double): this.type = js.native
    
    /**
      * Reset this Matrix.
      * 
      * Sets all values to `0`.
      */
    def zero(): Matrix4 = js.native
  }
  
  /**
    * A quaternion.
    */
  @js.native
  trait Quaternion extends StObject {
    
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
    def dot(v: Quaternion): Double = js.native
    def dot(v: Vector4): Double = js.native
    
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
    def length(): Double = js.native
    
    /**
      * Calculate the length of this Quaternion squared.
      */
    def lengthSq(): Double = js.native
    
    /**
      * Linearly interpolate this Quaternion towards the given Quaternion or Vector.
      * @param v The Quaternion or Vector to interpolate towards.
      * @param t The percentage of interpolation. Default 0.
      */
    def lerp(v: Quaternion): Quaternion = js.native
    def lerp(v: Quaternion, t: Double): Quaternion = js.native
    def lerp(v: Vector4): Quaternion = js.native
    def lerp(v: Vector4, t: Double): Quaternion = js.native
    
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
      * This callback is invoked, if set, each time a value in this quaternion is changed.
      * The callback is passed one argument, a reference to this quaternion.
      */
    var onChangeCallback: js.Function = js.native
    
    /**
      * Rotate this Quaternion on the X axis.
      * @param rad The rotation angle in radians.
      */
    def rotateX(rad: Double): Quaternion = js.native
    
    /**
      * Rotate this Quaternion on the Y axis.
      * @param rad The rotation angle in radians.
      */
    def rotateY(rad: Double): Quaternion = js.native
    
    /**
      * Rotate this Quaternion on the Z axis.
      * @param rad The rotation angle in radians.
      */
    def rotateZ(rad: Double): Quaternion = js.native
    
    /**
      * Rotates this Quaternion based on the two given vectors.
      * @param a The transform rotation vector.
      * @param b The target rotation vector.
      */
    def rotationTo(a: Vector3, b: Vector3): Quaternion = js.native
    
    /**
      * Scale this Quaternion by the given value.
      * @param scale The value to scale this Quaternion by.
      */
    def scale(scale: Double): Quaternion = js.native
    
    /**
      * Set the components of this Quaternion and optionally call the `onChangeCallback`.
      * @param x The x component, or an object containing x, y, z, and w components. Default 0.
      * @param y The y component. Default 0.
      * @param z The z component. Default 0.
      * @param w The w component. Default 0.
      * @param update Call the `onChangeCallback`? Default true.
      */
    def set(): Quaternion = js.native
    def set(x: js.Object): Quaternion = js.native
    def set(x: js.Object, y: Double): Quaternion = js.native
    def set(x: js.Object, y: Double, z: Double): Quaternion = js.native
    def set(x: js.Object, y: Double, z: Double, w: Double): Quaternion = js.native
    def set(x: js.Object, y: Double, z: Double, w: Double, update: Boolean): Quaternion = js.native
    def set(x: js.Object, y: Double, z: Double, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: js.Object, y: Double, z: Unit, w: Double): Quaternion = js.native
    def set(x: js.Object, y: Double, z: Unit, w: Double, update: Boolean): Quaternion = js.native
    def set(x: js.Object, y: Double, z: Unit, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: js.Object, y: Unit, z: Double): Quaternion = js.native
    def set(x: js.Object, y: Unit, z: Double, w: Double): Quaternion = js.native
    def set(x: js.Object, y: Unit, z: Double, w: Double, update: Boolean): Quaternion = js.native
    def set(x: js.Object, y: Unit, z: Double, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: js.Object, y: Unit, z: Unit, w: Double): Quaternion = js.native
    def set(x: js.Object, y: Unit, z: Unit, w: Double, update: Boolean): Quaternion = js.native
    def set(x: js.Object, y: Unit, z: Unit, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Double): Quaternion = js.native
    def set(x: Double, y: Double): Quaternion = js.native
    def set(x: Double, y: Double, z: Double): Quaternion = js.native
    def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
    def set(x: Double, y: Double, z: Double, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Double, y: Double, z: Double, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Double, y: Double, z: Unit, w: Double): Quaternion = js.native
    def set(x: Double, y: Double, z: Unit, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Double, y: Double, z: Unit, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Double, y: Unit, z: Double): Quaternion = js.native
    def set(x: Double, y: Unit, z: Double, w: Double): Quaternion = js.native
    def set(x: Double, y: Unit, z: Double, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Double, y: Unit, z: Double, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Double, y: Unit, z: Unit, w: Double): Quaternion = js.native
    def set(x: Double, y: Unit, z: Unit, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Double, y: Unit, z: Unit, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Double): Quaternion = js.native
    def set(x: Unit, y: Double, z: Double): Quaternion = js.native
    def set(x: Unit, y: Double, z: Double, w: Double): Quaternion = js.native
    def set(x: Unit, y: Double, z: Double, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Double, z: Double, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Double, z: Unit, w: Double): Quaternion = js.native
    def set(x: Unit, y: Double, z: Unit, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Double, z: Unit, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Unit, z: Double): Quaternion = js.native
    def set(x: Unit, y: Unit, z: Double, w: Double): Quaternion = js.native
    def set(x: Unit, y: Unit, z: Double, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Unit, z: Double, w: Unit, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Unit, z: Unit, w: Double): Quaternion = js.native
    def set(x: Unit, y: Unit, z: Unit, w: Double, update: Boolean): Quaternion = js.native
    def set(x: Unit, y: Unit, z: Unit, w: Unit, update: Boolean): Quaternion = js.native
    
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
    def setAxisAngle(axis: Vector3, rad: Double): Quaternion = js.native
    
    /**
      * Set this Quaternion from the given Euler, based on Euler order.
      * @param euler The Euler to convert from.
      * @param update Run the `onChangeCallback`? Default true.
      */
    def setFromEuler(euler: Euler): Quaternion = js.native
    def setFromEuler(euler: Euler, update: Boolean): Quaternion = js.native
    
    /**
      * Sets the rotation of this Quaternion from the given Matrix4.
      * @param mat4 The Matrix4 to set the rotation from.
      */
    def setFromRotationMatrix(mat4: Matrix4): Quaternion = js.native
    
    /**
      * Smoothly linearly interpolate this Quaternion towards the given Quaternion or Vector.
      * @param b The Quaternion or Vector to interpolate towards.
      * @param t The percentage of interpolation.
      */
    def slerp(b: Quaternion, t: Double): Quaternion = js.native
    def slerp(b: Vector4, t: Double): Quaternion = js.native
    
    /**
      * Subtract a given Quaternion or Vector from this Quaternion. Subtraction is component-wise.
      * @param v The Quaternion or Vector to subtract from this Quaternion.
      */
    def subtract(v: Quaternion): Quaternion = js.native
    def subtract(v: Vector4): Quaternion = js.native
    
    /**
      * The w component of this Quaternion.
      */
    var w: Double = js.native
    
    /**
      * The x component of this Quaternion.
      */
    var x: Double = js.native
    
    /**
      * The y component of this Quaternion.
      */
    var y: Double = js.native
    
    /**
      * The z component of this Quaternion.
      */
    var z: Double = js.native
  }
  
  /**
    * A seeded Random Data Generator.
    * 
    * Access via `Phaser.Math.RND` which is an instance of this class pre-defined
    * by Phaser. Or, create your own instance to use as you require.
    * 
    * The `Math.RND` generator is seeded by the Game Config property value `seed`.
    * If no such config property exists, a random number is used.
    * 
    * If you create your own instance of this class you should provide a seed for it.
    * If no seed is given it will use a 'random' one based on Date.now.
    */
  @js.native
  trait RandomDataGenerator extends StObject {
    
    /**
      * Returns a random angle between -180 and 180.
      */
    def angle(): Double = js.native
    
    /**
      * Returns a random integer between and including min and max.
      * This method is an alias for RandomDataGenerator.integerInRange.
      * @param min The minimum value in the range.
      * @param max The maximum value in the range.
      */
    def between(min: Double, max: Double): Double = js.native
    
    /**
      * Returns a random real number between 0 and 1.
      */
    def frac(): Double = js.native
    
    /**
      * Initialize the state of the random data generator.
      * @param seeds The seeds to initialize the random data generator with.
      */
    def init(seeds: String): Unit = js.native
    def init(seeds: js.Array[String]): Unit = js.native
    
    /**
      * Returns a random integer between 0 and 2^32.
      */
    def integer(): Double = js.native
    
    /**
      * Returns a random integer between and including min and max.
      * @param min The minimum value in the range.
      * @param max The maximum value in the range.
      */
    def integerInRange(min: Double, max: Double): Double = js.native
    
    /**
      * Returns a random real number between -1 and 1.
      */
    def normal(): Double = js.native
    
    /**
      * Returns a random element from within the given array.
      * @param array The array to pick a random element from.
      */
    def pick[T](array: js.Array[T]): T = js.native
    
    /**
      * Returns a random real number between 0 and 2^32.
      */
    def real(): Double = js.native
    
    /**
      * Returns a random real number between min and max.
      * @param min The minimum value in the range.
      * @param max The maximum value in the range.
      */
    def realInRange(min: Double, max: Double): Double = js.native
    
    /**
      * Returns a random rotation in radians, between -3.141 and 3.141
      */
    def rotation(): Double = js.native
    
    /**
      * Shuffles the given array, using the current seed.
      * @param array The array to be shuffled.
      */
    def shuffle[T](): js.Array[T] = js.native
    def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
    
    /**
      * Returns a sign to be used with multiplication operator.
      */
    def sign(): Double = js.native
    
    /**
      * Signs to choose from.
      */
    var signs: js.Array[Double] = js.native
    
    /**
      * Reset the seed of the random data generator.
      * 
      * _Note_: the seed array is only processed up to the first `undefined` (or `null`) value, should such be present.
      * @param seeds The array of seeds: the `toString()` of each value is used.
      */
    def sow(seeds: js.Array[String]): Unit = js.native
    
    /**
      * Gets or Sets the state of the generator. This allows you to retain the values
      * that the generator is using between games, i.e. in a game save file.
      * 
      * To seed this generator with a previously saved state you can pass it as the
      * `seed` value in your game config, or call this method directly after Phaser has booted.
      * 
      * Call this method with no parameters to return the current state.
      * 
      * If providing a state it should match the same format that this method
      * returns, which is a string with a header `!rnd` followed by the `c`,
      * `s0`, `s1` and `s2` values respectively, each comma-delimited.
      * @param state Generator state to be set.
      */
    def state(): String = js.native
    def state(state: String): String = js.native
    
    /**
      * Returns a random timestamp between min and max, or between the beginning of 2000 and the end of 2020 if min and max aren't specified.
      * @param min The minimum value in the range.
      * @param max The maximum value in the range.
      */
    def timestamp(min: Double, max: Double): Double = js.native
    
    /**
      * Returns a valid RFC4122 version4 ID hex string from https://gist.github.com/1308368
      */
    def uuid(): String = js.native
    
    /**
      * Returns a random element from within the given array, favoring the earlier entries.
      * @param array The array to pick a random element from.
      */
    def weightedPick[T](array: js.Array[T]): T = js.native
  }
  
  /**
    * A representation of a vector in 2D space.
    * 
    * A two-component vector.
    */
  @js.native
  trait Vector2 extends StObject {
    
    /**
      * Add a given Vector to this Vector. Addition is component-wise.
      * @param src The Vector to add to this Vector.
      */
    def add(src: Vector2Like): Vector2 = js.native
    
    /**
      * Calculate the angle between this Vector and the positive x-axis, in radians.
      */
    def angle(): Double = js.native
    
    /**
      * Copy the components of a given Vector into this Vector.
      * @param src The Vector to copy the components from.
      */
    def copy(src: Vector2Like): Vector2 = js.native
    
    /**
      * Calculate the cross product of this Vector and the given Vector.
      * @param src The Vector2 to cross with this Vector2.
      */
    def cross(src: Vector2Like): Double = js.native
    
    /**
      * Calculate the distance between this Vector and the given Vector.
      * @param src The Vector to calculate the distance to.
      */
    def distance(src: Vector2Like): Double = js.native
    
    /**
      * Calculate the distance between this Vector and the given Vector, squared.
      * @param src The Vector to calculate the distance to.
      */
    def distanceSq(src: Vector2Like): Double = js.native
    
    /**
      * Perform a component-wise division between this Vector and the given Vector.
      * 
      * Divides this Vector by the given Vector.
      * @param src The Vector to divide this Vector by.
      */
    def divide(src: Vector2Like): Vector2 = js.native
    
    /**
      * Calculate the dot product of this Vector and the given Vector.
      * @param src The Vector2 to dot product with this Vector2.
      */
    def dot(src: Vector2Like): Double = js.native
    
    /**
      * Check whether this Vector is equal to a given Vector.
      * 
      * Performs a strict equality check against each Vector's components.
      * @param v The vector to compare with this Vector.
      */
    def equals(v: Vector2Like): Boolean = js.native
    
    /**
      * Check whether this Vector is approximately equal to a given Vector.
      * @param v The vector to compare with this Vector.
      * @param epsilon The tolerance value. Default 0.0001.
      */
    def fuzzyEquals(v: Vector2Like): Boolean = js.native
    def fuzzyEquals(v: Vector2Like, epsilon: Double): Boolean = js.native
    
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
    def lerp(src: Vector2Like): Vector2 = js.native
    def lerp(src: Vector2Like, t: Double): Vector2 = js.native
    
    /**
      * Limit the length (or magnitude) of this Vector.
      * @param max The maximum length.
      */
    def limit(max: Double): Vector2 = js.native
    
    /**
      * Reflect this Vector across another.
      * @param axis A vector to reflect across.
      */
    def mirror(axis: Vector2): Vector2 = js.native
    
    /**
      * Perform a component-wise multiplication between this Vector and the given Vector.
      * 
      * Multiplies this Vector by the given Vector.
      * @param src The Vector to multiply this Vector by.
      */
    def multiply(src: Vector2Like): Vector2 = js.native
    
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
      * Rotate this Vector to its perpendicular, in the negative direction.
      */
    def normalizeLeftHand(): Vector2 = js.native
    
    /**
      * Rotate this Vector to its perpendicular, in the positive direction.
      */
    def normalizeRightHand(): Vector2 = js.native
    
    /**
      * Project this Vector onto another.
      * @param src The vector to project onto.
      */
    def project(src: Vector2): Vector2 = js.native
    
    /**
      * Reflect this Vector off a line defined by a normal.
      * @param normal A vector perpendicular to the line.
      */
    def reflect(normal: Vector2): Vector2 = js.native
    
    /**
      * Make this Vector the zero vector (0, 0).
      */
    def reset(): Vector2 = js.native
    
    /**
      * Rotate this Vector by an angle amount.
      * @param delta The angle to rotate by, in radians.
      */
    def rotate(delta: Double): Vector2 = js.native
    
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
      * Set the angle of this Vector.
      * @param angle The angle, in radians.
      */
    def setAngle(angle: Double): Vector2 = js.native
    
    /**
      * Set the component values of this Vector from a given Vector2Like object.
      * @param obj The object containing the component values to set for this Vector.
      */
    def setFromObject(obj: Vector2Like): Vector2 = js.native
    
    /**
      * Set the length (or magnitude) of this Vector.
      */
    def setLength(length: Double): Vector2 = js.native
    
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
    def subtract(src: Vector2Like): Vector2 = js.native
    
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
    
    /**
      * The x component of this Vector.
      */
    var x: Double = js.native
    
    /**
      * The y component of this Vector.
      */
    var y: Double = js.native
  }
  
  /**
    * A representation of a vector in 3D space.
    * 
    * A three-component vector.
    */
  @js.native
  trait Vector3 extends StObject {
    
    /**
      * Add a given Vector to this Vector. Addition is component-wise.
      * @param v The Vector to add to this Vector.
      */
    def add(v: Vector2): Vector3 = js.native
    def add(v: Vector3): Vector3 = js.native
    
    /**
      * Add the given value to each component of this Vector.
      * @param s The amount to add to this Vector.
      */
    def addScalar(s: Double): Vector3 = js.native
    
    /**
      * Add and scale a given Vector to this Vector. Addition is component-wise.
      * @param v The Vector to add to this Vector.
      * @param scale The amount to scale `v` by.
      */
    def addScale(v: Vector2, scale: Double): Vector3 = js.native
    def addScale(v: Vector3, scale: Double): Vector3 = js.native
    
    /**
      * Adds the two given Vector3s and sets the results into this Vector3.
      * @param a The first Vector to add.
      * @param b The second Vector to add.
      */
    def addVectors(a: Vector3, b: Vector3): Vector3 = js.native
    
    /**
      * Takes a Matrix3 and applies it to this Vector3.
      * @param mat3 The Matrix3 to apply to this Vector3.
      */
    def applyMatrix3(mat3: Matrix3): Vector3 = js.native
    
    /**
      * Takes a Matrix4 and applies it to this Vector3.
      * @param mat4 The Matrix4 to apply to this Vector3.
      */
    def applyMatrix4(mat4: Matrix4): Vector3 = js.native
    
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
      * Sets the components of this Vector3 from the given array, based on the offset.
      * 
      * Vector3.x = array[offset]
      * Vector3.y = array[offset + 1]
      * Vector3.z = array[offset + 2]
      * @param array The array of values to get this Vector from.
      * @param offset The offset index into the array. Default 0.
      */
    def fromArray(array: js.Array[Double]): Vector3 = js.native
    def fromArray(array: js.Array[Double], offset: Double): Vector3 = js.native
    
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
      * Sets the components of this Vector to be the `Math.max` result from the given vector.
      * @param v The Vector3 to check the maximum values against.
      */
    def max(v: Vector3): Vector3 = js.native
    
    /**
      * Sets the components of this Vector to be the `Math.min` result from the given vector.
      * @param v The Vector3 to check the minimum values against.
      */
    def min(v: Vector3): Vector3 = js.native
    
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
      * Multiplies this Vector3 by the given view and projection matrices.
      * @param viewMatrix A View Matrix.
      * @param projectionMatrix A Projection Matrix.
      */
    def projectViewMatrix(viewMatrix: Matrix4, projectionMatrix: Matrix4): Vector3 = js.native
    
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
    def set(x: js.Object, y: Double): Vector3 = js.native
    def set(x: js.Object, y: Double, z: Double): Vector3 = js.native
    def set(x: js.Object, y: Unit, z: Double): Vector3 = js.native
    /**
      * Set the `x`, `y`, and `z` components of this Vector to the given `x`, `y`, and `z` values.
      * @param x The x value to set for this Vector, or an object containing x, y and z components.
      * @param y The y value to set for this Vector.
      * @param z The z value to set for this Vector.
      */
    def set(x: Double): Vector3 = js.native
    def set(x: Double, y: Double): Vector3 = js.native
    def set(x: Double, y: Double, z: Double): Vector3 = js.native
    def set(x: Double, y: Unit, z: Double): Vector3 = js.native
    
    /**
      * Sets the components of this Vector3 from the Matrix4 column specified.
      * @param mat4 The Matrix4 to get the column from.
      * @param index The column index.
      */
    def setFromMatrixColumn(mat4: Matrix4, index: Double): Vector3 = js.native
    
    /**
      * Sets the components of this Vector3 from the position of the given Matrix4.
      * @param mat4 The Matrix4 to get the position from.
      */
    def setFromMatrixPosition(mat4: Matrix4): Vector3 = js.native
    
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
      * Transform this Vector with the given Matrix4.
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
      * Multiplies this Vector3 by the given inversed projection matrix and world matrix.
      * @param projectionMatrix An inversed Projection Matrix.
      * @param worldMatrix A World View Matrix.
      */
    def unprojectViewMatrix(projectionMatrix: Matrix4, worldMatrix: Matrix4): Vector3 = js.native
    
    /**
      * Set this Vector to point up.
      * 
      * Sets the y component of the vector to 1, and the others to 0.
      */
    def up(): Vector3 = js.native
    
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
  
  /**
    * A representation of a vector in 4D space.
    * 
    * A four-component vector.
    */
  @js.native
  trait Vector4 extends StObject {
    
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
}
