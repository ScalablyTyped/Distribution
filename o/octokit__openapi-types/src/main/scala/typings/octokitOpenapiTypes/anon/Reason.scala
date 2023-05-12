package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.approve_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason extends StObject {
  
  /**
    * @description Action to apply to the request.
    * @enum {string}
    */
  var action: approve_ | deny
  
  /** @description Reason for approving or denying the request. Max 1024 characters. */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object Reason {
  
  inline def apply(action: approve_ | deny): Reason = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
    
    inline def setAction(value: approve_ | deny): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
