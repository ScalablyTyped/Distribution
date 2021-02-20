package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemParameter extends StObject {
  
  /** Define the HTTP header name to use for the parameter. It is case insensitive. */
  var httpHeader: js.UndefOr[String] = js.native
  
  /** Define the name of the parameter, such as "api_key" . It is case sensitive. */
  var name: js.UndefOr[String] = js.native
  
  /** Define the URL query parameter name to use for the parameter. It is case sensitive. */
  var urlQueryParameter: js.UndefOr[String] = js.native
}
object SystemParameter {
  
  @scala.inline
  def apply(): SystemParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemParameter]
  }
  
  @scala.inline
  implicit class SystemParameterMutableBuilder[Self <: SystemParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpHeader(value: String): Self = StObject.set(x, "httpHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeaderUndefined: Self = StObject.set(x, "httpHeader", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrlQueryParameter(value: String): Self = StObject.set(x, "urlQueryParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlQueryParameterUndefined: Self = StObject.set(x, "urlQueryParameter", js.undefined)
  }
}
