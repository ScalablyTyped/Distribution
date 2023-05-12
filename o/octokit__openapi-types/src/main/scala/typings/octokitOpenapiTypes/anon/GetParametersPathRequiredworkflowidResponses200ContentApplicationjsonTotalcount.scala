package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount extends StObject {
  
  /**
    * List selected repositories for a required workflow
    * @description Lists the selected repositories that are configured for a required workflow in an organization. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var get: ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount
  
  /**
    * Sets repositories for a required workflow
    * @description Sets the repositories for a required workflow that is required for selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var put: ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids
}
object GetParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount {
  
  inline def apply(
    get: ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount,
    put: ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids
  ): GetParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathRequiredworkflowidResponses200ContentApplicationjsonTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathRequiredworkflowidRequestBodyContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
