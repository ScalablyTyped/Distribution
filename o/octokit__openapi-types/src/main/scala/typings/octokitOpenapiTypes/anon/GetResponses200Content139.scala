package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content139 extends StObject {
  
  /**
    * Gets GitHub Actions cache usage for a repository.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Responses200Content139
}
object GetResponses200Content139 {
  
  inline def apply(get: Responses200Content139): GetResponses200Content139 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content139] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content139): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
