package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content73 extends StObject {
  
  /** The return hash contains `failed_at` and `failed_reason` fields which represent the time at which the invitation failed and the reason for the failure. */
  var get: Responses200Content73
}
object GetResponses200Content73 {
  
  inline def apply(get: Responses200Content73): GetResponses200Content73 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content73]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content73] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content73): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
