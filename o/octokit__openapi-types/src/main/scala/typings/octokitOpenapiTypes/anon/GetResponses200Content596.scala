package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content596 extends StObject {
  
  /** Get the top 10 referrers over the last 14 days. */
  var get: Responses200Content596
}
object GetResponses200Content596 {
  
  inline def apply(get: Responses200Content596): GetResponses200Content596 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content596]
  }
  
  extension [Self <: GetResponses200Content596](x: Self) {
    
    inline def setGet(value: Responses200Content596): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
