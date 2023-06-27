package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgQuery extends StObject {
  
  /**
    * List repositories with GitHub Actions cache usage for an organization
    * @description Lists repositories and their GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  var get: ParametersPathOrgQuery
}
object GetParametersPathOrgQuery {
  
  inline def apply(get: ParametersPathOrgQuery): GetParametersPathOrgQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOrgQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
