package typings.phonon.Phonon

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononAjaxObject extends StObject {
  
  var contentType: js.UndefOr[String] = js.native
  
  var crossDomain: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataType: String = js.native
  
  var error: js.UndefOr[
    js.Function3[/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest, Unit]
  ] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var method: String = js.native
  
  def success(res: js.Any, xhr: XMLHttpRequest): Unit = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: String = js.native
}
object PhononAjaxObject {
  
  @scala.inline
  def apply(dataType: String, method: String, success: (js.Any, XMLHttpRequest) => Unit, url: String): PhononAjaxObject = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], success = js.Any.fromFunction2(success), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononAjaxObject]
  }
  
  @scala.inline
  implicit class PhononAjaxObjectMutableBuilder[Self <: PhononAjaxObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: (/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: (js.Any, XMLHttpRequest) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
