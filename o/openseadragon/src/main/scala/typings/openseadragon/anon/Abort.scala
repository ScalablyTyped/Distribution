package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abort extends StObject {
  
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ajaxHeaders: js.UndefOr[String] = js.native
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.native
  
  var loadWithAjax: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
}
object Abort {
  
  @scala.inline
  def apply(): Abort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abort]
  }
  
  @scala.inline
  implicit class AbortMutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    @scala.inline
    def setAjaxHeaders(value: String): Self = StObject.set(x, "ajaxHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxHeadersUndefined: Self = StObject.set(x, "ajaxHeaders", js.undefined)
    
    @scala.inline
    def setAjaxWithCredentials(value: Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCrossOriginPolicy(value: String | Boolean): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    @scala.inline
    def setLoadWithAjax(value: String): Self = StObject.set(x, "loadWithAjax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadWithAjaxUndefined: Self = StObject.set(x, "loadWithAjax", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
