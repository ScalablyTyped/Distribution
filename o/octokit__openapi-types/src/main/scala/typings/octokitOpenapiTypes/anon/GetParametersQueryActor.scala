package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryActor extends StObject {
  
  /**
    * List workflow runs for a repository
    * @description Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersQueryActor
}
object GetParametersQueryActor {
  
  inline def apply(get: ParametersQueryActor): GetParametersQueryActor = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryActor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryActor] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryActor): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
