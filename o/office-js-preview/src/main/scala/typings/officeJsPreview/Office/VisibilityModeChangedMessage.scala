package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message used in the `onVisibilityModeChanged` invocation.
  */
@js.native
trait VisibilityModeChangedMessage extends js.Object {
  /**
    * Visibility changed state.
    */
  var visibilityMode: VisibilityMode = js.native
}

object VisibilityModeChangedMessage {
  @scala.inline
  def apply(visibilityMode: VisibilityMode): VisibilityModeChangedMessage = {
    val __obj = js.Dynamic.literal(visibilityMode = visibilityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityModeChangedMessage]
  }
  @scala.inline
  implicit class VisibilityModeChangedMessageOps[Self <: VisibilityModeChangedMessage] (val x: Self) extends AnyVal {
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
    def setVisibilityMode(value: VisibilityMode): Self = this.set("visibilityMode", value.asInstanceOf[js.Any])
  }
  
}

