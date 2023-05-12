package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content362 extends StObject {
  
  /**
    * Get page views
    * @description Get the total number of views and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  var get: Responses200Content362
}
object GetResponses200Content362 {
  
  inline def apply(get: Responses200Content362): GetResponses200Content362 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content362]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content362] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content362): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
