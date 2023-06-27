package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters396 extends StObject {
  
  /**
    * List secret scanning alerts for a repository
    * @description Lists secret scanning alerts for an eligible repository, from newest to oldest.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: Parameters396
}
object GetParameters396 {
  
  inline def apply(get: Parameters396): GetParameters396 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters396]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters396] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters396): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
