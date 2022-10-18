package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCacheidOwner extends StObject {
  
  /**
    * Deletes a GitHub Actions cache for a repository, using a cache ID.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var delete: ParametersPathCacheidOwner
}
object DeleteParametersPathCacheidOwner {
  
  inline def apply(delete: ParametersPathCacheidOwner): DeleteParametersPathCacheidOwner = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCacheidOwner]
  }
  
  extension [Self <: DeleteParametersPathCacheidOwner](x: Self) {
    
    inline def setDelete(value: ParametersPathCacheidOwner): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
