package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.native
  
  var animationOptions: js.UndefOr[js.Object] = js.native
  
  var callback: js.UndefOr[js.Function] = js.native
}
object CarouselOptions {
  
  @scala.inline
  def apply(): CarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselOptions]
  }
  
  @scala.inline
  implicit class CarouselOptionsMutableBuilder[Self <: CarouselOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: js.Object): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
