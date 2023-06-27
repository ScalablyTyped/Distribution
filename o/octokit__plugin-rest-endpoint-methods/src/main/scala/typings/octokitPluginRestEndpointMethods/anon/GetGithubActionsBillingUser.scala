package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGithubActionsBillingUser extends StObject {
  
  var getGithubActionsBillingOrg: `1040`
  
  var getGithubActionsBillingUser: `1041`
  
  var getGithubPackagesBillingOrg: `1042`
  
  var getGithubPackagesBillingUser: `1043`
  
  var getSharedStorageBillingOrg: `1044`
  
  var getSharedStorageBillingUser: `1045`
}
object GetGithubActionsBillingUser {
  
  inline def apply(
    getGithubActionsBillingOrg: `1040`,
    getGithubActionsBillingUser: `1041`,
    getGithubPackagesBillingOrg: `1042`,
    getGithubPackagesBillingUser: `1043`,
    getSharedStorageBillingOrg: `1044`,
    getSharedStorageBillingUser: `1045`
  ): GetGithubActionsBillingUser = {
    val __obj = js.Dynamic.literal(getGithubActionsBillingOrg = getGithubActionsBillingOrg.asInstanceOf[js.Any], getGithubActionsBillingUser = getGithubActionsBillingUser.asInstanceOf[js.Any], getGithubPackagesBillingOrg = getGithubPackagesBillingOrg.asInstanceOf[js.Any], getGithubPackagesBillingUser = getGithubPackagesBillingUser.asInstanceOf[js.Any], getSharedStorageBillingOrg = getSharedStorageBillingOrg.asInstanceOf[js.Any], getSharedStorageBillingUser = getSharedStorageBillingUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGithubActionsBillingUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGithubActionsBillingUser] (val x: Self) extends AnyVal {
    
    inline def setGetGithubActionsBillingOrg(value: `1040`): Self = StObject.set(x, "getGithubActionsBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsBillingUser(value: `1041`): Self = StObject.set(x, "getGithubActionsBillingUser", value.asInstanceOf[js.Any])
    
    inline def setGetGithubPackagesBillingOrg(value: `1042`): Self = StObject.set(x, "getGithubPackagesBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetGithubPackagesBillingUser(value: `1043`): Self = StObject.set(x, "getGithubPackagesBillingUser", value.asInstanceOf[js.Any])
    
    inline def setGetSharedStorageBillingOrg(value: `1044`): Self = StObject.set(x, "getSharedStorageBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSharedStorageBillingUser(value: `1045`): Self = StObject.set(x, "getSharedStorageBillingUser", value.asInstanceOf[js.Any])
  }
}
