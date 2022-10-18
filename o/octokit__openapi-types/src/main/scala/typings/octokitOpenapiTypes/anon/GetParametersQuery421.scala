package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery421 extends StObject {
  
  /** Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters). */
  var get: ParametersQuery421
}
object GetParametersQuery421 {
  
  inline def apply(get: ParametersQuery421): GetParametersQuery421 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery421]
  }
  
  extension [Self <: GetParametersQuery421](x: Self) {
    
    inline def setGet(value: ParametersQuery421): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
