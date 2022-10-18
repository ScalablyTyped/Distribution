package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses422500503 extends StObject {
  
  /** **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default. */
  var get: Responses422500503
}
object GetResponses422500503 {
  
  inline def apply(get: Responses422500503): GetResponses422500503 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses422500503]
  }
  
  extension [Self <: GetResponses422500503](x: Self) {
    
    inline def setGet(value: Responses422500503): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
