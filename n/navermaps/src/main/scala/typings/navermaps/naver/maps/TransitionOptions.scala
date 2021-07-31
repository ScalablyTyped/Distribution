package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
}
object TransitionOptions {
  
  @scala.inline
  def apply(): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOptions]
  }
  
  @scala.inline
  implicit class TransitionOptionsMutableBuilder[Self <: TransitionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
