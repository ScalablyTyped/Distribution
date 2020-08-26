package typings.nodeZendesk.anon

import typings.nodeZendesk.mod.Users._UpdateIdPayload
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ids extends _UpdateIdPayload {
  var ids: js.Array[ZendeskID] = js.native
}

object Ids {
  @scala.inline
  def apply(ids: js.Array[ZendeskID]): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  @scala.inline
  implicit class IdsOps[Self <: Ids] (val x: Self) extends AnyVal {
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
    def setIdsVarargs(value: ZendeskID*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[ZendeskID]): Self = this.set("ids", value.asInstanceOf[js.Any])
  }
  
}

