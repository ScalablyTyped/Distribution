package typings.popmotion

import typings.popmotion.libEasingTypesMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsInterpolateMod {
  
  @JSImport("popmotion/lib/utils/interpolate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolate[T](input: js.Array[Double], output: js.Array[T]): js.Function1[/* v */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, T]]
  inline def interpolate[T](input: js.Array[Double], output: js.Array[T], hasIsClampEaseMixer: InterpolateOptions[T]): js.Function1[/* v */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], hasIsClampEaseMixer.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, T]]
  
  trait InterpolateOptions[T] extends StObject {
    
    var clamp: js.UndefOr[Boolean] = js.undefined
    
    var ease: js.UndefOr[MixEasing] = js.undefined
    
    var mixer: js.UndefOr[MixerFactory[T]] = js.undefined
  }
  object InterpolateOptions {
    
    inline def apply[T](): InterpolateOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolateOptions[T]]
    }
    
    extension [Self <: InterpolateOptions[?], T](x: Self & InterpolateOptions[T]) {
      
      inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setEase(value: MixEasing): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      inline def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
      
      inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      inline def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value*))
      
      inline def setMixer(value: (T, T) => Mix[T]): Self = StObject.set(x, "mixer", js.Any.fromFunction2(value))
      
      inline def setMixerUndefined: Self = StObject.set(x, "mixer", js.undefined)
    }
  }
  
  type Mix[T] = js.Function1[/* v */ Double, T]
  
  type MixEasing = Easing | js.Array[Easing]
  
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, Mix[T]]
}
