package typings.openui5.anon

import typings.openui5.sapMUploadUploadSetItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadyState extends StObject {
  
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
    * The file whose upload has just been completed.
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * ReadyState of the XHR request.
    *
    * Required for receiving a `readyState` is to set the property `sendXHR` to true. This property is not
    * supported by Internet Explorer 9.
    */
  var readyState: js.UndefOr[String] = js.undefined
  
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
    * Required for receiving `responseXML` is to set the property `sendXHR` to true.
    *
    * This property is not supported by Internet Explorer 9.
    */
  var responseXML: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the XHR request.
    *
    * Required for receiving a `status` is to set the property `sendXHR` to true. This property is not supported
    * by Internet Explorer 9.
    */
  var status: js.UndefOr[String] = js.undefined
}
object ReadyState {
  
  inline def apply(): ReadyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadyState]
  }
  
  extension [Self <: ReadyState](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setReadyState(value: String): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    inline def setReadyStateUndefined: Self = StObject.set(x, "readyState", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setResponseXML(value: String): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
    
    inline def setResponseXMLUndefined: Self = StObject.set(x, "responseXML", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
