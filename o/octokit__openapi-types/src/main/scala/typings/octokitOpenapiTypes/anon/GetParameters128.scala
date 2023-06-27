package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters128 extends StObject {
  
  /**
    * List secret scanning alerts for an organization
    * @description Lists secret scanning alerts for eligible repositories in an organization, from newest to oldest.
    * To use this endpoint, you must be an administrator or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have the `secret_scanning_alerts` read permission to use this endpoint.
    */
  var get: Parameters128
}
object GetParameters128 {
  
  inline def apply(get: Parameters128): GetParameters128 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters128]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters128] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters128): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
