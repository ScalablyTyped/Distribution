package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  /** End previous animation. */
  var animationEnd: js.UndefOr[AnimationEnd] = js.undefined
  
  /** Display overlay object with fade animation. */
  var animationFade: js.UndefOr[AnimationFade] = js.undefined
  
  /** Display static overlay object. */
  var animationStatic: js.UndefOr[AnimationStatic] = js.undefined
}
object Animation {
  
  inline def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setAnimationEnd(value: AnimationEnd): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    inline def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    inline def setAnimationFade(value: AnimationFade): Self = StObject.set(x, "animationFade", value.asInstanceOf[js.Any])
    
    inline def setAnimationFadeUndefined: Self = StObject.set(x, "animationFade", js.undefined)
    
    inline def setAnimationStatic(value: AnimationStatic): Self = StObject.set(x, "animationStatic", value.asInstanceOf[js.Any])
    
    inline def setAnimationStaticUndefined: Self = StObject.set(x, "animationStatic", js.undefined)
  }
}
