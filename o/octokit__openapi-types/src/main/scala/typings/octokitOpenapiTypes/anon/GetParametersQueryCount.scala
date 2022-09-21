package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryCount extends StObject {
  
  /** **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change. */
  var get: ParametersQueryCount
  
  /**
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * Provision an enterprise group, and invite users to the group. This sends invitation emails to the email address of the invited users to join the GitHub organization that the SCIM group corresponds to.
    */
  var post: RequestBodyContentApplicationjsonDisplayName
}
object GetParametersQueryCount {
  
  inline def apply(get: ParametersQueryCount, post: RequestBodyContentApplicationjsonDisplayName): GetParametersQueryCount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryCount]
  }
  
  extension [Self <: GetParametersQueryCount](x: Self) {
    
    inline def setGet(value: ParametersQueryCount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonDisplayName): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
