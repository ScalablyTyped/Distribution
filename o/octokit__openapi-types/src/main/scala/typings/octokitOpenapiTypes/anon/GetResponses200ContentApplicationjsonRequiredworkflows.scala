package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRequiredworkflows extends StObject {
  
  /**
    * List required workflows
    * @description List all required workflows in an organization.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var get: Responses200ContentApplicationjsonRequiredworkflows
  
  /**
    * Create a required workflow
    * @description Create a required workflow in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var post: RequestBodyContentApplicationjsonScope
}
object GetResponses200ContentApplicationjsonRequiredworkflows {
  
  inline def apply(
    get: Responses200ContentApplicationjsonRequiredworkflows,
    post: RequestBodyContentApplicationjsonScope
  ): GetResponses200ContentApplicationjsonRequiredworkflows = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRequiredworkflows]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonRequiredworkflows] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonRequiredworkflows): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonScope): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
