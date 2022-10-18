package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryToolname extends StObject {
  
  /**
    * Lists code scanning alerts for the default branch for all eligible repositories in an enterprise. Eligible repositories are repositories that are owned by organizations that you own or for which you are a security manager. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * To use this endpoint, you must be a member of the enterprise,
    * and you must use an access token with the `repo` scope or `security_events` scope.
    */
  var get: ParametersQueryToolname
}
object GetParametersQueryToolname {
  
  inline def apply(get: ParametersQueryToolname): GetParametersQueryToolname = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryToolname]
  }
  
  extension [Self <: GetParametersQueryToolname](x: Self) {
    
    inline def setGet(value: ParametersQueryToolname): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
