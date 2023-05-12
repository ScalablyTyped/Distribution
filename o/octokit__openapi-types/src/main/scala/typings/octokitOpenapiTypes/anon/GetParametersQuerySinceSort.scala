package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuerySinceSort extends StObject {
  
  /**
    * List review comments in a repository
    * @description Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID.
    */
  var get: ParametersQuerySinceSort
}
object GetParametersQuerySinceSort {
  
  inline def apply(get: ParametersQuerySinceSort): GetParametersQuerySinceSort = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuerySinceSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuerySinceSort] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuerySinceSort): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
