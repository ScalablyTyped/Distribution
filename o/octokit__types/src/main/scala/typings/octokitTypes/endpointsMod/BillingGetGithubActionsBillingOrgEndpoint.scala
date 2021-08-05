package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGetGithubActionsBillingOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
}
object BillingGetGithubActionsBillingOrgEndpoint {
  
  inline def apply(org_ : String): BillingGetGithubActionsBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubActionsBillingOrgEndpoint]
  }
  
  extension [Self <: BillingGetGithubActionsBillingOrgEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
