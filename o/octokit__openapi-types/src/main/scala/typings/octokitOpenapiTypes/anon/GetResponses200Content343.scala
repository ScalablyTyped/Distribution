package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content343 extends StObject {
  
  /** Get the top 10 popular contents over the last 14 days. */
  var get: Responses200Content343
}
object GetResponses200Content343 {
  
  inline def apply(get: Responses200Content343): GetResponses200Content343 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content343]
  }
  
  extension [Self <: GetResponses200Content343](x: Self) {
    
    inline def setGet(value: Responses200Content343): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
