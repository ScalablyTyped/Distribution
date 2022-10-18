package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryCreated extends StObject {
  
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersQueryCreated
}
object GetParametersQueryCreated {
  
  inline def apply(get: ParametersQueryCreated): GetParametersQueryCreated = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryCreated]
  }
  
  extension [Self <: GetParametersQueryCreated](x: Self) {
    
    inline def setGet(value: ParametersQueryCreated): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
