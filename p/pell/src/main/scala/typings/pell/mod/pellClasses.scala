package typings.pell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait pellClasses extends js.Object {
  var actionbar: js.UndefOr[String] = js.native
  var button: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
}

object pellClasses {
  @scala.inline
  def apply(): pellClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pellClasses]
  }
  @scala.inline
  implicit class pellClassesOps[Self <: pellClasses] (val x: Self) extends AnyVal {
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
    def setActionbar(value: String): Self = this.set("actionbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionbar: Self = this.set("actionbar", js.undefined)
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

