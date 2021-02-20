package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingGetSharedStorageBillingUserEndpoint extends StObject {
  
  var username: String = js.native
}
object BillingGetSharedStorageBillingUserEndpoint {
  
  @scala.inline
  def apply(username: String): BillingGetSharedStorageBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetSharedStorageBillingUserEndpoint]
  }
  
  @scala.inline
  implicit class BillingGetSharedStorageBillingUserEndpointMutableBuilder[Self <: BillingGetSharedStorageBillingUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
