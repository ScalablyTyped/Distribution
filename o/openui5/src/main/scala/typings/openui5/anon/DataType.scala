package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  /**
    * Deprecated. Use the correct Accept headers and correct Content-Type header in the response.
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP headers of the request.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The HTTP method. Possible values are "GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", and "HEAD".
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The mode of the request. Possible values are "cors", "no-cors", "same-origin".
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * The request parameters. If the HTTP method is "POST", "PUT", "PATCH", or "DELETE" the parameters will
    * be put as key/value pairs into the body of the request.
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The URL of the resource.
    */
  var url: String
  
  /**
    * Indicates whether cross-site requests should be made using credentials.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object DataType {
  
  inline def apply(url: String): DataType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
