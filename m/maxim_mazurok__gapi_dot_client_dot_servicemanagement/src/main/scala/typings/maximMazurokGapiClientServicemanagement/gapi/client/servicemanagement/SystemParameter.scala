package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemParameter extends StObject {
  
  /** Define the HTTP header name to use for the parameter. It is case insensitive. */
  var httpHeader: js.UndefOr[String] = js.undefined
  
  /** Define the name of the parameter, such as "api_key" . It is case sensitive. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Define the URL query parameter name to use for the parameter. It is case sensitive. */
  var urlQueryParameter: js.UndefOr[String] = js.undefined
}
object SystemParameter {
  
  inline def apply(): SystemParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemParameter] (val x: Self) extends AnyVal {
    
    inline def setHttpHeader(value: String): Self = StObject.set(x, "httpHeader", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaderUndefined: Self = StObject.set(x, "httpHeader", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrlQueryParameter(value: String): Self = StObject.set(x, "urlQueryParameter", value.asInstanceOf[js.Any])
    
    inline def setUrlQueryParameterUndefined: Self = StObject.set(x, "urlQueryParameter", js.undefined)
  }
}
