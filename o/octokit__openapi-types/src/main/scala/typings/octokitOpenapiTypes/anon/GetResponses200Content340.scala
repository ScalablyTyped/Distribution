package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content340 extends StObject {
  
  /** Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday. */
  var get: Responses200Content340
}
object GetResponses200Content340 {
  
  inline def apply(get: Responses200Content340): GetResponses200Content340 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content340]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content340] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content340): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
