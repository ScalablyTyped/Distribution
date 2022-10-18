package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content247 extends StObject {
  
  /**
    * Gets the total GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  var get: Responses200Content247
}
object GetResponses200Content247 {
  
  inline def apply(get: Responses200Content247): GetResponses200Content247 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content247]
  }
  
  extension [Self <: GetResponses200Content247](x: Self) {
    
    inline def setGet(value: Responses200Content247): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
