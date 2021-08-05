package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGetSharedStorageBillingUserEndpoint extends StObject {
  
  var username: String
}
object BillingGetSharedStorageBillingUserEndpoint {
  
  inline def apply(username: String): BillingGetSharedStorageBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetSharedStorageBillingUserEndpoint]
  }
  
  extension [Self <: BillingGetSharedStorageBillingUserEndpoint](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
