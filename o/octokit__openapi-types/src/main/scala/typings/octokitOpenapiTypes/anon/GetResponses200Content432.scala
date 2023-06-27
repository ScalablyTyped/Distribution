package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content432 extends StObject {
  
  /**
    * Get top referral sources
    * @description Get the top 10 referrers over the last 14 days.
    */
  var get: Responses200Content432
}
object GetResponses200Content432 {
  
  inline def apply(get: Responses200Content432): GetResponses200Content432 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content432]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content432] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content432): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
