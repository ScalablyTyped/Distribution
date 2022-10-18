package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadyStateXHR extends StObject {
  
  /**
    * The name of a file to be uploaded.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Http-Response-Headers which come from the server.
    *
    * Provided as a JSON-map, i.e. each header-field is reflected by a property in the `headers` object, with
    * the property value reflecting the header-field's content.
    *
    * Required for receiving `headers` is to set the property `sendXHR` to true. This property is not supported
    * by Internet Explorer 9.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /**
    * ReadyState of the XHR request.
    *
    * Required for receiving a `readyStateXHR` is to set the property `sendXHR` to true. This property is not
    * supported by Internet Explorer 9.
    */
  var readyStateXHR: js.UndefOr[String] = js.undefined
  
  /**
    * Http-Request-Headers.
    *
    * Required for receiving `requestHeaders` is to set the property `sendXHR` to true. This property is not
    * supported by Internet Explorer 9.
    */
  var requestHeaders: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
    * Response message which comes from the server.
    *
    * On the server side this response has to be put within the "body" tags of the response document
    * of the iFrame. It can consist of a return code and an optional message. This does not work in cross-domain
    * scenarios.
    */
  var response: js.UndefOr[String] = js.undefined
  
  /**
    * Http-Response which comes from the server.
    *
    * Required for receiving `responseRaw` is to set the property `sendXHR` to true.
    *
    * This property is not supported by Internet Explorer 9.
    */
  var responseRaw: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the XHR request.
    *
    * Required for receiving a `status` is to set the property `sendXHR` to true. This property is not supported
    * by Internet Explorer 9.
    */
  var status: js.UndefOr[String] = js.undefined
}
object ReadyStateXHR {
  
  inline def apply(): ReadyStateXHR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadyStateXHR]
  }
  
  extension [Self <: ReadyStateXHR](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReadyStateXHR(value: String): Self = StObject.set(x, "readyStateXHR", value.asInstanceOf[js.Any])
    
    inline def setReadyStateXHRUndefined: Self = StObject.set(x, "readyStateXHR", js.undefined)
    
    inline def setRequestHeaders(value: js.Array[js.Object]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    inline def setRequestHeadersVarargs(value: js.Object*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseRaw(value: String): Self = StObject.set(x, "responseRaw", value.asInstanceOf[js.Any])
    
    inline def setResponseRawUndefined: Self = StObject.set(x, "responseRaw", js.undefined)
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
