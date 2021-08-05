package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterAction extends StObject {
  
  /** List of labels to add to the message. */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Email address that the message should be forwarded to. */
  var forward: js.UndefOr[String] = js.undefined
  
  /** List of labels to remove from the message. */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}
object FilterAction {
  
  inline def apply(): FilterAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterAction]
  }
  
  extension [Self <: FilterAction](x: Self) {
    
    inline def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
    
    inline def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
    
    inline def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value :_*))
    
    inline def setForward(value: String): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
    
    inline def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value :_*))
  }
}
