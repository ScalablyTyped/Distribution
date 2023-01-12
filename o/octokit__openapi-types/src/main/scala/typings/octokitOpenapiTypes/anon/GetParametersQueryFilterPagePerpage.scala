package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryFilterPagePerpage extends StObject {
  
  /** Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters). */
  var get: ParametersQueryFilterPagePerpage
}
object GetParametersQueryFilterPagePerpage {
  
  inline def apply(get: ParametersQueryFilterPagePerpage): GetParametersQueryFilterPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryFilterPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryFilterPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryFilterPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
