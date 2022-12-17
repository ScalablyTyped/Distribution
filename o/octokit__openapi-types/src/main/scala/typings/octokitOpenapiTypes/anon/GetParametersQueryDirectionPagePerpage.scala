package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryDirectionPagePerpage extends StObject {
  
  /** Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID. */
  var get: ParametersQueryDirectionPagePerpage
}
object GetParametersQueryDirectionPagePerpage {
  
  inline def apply(get: ParametersQueryDirectionPagePerpage): GetParametersQueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryDirectionPagePerpage]
  }
  
  extension [Self <: GetParametersQueryDirectionPagePerpage](x: Self) {
    
    inline def setGet(value: ParametersQueryDirectionPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
