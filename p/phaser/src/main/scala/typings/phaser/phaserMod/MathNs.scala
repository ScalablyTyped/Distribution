package typings.phaser.phaserMod

import typings.phaser.PhaserNs.GeomNs.Point
import typings.phaser.PhaserNs.TypesNs.MathNs.SinCosTable
import typings.phaser.PhaserNs.TypesNs.MathNs.Vector2Like
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Math")
@js.native
object MathNs extends js.Object {
  /**
    * A three-dimensional matrix.
    * 
    * Defaults to the identity matrix when instantiated.
    */
  @js.native
  /**
    * 
    * @param m Optional Matrix3 to copy values from.
    */
  class Matrix3 ()
    extends typings.phaser.PhaserNs.MathNs.Matrix3 {
    def this(m: typings.phaser.PhaserNs.MathNs.Matrix3) = this()
  }
  
  /**
    * A four-dimensional matrix.
    */
  @js.native
  /**
    * 
    * @param m Optional Matrix4 to copy values from.
    */
  class Matrix4 ()
    extends typings.phaser.PhaserNs.MathNs.Matrix4 {
    def this(m: typings.phaser.PhaserNs.MathNs.Matrix4) = this()
  }
  
  /**
    * A quaternion.
    */
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    * @param w The w component.
    */
  class Quaternion ()
    extends typings.phaser.PhaserNs.MathNs.Quaternion {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
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
  /**
    * 
    * @param seeds The seeds to use for the random number generator.
    */
  class RandomDataGenerator ()
    extends typings.phaser.PhaserNs.MathNs.RandomDataGenerator {
    def this(seeds: String) = this()
    def this(seeds: js.Array[String]) = this()
  }
  
  /**
    * A representation of a vector in 2D space.
    * 
    * A two-component vector.
    */
  @js.native
  /**
    * 
    * @param x The x component, or an object with `x` and `y` properties.
    * @param y The y component.
    */
  class Vector2 ()
    extends typings.phaser.PhaserNs.MathNs.Vector2 {
    def this(x: Double) = this()
    def this(x: Vector2Like) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Vector2Like, y: Double) = this()
  }
  
  /**
    * A representation of a vector in 3D space.
    * 
    * A three-component vector.
    */
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  class Vector3 ()
    extends typings.phaser.PhaserNs.MathNs.Vector3 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
  }
  
  /**
    * A representation of a vector in 4D space.
    * 
    * A four-component vector.
    */
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    * @param w The w component.
    */
  class Vector4 ()
    extends typings.phaser.PhaserNs.MathNs.Vector4 {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
  }
  
  /**
    * For converting degrees to radians (PI / 180)
    */
  var DEG_TO_RAD: Double = js.native
  /**
    * An epsilon value (1.0e-6)
    */
  var EPSILON: Double = js.native
  /**
    * The value of PI * 2.
    */
  var PI2: Double = js.native
  /**
    * For converting radians to degrees (180 / PI)
    */
  var RAD_TO_DEG: Double = js.native
  /**
    * An instance of the Random Number Generator.
    * This is not set until the Game boots.
    */
  var RND: typings.phaser.PhaserNs.MathNs.RandomDataGenerator = js.native
  /**
    * The value of PI * 0.5.
    */
  var TAU: Double = js.native
  /**
    * Calculate the mean average of the given values.
    * @param values The values to average.
    */
  def Average(values: js.Array[Double]): Double = js.native
  /**
    * [description]
    * @param n [description]
    * @param i [description]
    */
  def Bernstein(n: Double, i: Double): Double = js.native
  /**
    * Compute a random integer between the `min` and `max` values, inclusive.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  def Between(min: integer, max: integer): integer = js.native
  /**
    * Calculates a Catmull-Rom value.
    * @param t [description]
    * @param p0 [description]
    * @param p1 [description]
    * @param p2 [description]
    * @param p3 [description]
    */
  def CatmullRom(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  /**
    * Ceils to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  def CeilTo(value: Double): Double = js.native
  def CeilTo(value: Double, place: Double): Double = js.native
  def CeilTo(value: Double, place: Double, base: integer): Double = js.native
  /**
    * Force a value within the boundaries by clamping it to the range `min`, `max`.
    * @param value The value to be clamped.
    * @param min The minimum bounds.
    * @param max The maximum bounds.
    */
  def Clamp(value: Double, min: Double, max: Double): Double = js.native
  /**
    * Convert the given angle from degrees, to the equivalent angle in radians.
    * @param degrees The angle (in degrees) to convert to radians.
    */
  def DegToRad(degrees: integer): Double = js.native
  /**
    * Calculates the positive difference of two given numbers.
    * @param a The first number in the calculation.
    * @param b The second number in the calculation.
    */
  def Difference(a: Double, b: Double): Double = js.native
  /**
    * Calculates the factorial of a given number for integer values greater than 0.
    * @param value A positive integer to calculate the factorial of.
    */
  def Factorial(value: Double): Double = js.native
  /**
    * Generate a random floating point number between the two given bounds, minimum inclusive, maximum exclusive.
    * @param min The lower bound for the float, inclusive.
    * @param max The upper bound for the float exclusive.
    */
  def FloatBetween(min: Double, max: Double): Double = js.native
  /**
    * Floors to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  def FloorTo(value: Double): Double = js.native
  def FloorTo(value: Double, place: integer): Double = js.native
  def FloorTo(value: Double, place: integer, base: integer): Double = js.native
  /**
    * Return a value based on the range between `min` and `max` and the percentage given.
    * @param percent A value between 0 and 1 representing the percentage.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  def FromPercent(percent: Double, min: Double): Double = js.native
  def FromPercent(percent: Double, min: Double, max: Double): Double = js.native
  /**
    * Calculate the speed required to cover a distance in the time given.
    * @param distance The distance to travel in pixels.
    * @param time The time, in ms, to cover the distance in.
    */
  def GetSpeed(distance: Double, time: integer): Double = js.native
  /**
    * Check if a given value is an even number.
    * @param value The number to perform the check with.
    */
  def IsEven(value: Double): Boolean = js.native
  /**
    * Check if a given value is an even number using a strict type check.
    * @param value The number to perform the check with.
    */
  def IsEvenStrict(value: Double): Boolean = js.native
  /**
    * Calculates a linear (interpolation) value over t.
    * @param p0 The first point.
    * @param p1 The second point.
    * @param t The percentage between p0 and p1 to return, represented as a number between 0 and 1.
    */
  def Linear(p0: Double, p1: Double, t: Double): Double = js.native
  /**
    * Add an `amount` to a `value`, limiting the maximum result to `max`.
    * @param value The value to add to.
    * @param amount The amount to add.
    * @param max The maximum value to return.
    */
  def MaxAdd(value: Double, amount: Double, max: Double): Double = js.native
  /**
    * Subtract an `amount` from `value`, limiting the minimum result to `min`.
    * @param value The value to subtract from.
    * @param amount The amount to subtract.
    * @param min The minimum value to return.
    */
  def MinSub(value: Double, amount: Double, min: Double): Double = js.native
  /**
    * Work out what percentage `value` is of the range between `min` and `max`.
    * If `max` isn't given then it will return the percentage of `value` to `min`.
    * 
    * You can optionally specify an `upperMax` value, which is a mid-way point in the range that represents 100%, after which the % starts to go down to zero again.
    * @param value The value to determine the percentage of.
    * @param min The minimum value.
    * @param max The maximum value.
    * @param upperMax The mid-way point in the range that represents 100%.
    */
  def Percent(value: Double, min: Double): Double = js.native
  def Percent(value: Double, min: Double, max: Double): Double = js.native
  def Percent(value: Double, min: Double, max: Double, upperMax: Double): Double = js.native
  /**
    * Convert the given angle in radians, to the equivalent angle in degrees.
    * @param radians The angle in radians to convert ot degrees.
    */
  def RadToDeg(radians: Double): integer = js.native
  /**
    * Compute a random unit vector.
    * 
    * Computes random values for the given vector between -1 and 1 that can be used to represent a direction.
    * 
    * Optionally accepts a scale value to scale the resulting vector by.
    * @param vector The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  def RandomXY(vector: typings.phaser.PhaserNs.MathNs.Vector2): typings.phaser.PhaserNs.MathNs.Vector2 = js.native
  def RandomXY(vector: typings.phaser.PhaserNs.MathNs.Vector2, scale: Double): typings.phaser.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Compute a random position vector in a spherical area, optionally defined by the given radius.
    * @param vec3 The Vector to compute random values for.
    * @param radius The radius. Default 1.
    */
  def RandomXYZ(vec3: typings.phaser.PhaserNs.MathNs.Vector3): typings.phaser.PhaserNs.MathNs.Vector3 = js.native
  def RandomXYZ(vec3: typings.phaser.PhaserNs.MathNs.Vector3, radius: Double): typings.phaser.PhaserNs.MathNs.Vector3 = js.native
  /**
    * Compute a random four-dimensional vector.
    * @param vec4 The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  def RandomXYZW(vec4: typings.phaser.PhaserNs.MathNs.Vector4): typings.phaser.PhaserNs.MathNs.Vector4 = js.native
  def RandomXYZW(vec4: typings.phaser.PhaserNs.MathNs.Vector4, scale: Double): typings.phaser.PhaserNs.MathNs.Vector4 = js.native
  def Rotate(point: js.Object, angle: Double): Point = js.native
  /**
    * Rotate a given point by a given angle around the origin (0, 0), in an anti-clockwise direction.
    * @param point The point to be rotated.
    * @param angle The angle to be rotated by in an anticlockwise direction.
    */
  def Rotate(point: Point, angle: Double): Point = js.native
  def RotateAround(point: js.Object, x: Double, y: Double, angle: Double): Point = js.native
  /**
    * Rotate a `point` around `x` and `y` by the given `angle`.
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    */
  def RotateAround(point: Point, x: Double, y: Double, angle: Double): Point = js.native
  def RotateAroundDistance(point: js.Object, x: Double, y: Double, angle: Double, distance: Double): Point = js.native
  /**
    * Rotate a `point` around `x` and `y` by the given `angle` and `distance`.
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  def RotateAroundDistance(point: Point, x: Double, y: Double, angle: Double, distance: Double): Point = js.native
  /**
    * Rotates a vector in place by axis angle.
    * 
    * This is the same as transforming a point by an
    * axis-angle quaternion, but it has higher precision.
    * @param vec The vector to be rotated.
    * @param axis The axis to rotate around.
    * @param radians The angle of rotation in radians.
    */
  def RotateVec3(
    vec: typings.phaser.PhaserNs.MathNs.Vector3,
    axis: typings.phaser.PhaserNs.MathNs.Vector3,
    radians: Double
  ): typings.phaser.PhaserNs.MathNs.Vector3 = js.native
  /**
    * Round a given number so it is further away from zero. That is, positive numbers are rounded up, and negative numbers are rounded down.
    * @param value The number to round.
    */
  def RoundAwayFromZero(value: Double): Double = js.native
  /**
    * Round a value to the given precision.
    * 
    * For example:
    * 
    * ```javascript
    * RoundTo(123.456, 0) = 123
    * RoundTo(123.456, 1) = 120
    * RoundTo(123.456, 2) = 100
    * ```
    * 
    * To round the decimal, i.e. to round to precision, pass in a negative `place`:
    * 
    * ```javascript
    * RoundTo(123.456789, 0) = 123
    * RoundTo(123.456789, -1) = 123.5
    * RoundTo(123.456789, -2) = 123.46
    * RoundTo(123.456789, -3) = 123.457
    * ```
    * @param value The value to round.
    * @param place The place to round to. Positive to round the units, negative to round the decimal. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  def RoundTo(value: Double): Double = js.native
  def RoundTo(value: Double, place: integer): Double = js.native
  def RoundTo(value: Double, place: integer, base: integer): Double = js.native
  /**
    * Generate a series of sine and cosine values.
    * @param length The number of values to generate.
    * @param sinAmp The sine value amplitude. Default 1.
    * @param cosAmp The cosine value amplitude. Default 1.
    * @param frequency The frequency of the values. Default 1.
    */
  def SinCosTableGenerator(length: Double): SinCosTable = js.native
  def SinCosTableGenerator(length: Double, sinAmp: Double): SinCosTable = js.native
  def SinCosTableGenerator(length: Double, sinAmp: Double, cosAmp: Double): SinCosTable = js.native
  def SinCosTableGenerator(length: Double, sinAmp: Double, cosAmp: Double, frequency: Double): SinCosTable = js.native
  /**
    * Calculate a smooth interpolation percentage of `x` between `min` and `max`.
    * 
    * The function receives the number `x` as an argument and returns 0 if `x` is less than or equal to the left edge,
    * 1 if `x` is greater than or equal to the right edge, and smoothly interpolates, using a Hermite polynomial,
    * between 0 and 1 otherwise.
    * @param x The input value.
    * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
    * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
    */
  def SmoothStep(x: Double, min: Double, max: Double): Double = js.native
  /**
    * Calculate a smoother interpolation percentage of `x` between `min` and `max`.
    * 
    * The function receives the number `x` as an argument and returns 0 if `x` is less than or equal to the left edge,
    * 1 if `x` is greater than or equal to the right edge, and smoothly interpolates, using a Hermite polynomial,
    * between 0 and 1 otherwise.
    * 
    * Produces an even smoother interpolation than {@link Phaser.Math.SmoothStep}.
    * @param x The input value.
    * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
    * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
    */
  def SmootherStep(x: Double, min: Double, max: Double): Double = js.native
  /**
    * Takes the `x` and `y` coordinates and transforms them into the same space as
    * defined by the position, rotation and scale values.
    * @param x The x coordinate to be transformed.
    * @param y The y coordinate to be transformed.
    * @param positionX Horizontal position of the transform point.
    * @param positionY Vertical position of the transform point.
    * @param rotation Rotation of the transform point, in radians.
    * @param scaleX Horizontal scale of the transform point.
    * @param scaleY Vertical scale of the transform point.
    * @param output The output vector, point or object for the translated coordinates.
    */
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double
  ): typings.phaser.PhaserNs.MathNs.Vector2 | Point | js.Object = js.native
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: js.Object
  ): typings.phaser.PhaserNs.MathNs.Vector2 | Point | js.Object = js.native
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: Point
  ): typings.phaser.PhaserNs.MathNs.Vector2 | Point | js.Object = js.native
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: typings.phaser.PhaserNs.MathNs.Vector2
  ): typings.phaser.PhaserNs.MathNs.Vector2 | Point | js.Object = js.native
  /**
    * Checks if the two values are within the given `tolerance` of each other.
    * @param a The first value to use in the calculation.
    * @param b The second value to use in the calculation.
    * @param tolerance The tolerance. Anything equal to or less than this value is considered as being within range.
    */
  def Within(a: Double, b: Double, tolerance: Double): Boolean = js.native
  /**
    * Wrap the given `value` between `min` and `max.
    * @param value The value to wrap.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  def Wrap(value: Double, min: Double, max: Double): Double = js.native
  @JSName("Angle")
  @js.native
  object AngleNs extends js.Object {
    /**
      * Find the angle of a segment from (x1, y1) -> (x2, y2).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    def Between(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    def BetweenPoints(point1: js.Object, point2: js.Object): Double = js.native
    def BetweenPoints(point1: js.Object, point2: Point): Double = js.native
    def BetweenPoints(point1: Point, point2: js.Object): Double = js.native
    /**
      * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
      * 
      * Calculates the angle of the vector from the first point to the second point.
      * @param point1 The first point.
      * @param point2 The second point.
      */
    def BetweenPoints(point1: Point, point2: Point): Double = js.native
    def BetweenPointsY(point1: js.Object, point2: js.Object): Double = js.native
    def BetweenPointsY(point1: js.Object, point2: Point): Double = js.native
    def BetweenPointsY(point1: Point, point2: js.Object): Double = js.native
    /**
      * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
      * 
      * The difference between this method and {@link Phaser.Math.Angle.BetweenPoints} is that this assumes the y coordinate
      * travels down the screen.
      * @param point1 The first point.
      * @param point2 The second point.
      */
    def BetweenPointsY(point1: Point, point2: Point): Double = js.native
    /**
      * Find the angle of a segment from (x1, y1) -> (x2, y2).
      * 
      * The difference between this method and {@link Phaser.Math.Angle.Between} is that this assumes the y coordinate
      * travels down the screen.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    def BetweenY(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    /**
      * Takes an angle in Phasers default clockwise format and converts it so that
      * 0 is North, 90 is West, 180 is South and 270 is East,
      * therefore running counter-clockwise instead of clockwise.
      * 
      * You can pass in the angle from a Game Object using:
      * 
      * ```javascript
      * var converted = CounterClockwise(gameobject.rotation);
      * ```
      * 
      * All values for this function are in radians.
      * @param angle The angle to convert, in radians.
      */
    def CounterClockwise(angle: Double): Double = js.native
    /**
      * Normalize an angle to the [0, 2pi] range.
      * @param angle The angle to normalize, in radians.
      */
    def Normalize(angle: Double): Double = js.native
    /**
      * Reverse the given angle.
      * @param angle The angle to reverse, in radians.
      */
    def Reverse(angle: Double): Double = js.native
    /**
      * Rotates `currentAngle` towards `targetAngle`, taking the shortest rotation distance. The `lerp` argument is the amount to rotate by in this call.
      * @param currentAngle The current angle, in radians.
      * @param targetAngle The target angle to rotate to, in radians.
      * @param lerp The lerp value to add to the current angle. Default 0.05.
      */
    def RotateTo(currentAngle: Double, targetAngle: Double): Double = js.native
    def RotateTo(currentAngle: Double, targetAngle: Double, lerp: Double): Double = js.native
    /**
      * Gets the shortest angle between `angle1` and `angle2`.
      * 
      * Both angles must be in the range -180 to 180, which is the same clamped
      * range that `sprite.angle` uses, so you can pass in two sprite angles to
      * this method and get the shortest angle back between the two of them.
      * 
      * The angle returned will be in the same range. If the returned angle is
      * greater than 0 then it's a counter-clockwise rotation, if < 0 then it's
      * a clockwise rotation.
      * 
      * TODO: Wrap the angles in this function?
      * @param angle1 The first angle in the range -180 to 180.
      * @param angle2 The second angle in the range -180 to 180.
      */
    def ShortestBetween(angle1: Double, angle2: Double): Double = js.native
    /**
      * Wrap an angle.
      * 
      * Wraps the angle to a value in the range of -PI to PI.
      * @param angle The angle to wrap, in radians.
      */
    def Wrap(angle: Double): Double = js.native
    /**
      * Wrap an angle in degrees.
      * 
      * Wraps the angle to a value in the range of -180 to 180.
      * @param angle The angle to wrap, in degrees.
      */
    def WrapDegrees(angle: Double): Double = js.native
  }
  
  @JSName("Distance")
  @js.native
  object DistanceNs extends js.Object {
    /**
      * Calculate the distance between two sets of coordinates (points).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    def Between(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    /**
      * Calculate the distance between two sets of coordinates (points) to the power of `pow`.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      * @param pow The exponent.
      */
    def Power(x1: Double, y1: Double, x2: Double, y2: Double, pow: Double): Double = js.native
    /**
      * Calculate the distance between two sets of coordinates (points), squared.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    def Squared(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  }
  
  @JSName("Easing")
  @js.native
  object EasingNs extends js.Object {
    @JSName("Back")
    @js.native
    object BackNs extends js.Object {
      /**
        * Back ease-in.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      def In(v: Double): Double = js.native
      def In(v: Double, overshoot: Double): Double = js.native
      /**
        * Back ease-in/out.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      def InOut(v: Double): Double = js.native
      def InOut(v: Double, overshoot: Double): Double = js.native
      /**
        * Back ease-out.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      def Out(v: Double): Double = js.native
      def Out(v: Double, overshoot: Double): Double = js.native
    }
    
    @JSName("Bounce")
    @js.native
    object BounceNs extends js.Object {
      /**
        * Bounce ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Bounce ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Bounce ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Circular")
    @js.native
    object CircularNs extends js.Object {
      /**
        * Circular ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Circular ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Circular ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Cubic")
    @js.native
    object CubicNs extends js.Object {
      /**
        * Cubic ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Cubic ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Cubic ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Elastic")
    @js.native
    object ElasticNs extends js.Object {
      /**
        * Elastic ease-in.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      def In(v: Double): Double = js.native
      def In(v: Double, amplitude: Double): Double = js.native
      def In(v: Double, amplitude: Double, period: Double): Double = js.native
      /**
        * Elastic ease-in/out.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      def InOut(v: Double): Double = js.native
      def InOut(v: Double, amplitude: Double): Double = js.native
      def InOut(v: Double, amplitude: Double, period: Double): Double = js.native
      /**
        * Elastic ease-out.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      def Out(v: Double): Double = js.native
      def Out(v: Double, amplitude: Double): Double = js.native
      def Out(v: Double, amplitude: Double, period: Double): Double = js.native
    }
    
    @JSName("Expo")
    @js.native
    object ExpoNs extends js.Object {
      /**
        * Exponential ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Exponential ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Exponential ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Linear")
    @js.native
    object LinearNs extends js.Object {
      /**
        * Linear easing (no variation).
        * @param v The value to be tweened.
        */
      def Linear(v: Double): Double = js.native
    }
    
    @JSName("Quadratic")
    @js.native
    object QuadraticNs extends js.Object {
      /**
        * Quadratic ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Quadratic ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Quadratic ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Quartic")
    @js.native
    object QuarticNs extends js.Object {
      /**
        * Quartic ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Quartic ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Quartic ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Quintic")
    @js.native
    object QuinticNs extends js.Object {
      /**
        * Quintic ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Quintic ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Quintic ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Sine")
    @js.native
    object SineNs extends js.Object {
      /**
        * Sinusoidal ease-in.
        * @param v The value to be tweened.
        */
      def In(v: Double): Double = js.native
      /**
        * Sinusoidal ease-in/out.
        * @param v The value to be tweened.
        */
      def InOut(v: Double): Double = js.native
      /**
        * Sinusoidal ease-out.
        * @param v The value to be tweened.
        */
      def Out(v: Double): Double = js.native
    }
    
    @JSName("Stepped")
    @js.native
    object SteppedNs extends js.Object {
      /**
        * Stepped easing.
        * @param v The value to be tweened.
        * @param steps The number of steps in the ease. Default 1.
        */
      def Stepped(v: Double): Double = js.native
      def Stepped(v: Double, steps: Double): Double = js.native
    }
    
  }
  
  @JSName("Fuzzy")
  @js.native
  object FuzzyNs extends js.Object {
    /**
      * Calculate the fuzzy ceiling of the given value.
      * @param value The value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    def Ceil(value: Double): Double = js.native
    def Ceil(value: Double, epsilon: Double): Double = js.native
    /**
      * Check whether the given values are fuzzily equal.
      * 
      * Two numbers are fuzzily equal if their difference is less than `epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    def Equal(a: Double, b: Double): Boolean = js.native
    def Equal(a: Double, b: Double, epsilon: Double): Boolean = js.native
    /**
      * Calculate the fuzzy floor of the given value.
      * @param value The value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    def Floor(value: Double): Double = js.native
    def Floor(value: Double, epsilon: Double): Double = js.native
    /**
      * Check whether `a` is fuzzily greater than `b`.
      * 
      * `a` is fuzzily greater than `b` if it is more than `b - epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    def GreaterThan(a: Double, b: Double): Boolean = js.native
    def GreaterThan(a: Double, b: Double, epsilon: Double): Boolean = js.native
    /**
      * Check whether `a` is fuzzily less than `b`.
      * 
      * `a` is fuzzily less than `b` if it is less than `b + epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    def LessThan(a: Double, b: Double): Boolean = js.native
    def LessThan(a: Double, b: Double, epsilon: Double): Boolean = js.native
  }
  
  @JSName("Interpolation")
  @js.native
  object InterpolationNs extends js.Object {
    /**
      * A bezier interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    def Bezier(v: js.Array[Double], k: Double): Double = js.native
    /**
      * A Catmull-Rom interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    def CatmullRom(v: js.Array[Double], k: Double): Double = js.native
    /**
      * A cubic bezier interpolation method.
      * 
      * https://medium.com/@adrian_cooney/bezier-interpolation-13b68563313a
      * @param t The percentage of interpolation, between 0 and 1.
      * @param p0 The start point.
      * @param p1 The first control point.
      * @param p2 The second control point.
      * @param p3 The end point.
      */
    def CubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    /**
      * A linear interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    def Linear(v: js.Array[Double], k: Double): Double = js.native
    /**
      * A quadratic bezier interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param p0 The start point.
      * @param p1 The control point.
      * @param p2 The end point.
      */
    def QuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
    /**
      * A Smooth Step interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
      * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
      */
    def SmoothStep(t: Double, min: Double, max: Double): Double = js.native
    /**
      * A Smoother Step interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
      * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
      */
    def SmootherStep(t: Double, min: Double, max: Double): Double = js.native
  }
  
  @JSName("Pow2")
  @js.native
  object Pow2Ns extends js.Object {
    /**
      * Returns the nearest power of 2 to the given `value`.
      * @param value The value.
      */
    def GetPowerOfTwo(value: Double): integer = js.native
    /**
      * Checks if the given `width` and `height` are a power of two.
      * Useful for checking texture dimensions.
      * @param width The width.
      * @param height The height.
      */
    def IsSizePowerOfTwo(width: Double, height: Double): Boolean = js.native
    /**
      * Tests the value and returns `true` if it is a power of two.
      * @param value The value to check if it's a power of two.
      */
    def IsValuePowerOfTwo(value: Double): Boolean = js.native
  }
  
  @JSName("Snap")
  @js.native
  object SnapNs extends js.Object {
    /**
      * Snap a value to nearest grid slice, using ceil.
      * 
      * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `15`.
      * As will `14` snap to `15`... but `16` will snap to `20`.
      * @param value The value to snap.
      * @param gap The interval gap of the grid.
      * @param start Optional starting offset for gap. Default 0.
      * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
      */
    def Ceil(value: Double, gap: Double): Double = js.native
    def Ceil(value: Double, gap: Double, start: Double): Double = js.native
    def Ceil(value: Double, gap: Double, start: Double, divide: Boolean): Double = js.native
    /**
      * Snap a value to nearest grid slice, using floor.
      * 
      * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `10`.
      * As will `14` snap to `10`... but `16` will snap to `15`.
      * @param value The value to snap.
      * @param gap The interval gap of the grid.
      * @param start Optional starting offset for gap. Default 0.
      * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
      */
    def Floor(value: Double, gap: Double): Double = js.native
    def Floor(value: Double, gap: Double, start: Double): Double = js.native
    def Floor(value: Double, gap: Double, start: Double, divide: Boolean): Double = js.native
    /**
      * Snap a value to nearest grid slice, using rounding.
      * 
      * Example: if you have an interval gap of `5` and a position of `12`... you will snap to `10` whereas `14` will snap to `15`.
      * @param value The value to snap.
      * @param gap The interval gap of the grid.
      * @param start Optional starting offset for gap. Default 0.
      * @param divide If `true` it will divide the snapped value by the gap before returning. Default false.
      */
    def To(value: Double, gap: Double): Double = js.native
    def To(value: Double, gap: Double, start: Double): Double = js.native
    def To(value: Double, gap: Double, start: Double, divide: Boolean): Double = js.native
  }
  
  /* static members */
  @js.native
  object Vector2 extends js.Object {
    /**
      * A static down Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val DOWN: typings.phaser.PhaserNs.MathNs.Vector2 = js.native
    /**
      * A static left Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val LEFT: typings.phaser.PhaserNs.MathNs.Vector2 = js.native
    /**
      * A static one Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val ONE: typings.phaser.PhaserNs.MathNs.Vector2 = js.native
    /**
      * A static right Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val RIGHT: typings.phaser.PhaserNs.MathNs.Vector2 = js.native
    /**
      * A static up Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val UP: typings.phaser.PhaserNs.MathNs.Vector2 = js.native
    /**
      * A static zero Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val ZERO: typings.phaser.PhaserNs.MathNs.Vector2 = js.native
  }
  
  /* static members */
  @js.native
  object Vector3 extends js.Object {
    /**
      * A static back Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val BACK: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
    /**
      * A static down Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val DOWN: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
    /**
      * A static forward Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val FORWARD: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
    /**
      * A static left Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val LEFT: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
    /**
      * A static one Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val ONE: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
    /**
      * A static right Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val RIGHT: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
    /**
      * A static up Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val UP: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
    /**
      * A static zero Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    val ZERO: typings.phaser.PhaserNs.MathNs.Vector3 = js.native
  }
  
}

