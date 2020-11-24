package typings.nodeZendesk.anon

import typings.nodeZendesk.mod.Users._UpdateIdPayload
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Externalids extends _UpdateIdPayload {
  
  var external_ids: js.Array[ZendeskID] = js.native
}
object Externalids {
  
  @scala.inline
  def apply(external_ids: js.Array[ZendeskID]): Externalids = {
    val __obj = js.Dynamic.literal(external_ids = external_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Externalids]
  }
  
  @scala.inline
  implicit class ExternalidsOps[Self <: Externalids] (val x: Self) extends AnyVal {
    
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
    def setExternal_idsVarargs(value: ZendeskID*): Self = this.set("external_ids", js.Array(value :_*))
    
    @scala.inline
    def setExternal_ids(value: js.Array[ZendeskID]): Self = this.set("external_ids", value.asInstanceOf[js.Any])
  }
}
