package typings.phaser.global.Phaser.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Math.Easing")
@js.native
object Easing extends js.Object {
  
  /**
    * Linear easing (no variation).
    * @param v The value to be tweened.
    */
  def Linear(v: Double): Double = js.native
  
  @js.native
  object Back extends js.Object {
    
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
  
  @js.native
  object Bounce extends js.Object {
    
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
  
  @js.native
  object Circular extends js.Object {
    
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
  
  @js.native
  object Cubic extends js.Object {
    
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
  
  @js.native
  object Elastic extends js.Object {
    
    /**
      * Elastic ease-in.
      * @param v The value to be tweened.
      * @param amplitude The amplitude of the elastic ease. Default 0.1.
      * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
      */
    def In(v: Double): Double = js.native
    def In(v: Double, amplitude: js.UndefOr[scala.Nothing], period: Double): Double = js.native
    def In(v: Double, amplitude: Double): Double = js.native
    def In(v: Double, amplitude: Double, period: Double): Double = js.native
    
    /**
      * Elastic ease-in/out.
      * @param v The value to be tweened.
      * @param amplitude The amplitude of the elastic ease. Default 0.1.
      * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
      */
    def InOut(v: Double): Double = js.native
    def InOut(v: Double, amplitude: js.UndefOr[scala.Nothing], period: Double): Double = js.native
    def InOut(v: Double, amplitude: Double): Double = js.native
    def InOut(v: Double, amplitude: Double, period: Double): Double = js.native
    
    /**
      * Elastic ease-out.
      * @param v The value to be tweened.
      * @param amplitude The amplitude of the elastic ease. Default 0.1.
      * @param period Sets how tight the sine-wave is, where smaller values are tighter waves, which result in more cycles. Default 0.1.
      */
    def Out(v: Double): Double = js.native
    def Out(v: Double, amplitude: js.UndefOr[scala.Nothing], period: Double): Double = js.native
    def Out(v: Double, amplitude: Double): Double = js.native
    def Out(v: Double, amplitude: Double, period: Double): Double = js.native
  }
  
  @js.native
  object Expo extends js.Object {
    
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
  
  @js.native
  object Quadratic extends js.Object {
    
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
  
  @js.native
  object Quartic extends js.Object {
    
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
  
  @js.native
  object Quintic extends js.Object {
    
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
  
  @js.native
  object Sine extends js.Object {
    
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
  
  @js.native
  object Stepped extends js.Object {
    
    /**
      * Stepped easing.
      * @param v The value to be tweened.
      * @param steps The number of steps in the ease. Default 1.
      */
    def apply(v: Double): Double = js.native
    def apply(v: Double, steps: Double): Double = js.native
  }
}
