package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryInclude extends StObject {
  
  /**
    * Gets the audit log for an organization. For more information, see "[Reviewing the audit log for your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/reviewing-the-audit-log-for-your-organization)."
    *
    * This endpoint is available for organizations on GitHub Enterprise Cloud. To use this endpoint, you must be an organization owner, and you must use an access token with the `admin:org` scope. GitHub Apps must have the `organization_administration` read permission to use this endpoint.
    *
    * By default, the response includes up to 30 events from the past three months. Use the `phrase` parameter to filter results and retrieve older events. For example, use the `phrase` parameter with the `created` qualifier to filter events based on when the events occurred. For more information, see "[Reviewing the audit log for your organization](https://docs.github.com/organizations/keeping-your-organization-secure/managing-security-settings-for-your-organization/reviewing-the-audit-log-for-your-organization#searching-the-audit-log)."
    *
    * Use pagination to retrieve fewer or more than 30 events. For more information, see "[Resources in the REST API](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination)."
    */
  var get: ParametersQueryInclude
}
object GetParametersQueryInclude {
  
  inline def apply(get: ParametersQueryInclude): GetParametersQueryInclude = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryInclude]
  }
  
  extension [Self <: GetParametersQueryInclude](x: Self) {
    
    inline def setGet(value: ParametersQueryInclude): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
