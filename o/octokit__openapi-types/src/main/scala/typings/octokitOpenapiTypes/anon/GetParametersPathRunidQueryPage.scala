package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRunidQueryPage extends StObject {
  
  /**
    * List workflow run artifacts
    * @description Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathRunidQueryPage
}
object GetParametersPathRunidQueryPage {
  
  inline def apply(get: ParametersPathRunidQueryPage): GetParametersPathRunidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRunidQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathRunidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathRunidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
