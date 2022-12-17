package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryToolguid extends StObject {
  
  /**
    * Lists all open code scanning alerts for the default branch (usually `main`
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
  var get: ParametersQueryToolguid
}
object GetParametersQueryToolguid {
  
  inline def apply(get: ParametersQueryToolguid): GetParametersQueryToolguid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryToolguid]
  }
  
  extension [Self <: GetParametersQueryToolguid](x: Self) {
    
    inline def setGet(value: ParametersQueryToolguid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
