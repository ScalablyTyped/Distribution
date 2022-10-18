package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  /**
    * The URL of the resource.
    */
  var URL: String
  
  /**
    * The expected Content-Type of the response. Possible values are "xml", "json", "text", "script", "html",
    * "jsonp". Note: Complex Binding is not supported when a dataType is provided. Serialization of the response
    * to an object is up to the developer.
    */
  var dataType: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The HTTP headers of the request.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The HTTP method. Possible values are "GET", "POST".
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The mode of the request. Possible values are "cors", "no-cors", "same-origin".
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * The request parameters. If the method is "POST" the parameters will be put as key/value pairs into the
    * body of the request.
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Indicates whether cross-site requests should be made using credentials.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object DataType {
  
  inline def apply(URL: String): DataType = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  extension [Self <: DataType](x: Self) {
    
    inline def setDataType(value: js.Object): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
