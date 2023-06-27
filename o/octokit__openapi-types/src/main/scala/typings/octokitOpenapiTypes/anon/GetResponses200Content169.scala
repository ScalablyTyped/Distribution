package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content169 extends StObject {
  
  /**
    * Get GitHub Actions cache usage for a repository
    * @description Gets GitHub Actions cache usage for a repository.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Responses200Content169
}
object GetResponses200Content169 {
  
  inline def apply(get: Responses200Content169): GetResponses200Content169 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content169]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content169] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content169): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
