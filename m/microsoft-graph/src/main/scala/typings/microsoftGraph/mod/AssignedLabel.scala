package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignedLabel extends js.Object {
  var displayName: js.UndefOr[String] = js.native
  var labelId: js.UndefOr[String] = js.native
}

object AssignedLabel {
  @scala.inline
  def apply(): AssignedLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedLabel]
  }
  @scala.inline
  implicit class AssignedLabelOps[Self <: AssignedLabel] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
  }
  
}

