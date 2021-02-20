package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingGetGithubActionsBillingOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
}
object BillingGetGithubActionsBillingOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String): BillingGetGithubActionsBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubActionsBillingOrgEndpoint]
  }
  
  @scala.inline
  implicit class BillingGetGithubActionsBillingOrgEndpointMutableBuilder[Self <: BillingGetGithubActionsBillingOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
