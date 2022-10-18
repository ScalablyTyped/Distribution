package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content330 extends StObject {
  
  /** The return hash contains `failed_at` and `failed_reason` fields which represent the time at which the invitation failed and the reason for the failure. */
  var get: Responses200Content330
}
object GetResponses200Content330 {
  
  inline def apply(get: Responses200Content330): GetResponses200Content330 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content330]
  }
  
  extension [Self <: GetResponses200Content330](x: Self) {
    
    inline def setGet(value: Responses200Content330): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
