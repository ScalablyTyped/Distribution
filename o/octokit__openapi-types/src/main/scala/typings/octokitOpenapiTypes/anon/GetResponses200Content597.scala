package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content597 extends StObject {
  
  /** Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday. */
  var get: Responses200Content597
}
object GetResponses200Content597 {
  
  inline def apply(get: Responses200Content597): GetResponses200Content597 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content597]
  }
  
  extension [Self <: GetResponses200Content597](x: Self) {
    
    inline def setGet(value: Responses200Content597): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
