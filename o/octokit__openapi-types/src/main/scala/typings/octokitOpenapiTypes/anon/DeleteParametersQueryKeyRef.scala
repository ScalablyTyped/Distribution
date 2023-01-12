package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersQueryKeyRef extends StObject {
  
  /**
    * Deletes one or more GitHub Actions caches for a repository, using a complete cache key. By default, all caches that match the provided key are deleted, but you can optionally provide a Git ref to restrict deletions to caches that match both the provided key and the Git ref.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var delete: ParametersQueryKeyRef
  
  /**
    * Lists the GitHub Actions caches for a repository.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersQueryRef
}
object DeleteParametersQueryKeyRef {
  
  inline def apply(delete: ParametersQueryKeyRef, get: ParametersQueryRef): DeleteParametersQueryKeyRef = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersQueryKeyRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersQueryKeyRef] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersQueryKeyRef): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersQueryRef): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
