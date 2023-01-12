package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCacheid extends StObject {
  
  /**
    * Deletes a GitHub Actions cache for a repository, using a cache ID.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var delete: ParametersPathCacheid
}
object DeleteParametersPathCacheid {
  
  inline def apply(delete: ParametersPathCacheid): DeleteParametersPathCacheid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCacheid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathCacheid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathCacheid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
