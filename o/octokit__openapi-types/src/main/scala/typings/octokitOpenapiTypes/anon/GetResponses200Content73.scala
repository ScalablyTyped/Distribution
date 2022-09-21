package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content73 extends StObject {
  
  /** List the users blocked by an organization. */
  var get: Responses200Content73
}
object GetResponses200Content73 {
  
  inline def apply(get: Responses200Content73): GetResponses200Content73 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content73]
  }
  
  extension [Self <: GetResponses200Content73](x: Self) {
    
    inline def setGet(value: Responses200Content73): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
