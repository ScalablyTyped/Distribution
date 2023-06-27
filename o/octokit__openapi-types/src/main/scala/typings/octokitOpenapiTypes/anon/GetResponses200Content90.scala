package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content90 extends StObject {
  
  /**
    * List failed organization invitations
    * @description The return hash contains `failed_at` and `failed_reason` fields which represent the time at which the invitation failed and the reason for the failure.
    */
  var get: Responses200Content90
}
object GetResponses200Content90 {
  
  inline def apply(get: Responses200Content90): GetResponses200Content90 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content90]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content90] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content90): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
