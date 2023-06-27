package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content61 extends StObject {
  
  /**
    * Get GitHub Actions cache usage for an organization
    * @description Gets the total GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  var get: Responses200Content61
}
object GetResponses200Content61 {
  
  inline def apply(get: Responses200Content61): GetResponses200Content61 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content61]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content61] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content61): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
