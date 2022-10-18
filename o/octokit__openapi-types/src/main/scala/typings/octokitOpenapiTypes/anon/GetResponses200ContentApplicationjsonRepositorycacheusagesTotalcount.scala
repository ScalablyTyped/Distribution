package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRepositorycacheusagesTotalcount extends StObject {
  
  /**
    * Lists repositories and their GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonRepositorycacheusagesTotalcount
}
object GetResponses200ContentApplicationjsonRepositorycacheusagesTotalcount {
  
  inline def apply(get: Responses200ContentApplicationjsonRepositorycacheusagesTotalcount): GetResponses200ContentApplicationjsonRepositorycacheusagesTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRepositorycacheusagesTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonRepositorycacheusagesTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonRepositorycacheusagesTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
