package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content345 extends StObject {
  
  /** Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday. */
  var get: Responses200Content345
}
object GetResponses200Content345 {
  
  inline def apply(get: Responses200Content345): GetResponses200Content345 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content345]
  }
  
  extension [Self <: GetResponses200Content345](x: Self) {
    
    inline def setGet(value: Responses200Content345): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
