package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRequiredworkflowidforrepo extends StObject {
  
  /**
    * Get a required workflow entity for a repository
    * @description Gets a specific required workflow present in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  var get: ParametersPathRequiredworkflowidforrepo
}
object GetParametersPathRequiredworkflowidforrepo {
  
  inline def apply(get: ParametersPathRequiredworkflowidforrepo): GetParametersPathRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathRequiredworkflowidforrepo): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
