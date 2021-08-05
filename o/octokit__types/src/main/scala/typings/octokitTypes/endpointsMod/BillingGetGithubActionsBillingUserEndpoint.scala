package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGetGithubActionsBillingUserEndpoint extends StObject {
  
  var username: String
}
object BillingGetGithubActionsBillingUserEndpoint {
  
  inline def apply(username: String): BillingGetGithubActionsBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubActionsBillingUserEndpoint]
  }
  
  extension [Self <: BillingGetGithubActionsBillingUserEndpoint](x: Self) {
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
