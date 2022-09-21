package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  /**
    * The amount of time it takes the backend service to fully respond to a request. Measured from when the destination service starts to send the request to the backend until when the
    * destination service receives the complete response from the backend.
    */
  var backendLatency: js.UndefOr[String] = js.undefined
  
  /** The HTTP response status code, such as `200` and `404`. */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP response headers. If multiple headers share the same key, they must be merged according to HTTP spec. All header keys must be lowercased, because HTTP header keys are
    * case-insensitive.
    */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.Response & TopLevel[Any]
  ] = js.undefined
  
  /** The HTTP response size in bytes. If unknown, it must be -1. */
  var size: js.UndefOr[String] = js.undefined
  
  /** The timestamp when the `destination` service sends the last byte of the response. */
  var time: js.UndefOr[String] = js.undefined
}
object Response {
  
  inline def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setBackendLatency(value: String): Self = StObject.set(x, "backendLatency", value.asInstanceOf[js.Any])
    
    inline def setBackendLatencyUndefined: Self = StObject.set(x, "backendLatency", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.Response & TopLevel[Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
