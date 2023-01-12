package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestHeaders extends StObject {
  
  /**
    * The name of a file to be uploaded.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Http-Request-Headers.
    *
    * Required for receiving `requestHeaders` is to set the property `sendXHR` to true. This property is not
    * supported by Internet Explorer 9.
    */
  var requestHeaders: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object RequestHeaders {
  
  inline def apply(): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestHeaders] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[js.Object]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: js.Object*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
  }
}
