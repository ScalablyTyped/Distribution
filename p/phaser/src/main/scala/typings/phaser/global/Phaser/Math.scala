package typings.phaser.global.Phaser

import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Types.Math.SinCosTable
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Math {
  
  @JSGlobal("Phaser.Math")
  @js.native
  val ^ : js.Any = js.native
  
  object Angle {
    
    /**
      * Find the angle of a segment from (x1, y1) -> (x2, y2).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    @JSGlobal("Phaser.Math.Angle.Between")
    @js.native
    def Between(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    
    /**
      * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
      * 
      * Calculates the angle of the vector from the first point to the second point.
      * @param point1 The first point.
      * @param point2 The second point.
      */
    @JSGlobal("Phaser.Math.Angle.BetweenPoints")
    @js.native
    def BetweenPoints(point1: Vector2Like, point2: Vector2Like): Double = js.native
    
    /**
      * Find the angle of a segment from (point1.x, point1.y) -> (point2.x, point2.y).
      * 
      * The difference between this method and {@link Phaser.Math.Angle.BetweenPoints} is that this assumes the y coordinate
      * travels down the screen.
      * @param point1 The first point.
      * @param point2 The second point.
      */
    @JSGlobal("Phaser.Math.Angle.BetweenPointsY")
    @js.native
    def BetweenPointsY(point1: Vector2Like, point2: Vector2Like): Double = js.native
    
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
    @JSGlobal("Phaser.Math.Angle.BetweenY")
    @js.native
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
    @JSGlobal("Phaser.Math.Angle.CounterClockwise")
    @js.native
    def CounterClockwise(angle: Double): Double = js.native
    
    /**
      * Normalize an angle to the [0, 2pi] range.
      * @param angle The angle to normalize, in radians.
      */
    @JSGlobal("Phaser.Math.Angle.Normalize")
    @js.native
    def Normalize(angle: Double): Double = js.native
    
    /**
      * Returns a random angle in the range [-pi, pi].
      */
    @JSGlobal("Phaser.Math.Angle.Random")
    @js.native
    def Random(): Double = js.native
    
    /**
      * Returns a random angle in the range [-180, 180].
      */
    @JSGlobal("Phaser.Math.Angle.RandomDegrees")
    @js.native
    def RandomDegrees(): Double = js.native
    
    /**
      * Reverse the given angle.
      * @param angle The angle to reverse, in radians.
      */
    @JSGlobal("Phaser.Math.Angle.Reverse")
    @js.native
    def Reverse(angle: Double): Double = js.native
    
    /**
      * Rotates `currentAngle` towards `targetAngle`, taking the shortest rotation distance. The `lerp` argument is the amount to rotate by in this call.
      * @param currentAngle The current angle, in radians.
      * @param targetAngle The target angle to rotate to, in radians.
      * @param lerp The lerp value to add to the current angle. Default 0.05.
      */
    @JSGlobal("Phaser.Math.Angle.RotateTo")
    @js.native
    def RotateTo(currentAngle: Double, targetAngle: Double): Double = js.native
    @JSGlobal("Phaser.Math.Angle.RotateTo")
    @js.native
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
    @JSGlobal("Phaser.Math.Angle.ShortestBetween")
    @js.native
    def ShortestBetween(angle1: Double, angle2: Double): Double = js.native
    
    /**
      * Wrap an angle.
      * 
      * Wraps the angle to a value in the range of -PI to PI.
      * @param angle The angle to wrap, in radians.
      */
    @JSGlobal("Phaser.Math.Angle.Wrap")
    @js.native
    def Wrap(angle: Double): Double = js.native
    
    /**
      * Wrap an angle in degrees.
      * 
      * Wraps the angle to a value in the range of -180 to 180.
      * @param angle The angle to wrap, in degrees.
      */
    @JSGlobal("Phaser.Math.Angle.WrapDegrees")
    @js.native
    def WrapDegrees(angle: Double): Double = js.native
  }
  
  /**
    * Calculate the mean average of the given values.
    * @param values The values to average.
    */
  @JSGlobal("Phaser.Math.Average")
  @js.native
  def Average(values: js.Array[Double]): Double = js.native
  
  /**
    * Calculates the Bernstein basis from the three factorial coefficients.
    * @param n The first value.
    * @param i The second value.
    */
  @JSGlobal("Phaser.Math.Bernstein")
  @js.native
  def Bernstein(n: Double, i: Double): Double = js.native
  
  /**
    * Compute a random integer between the `min` and `max` values, inclusive.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  @JSGlobal("Phaser.Math.Between")
  @js.native
  def Between(min: integer, max: integer): integer = js.native
  
  /**
    * Calculates a Catmull-Rom value from the given points, based on an alpha of 0.5.
    * @param t The amount to interpolate by.
    * @param p0 The first control point.
    * @param p1 The second control point.
    * @param p2 The third control point.
    * @param p3 The fourth control point.
    */
  @JSGlobal("Phaser.Math.CatmullRom")
  @js.native
  def CatmullRom(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
  
  /**
    * Ceils to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  @JSGlobal("Phaser.Math.CeilTo")
  @js.native
  def CeilTo(value: Double): Double = js.native
  @JSGlobal("Phaser.Math.CeilTo")
  @js.native
  def CeilTo(value: Double, place: js.UndefOr[scala.Nothing], base: integer): Double = js.native
  @JSGlobal("Phaser.Math.CeilTo")
  @js.native
  def CeilTo(value: Double, place: Double): Double = js.native
  @JSGlobal("Phaser.Math.CeilTo")
  @js.native
  def CeilTo(value: Double, place: Double, base: integer): Double = js.native
  
  /**
    * Force a value within the boundaries by clamping it to the range `min`, `max`.
    * @param value The value to be clamped.
    * @param min The minimum bounds.
    * @param max The maximum bounds.
    */
  @JSGlobal("Phaser.Math.Clamp")
  @js.native
  def Clamp(value: Double, min: Double, max: Double): Double = js.native
  
  /**
    * For converting degrees to radians (PI / 180)
    */
  @JSGlobal("Phaser.Math.DEG_TO_RAD")
  @js.native
  def DEG_TO_RAD: Double = js.native
  @scala.inline
  def DEG_TO_RAD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEG_TO_RAD")(x.asInstanceOf[js.Any])
  
  /**
    * Convert the given angle from degrees, to the equivalent angle in radians.
    * @param degrees The angle (in degrees) to convert to radians.
    */
  @JSGlobal("Phaser.Math.DegToRad")
  @js.native
  def DegToRad(degrees: integer): Double = js.native
  
  /**
    * Calculates the positive difference of two given numbers.
    * @param a The first number in the calculation.
    * @param b The second number in the calculation.
    */
  @JSGlobal("Phaser.Math.Difference")
  @js.native
  def Difference(a: Double, b: Double): Double = js.native
  
  object Distance {
    
    /**
      * Calculate the distance between two sets of coordinates (points).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    @JSGlobal("Phaser.Math.Distance.Between")
    @js.native
    def Between(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    
    /**
      * Calculate the distance between two points.
      * @param a The first point.
      * @param b The second point.
      */
    @JSGlobal("Phaser.Math.Distance.BetweenPoints")
    @js.native
    def BetweenPoints(a: Vector2Like, b: Vector2Like): Double = js.native
    
    /**
      * Calculate the squared distance between two points.
      * @param a The first point.
      * @param b The second point.
      */
    @JSGlobal("Phaser.Math.Distance.BetweenPointsSquared")
    @js.native
    def BetweenPointsSquared(a: Vector2Like, b: Vector2Like): Double = js.native
    
    /**
      * Calculate the Chebyshev distance between two sets of coordinates (points).
      * 
      * Chebyshev distance (or chessboard distance) is the maximum of the horizontal and vertical distances.
      * It's the effective distance when movement can be horizontal, vertical, or diagonal.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    @JSGlobal("Phaser.Math.Distance.Chebyshev")
    @js.native
    def Chebyshev(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    
    /**
      * Calculate the distance between two sets of coordinates (points) to the power of `pow`.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      * @param pow The exponent.
      */
    @JSGlobal("Phaser.Math.Distance.Power")
    @js.native
    def Power(x1: Double, y1: Double, x2: Double, y2: Double, pow: Double): Double = js.native
    
    /**
      * Calculate the snake distance between two sets of coordinates (points).
      * 
      * Snake distance (rectilinear distance, Manhattan distance) is the sum of the horizontal and vertical distances.
      * It's the effective distance when movement is allowed only horizontally or vertically (but not both).
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    @JSGlobal("Phaser.Math.Distance.Snake")
    @js.native
    def Snake(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    
    /**
      * Calculate the distance between two sets of coordinates (points), squared.
      * @param x1 The x coordinate of the first point.
      * @param y1 The y coordinate of the first point.
      * @param x2 The x coordinate of the second point.
      * @param y2 The y coordinate of the second point.
      */
    @JSGlobal("Phaser.Math.Distance.Squared")
    @js.native
    def Squared(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  }
  
  /**
    * An epsilon value (1.0e-6)
    */
  @JSGlobal("Phaser.Math.EPSILON")
  @js.native
  def EPSILON: Double = js.native
  @scala.inline
  def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
  
  object Easing {
    
    object Back {
      
      /**
        * Back ease-in.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      @JSGlobal("Phaser.Math.Easing.Back.In")
      @js.native
      def In(v: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Back.In")
      @js.native
      def In(v: Double, overshoot: Double): Double = js.native
      
      /**
        * Back ease-in/out.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      @JSGlobal("Phaser.Math.Easing.Back.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Back.InOut")
      @js.native
      def InOut(v: Double, overshoot: Double): Double = js.native
      
      /**
        * Back ease-out.
        * @param v The value to be tweened.
        * @param overshoot The overshoot amount. Default 1.70158.
        */
      @JSGlobal("Phaser.Math.Easing.Back.Out")
      @js.native
      def Out(v: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Back.Out")
      @js.native
      def Out(v: Double, overshoot: Double): Double = js.native
    }
    
    object Bounce {
      
      /**
        * Bounce ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Bounce.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Bounce ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Bounce.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Bounce ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Bounce.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    object Circular {
      
      /**
        * Circular ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Circular.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Circular ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Circular.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Circular ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Circular.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    object Cubic {
      
      /**
        * Cubic ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Cubic.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Cubic ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Cubic.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Cubic ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Cubic.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    object Elastic {
      
      /**
        * Elastic ease-in.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      @JSGlobal("Phaser.Math.Easing.Elastic.In")
      @js.native
      def In(v: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.In")
      @js.native
      def In(v: Double, amplitude: js.UndefOr[scala.Nothing], period: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.In")
      @js.native
      def In(v: Double, amplitude: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.In")
      @js.native
      def In(v: Double, amplitude: Double, period: Double): Double = js.native
      
      /**
        * Elastic ease-in/out.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      @JSGlobal("Phaser.Math.Easing.Elastic.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.InOut")
      @js.native
      def InOut(v: Double, amplitude: js.UndefOr[scala.Nothing], period: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.InOut")
      @js.native
      def InOut(v: Double, amplitude: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.InOut")
      @js.native
      def InOut(v: Double, amplitude: Double, period: Double): Double = js.native
      
      /**
        * Elastic ease-out.
        * @param v The value to be tweened.
        * @param amplitude The amplitude of the elastic ease. Default 0.1.
        * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
        */
      @JSGlobal("Phaser.Math.Easing.Elastic.Out")
      @js.native
      def Out(v: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.Out")
      @js.native
      def Out(v: Double, amplitude: js.UndefOr[scala.Nothing], period: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.Out")
      @js.native
      def Out(v: Double, amplitude: Double): Double = js.native
      @JSGlobal("Phaser.Math.Easing.Elastic.Out")
      @js.native
      def Out(v: Double, amplitude: Double, period: Double): Double = js.native
    }
    
    object Expo {
      
      /**
        * Exponential ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Expo.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Exponential ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Expo.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Exponential ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Expo.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    /**
      * Linear easing (no variation).
      * @param v The value to be tweened.
      */
    @JSGlobal("Phaser.Math.Easing.Linear")
    @js.native
    def Linear(v: Double): Double = js.native
    
    object Quadratic {
      
      /**
        * Quadratic ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quadratic.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Quadratic ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quadratic.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Quadratic ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quadratic.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    object Quartic {
      
      /**
        * Quartic ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quartic.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Quartic ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quartic.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Quartic ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quartic.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    object Quintic {
      
      /**
        * Quintic ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quintic.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Quintic ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quintic.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Quintic ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Quintic.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    object Sine {
      
      /**
        * Sinusoidal ease-in.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Sine.In")
      @js.native
      def In(v: Double): Double = js.native
      
      /**
        * Sinusoidal ease-in/out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Sine.InOut")
      @js.native
      def InOut(v: Double): Double = js.native
      
      /**
        * Sinusoidal ease-out.
        * @param v The value to be tweened.
        */
      @JSGlobal("Phaser.Math.Easing.Sine.Out")
      @js.native
      def Out(v: Double): Double = js.native
    }
    
    /**
      * Stepped easing.
      * @param v The value to be tweened.
      * @param steps The number of steps in the ease. Default 1.
      */
    @JSGlobal("Phaser.Math.Easing.Stepped")
    @js.native
    def Stepped(v: Double): Double = js.native
    @JSGlobal("Phaser.Math.Easing.Stepped")
    @js.native
    def Stepped(v: Double, steps: Double): Double = js.native
  }
  
  /**
    * Calculates the factorial of a given number for integer values greater than 0.
    * @param value A positive integer to calculate the factorial of.
    */
  @JSGlobal("Phaser.Math.Factorial")
  @js.native
  def Factorial(value: Double): Double = js.native
  
  /**
    * Generate a random floating point number between the two given bounds, minimum inclusive, maximum exclusive.
    * @param min The lower bound for the float, inclusive.
    * @param max The upper bound for the float exclusive.
    */
  @JSGlobal("Phaser.Math.FloatBetween")
  @js.native
  def FloatBetween(min: Double, max: Double): Double = js.native
  
  /**
    * Floors to some place comparative to a `base`, default is 10 for decimal place.
    * 
    * The `place` is represented by the power applied to `base` to get that place.
    * @param value The value to round.
    * @param place The place to round to. Default 0.
    * @param base The base to round in. Default is 10 for decimal. Default 10.
    */
  @JSGlobal("Phaser.Math.FloorTo")
  @js.native
  def FloorTo(value: Double): Double = js.native
  @JSGlobal("Phaser.Math.FloorTo")
  @js.native
  def FloorTo(value: Double, place: js.UndefOr[scala.Nothing], base: integer): Double = js.native
  @JSGlobal("Phaser.Math.FloorTo")
  @js.native
  def FloorTo(value: Double, place: integer): Double = js.native
  @JSGlobal("Phaser.Math.FloorTo")
  @js.native
  def FloorTo(value: Double, place: integer, base: integer): Double = js.native
  
  /**
    * Return a value based on the range between `min` and `max` and the percentage given.
    * @param percent A value between 0 and 1 representing the percentage.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  @JSGlobal("Phaser.Math.FromPercent")
  @js.native
  def FromPercent(percent: Double, min: Double): Double = js.native
  @JSGlobal("Phaser.Math.FromPercent")
  @js.native
  def FromPercent(percent: Double, min: Double, max: Double): Double = js.native
  
  object Fuzzy {
    
    /**
      * Calculate the fuzzy ceiling of the given value.
      * @param value The value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    @JSGlobal("Phaser.Math.Fuzzy.Ceil")
    @js.native
    def Ceil(value: Double): Double = js.native
    @JSGlobal("Phaser.Math.Fuzzy.Ceil")
    @js.native
    def Ceil(value: Double, epsilon: Double): Double = js.native
    
    /**
      * Check whether the given values are fuzzily equal.
      * 
      * Two numbers are fuzzily equal if their difference is less than `epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    @JSGlobal("Phaser.Math.Fuzzy.Equal")
    @js.native
    def Equal(a: Double, b: Double): Boolean = js.native
    @JSGlobal("Phaser.Math.Fuzzy.Equal")
    @js.native
    def Equal(a: Double, b: Double, epsilon: Double): Boolean = js.native
    
    /**
      * Calculate the fuzzy floor of the given value.
      * @param value The value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    @JSGlobal("Phaser.Math.Fuzzy.Floor")
    @js.native
    def Floor(value: Double): Double = js.native
    @JSGlobal("Phaser.Math.Fuzzy.Floor")
    @js.native
    def Floor(value: Double, epsilon: Double): Double = js.native
    
    /**
      * Check whether `a` is fuzzily greater than `b`.
      * 
      * `a` is fuzzily greater than `b` if it is more than `b - epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    @JSGlobal("Phaser.Math.Fuzzy.GreaterThan")
    @js.native
    def GreaterThan(a: Double, b: Double): Boolean = js.native
    @JSGlobal("Phaser.Math.Fuzzy.GreaterThan")
    @js.native
    def GreaterThan(a: Double, b: Double, epsilon: Double): Boolean = js.native
    
    /**
      * Check whether `a` is fuzzily less than `b`.
      * 
      * `a` is fuzzily less than `b` if it is less than `b + epsilon`.
      * @param a The first value.
      * @param b The second value.
      * @param epsilon The epsilon. Default 0.0001.
      */
    @JSGlobal("Phaser.Math.Fuzzy.LessThan")
    @js.native
    def LessThan(a: Double, b: Double): Boolean = js.native
    @JSGlobal("Phaser.Math.Fuzzy.LessThan")
    @js.native
    def LessThan(a: Double, b: Double, epsilon: Double): Boolean = js.native
  }
  
  /**
    * Calculate a per-ms speed from a distance and time (given in seconds).
    * @param distance The distance.
    * @param time The time, in seconds.
    */
  @JSGlobal("Phaser.Math.GetSpeed")
  @js.native
  def GetSpeed(distance: Double, time: integer): Double = js.native
  
  object Interpolation {
    
    /**
      * A bezier interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    @JSGlobal("Phaser.Math.Interpolation.Bezier")
    @js.native
    def Bezier(v: js.Array[Double], k: Double): Double = js.native
    
    /**
      * A Catmull-Rom interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    @JSGlobal("Phaser.Math.Interpolation.CatmullRom")
    @js.native
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
    @JSGlobal("Phaser.Math.Interpolation.CubicBezier")
    @js.native
    def CubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    
    /**
      * A linear interpolation method.
      * @param v The input array of values to interpolate between.
      * @param k The percentage of interpolation, between 0 and 1.
      */
    @JSGlobal("Phaser.Math.Interpolation.Linear")
    @js.native
    def Linear(v: js.Array[Double], k: Double): Double = js.native
    
    /**
      * A quadratic bezier interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param p0 The start point.
      * @param p1 The control point.
      * @param p2 The end point.
      */
    @JSGlobal("Phaser.Math.Interpolation.QuadraticBezier")
    @js.native
    def QuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
    
    /**
      * A Smooth Step interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
      * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
      */
    @JSGlobal("Phaser.Math.Interpolation.SmoothStep")
    @js.native
    def SmoothStep(t: Double, min: Double, max: Double): Double = js.native
    
    /**
      * A Smoother Step interpolation method.
      * @param t The percentage of interpolation, between 0 and 1.
      * @param min The minimum value, also known as the 'left edge', assumed smaller than the 'right edge'.
      * @param max The maximum value, also known as the 'right edge', assumed greater than the 'left edge'.
      */
    @JSGlobal("Phaser.Math.Interpolation.SmootherStep")
    @js.native
    def SmootherStep(t: Double, min: Double, max: Double): Double = js.native
  }
  
  /**
    * Check if a given value is an even number.
    * @param value The number to perform the check with.
    */
  @JSGlobal("Phaser.Math.IsEven")
  @js.native
  def IsEven(value: Double): Boolean = js.native
  
  /**
    * Check if a given value is an even number using a strict type check.
    * @param value The number to perform the check with.
    */
  @JSGlobal("Phaser.Math.IsEvenStrict")
  @js.native
  def IsEvenStrict(value: Double): Boolean = js.native
  
  /**
    * Calculates a linear (interpolation) value over t.
    * @param p0 The first point.
    * @param p1 The second point.
    * @param t The percentage between p0 and p1 to return, represented as a number between 0 and 1.
    */
  @JSGlobal("Phaser.Math.Linear")
  @js.native
  def Linear(p0: Double, p1: Double, t: Double): Double = js.native
  
  /**
    * The maximum safe integer this browser supports.
    * We use a const for backward compatibility with Internet Explorer.
    */
  @JSGlobal("Phaser.Math.MAX_SAFE_INTEGER")
  @js.native
  def MAX_SAFE_INTEGER: Double = js.native
  @scala.inline
  def MAX_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SAFE_INTEGER")(x.asInstanceOf[js.Any])
  
  /**
    * The minimum safe integer this browser supports.
    * We use a const for backward compatibility with Internet Explorer.
    */
  @JSGlobal("Phaser.Math.MIN_SAFE_INTEGER")
  @js.native
  def MIN_SAFE_INTEGER: Double = js.native
  @scala.inline
  def MIN_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SAFE_INTEGER")(x.asInstanceOf[js.Any])
  
  /**
    * A three-dimensional matrix.
    * 
    * Defaults to the identity matrix when instantiated.
    */
  @JSGlobal("Phaser.Math.Matrix3")
  @js.native
  /**
    * 
    * @param m Optional Matrix3 to copy values from.
    */
  class Matrix3 ()
    extends typings.phaser.Phaser.Math.Matrix3 {
    def this(m: typings.phaser.Phaser.Math.Matrix3) = this()
  }
  
  /**
    * A four-dimensional matrix.
    */
  @JSGlobal("Phaser.Math.Matrix4")
  @js.native
  /**
    * 
    * @param m Optional Matrix4 to copy values from.
    */
  class Matrix4 ()
    extends typings.phaser.Phaser.Math.Matrix4 {
    def this(m: typings.phaser.Phaser.Math.Matrix4) = this()
  }
  
  /**
    * Add an `amount` to a `value`, limiting the maximum result to `max`.
    * @param value The value to add to.
    * @param amount The amount to add.
    * @param max The maximum value to return.
    */
  @JSGlobal("Phaser.Math.MaxAdd")
  @js.native
  def MaxAdd(value: Double, amount: Double, max: Double): Double = js.native
  
  /**
    * Subtract an `amount` from `value`, limiting the minimum result to `min`.
    * @param value The value to subtract from.
    * @param amount The amount to subtract.
    * @param min The minimum value to return.
    */
  @JSGlobal("Phaser.Math.MinSub")
  @js.native
  def MinSub(value: Double, amount: Double, min: Double): Double = js.native
  
  /**
    * The value of PI * 2.
    */
  @JSGlobal("Phaser.Math.PI2")
  @js.native
  def PI2: Double = js.native
  @scala.inline
  def PI2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI2")(x.asInstanceOf[js.Any])
  
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
  @JSGlobal("Phaser.Math.Percent")
  @js.native
  def Percent(value: Double, min: Double): Double = js.native
  @JSGlobal("Phaser.Math.Percent")
  @js.native
  def Percent(value: Double, min: Double, max: js.UndefOr[scala.Nothing], upperMax: Double): Double = js.native
  @JSGlobal("Phaser.Math.Percent")
  @js.native
  def Percent(value: Double, min: Double, max: Double): Double = js.native
  @JSGlobal("Phaser.Math.Percent")
  @js.native
  def Percent(value: Double, min: Double, max: Double, upperMax: Double): Double = js.native
  
  object Pow2 {
    
    /**
      * Returns the nearest power of 2 to the given `value`.
      * @param value The value.
      */
    @JSGlobal("Phaser.Math.Pow2.GetNext")
    @js.native
    def GetNext(value: Double): integer = js.native
    
    /**
      * Checks if the given `width` and `height` are a power of two.
      * Useful for checking texture dimensions.
      * @param width The width.
      * @param height The height.
      */
    @JSGlobal("Phaser.Math.Pow2.IsSize")
    @js.native
    def IsSize(width: Double, height: Double): Boolean = js.native
    
    /**
      * Tests the value and returns `true` if it is a power of two.
      * @param value The value to check if it's a power of two.
      */
    @JSGlobal("Phaser.Math.Pow2.IsValue")
    @js.native
    def IsValue(value: Double): Boolean = js.native
  }
  
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
  class Quaternion ()
    extends typings.phaser.Phaser.Math.Quaternion {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
  }
  
  /**
    * For converting radians to degrees (180 / PI)
    */
  @JSGlobal("Phaser.Math.RAD_TO_DEG")
  @js.native
  def RAD_TO_DEG: Double = js.native
  @scala.inline
  def RAD_TO_DEG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAD_TO_DEG")(x.asInstanceOf[js.Any])
  
  /**
    * An instance of the Random Number Generator.
    * This is not set until the Game boots.
    */
  @JSGlobal("Phaser.Math.RND")
  @js.native
  def RND: typings.phaser.Phaser.Math.RandomDataGenerator = js.native
  @scala.inline
  def RND_=(x: typings.phaser.Phaser.Math.RandomDataGenerator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RND")(x.asInstanceOf[js.Any])
  
  /**
    * Convert the given angle in radians, to the equivalent angle in degrees.
    * @param radians The angle in radians to convert ot degrees.
    */
  @JSGlobal("Phaser.Math.RadToDeg")
  @js.native
  def RadToDeg(radians: Double): integer = js.native
  
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
  @JSGlobal("Phaser.Math.RandomDataGenerator")
  @js.native
  /**
    * 
    * @param seeds The seeds to use for the random number generator.
    */
  class RandomDataGenerator ()
    extends typings.phaser.Phaser.Math.RandomDataGenerator {
    def this(seeds: String) = this()
    def this(seeds: js.Array[String]) = this()
  }
  
  /**
    * Compute a random unit vector.
    * 
    * Computes random values for the given vector between -1 and 1 that can be used to represent a direction.
    * 
    * Optionally accepts a scale value to scale the resulting vector by.
    * @param vector The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  @JSGlobal("Phaser.Math.RandomXY")
  @js.native
  def RandomXY(vector: typings.phaser.Phaser.Math.Vector2): typings.phaser.Phaser.Math.Vector2 = js.native
  @JSGlobal("Phaser.Math.RandomXY")
  @js.native
  def RandomXY(vector: typings.phaser.Phaser.Math.Vector2, scale: Double): typings.phaser.Phaser.Math.Vector2 = js.native
  
  /**
    * Compute a random position vector in a spherical area, optionally defined by the given radius.
    * @param vec3 The Vector to compute random values for.
    * @param radius The radius. Default 1.
    */
  @JSGlobal("Phaser.Math.RandomXYZ")
  @js.native
  def RandomXYZ(vec3: typings.phaser.Phaser.Math.Vector3): typings.phaser.Phaser.Math.Vector3 = js.native
  @JSGlobal("Phaser.Math.RandomXYZ")
  @js.native
  def RandomXYZ(vec3: typings.phaser.Phaser.Math.Vector3, radius: Double): typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * Compute a random four-dimensional vector.
    * @param vec4 The Vector to compute random values for.
    * @param scale The scale of the random values. Default 1.
    */
  @JSGlobal("Phaser.Math.RandomXYZW")
  @js.native
  def RandomXYZW(vec4: typings.phaser.Phaser.Math.Vector4): typings.phaser.Phaser.Math.Vector4 = js.native
  @JSGlobal("Phaser.Math.RandomXYZW")
  @js.native
  def RandomXYZW(vec4: typings.phaser.Phaser.Math.Vector4, scale: Double): typings.phaser.Phaser.Math.Vector4 = js.native
  
  @JSGlobal("Phaser.Math.Rotate")
  @js.native
  def Rotate(point: js.Object, angle: Double): Point = js.native
  /**
    * Rotate a given point by a given angle around the origin (0, 0), in an anti-clockwise direction.
    * @param point The point to be rotated.
    * @param angle The angle to be rotated by in an anticlockwise direction.
    */
  @JSGlobal("Phaser.Math.Rotate")
  @js.native
  def Rotate(point: Point, angle: Double): Point = js.native
  
  /**
    * Rotate a `point` around `x` and `y` to the given `angle`, at the same distance.
    * 
    * In polar notation, this maps a point from (r, t) to (r, angle), vs. the origin (x, y).
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    */
  @JSGlobal("Phaser.Math.RotateAround")
  @js.native
  def RotateAround[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double): T = js.native
  
  /**
    * Rotate a `point` around `x` and `y` by the given `angle` and `distance`.
    * 
    * In polar notation, this maps a point from (r, t) to (distance, t + angle), vs. the origin (x, y).
    * @param point The point to be rotated.
    * @param x The horizontal coordinate to rotate around.
    * @param y The vertical coordinate to rotate around.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  @JSGlobal("Phaser.Math.RotateAroundDistance")
  @js.native
  def RotateAroundDistance[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double, distance: Double): T = js.native
  
  /**
    * Position a `point` at the given `angle` and `distance` to (`x`, `y`).
    * @param point The point to be positioned.
    * @param x The horizontal coordinate to position from.
    * @param y The vertical coordinate to position from.
    * @param angle The angle of rotation in radians.
    * @param distance The distance from (x, y) to place the point at.
    */
  @JSGlobal("Phaser.Math.RotateTo")
  @js.native
  def RotateTo[T /* <: Vector2Like */](point: T, x: Double, y: Double, angle: Double, distance: Double): T = js.native
  
  /**
    * Rotates a vector in place by axis angle.
    * 
    * This is the same as transforming a point by an
    * axis-angle quaternion, but it has higher precision.
    * @param vec The vector to be rotated.
    * @param axis The axis to rotate around.
    * @param radians The angle of rotation in radians.
    */
  @JSGlobal("Phaser.Math.RotateVec3")
  @js.native
  def RotateVec3(vec: typings.phaser.Phaser.Math.Vector3, axis: typings.phaser.Phaser.Math.Vector3, radians: Double): typings.phaser.Phaser.Math.Vector3 = js.native
  
  /**
    * Round a given number so it is further away from zero. That is, positive numbers are rounded up, and negative numbers are rounded down.
    * @param value The number to round.
    */
  @JSGlobal("Phaser.Math.RoundAwayFromZero")
  @js.native
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
  @JSGlobal("Phaser.Math.RoundTo")
  @js.native
  def RoundTo(value: Double): Double = js.native
  @JSGlobal("Phaser.Math.RoundTo")
  @js.native
  def RoundTo(value: Double, place: js.UndefOr[scala.Nothing], base: integer): Double = js.native
  @JSGlobal("Phaser.Math.RoundTo")
  @js.native
  def RoundTo(value: Double, place: integer): Double = js.native
  @JSGlobal("Phaser.Math.RoundTo")
  @js.native
  def RoundTo(value: Double, place: integer, base: integer): Double = js.native
  
  /**
    * Generate a series of sine and cosine values.
    * @param length The number of values to generate.
    * @param sinAmp The sine value amplitude. Default 1.
    * @param cosAmp The cosine value amplitude. Default 1.
    * @param frequency The frequency of the values. Default 1.
    */
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
  def SinCosTableGenerator(length: Double): SinCosTable = js.native
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
  def SinCosTableGenerator(
    length: Double,
    sinAmp: js.UndefOr[scala.Nothing],
    cosAmp: js.UndefOr[scala.Nothing],
    frequency: Double
  ): SinCosTable = js.native
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
  def SinCosTableGenerator(length: Double, sinAmp: js.UndefOr[scala.Nothing], cosAmp: Double): SinCosTable = js.native
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
  def SinCosTableGenerator(length: Double, sinAmp: js.UndefOr[scala.Nothing], cosAmp: Double, frequency: Double): SinCosTable = js.native
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
  def SinCosTableGenerator(length: Double, sinAmp: Double): SinCosTable = js.native
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
  def SinCosTableGenerator(length: Double, sinAmp: Double, cosAmp: js.UndefOr[scala.Nothing], frequency: Double): SinCosTable = js.native
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
  def SinCosTableGenerator(length: Double, sinAmp: Double, cosAmp: Double): SinCosTable = js.native
  @JSGlobal("Phaser.Math.SinCosTableGenerator")
  @js.native
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
  @JSGlobal("Phaser.Math.SmoothStep")
  @js.native
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
  @JSGlobal("Phaser.Math.SmootherStep")
  @js.native
  def SmootherStep(x: Double, min: Double, max: Double): Double = js.native
  
  object Snap {
    
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
    @JSGlobal("Phaser.Math.Snap.Ceil")
    @js.native
    def Ceil(value: Double, gap: Double): Double = js.native
    @JSGlobal("Phaser.Math.Snap.Ceil")
    @js.native
    def Ceil(value: Double, gap: Double, start: js.UndefOr[scala.Nothing], divide: Boolean): Double = js.native
    @JSGlobal("Phaser.Math.Snap.Ceil")
    @js.native
    def Ceil(value: Double, gap: Double, start: Double): Double = js.native
    @JSGlobal("Phaser.Math.Snap.Ceil")
    @js.native
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
    @JSGlobal("Phaser.Math.Snap.Floor")
    @js.native
    def Floor(value: Double, gap: Double): Double = js.native
    @JSGlobal("Phaser.Math.Snap.Floor")
    @js.native
    def Floor(value: Double, gap: Double, start: js.UndefOr[scala.Nothing], divide: Boolean): Double = js.native
    @JSGlobal("Phaser.Math.Snap.Floor")
    @js.native
    def Floor(value: Double, gap: Double, start: Double): Double = js.native
    @JSGlobal("Phaser.Math.Snap.Floor")
    @js.native
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
    @JSGlobal("Phaser.Math.Snap.To")
    @js.native
    def To(value: Double, gap: Double): Double = js.native
    @JSGlobal("Phaser.Math.Snap.To")
    @js.native
    def To(value: Double, gap: Double, start: js.UndefOr[scala.Nothing], divide: Boolean): Double = js.native
    @JSGlobal("Phaser.Math.Snap.To")
    @js.native
    def To(value: Double, gap: Double, start: Double): Double = js.native
    @JSGlobal("Phaser.Math.Snap.To")
    @js.native
    def To(value: Double, gap: Double, start: Double, divide: Boolean): Double = js.native
  }
  
  /**
    * The value of PI * 0.5.
    */
  @JSGlobal("Phaser.Math.TAU")
  @js.native
  def TAU: Double = js.native
  @scala.inline
  def TAU_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAU")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a Vector2 containing the x and y position of the given index in a `width` x `height` sized grid.
    * 
    * For example, in a 6 x 4 grid, index 16 would equal x: 4 y: 2.
    * 
    * If the given index is out of range an empty Vector2 is returned.
    * @param index The position within the grid to get the x/y value for.
    * @param width The width of the grid.
    * @param height The height of the grid.
    * @param out An optional Vector2 to store the result in. If not given, a new Vector2 instance will be created.
    */
  @JSGlobal("Phaser.Math.ToXY")
  @js.native
  def ToXY(index: integer, width: integer, height: integer): typings.phaser.Phaser.Math.Vector2 = js.native
  @JSGlobal("Phaser.Math.ToXY")
  @js.native
  def ToXY(index: integer, width: integer, height: integer, out: typings.phaser.Phaser.Math.Vector2): typings.phaser.Phaser.Math.Vector2 = js.native
  
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
  @JSGlobal("Phaser.Math.TransformXY")
  @js.native
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double
  ): typings.phaser.Phaser.Math.Vector2 | Point | js.Object = js.native
  @JSGlobal("Phaser.Math.TransformXY")
  @js.native
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: js.Object
  ): typings.phaser.Phaser.Math.Vector2 | Point | js.Object = js.native
  @JSGlobal("Phaser.Math.TransformXY")
  @js.native
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: Point
  ): typings.phaser.Phaser.Math.Vector2 | Point | js.Object = js.native
  @JSGlobal("Phaser.Math.TransformXY")
  @js.native
  def TransformXY(
    x: Double,
    y: Double,
    positionX: Double,
    positionY: Double,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    output: typings.phaser.Phaser.Math.Vector2
  ): typings.phaser.Phaser.Math.Vector2 | Point | js.Object = js.native
  
  /**
    * A representation of a vector in 2D space.
    * 
    * A two-component vector.
    */
  @JSGlobal("Phaser.Math.Vector2")
  @js.native
  /**
    * 
    * @param x The x component, or an object with `x` and `y` properties.
    * @param y The y component.
    */
  class Vector2 ()
    extends typings.phaser.Phaser.Math.Vector2 {
    def this(x: Double) = this()
    def this(x: Vector2Like) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Vector2Like, y: Double) = this()
  }
  object Vector2 {
    
    /**
      * A static down Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.DOWN")
    @js.native
    val DOWN: typings.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static left Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.LEFT")
    @js.native
    val LEFT: typings.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static one Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.ONE")
    @js.native
    val ONE: typings.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static right Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.RIGHT")
    @js.native
    val RIGHT: typings.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static up Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.UP")
    @js.native
    val UP: typings.phaser.Phaser.Math.Vector2 = js.native
    
    /**
      * A static zero Vector2 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector2.ZERO")
    @js.native
    val ZERO: typings.phaser.Phaser.Math.Vector2 = js.native
  }
  
  /**
    * A representation of a vector in 3D space.
    * 
    * A three-component vector.
    */
  @JSGlobal("Phaser.Math.Vector3")
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    */
  class Vector3 ()
    extends typings.phaser.Phaser.Math.Vector3 {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
  }
  object Vector3 {
    
    /**
      * A static back Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.BACK")
    @js.native
    val BACK: typings.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static down Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.DOWN")
    @js.native
    val DOWN: typings.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static forward Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.FORWARD")
    @js.native
    val FORWARD: typings.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static left Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.LEFT")
    @js.native
    val LEFT: typings.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static one Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.ONE")
    @js.native
    val ONE: typings.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static right Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.RIGHT")
    @js.native
    val RIGHT: typings.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static up Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.UP")
    @js.native
    val UP: typings.phaser.Phaser.Math.Vector3 = js.native
    
    /**
      * A static zero Vector3 for use by reference.
      * 
      * This constant is meant for comparison operations and should not be modified directly.
      */
    /* static member */
    @JSGlobal("Phaser.Math.Vector3.ZERO")
    @js.native
    val ZERO: typings.phaser.Phaser.Math.Vector3 = js.native
  }
  
  /**
    * A representation of a vector in 4D space.
    * 
    * A four-component vector.
    */
  @JSGlobal("Phaser.Math.Vector4")
  @js.native
  /**
    * 
    * @param x The x component.
    * @param y The y component.
    * @param z The z component.
    * @param w The w component.
    */
  class Vector4 ()
    extends typings.phaser.Phaser.Math.Vector4 {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
  }
  
  /**
    * Checks if the two values are within the given `tolerance` of each other.
    * @param a The first value to use in the calculation.
    * @param b The second value to use in the calculation.
    * @param tolerance The tolerance. Anything equal to or less than this value is considered as being within range.
    */
  @JSGlobal("Phaser.Math.Within")
  @js.native
  def Within(a: Double, b: Double, tolerance: Double): Boolean = js.native
  
  /**
    * Wrap the given `value` between `min` and `max.
    * @param value The value to wrap.
    * @param min The minimum value.
    * @param max The maximum value.
    */
  @JSGlobal("Phaser.Math.Wrap")
  @js.native
  def Wrap(value: Double, min: Double, max: Double): Double = js.native
}
