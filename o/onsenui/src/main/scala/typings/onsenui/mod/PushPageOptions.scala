package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushPageOptions extends StObject {
  
  var animation: js.UndefOr[String] = js.native
  
  var animationOptions: js.UndefOr[js.Object] = js.native
  
  var callback: js.UndefOr[js.Function] = js.native
  
  var data: js.UndefOr[js.Object] = js.native
  
  var page: js.UndefOr[js.Any] = js.native
  
  var pageHTML: js.UndefOr[String] = js.native
}
object PushPageOptions {
  
  @scala.inline
  def apply(): PushPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushPageOptions]
  }
  
  @scala.inline
  implicit class PushPageOptionsMutableBuilder[Self <: PushPageOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageHTML(value: String): Self = StObject.set(x, "pageHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageHTMLUndefined: Self = StObject.set(x, "pageHTML", js.undefined)
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
