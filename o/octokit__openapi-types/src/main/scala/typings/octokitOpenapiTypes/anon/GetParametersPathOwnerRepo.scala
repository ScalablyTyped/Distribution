package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerRepo extends StObject {
  
  /**
    * List workflow runs for a required workflow
    * @description List all workflow runs for a required workflow. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var get: ParametersPathOwnerRepo
}
object GetParametersPathOwnerRepo {
  
  inline def apply(get: ParametersPathOwnerRepo): GetParametersPathOwnerRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
