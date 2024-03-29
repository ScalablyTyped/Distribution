package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters266 extends StObject {
  
  /**
    * List Dependabot alerts for a repository
    * @description You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  var get: Parameters266
}
object GetParameters266 {
  
  inline def apply(get: Parameters266): GetParameters266 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters266]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters266] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters266): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
