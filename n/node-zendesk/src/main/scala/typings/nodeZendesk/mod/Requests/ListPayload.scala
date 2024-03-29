package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.PaginablePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPayload
  extends StObject
     with PaginablePayload {
  
  val requests: js.Array[ResponseModel]
}
object ListPayload {
  
  inline def apply(count: Double, requests: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], next_page = null, previous_page = null)
    __obj.asInstanceOf[ListPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPayload] (val x: Self) extends AnyVal {
    
    inline def setRequests(value: js.Array[ResponseModel]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsVarargs(value: ResponseModel*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
