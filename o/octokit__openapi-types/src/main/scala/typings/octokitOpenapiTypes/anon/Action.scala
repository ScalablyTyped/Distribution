package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.approve_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * @description Action to apply to the requests.
    * @enum {string}
    */
  var action: approve_ | deny
  
  /** @description Unique identifiers of the requests for access via fine-grained personal access token. Must be formed of between 1 and 100 `pat_request_id` values. */
  var pat_request_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** @description Reason for approving or denying the requests. Max 1024 characters. */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object Action {
  
  inline def apply(action: approve_ | deny): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: approve_ | deny): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPat_request_ids(value: js.Array[Double]): Self = StObject.set(x, "pat_request_ids", value.asInstanceOf[js.Any])
    
    inline def setPat_request_idsUndefined: Self = StObject.set(x, "pat_request_ids", js.undefined)
    
    inline def setPat_request_idsVarargs(value: Double*): Self = StObject.set(x, "pat_request_ids", js.Array(value*))
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
