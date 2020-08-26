package typings.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryAction extends js.Object {
  var maybe: js.UndefOr[CategoryActionData] = js.native
  var no: js.UndefOr[CategoryActionData] = js.native
  var yes: js.UndefOr[CategoryActionData] = js.native
}

object CategoryAction {
  @scala.inline
  def apply(): CategoryAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryAction]
  }
  @scala.inline
  implicit class CategoryActionOps[Self <: CategoryAction] (val x: Self) extends AnyVal {
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
    def setMaybe(value: CategoryActionData): Self = this.set("maybe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaybe: Self = this.set("maybe", js.undefined)
    @scala.inline
    def setNo(value: CategoryActionData): Self = this.set("no", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo: Self = this.set("no", js.undefined)
    @scala.inline
    def setYes(value: CategoryActionData): Self = this.set("yes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYes: Self = this.set("yes", js.undefined)
  }
  
}

