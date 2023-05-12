package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageSince extends StObject {
  
  /**
    * List issue comments for a repository
    * @description You can use the REST API to list comments on issues and pull requests for a repository. Every pull request is an issue, but not every issue is a pull request.
    *
    * By default, issue comments are ordered by ascending ID.
    */
  var get: ParametersQueryPerpageSince
}
object GetParametersQueryPerpageSince {
  
  inline def apply(get: ParametersQueryPerpageSince): GetParametersQueryPerpageSince = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageSince]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPerpageSince] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPerpageSince): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
