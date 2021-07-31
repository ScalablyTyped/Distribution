package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergePayload extends StObject {
  
  val ids: js.Array[ZendeskID]
  
  val source_comment: js.UndefOr[String | Null] = js.undefined
  
  val target_comment: js.UndefOr[String | Null] = js.undefined
}
object MergePayload {
  
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): MergePayload = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePayload]
  }
  
  @scala.inline
  implicit class MergePayloadMutableBuilder[Self <: MergePayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[ZendeskID]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: ZendeskID*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setSource_comment(value: String): Self = StObject.set(x, "source_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_commentNull: Self = StObject.set(x, "source_comment", null)
    
    @scala.inline
    def setSource_commentUndefined: Self = StObject.set(x, "source_comment", js.undefined)
    
    @scala.inline
    def setTarget_comment(value: String): Self = StObject.set(x, "target_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_commentNull: Self = StObject.set(x, "target_comment", null)
    
    @scala.inline
    def setTarget_commentUndefined: Self = StObject.set(x, "target_comment", js.undefined)
  }
}
