package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content583 extends StObject {
  
  /** Returns the last year of commit activity grouped by week. The `days` array is a group of commits per day, starting on `Sunday`. */
  var get: Responses200Content583
}
object GetResponses200Content583 {
  
  inline def apply(get: Responses200Content583): GetResponses200Content583 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content583]
  }
  
  extension [Self <: GetResponses200Content583](x: Self) {
    
    inline def setGet(value: Responses200Content583): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
