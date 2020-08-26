package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  var actions: js.UndefOr[js.Array[AuthenticationRequired]] = js.native
  var identifier: js.UndefOr[String] = js.native
}

object Actions {
  @scala.inline
  def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: AuthenticationRequired*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[AuthenticationRequired]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
  
}

