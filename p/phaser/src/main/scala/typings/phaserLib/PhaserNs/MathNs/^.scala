package typings
package phaserLib.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Math")
@js.native
object ^ extends js.Object {
  /**
    * For converting degrees to radians (PI / 180)
    */
  var DEG_TO_RAD: scala.Double = js.native
  /**
    * An epsilon value (1.0e-6)
    */
  var EPSILON: scala.Double = js.native
  /**
    * The value of PI * 2.
    */
  var PI2: scala.Double = js.native
  /**
    * For converting radians to degrees (180 / PI)
    */
  var RAD_TO_DEG: scala.Double = js.native
  /**
    * An instance of the Random Number Generator.
    * This is not set until the Game boots.
    */
  var RND: RandomDataGenerator = js.native
  /**
    * The value of PI * 0.5.
    */
  var TAU: scala.Double = js.native
  /**
    * Calculate the mean average of the given values.
    * @param values The values to average.
    */
  def Average(values: js.Array[scala.Double]): scala.Double = js.native
  /**
    * [description]
    * @param n [description]
    * @param i [description]
    */
  def Bernstein(n: scala.Double, i: scala.Double): scala.Double = js.native
  /**
    * Compute a random integer between the `min` and `max` values, inclusive.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  def Between(min: phaserLib.integer, max: phaserLib.integer): phaserLib.integer = js.native
  /**
    * Calculates a Catmull-Rom value.
    * @param t [description]
    * @param p0 [description]
    * @param p1 [description]
    * @param p2 [description]
    * @param p3 [description]
    */
  def CatmullRom(t: scala.Double, p0: scala.Double, p1: scala.Double, p2: scala.Double, p3: scala.Double): scala.Double = js.native
  /**
    * Ceils to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  def CeilTo(value: scala.Double): scala.Double = js.native
  def CeilTo(value: scala.Double, place: scala.Double): scala.Double = js.native
  def CeilTo(value: scala.Double, place: scala.Double, base: phaserLib.integer): scala.Double = js.native
  /**
    * Force a value within the boundaries by clamping it to the range `min`, `max`.
    * @param value The value to be clamped.
    * @param min The minimum bounds.
    * @param max The maximum bounds.
    */
  def Clamp(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Convert the given angle from degrees, to the equivalent angle in radians.
    * @param degrees The angle (in degrees) to convert to radians.
    */
  def DegToRad(degrees: phaserLib.integer): scala.Double = js.native
  /**
    * Calculates the positive difference of two given numbers.
    * @param a The first number in the calculation.
    * @param b The second number in the calculation.
    */
  def Difference(a: scala.Double, b: scala.Double): scala.Double = js.native
  /**
    * Calculates the factorial of a given number for integer values greater than 0.
    * @param value A positive integer to calculate the factorial of.
    */
  def Factorial(value: scala.Double): scala.Double = js.native
  /**
    * Generate a random floating point number between the two given bounds, minimum inclusive, maximum exclusive.
    * @param min The lower bound for the float, inclusive.
    * @param max The upper bound for the float exclusive.
    */
  def FloatBetween(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Floors to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  def FloorTo(value: scala.Double): scala.Double = js.native
  def FloorTo(value: scala.Double, place: phaserLib.integer): scala.Double = js.native
  def FloorTo(value: scala.Double, place: phaserLib.integer, base: phaserLib.integer): scala.Double = js.native
  /**
    * Return a value based on the range between `min` and `max` and the percentage given.
    * @param percent A value between 0 and 1 representing the percentage.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  def FromPercent(percent: scala.Double, min: scala.Double): scala.Double = js.native
  def FromPercent(percent: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Calculate the speed required to cover a distance in the time given.
    * @param distance The distance to travel in pixels.
    * @param time The time, in ms, to cover the distance in.
    */
  def GetSpeed(distance: scala.Double, time: phaserLib.integer): scala.Double = js.native
  /**
    * Check if a given value is an even number.
    * @param value The number to perform the check with.
    */
  def IsEven(value: scala.Double): scala.Boolean = js.native
  /**
    * Check if a given value is an even number using a strict type check.
    * @param value The number to perform the check with.
    */
  def IsEvenStrict(value: scala.Double): scala.Boolean = js.native
  /**
    * Calculates a linear (interpolation) value over t.
    * @param p0 The first point.
    * @param p1 The second point.
    * @param t The percentage between p0 and p1 to return, represented as a number between 0 and 1.
    */
  def Linear(p0: scala.Double, p1: scala.Double, t: scala.Double): scala.Double = js.native
  /**
    * Add an `amount` to a `value`, limiting the maximum result to `max`.
    * @param value The value to add to.
    * @param amount The amount to add.
    * @param max The maximum value to return.
    */
  def MaxAdd(value: scala.Double, amount: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * Subtract an `amount` from `value`, limiting the minimum result to `min`.
    * @param value The value to subtract from.
    * @param amount The amount to subtract.
    * @param min The minimum value to return.
    */
  def MinSub(value: scala.Double, amount: scala.Double, min: scala.Double): scala.Double = js.native
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
  def Percent(value: scala.Double, min: scala.Double): scala.Double = js.native
  def Percent(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  def Percent(value: scala.Double, min: scala.Double, max: scala.Double, upperMax: scala.Double): scala.Double = js.native
  /**
    * Convert the given angle in radians, to the equivalent angle in degrees.
    * @param radians The angle in radians to convert ot degrees.
    */
  def RadToDeg(radians: scala.Double): phaserLib.integer = js.native
  /**
    * Compute a random unit vector.
    * 
    * Computes random values for the given vector between -1 and 1 that can be used to represent a direction.
    * 
    * Optionally accepts a scale value to scale the resulting vector by.
    * @param vector The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  def RandomXY(vector: Vector2): Vector2 = js.native
  def RandomXY(vector: Vector2, scale: scala.Double): Vector2 = js.native
  /**
    * Compute a random position vector in a spherical area, optionally defined by the given radius.
    * @param vec3 The Vector to compute random values for.
    * @param radius The radius. Default 1.
    */
  def RandomXYZ(vec3: Vector3): Vector3 = js.native
  def RandomXYZ(vec3: Vector3, radius: scala.Double): Vector3 = js.native
  /**
    * Compute a random four-dimensional vector.
    * @param vec4 The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  def RandomXYZW(vec4: Vector4): Vector4 = js.native
  def RandomXYZW(vec4: Vector4, scale: scala.Double): Vector4 = js.native
  def Rotate(point: js.Object, angle: scala.Double): phaserLib.PhaserNs.GeomNs.Point = js.native
  /**
    * Rotate a given point by a given angle around the origin (0, 0), in an anti-clockwise direction.
    * @param point The point to be rotated.
    * @param angle The angle to be rotated by in an anticlockwise direction.
    */
  def Rotate(point: phaserLib.PhaserNs.GeomNs.Point, angle: scala.Double): phaserLib.PhaserNs.GeomNs.Point = js.native
  def RotateAround(point: js.Object, x: scala.Double, y: scala.Double, angle: scala.Double): phaserLib.PhaserNs.GeomNs.Point = js.native
  /**
    * Rotate a `point` around `x` and `y` by the given `angle`.
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    */
  def RotateAround(point: phaserLib.PhaserNs.GeomNs.Point, x: scala.Double, y: scala.Double, angle: scala.Double): phaserLib.PhaserNs.GeomNs.Point = js.native
  def RotateAroundDistance(point: js.Object, x: scala.Double, y: scala.Double, angle: scala.Double, distance: scala.Double): phaserLib.PhaserNs.GeomNs.Point = js.native
  /**
    * Rotate a `point` around `x` and `y` by the given `angle` and `distance`.
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  def RotateAroundDistance(
    point: phaserLib.PhaserNs.GeomNs.Point,
    x: scala.Double,
    y: scala.Double,
    angle: scala.Double,
    distance: scala.Double
  ): phaserLib.PhaserNs.GeomNs.Point = js.native
  /**
    * Rotates a vector in place by axis angle.
    * 
    * This is the same as transforming a point by an
    * axis-angle quaternion, but it has higher precision.
    * @param vec The vector to be rotated.
    * @param axis The axis to rotate around.
    * @param radians The angle of rotation in radians.
    */
  def RotateVec3(vec: Vector3, axis: Vector3, radians: scala.Double): Vector3 = js.native
  /**
    * Round a given number so it is further away from zero. That is, positive numbers are rounded up, and negative numbers are rounded down.
    * @param value The number to round.
    */
  def RoundAwayFromZero(value: scala.Double): scala.Double = js.native
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
  def RoundTo(value: scala.Double): scala.Double = js.native
  def RoundTo(value: scala.Double, place: phaserLib.integer): scala.Double = js.native
  def RoundTo(value: scala.Double, place: phaserLib.integer, base: phaserLib.integer): scala.Double = js.native
  /**
    * Generate a series of sine and cosine values.
    * @param length The number of values to generate.
    * @param sinAmp The sine value amplitude. Default 1.
    * @param cosAmp The cosine value amplitude. Default 1.
    * @param frequency The frequency of the values. Default 1.
    */
  def SinCosTableGenerator(length: scala.Double): phaserLib.PhaserNs.TypesNs.MathNs.SinCosTable = js.native
  def SinCosTableGenerator(length: scala.Double, sinAmp: scala.Double): phaserLib.PhaserNs.TypesNs.MathNs.SinCosTable = js.native
  def SinCosTableGenerator(length: scala.Double, sinAmp: scala.Double, cosAmp: scala.Double): phaserLib.PhaserNs.TypesNs.MathNs.SinCosTable = js.native
  def SinCosTableGenerator(length: scala.Double, sinAmp: scala.Double, cosAmp: scala.Double, frequency: scala.Double): phaserLib.PhaserNs.TypesNs.MathNs.SinCosTable = js.native
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
  def SmoothStep(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
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
  def SmootherStep(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
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
    x: scala.Double,
    y: scala.Double,
    positionX: scala.Double,
    positionY: scala.Double,
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double
  ): Vector2 | phaserLib.PhaserNs.GeomNs.Point | js.Object = js.native
  def TransformXY(
    x: scala.Double,
    y: scala.Double,
    positionX: scala.Double,
    positionY: scala.Double,
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    output: js.Object
  ): Vector2 | phaserLib.PhaserNs.GeomNs.Point | js.Object = js.native
  def TransformXY(
    x: scala.Double,
    y: scala.Double,
    positionX: scala.Double,
    positionY: scala.Double,
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    output: phaserLib.PhaserNs.GeomNs.Point
  ): Vector2 | phaserLib.PhaserNs.GeomNs.Point | js.Object = js.native
  def TransformXY(
    x: scala.Double,
    y: scala.Double,
    positionX: scala.Double,
    positionY: scala.Double,
    rotation: scala.Double,
    scaleX: scala.Double,
    scaleY: scala.Double,
    output: Vector2
  ): Vector2 | phaserLib.PhaserNs.GeomNs.Point | js.Object = js.native
  /**
    * Checks if the two values are within the given `tolerance` of each other.
    * @param a The first value to use in the calculation.
    * @param b The second value to use in the calculation.
    * @param tolerance The tolerance. Anything equal to or less than this value is considered as being within range.
    */
  def Within(a: scala.Double, b: scala.Double, tolerance: scala.Double): scala.Boolean = js.native
  /**
    * Wrap the given `value` between `min` and `max.
    * @param value The value to wrap.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  def Wrap(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
}

