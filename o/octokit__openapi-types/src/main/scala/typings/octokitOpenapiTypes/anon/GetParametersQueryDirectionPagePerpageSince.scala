package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryDirectionPagePerpageSince extends StObject {
  
  /** Lists review comments for all pull requests in a repository. By default, review comments are in ascending order by ID. */
  var get: ParametersQueryDirectionPagePerpageSince
}
object GetParametersQueryDirectionPagePerpageSince {
  
  inline def apply(get: ParametersQueryDirectionPagePerpageSince): GetParametersQueryDirectionPagePerpageSince = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryDirectionPagePerpageSince]
  }
  
  extension [Self <: GetParametersQueryDirectionPagePerpageSince](x: Self) {
    
    inline def setGet(value: ParametersQueryDirectionPagePerpageSince): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
