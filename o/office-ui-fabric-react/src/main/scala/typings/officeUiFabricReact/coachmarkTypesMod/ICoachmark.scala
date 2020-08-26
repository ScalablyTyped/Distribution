package typings.officeUiFabricReact.coachmarkTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmark extends js.Object {
  /**
    * Forces the Coachmark to dismiss
    */
  var dismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
}

object ICoachmark {
  @scala.inline
  def apply(): ICoachmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICoachmark]
  }
  @scala.inline
  implicit class ICoachmarkOps[Self <: ICoachmark] (val x: Self) extends AnyVal {
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
    def setDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("dismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDismiss: Self = this.set("dismiss", js.undefined)
  }
  
}

