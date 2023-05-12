package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgRepo extends StObject {
  
  /**
    * List repository required workflows
    * @description Lists the required workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var get: ParametersPathOrgRepo
}
object GetParametersPathOrgRepo {
  
  inline def apply(get: ParametersPathOrgRepo): GetParametersPathOrgRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOrgRepo] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOrgRepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
