package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyThreadRequest extends StObject {
  
  /** A list of IDs of labels to add to this thread. You can add up to 100 labels with each update. */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of IDs of labels to remove from this thread. You can remove up to 100 labels with each update. */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ModifyThreadRequest {
  
  inline def apply(): ModifyThreadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyThreadRequest]
  }
  
  extension [Self <: ModifyThreadRequest](x: Self) {
    
    inline def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
    
    inline def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
    
    inline def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value*))
    
    inline def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
    
    inline def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
    
    inline def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value*))
  }
}
