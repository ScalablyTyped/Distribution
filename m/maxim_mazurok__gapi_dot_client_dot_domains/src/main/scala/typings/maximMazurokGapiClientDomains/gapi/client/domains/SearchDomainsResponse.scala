package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDomainsResponse extends StObject {
  
  /** Results of the domain name search. */
  var registerParameters: js.UndefOr[js.Array[RegisterParameters]] = js.undefined
}
object SearchDomainsResponse {
  
  @scala.inline
  def apply(): SearchDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDomainsResponse]
  }
  
  @scala.inline
  implicit class SearchDomainsResponseMutableBuilder[Self <: SearchDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegisterParameters(value: js.Array[RegisterParameters]): Self = StObject.set(x, "registerParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterParametersUndefined: Self = StObject.set(x, "registerParameters", js.undefined)
    
    @scala.inline
    def setRegisterParametersVarargs(value: RegisterParameters*): Self = StObject.set(x, "registerParameters", js.Array(value :_*))
  }
}
