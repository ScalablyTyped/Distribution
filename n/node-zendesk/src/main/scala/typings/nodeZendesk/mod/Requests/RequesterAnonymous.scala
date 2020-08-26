package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequesterAnonymous extends js.Object {
  var email: js.UndefOr[String] = js.native
  var locale_id: js.UndefOr[ZendeskID] = js.native
  var name: String = js.native
}

object RequesterAnonymous {
  @scala.inline
  def apply(name: String): RequesterAnonymous = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAnonymous]
  }
  @scala.inline
  implicit class RequesterAnonymousOps[Self <: RequesterAnonymous] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setLocale_id(value: ZendeskID): Self = this.set("locale_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale_id: Self = this.set("locale_id", js.undefined)
  }
  
}

