package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersQuery407 extends StObject {
  
  /**
    * Deletes one or more GitHub Actions caches for a repository, using a complete cache key. By default, all caches that match the provided key are deleted, but you can optionally provide a Git ref to restrict deletions to caches that match both the provided key and the Git ref.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var delete: ParametersQuery407
  
  /**
    * Lists the GitHub Actions caches for a repository.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersQueryKeyPage
}
object DeleteParametersQuery407 {
  
  inline def apply(delete: ParametersQuery407, get: ParametersQueryKeyPage): DeleteParametersQuery407 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersQuery407]
  }
  
  extension [Self <: DeleteParametersQuery407](x: Self) {
    
    inline def setDelete(value: ParametersQuery407): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersQueryKeyPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
