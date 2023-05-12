package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOwnerProtectionruleid extends StObject {
  
  /**
    * Disable a custom protection rule for an environment
    * @description Disables a custom deployment protection rule for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. Removing a custom protection rule requires admin or owner permissions to the repository. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see "[Get an app](https://docs.github.com/rest/apps/apps#get-an-app)".
    */
  var delete: ParametersPathOwnerProtectionruleid
  
  /**
    * Get a custom deployment protection rule
    * @description Gets an enabled custom deployment protection rule for an environment. Anyone with read access to the repository can use this endpoint. If the repository is private and you want to use a personal access token (classic), you must use an access token with the `repo` scope. GitHub Apps and fine-grained personal access tokens must have the `actions:read` permission to use this endpoint. For more information about environments, see "[Using environments for deployment](https://docs.github.com/en/actions/deployment/targeting-different-environments/using-environments-for-deployment)."
    *
    * For more information about the app that is providing this custom deployment rule, see [`GET /apps/{app_slug}`](https://docs.github.com/rest/apps/apps#get-an-app).
    */
  var get: ParametersPathProtectionruleid
}
object DeleteParametersPathOwnerProtectionruleid {
  
  inline def apply(delete: ParametersPathOwnerProtectionruleid, get: ParametersPathProtectionruleid): DeleteParametersPathOwnerProtectionruleid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOwnerProtectionruleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathOwnerProtectionruleid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathOwnerProtectionruleid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathProtectionruleid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
