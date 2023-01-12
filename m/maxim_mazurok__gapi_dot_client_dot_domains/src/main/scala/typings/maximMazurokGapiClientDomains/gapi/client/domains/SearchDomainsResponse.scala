package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDomainsResponse extends StObject {
  
  /** Results of the domain name search. */
  var registerParameters: js.UndefOr[js.Array[RegisterParameters]] = js.undefined
}
object SearchDomainsResponse {
  
  inline def apply(): SearchDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDomainsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchDomainsResponse] (val x: Self) extends AnyVal {
    
    inline def setRegisterParameters(value: js.Array[RegisterParameters]): Self = StObject.set(x, "registerParameters", value.asInstanceOf[js.Any])
    
    inline def setRegisterParametersUndefined: Self = StObject.set(x, "registerParameters", js.undefined)
    
    inline def setRegisterParametersVarargs(value: RegisterParameters*): Self = StObject.set(x, "registerParameters", js.Array(value*))
  }
}
