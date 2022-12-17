package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathWorkflowidQueryActor extends StObject {
  
  /**
    * List all workflow runs for a workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  var get: ParametersPathWorkflowidQueryActor
}
object GetParametersPathWorkflowidQueryActor {
  
  inline def apply(get: ParametersPathWorkflowidQueryActor): GetParametersPathWorkflowidQueryActor = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathWorkflowidQueryActor]
  }
  
  extension [Self <: GetParametersPathWorkflowidQueryActor](x: Self) {
    
    inline def setGet(value: ParametersPathWorkflowidQueryActor): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
