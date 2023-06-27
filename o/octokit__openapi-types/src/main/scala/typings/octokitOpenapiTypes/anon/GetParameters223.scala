package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters223 extends StObject {
  
  /**
    * List code scanning alerts for a repository
    * @description Lists all open code scanning alerts for the default branch (usually `main`
    * or `master`). You must use an access token with the `security_events` scope to use
    * this endpoint with private repos, the `public_repo` scope also grants permission to read
    * security events on public repos only. GitHub Apps must have the `security_events` read
    * permission to use this endpoint.
    *
    * The response includes a `most_recent_instance` object.
    * This provides details of the most recent instance of this alert
    * for the default branch or for the specified Git reference
    * (if you used `ref` in the request).
    */
  var get: Parameters223
}
object GetParameters223 {
  
  inline def apply(get: Parameters223): GetParameters223 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters223]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters223] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters223): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
