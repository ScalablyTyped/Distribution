package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabbarOptions extends StObject {
  
  /**
    * @description Animation name. Available animations are `"fade"`, `"slide"` and `"none"`.
    */
  var animation: js.UndefOr[String] = js.undefined
  
  /**
    * @description Specify the animation's duration, delay and timing. E.g. `{duration: 0.2, delay: 0.4, timing: 'ease-in'}`.
    */
  var animationOptions: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  
  /**
    * @description If true the page will not be changed.
    */
  var keepPage: js.UndefOr[Boolean] = js.undefined
}
object TabbarOptions {
  
  inline def apply(): TabbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabbarOptions]
  }
  
  extension [Self <: TabbarOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: String): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setKeepPage(value: Boolean): Self = StObject.set(x, "keepPage", value.asInstanceOf[js.Any])
    
    inline def setKeepPageUndefined: Self = StObject.set(x, "keepPage", js.undefined)
  }
}
