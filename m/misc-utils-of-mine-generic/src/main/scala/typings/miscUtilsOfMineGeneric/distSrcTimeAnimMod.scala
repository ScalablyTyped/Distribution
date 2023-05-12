package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.distSrcTypeMod.Fn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeAnimMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/anim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate(param0: AnimateOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  object easing {
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time/anim", "easing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * “bow shooting”. First we “pull the bowstring”, and then “shoot”.
      * @param x “elasticity coefficient”. The distance of “bowstring pulling” is defined by it. Default value 1.5.
      */
    inline def back(): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    inline def back(x: Double): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("back")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    
    inline def bounceEaseInOut(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceEaseInOut")().asInstanceOf[Timing]
    
    /**
      * Imagine we are dropping a ball. It falls down, then bounces back a few times and stops. The bounce function does the same, but in the reverse order: “bouncing” starts immediately.
      * */
    inline def bounceEasyOut(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceEasyOut")().asInstanceOf[Timing]
    
    inline def easeInBounce(): TimingObject = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInBounce")().asInstanceOf[TimingObject]
    
    inline def easeInCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInCubic")().asInstanceOf[Timing]
    
    inline def easeInElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInElastic")().asInstanceOf[Timing]
    
    inline def easeInExpo(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInExpo")().asInstanceOf[Timing]
    
    inline def easeInOutBack(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBack")().asInstanceOf[Timing]
    
    inline def easeInOutBounce(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutBounce")().asInstanceOf[Timing]
    
    inline def easeInOutCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutCubic")().asInstanceOf[Timing]
    
    inline def easeInOutElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutElastic")().asInstanceOf[Timing]
    
    inline def easeInOutExpo(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutExpo")().asInstanceOf[Timing]
    
    inline def easeInOutQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuad")().asInstanceOf[Timing]
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time/anim", "easing.easeInOutQuart")
    @js.native
    val easeInOutQuart: Timing = js.native
    
    inline def easeInOutQuint(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOutQuint")().asInstanceOf[Timing]
    
    inline def easeInQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInQuad")().asInstanceOf[Timing]
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time/anim", "easing.easeInQuart")
    @js.native
    val easeInQuart: Timing = js.native
    
    @JSImport("misc-utils-of-mine-generic/dist/src/time/anim", "easing.easeInQuint")
    @js.native
    val easeInQuint: Timing = js.native
    
    inline def easeInSine(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInSine")().asInstanceOf[Timing]
    
    inline def easeOutBack(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBack")().asInstanceOf[Timing]
    
    inline def easeOutBounce(): TimingObject = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutBounce")().asInstanceOf[TimingObject]
    
    inline def easeOutCubic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutCubic")().asInstanceOf[Timing]
    
    inline def easeOutElastic(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutElastic")().asInstanceOf[Timing]
    
    inline def easeOutQuad(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuad")().asInstanceOf[Timing]
    
    inline def easeOutQuint(): Timing = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuint")().asInstanceOf[Timing]
    
    /**
      * @param x “initial range”
      */
    inline def elastic(): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")().asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    inline def elastic(x: Double): js.Function1[/* timeFraction */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("elastic")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* timeFraction */ Double, Double]]
    
    /**
      * parabolic curve
      */
    inline def quad(timeFraction: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quad")(timeFraction.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  trait AnimateOptions extends StObject {
    
    def draw(n: Double): Unit
    
    var duration: Double
    
    var end: js.UndefOr[Fn[js.Array[Any], Any]] = js.undefined
    
    var lapse: js.UndefOr[Double] = js.undefined
    
    var timing: Timing | TimingObject
  }
  object AnimateOptions {
    
    inline def apply(draw: Double => Unit, duration: Double, timing: Timing | TimingObject): AnimateOptions = {
      val __obj = js.Dynamic.literal(draw = js.Any.fromFunction1(draw), duration = duration.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimateOptions] (val x: Self) extends AnyVal {
      
      inline def setDraw(value: Double => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: js.Array[Any] => Any): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setLapse(value: Double): Self = StObject.set(x, "lapse", value.asInstanceOf[js.Any])
      
      inline def setLapseUndefined: Self = StObject.set(x, "lapse", js.undefined)
      
      inline def setTiming(value: Timing | TimingObject): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingFunction5(
        value: (/* n */ Double, /* c */ js.UndefOr[Double], /* d */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "timing", js.Any.fromFunction5(value))
    }
  }
  
  type Timing = js.Function5[
    /* n */ Double, 
    /* c */ js.UndefOr[Double], 
    /* d */ js.UndefOr[Double], 
    /* x */ js.UndefOr[Double], 
    /* y */ js.UndefOr[Double], 
    Double
  ]
  
  trait TimingObject extends StObject {
    
    def fn(duration: Double): Timing
  }
  object TimingObject {
    
    inline def apply(fn: Double => Timing): TimingObject = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn))
      __obj.asInstanceOf[TimingObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimingObject] (val x: Self) extends AnyVal {
      
      inline def setFn(value: Double => Timing): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    }
  }
}
