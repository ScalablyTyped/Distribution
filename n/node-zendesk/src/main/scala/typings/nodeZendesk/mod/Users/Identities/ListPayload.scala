package typings.nodeZendesk.mod.Users.Identities

import typings.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPayload extends PaginablePayload {
  
  val identities: js.Array[ResponseModel] = js.native
}
object ListPayload {
  
  @scala.inline
  def apply(count: Double, identities: js.Array[ResponseModel]): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
  
  @scala.inline
  implicit class ListPayloadOps[Self <: ListPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentitiesVarargs(value: ResponseModel*): Self = this.set("identities", js.Array(value :_*))
    
    @scala.inline
    def setIdentities(value: js.Array[ResponseModel]): Self = this.set("identities", value.asInstanceOf[js.Any])
  }
}
