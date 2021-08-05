package typings.phonon.Phonon

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononAjaxObject extends StObject {
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var dataType: String
  
  var error: js.UndefOr[
    js.Function3[/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var method: String
  
  def success(res: js.Any, xhr: XMLHttpRequest): Unit
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: String
}
object PhononAjaxObject {
  
  inline def apply(dataType: String, method: String, success: (js.Any, XMLHttpRequest) => Unit, url: String): PhononAjaxObject = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], success = js.Any.fromFunction2(success), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononAjaxObject]
  }
  
  extension [Self <: PhononAjaxObject](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
    
    inline def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: (/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: (js.Any, XMLHttpRequest) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
