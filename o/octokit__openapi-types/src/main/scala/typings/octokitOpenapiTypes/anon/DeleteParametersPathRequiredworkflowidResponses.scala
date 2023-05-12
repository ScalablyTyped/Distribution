package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRequiredworkflowidResponses extends StObject {
  
  /**
    * Delete a required workflow
    * @description Deletes a required workflow configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var delete: ParametersPathRequiredworkflowidResponses
  
  /**
    * Get a required workflow
    * @description Get a required workflow configured in an organization.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var get: ParametersPathRequiredworkflowid
  
  /**
    * Update a required workflow
    * @description Update a required workflow in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var patch: RequestBodyContentApplicationjsonWorkflowfilepath
}
object DeleteParametersPathRequiredworkflowidResponses {
  
  inline def apply(
    delete: ParametersPathRequiredworkflowidResponses,
    get: ParametersPathRequiredworkflowid,
    patch: RequestBodyContentApplicationjsonWorkflowfilepath
  ): DeleteParametersPathRequiredworkflowidResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRequiredworkflowidResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathRequiredworkflowidResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathRequiredworkflowidResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathRequiredworkflowid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonWorkflowfilepath): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
