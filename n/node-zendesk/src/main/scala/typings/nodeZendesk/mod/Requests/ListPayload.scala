package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.PaginablePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPayload extends PaginablePayload {
  
  val requests: js.Array[ResponseModel] = js.native
}
object ListPayload {
  
  @scala.inline
  def apply(count: Double, requests: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  
  @scala.inline
  implicit class ListPayloadMutableBuilder[Self <: ListPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[ResponseModel]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsVarargs(value: ResponseModel*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
