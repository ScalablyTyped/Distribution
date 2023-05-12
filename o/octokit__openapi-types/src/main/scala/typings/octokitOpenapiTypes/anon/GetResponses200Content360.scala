package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content360 extends StObject {
  
  /**
    * Get top referral paths
    * @description Get the top 10 popular contents over the last 14 days.
    */
  var get: Responses200Content360
}
object GetResponses200Content360 {
  
  inline def apply(get: Responses200Content360): GetResponses200Content360 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content360]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content360] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content360): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
