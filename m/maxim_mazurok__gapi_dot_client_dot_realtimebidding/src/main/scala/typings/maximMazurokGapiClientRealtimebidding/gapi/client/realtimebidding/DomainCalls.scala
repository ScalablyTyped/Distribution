package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainCalls extends StObject {
  
  /** The domain name. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** Number of HTTP calls made to the domain. */
  var httpCallCount: js.UndefOr[Double] = js.undefined
}
object DomainCalls {
  
  inline def apply(): DomainCalls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainCalls]
  }
  
  extension [Self <: DomainCalls](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setHttpCallCount(value: Double): Self = StObject.set(x, "httpCallCount", value.asInstanceOf[js.Any])
    
    inline def setHttpCallCountUndefined: Self = StObject.set(x, "httpCallCount", js.undefined)
  }
}
