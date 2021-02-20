package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteMessagesRequest extends StObject {
  
  /** The IDs of the messages to delete. */
  var ids: js.UndefOr[js.Array[String]] = js.native
}
object BatchDeleteMessagesRequest {
  
  @scala.inline
  def apply(): BatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteMessagesRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteMessagesRequestMutableBuilder[Self <: BatchDeleteMessagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
  }
}
