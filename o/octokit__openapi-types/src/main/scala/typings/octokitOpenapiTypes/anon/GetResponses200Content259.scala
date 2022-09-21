package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content259 extends StObject {
  
  /** List files larger than 100MB found during the import */
  var get: Responses200Content259
}
object GetResponses200Content259 {
  
  inline def apply(get: Responses200Content259): GetResponses200Content259 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content259]
  }
  
  extension [Self <: GetResponses200Content259](x: Self) {
    
    inline def setGet(value: Responses200Content259): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
