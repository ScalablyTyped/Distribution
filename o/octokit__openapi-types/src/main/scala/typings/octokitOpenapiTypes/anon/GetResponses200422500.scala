package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200422500 extends StObject {
  
  /** **Note:** Responses include a maximum of 3000 files. The paginated response returns 30 files per page by default. */
  var get: Responses200422500
}
object GetResponses200422500 {
  
  inline def apply(get: Responses200422500): GetResponses200422500 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200422500]
  }
  
  extension [Self <: GetResponses200422500](x: Self) {
    
    inline def setGet(value: Responses200422500): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
