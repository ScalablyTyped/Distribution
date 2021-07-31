package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGetGithubPackagesBillingUserEndpoint extends StObject {
  
  var username: String
}
object BillingGetGithubPackagesBillingUserEndpoint {
  
  @scala.inline
  def apply(username: String): BillingGetGithubPackagesBillingUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubPackagesBillingUserEndpoint]
  }
  
  @scala.inline
  implicit class BillingGetGithubPackagesBillingUserEndpointMutableBuilder[Self <: BillingGetGithubPackagesBillingUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
