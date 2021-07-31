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
  
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnd(value: AnimationEnd): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    @scala.inline
    def setAnimationFade(value: AnimationFade): Self = StObject.set(x, "animationFade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationFadeUndefined: Self = StObject.set(x, "animationFade", js.undefined)
    
    @scala.inline
    def setAnimationStatic(value: AnimationStatic): Self = StObject.set(x, "animationStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationStaticUndefined: Self = StObject.set(x, "animationStatic", js.undefined)
  }
}
