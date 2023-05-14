package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGithubActionsBillingUser extends StObject {
  
  var getGithubActionsBillingOrg: `1036`
  
  var getGithubActionsBillingUser: `1037`
  
  var getGithubPackagesBillingOrg: `1038`
  
  var getGithubPackagesBillingUser: `1039`
  
  var getSharedStorageBillingOrg: `1040`
  
  var getSharedStorageBillingUser: `1041`
}
object GetGithubActionsBillingUser {
  
  inline def apply(
    getGithubActionsBillingOrg: `1036`,
    getGithubActionsBillingUser: `1037`,
    getGithubPackagesBillingOrg: `1038`,
    getGithubPackagesBillingUser: `1039`,
    getSharedStorageBillingOrg: `1040`,
    getSharedStorageBillingUser: `1041`
  ): GetGithubActionsBillingUser = {
    val __obj = js.Dynamic.literal(getGithubActionsBillingOrg = getGithubActionsBillingOrg.asInstanceOf[js.Any], getGithubActionsBillingUser = getGithubActionsBillingUser.asInstanceOf[js.Any], getGithubPackagesBillingOrg = getGithubPackagesBillingOrg.asInstanceOf[js.Any], getGithubPackagesBillingUser = getGithubPackagesBillingUser.asInstanceOf[js.Any], getSharedStorageBillingOrg = getSharedStorageBillingOrg.asInstanceOf[js.Any], getSharedStorageBillingUser = getSharedStorageBillingUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGithubActionsBillingUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGithubActionsBillingUser] (val x: Self) extends AnyVal {
    
    inline def setGetGithubActionsBillingOrg(value: `1036`): Self = StObject.set(x, "getGithubActionsBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsBillingUser(value: `1037`): Self = StObject.set(x, "getGithubActionsBillingUser", value.asInstanceOf[js.Any])
    
    inline def setGetGithubPackagesBillingOrg(value: `1038`): Self = StObject.set(x, "getGithubPackagesBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetGithubPackagesBillingUser(value: `1039`): Self = StObject.set(x, "getGithubPackagesBillingUser", value.asInstanceOf[js.Any])
    
    inline def setGetSharedStorageBillingOrg(value: `1040`): Self = StObject.set(x, "getSharedStorageBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSharedStorageBillingUser(value: `1041`): Self = StObject.set(x, "getSharedStorageBillingUser", value.asInstanceOf[js.Any])
  }
}
