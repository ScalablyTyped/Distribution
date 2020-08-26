package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for how a dialog is displayed.
  */
@js.native
trait DialogOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Determines whether the dialog box should be displayed within an IFrame. This setting is only applicable in Office on the web, and is 
    * ignored by other platforms. If false (default), the dialog will be displayed as a new browser window (pop-up). Recommended for 
    * authentication pages that cannot be displayed in an IFrame. If true, the dialog will be displayed as a floating overlay with an IFrame. 
    * This is best for user experience and performance.
    */
  var displayInIframe: js.UndefOr[Boolean] = js.native
  /**
    * Defines the width of the dialog as a percentage of the current display. Defaults to 80%. 250px minimum.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Determines if the pop-up blocker dialog will be shown to the user. Defaults to true.
    * 
    * `true` - The framework displays a pop-up to trigger the navigation and avoid the browser's pop-up blocker.
    * `false` - The dialog will not be shown and the developer must handle pop-ups (by providing a user interface artifact to trigger the navigation).
    */
  var promptBeforeOpen: js.UndefOr[Boolean] = js.native
  /**
    * Defines the height of the dialog as a percentage of the current display. Defaults to 80%. 150px minimum.
    */
  var width: js.UndefOr[Double] = js.native
}

object DialogOptions {
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  @scala.inline
  implicit class DialogOptionsOps[Self <: DialogOptions] (val x: Self) extends AnyVal {
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setDisplayInIframe(value: Boolean): Self = this.set("displayInIframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayInIframe: Self = this.set("displayInIframe", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPromptBeforeOpen(value: Boolean): Self = this.set("promptBeforeOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptBeforeOpen: Self = this.set("promptBeforeOpen", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

