package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAlertnumber extends StObject {
  
  /**
    * Gets a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repos, the `public_repo` scope also grants permission to read security events on public repos only. GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * **Deprecation notice**:
    * The instances field is deprecated and will, in future, not be included in the response for this endpoint. The example response reflects this change. The same information can now be retrieved via a GET request to the URL specified by `instances_url`.
    */
  var get: ParametersPathAlertnumber
  
  /** Updates the status of a single code scanning alert. You must use an access token with the `security_events` scope to use this endpoint with private repositories. You can also use tokens with the `public_repo` scope for public repositories only. GitHub Apps must have the `security_events` write permission to use this endpoint. */
  var patch: RequestBodyContentApplicationjsonDismissedcomment
}
object GetParametersPathAlertnumber {
  
  inline def apply(get: ParametersPathAlertnumber, patch: RequestBodyContentApplicationjsonDismissedcomment): GetParametersPathAlertnumber = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAlertnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAlertnumber] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAlertnumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonDismissedcomment): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
