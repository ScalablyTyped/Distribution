package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters399 extends StObject {
  
  /**
    * List locations for a secret scanning alert
    * @description Lists all locations for a given secret scanning alert for an eligible repository.
    * To use this endpoint, you must be an administrator for the repository or for the organization that owns the repository, and you must use a personal access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: Parameters399
}
object GetParameters399 {
  
  inline def apply(get: Parameters399): GetParameters399 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters399]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters399] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters399): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
