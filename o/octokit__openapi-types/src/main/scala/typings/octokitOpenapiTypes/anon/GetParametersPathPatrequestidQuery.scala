package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPatrequestidQuery extends StObject {
  
  /**
    * List repositories requested to be accessed by a fine-grained personal access token
    * @description Lists the repositories a fine-grained personal access token request is requesting access to. Only GitHub Apps can call this API,
    * using the `organization_personal_access_token_requests: read` permission.
    *
    * **Note**: Fine-grained PATs are in public beta. Related APIs, events, and functionality are subject to change.
    */
  var get: ParametersPathPatrequestidQuery
}
object GetParametersPathPatrequestidQuery {
  
  inline def apply(get: ParametersPathPatrequestidQuery): GetParametersPathPatrequestidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPatrequestidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathPatrequestidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathPatrequestidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
