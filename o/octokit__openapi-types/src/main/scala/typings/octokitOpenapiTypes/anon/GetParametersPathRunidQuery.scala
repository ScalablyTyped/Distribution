package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRunidQuery extends StObject {
  
  /**
    * List workflow run artifacts
    * @description Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathRunidQuery
}
object GetParametersPathRunidQuery {
  
  inline def apply(get: ParametersPathRunidQuery): GetParametersPathRunidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRunidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathRunidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathRunidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
