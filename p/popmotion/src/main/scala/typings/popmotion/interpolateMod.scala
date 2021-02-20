package typings.popmotion

import typings.popmotion.easingTypesMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolateMod {
  
  @JSImport("popmotion/lib/utils/interpolate", "interpolate")
  @js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T]): js.Function1[/* v */ Double, T] = js.native
  @JSImport("popmotion/lib/utils/interpolate", "interpolate")
  @js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): js.Function1[/* v */ Double, T] = js.native
  
  @js.native
  trait InterpolateOptions[T] extends StObject {
    
    var clamp: js.UndefOr[Boolean] = js.native
    
    var ease: js.UndefOr[MixEasing] = js.native
    
    var mixer: js.UndefOr[MixerFactory[T]] = js.native
  }
  object InterpolateOptions {
    
    @scala.inline
    def apply[T](): InterpolateOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolateOptions[T]]
    }
    
    @scala.inline
    implicit class InterpolateOptionsMutableBuilder[Self <: InterpolateOptions[_], T] (val x: Self with InterpolateOptions[T]) extends AnyVal {
      
      @scala.inline
      def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      @scala.inline
      def setEase(value: MixEasing): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseFunction1(value: /* v */ Double => Double): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setEaseVarargs(value: Easing*): Self = StObject.set(x, "ease", js.Array(value :_*))
      
      @scala.inline
      def setMixer(value: (T, T) => Mix[T]): Self = StObject.set(x, "mixer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMixerUndefined: Self = StObject.set(x, "mixer", js.undefined)
    }
  }
  
  type Mix[T] = js.Function1[/* v */ Double, T]
  
  type MixEasing = Easing | js.Array[Easing]
  
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, Mix[T]]
}
