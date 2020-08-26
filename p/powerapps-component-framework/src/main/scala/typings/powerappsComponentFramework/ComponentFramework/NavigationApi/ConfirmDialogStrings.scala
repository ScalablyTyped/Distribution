package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the String parameters for Confirm Dialog.
  */
@js.native
trait ConfirmDialogStrings extends js.Object {
  /**
    * Cancel Button label.
    */
  var cancelButtonLabel: js.UndefOr[String] = js.native
  /**
    * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[String] = js.native
  /**
    * Confirm Dialog Subtitle
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Confirm Dialog Text\Message.
    */
  var text: String = js.native
  /**
    * Confirm Dialog Title.
    */
  var title: js.UndefOr[String] = js.native
}

object ConfirmDialogStrings {
  @scala.inline
  def apply(text: String): ConfirmDialogStrings = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmDialogStrings]
  }
  @scala.inline
  implicit class ConfirmDialogStringsOps[Self <: ConfirmDialogStrings] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelButtonLabel(value: String): Self = this.set("cancelButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonLabel: Self = this.set("cancelButtonLabel", js.undefined)
    @scala.inline
    def setConfirmButtonLabel(value: String): Self = this.set("confirmButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmButtonLabel: Self = this.set("confirmButtonLabel", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

