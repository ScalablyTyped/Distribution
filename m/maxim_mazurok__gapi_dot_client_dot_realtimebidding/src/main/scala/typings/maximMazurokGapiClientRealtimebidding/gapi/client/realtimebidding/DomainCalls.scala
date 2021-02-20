package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainCalls extends StObject {
  
  /** The domain name. */
  var domain: js.UndefOr[String] = js.native
  
  /** Number of HTTP calls made to the domain. */
  var httpCallCount: js.UndefOr[Double] = js.native
}
object DomainCalls {
  
  @scala.inline
  def apply(): DomainCalls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainCalls]
  }
  
  @scala.inline
  implicit class DomainCallsMutableBuilder[Self <: DomainCalls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setHttpCallCount(value: Double): Self = StObject.set(x, "httpCallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCallCountUndefined: Self = StObject.set(x, "httpCallCount", js.undefined)
  }
}
