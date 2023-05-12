package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathQuery extends StObject {
  
  /**
    * List Dependabot alerts for an enterprise
    * @description Lists Dependabot alerts for repositories that are owned by the specified enterprise.
    * To use this endpoint, you must be a member of the enterprise, and you must use an
    * access token with the `repo` scope or `security_events` scope.
    * Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security manager. For more information about security managers, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  var get: ParametersPathQuery
}
object GetParametersPathQuery {
  
  inline def apply(get: ParametersPathQuery): GetParametersPathQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
