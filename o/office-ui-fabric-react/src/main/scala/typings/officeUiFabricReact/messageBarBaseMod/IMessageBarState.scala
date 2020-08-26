package typings.officeUiFabricReact.messageBarBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBarState extends js.Object {
  var expandSingleLine: js.UndefOr[Boolean] = js.native
  var labelId: js.UndefOr[String] = js.native
  var showContent: js.UndefOr[Boolean] = js.native
}

object IMessageBarState {
  @scala.inline
  def apply(): IMessageBarState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBarState]
  }
  @scala.inline
  implicit class IMessageBarStateOps[Self <: IMessageBarState] (val x: Self) extends AnyVal {
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
    def setExpandSingleLine(value: Boolean): Self = this.set("expandSingleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandSingleLine: Self = this.set("expandSingleLine", js.undefined)
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
    @scala.inline
    def setShowContent(value: Boolean): Self = this.set("showContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowContent: Self = this.set("showContent", js.undefined)
  }
  
}

