package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditsListPayload extends PaginablePayload {
  
  val audits: js.Array[Audit] = js.native
}
object AuditsListPayload {
  
  @scala.inline
  def apply(audits: js.Array[Audit], count: Double): AuditsListPayload = {
    val __obj = js.Dynamic.literal(audits = audits.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditsListPayload]
  }
  
  @scala.inline
  implicit class AuditsListPayloadOps[Self <: AuditsListPayload] (val x: Self) extends AnyVal {
    
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
    def setAuditsVarargs(value: Audit*): Self = this.set("audits", js.Array(value :_*))
    
    @scala.inline
    def setAudits(value: js.Array[Audit]): Self = this.set("audits", value.asInstanceOf[js.Any])
  }
}
