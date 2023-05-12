package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAttemptnumberQueryPage extends StObject {
  
  /**
    * List jobs for a workflow run attempt
    * @description Lists jobs for a specific workflow run attempt. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    */
  var get: ParametersPathAttemptnumberQueryPage
}
object GetParametersPathAttemptnumberQueryPage {
  
  inline def apply(get: ParametersPathAttemptnumberQueryPage): GetParametersPathAttemptnumberQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAttemptnumberQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAttemptnumberQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAttemptnumberQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
