package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.PaginablePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditsListPayload
  extends StObject
     with PaginablePayload {
  
  val audits: js.Array[Audit]
}
object AuditsListPayload {
  
  @scala.inline
  def apply(audits: js.Array[Audit], count: Double): AuditsListPayload = {
    val __obj = js.Dynamic.literal(audits = audits.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], next_page = null, previous_page = null)
    __obj.asInstanceOf[AuditsListPayload]
  }
  
  @scala.inline
  implicit class AuditsListPayloadMutableBuilder[Self <: AuditsListPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudits(value: js.Array[Audit]): Self = StObject.set(x, "audits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditsVarargs(value: Audit*): Self = StObject.set(x, "audits", js.Array(value :_*))
  }
}
