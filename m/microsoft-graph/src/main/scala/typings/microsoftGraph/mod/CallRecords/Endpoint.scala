package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  // User-agent reported by this endpoint.
  var userAgent: js.UndefOr[NullableOption[UserAgent]] = js.undefined
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserAgent(value: NullableOption[UserAgent]): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentNull: Self = StObject.set(x, "userAgent", null)
    
    @scala.inline
    def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
