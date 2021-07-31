package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyThreadRequest extends StObject {
  
  /** A list of IDs of labels to add to this thread. */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of IDs of labels to remove from this thread. */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ModifyThreadRequest {
  
  @scala.inline
  def apply(): ModifyThreadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyThreadRequest]
  }
  
  @scala.inline
  implicit class ModifyThreadRequestMutableBuilder[Self <: ModifyThreadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLabelIds(value: js.Array[String]): Self = StObject.set(x, "addLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddLabelIdsUndefined: Self = StObject.set(x, "addLabelIds", js.undefined)
    
    @scala.inline
    def setAddLabelIdsVarargs(value: String*): Self = StObject.set(x, "addLabelIds", js.Array(value :_*))
    
    @scala.inline
    def setRemoveLabelIds(value: js.Array[String]): Self = StObject.set(x, "removeLabelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveLabelIdsUndefined: Self = StObject.set(x, "removeLabelIds", js.undefined)
    
    @scala.inline
    def setRemoveLabelIdsVarargs(value: String*): Self = StObject.set(x, "removeLabelIds", js.Array(value :_*))
  }
}
