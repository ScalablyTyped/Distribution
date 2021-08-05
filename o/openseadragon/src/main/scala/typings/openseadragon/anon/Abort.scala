package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abort extends StObject {
  
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ajaxHeaders: js.UndefOr[String] = js.undefined
  
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.undefined
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var crossOriginPolicy: js.UndefOr[String | Boolean] = js.undefined
  
  var loadWithAjax: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object Abort {
  
  inline def apply(): Abort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Abort]
  }
  
  extension [Self <: Abort](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
    
    inline def setAjaxHeaders(value: String): Self = StObject.set(x, "ajaxHeaders", value.asInstanceOf[js.Any])
    
    inline def setAjaxHeadersUndefined: Self = StObject.set(x, "ajaxHeaders", js.undefined)
    
    inline def setAjaxWithCredentials(value: Boolean): Self = StObject.set(x, "ajaxWithCredentials", value.asInstanceOf[js.Any])
    
    inline def setAjaxWithCredentialsUndefined: Self = StObject.set(x, "ajaxWithCredentials", js.undefined)
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCrossOriginPolicy(value: String | Boolean): Self = StObject.set(x, "crossOriginPolicy", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginPolicyUndefined: Self = StObject.set(x, "crossOriginPolicy", js.undefined)
    
    inline def setLoadWithAjax(value: String): Self = StObject.set(x, "loadWithAjax", value.asInstanceOf[js.Any])
    
    inline def setLoadWithAjaxUndefined: Self = StObject.set(x, "loadWithAjax", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
