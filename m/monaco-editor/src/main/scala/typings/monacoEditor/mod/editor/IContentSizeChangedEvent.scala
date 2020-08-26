package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContentSizeChangedEvent extends js.Object {
  val contentHeight: Double = js.native
  val contentHeightChanged: Boolean = js.native
  val contentWidth: Double = js.native
  val contentWidthChanged: Boolean = js.native
}

object IContentSizeChangedEvent {
  @scala.inline
  def apply(
    contentHeight: Double,
    contentHeightChanged: Boolean,
    contentWidth: Double,
    contentWidthChanged: Boolean
  ): IContentSizeChangedEvent = {
    val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], contentHeightChanged = contentHeightChanged.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], contentWidthChanged = contentWidthChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentSizeChangedEvent]
  }
  @scala.inline
  implicit class IContentSizeChangedEventOps[Self <: IContentSizeChangedEvent] (val x: Self) extends AnyVal {
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
    def setContentHeight(value: Double): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentHeightChanged(value: Boolean): Self = this.set("contentHeightChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentWidth(value: Double): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentWidthChanged(value: Boolean): Self = this.set("contentWidthChanged", value.asInstanceOf[js.Any])
  }
  
}

