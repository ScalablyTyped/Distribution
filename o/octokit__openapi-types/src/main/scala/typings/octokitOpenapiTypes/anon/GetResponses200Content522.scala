package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content522 extends StObject {
  
  /** List files larger than 100MB found during the import */
  var get: Responses200Content522
}
object GetResponses200Content522 {
  
  inline def apply(get: Responses200Content522): GetResponses200Content522 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content522]
  }
  
  extension [Self <: GetResponses200Content522](x: Self) {
    
    inline def setGet(value: Responses200Content522): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
