package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushPageOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.undefined
  
  var animationOptions: js.UndefOr[js.Object] = js.undefined
  
  var callback: js.UndefOr[js.Function] = js.undefined
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var page: js.UndefOr[js.Any] = js.undefined
  
  var pageHTML: js.UndefOr[String] = js.undefined
}
object PushPageOptions {
  
  inline def apply(): PushPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushPageOptions]
  }
  
  extension [Self <: PushPageOptions](x: Self) {
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: js.Object): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageHTML(value: String): Self = StObject.set(x, "pageHTML", value.asInstanceOf[js.Any])
    
    inline def setPageHTMLUndefined: Self = StObject.set(x, "pageHTML", js.undefined)
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
