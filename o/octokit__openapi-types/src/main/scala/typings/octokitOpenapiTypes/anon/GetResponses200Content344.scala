package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content344 extends StObject {
  
  /** Get the top 10 referrers over the last 14 days. */
  var get: Responses200Content344
}
object GetResponses200Content344 {
  
  inline def apply(get: Responses200Content344): GetResponses200Content344 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content344]
  }
  
  extension [Self <: GetResponses200Content344](x: Self) {
    
    inline def setGet(value: Responses200Content344): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
