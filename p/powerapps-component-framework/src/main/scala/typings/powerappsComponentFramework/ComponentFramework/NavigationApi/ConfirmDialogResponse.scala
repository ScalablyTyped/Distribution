package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
  */
@js.native
trait ConfirmDialogResponse extends js.Object {
  /**
    *  confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
    */
  var confirmed: Boolean = js.native
}

object ConfirmDialogResponse {
  @scala.inline
  def apply(confirmed: Boolean): ConfirmDialogResponse = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogResponse]
  }
  @scala.inline
  implicit class ConfirmDialogResponseOps[Self <: ConfirmDialogResponse] (val x: Self) extends AnyVal {
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
    def setConfirmed(value: Boolean): Self = this.set("confirmed", value.asInstanceOf[js.Any])
  }
  
}

