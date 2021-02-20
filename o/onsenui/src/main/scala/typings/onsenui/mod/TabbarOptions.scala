package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbarOptions extends StObject {
  
  /**
    * @description Animation name. Available animations are `"fade"`, `"slide"` and `"none"`.
    */
  var animation: js.UndefOr[String] = js.native
  
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var callback: js.UndefOr[js.Function] = js.native
  
  /**
    * @description If true the page will not be changed.
    */
  var keepPage: js.UndefOr[Boolean] = js.native
}
object TabbarOptions {
  
  @scala.inline
  def apply(): TabbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabbarOptions]
  }
  
  @scala.inline
  implicit class TabbarOptionsMutableBuilder[Self <: TabbarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: String): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setKeepPage(value: Boolean): Self = StObject.set(x, "keepPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepPageUndefined: Self = StObject.set(x, "keepPage", js.undefined)
  }
}
