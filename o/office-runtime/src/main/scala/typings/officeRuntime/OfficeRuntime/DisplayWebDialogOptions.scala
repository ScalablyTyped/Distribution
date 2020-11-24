package typings.officeRuntime.OfficeRuntime

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides display options and actions a dialog box may take. */
@js.native
trait DisplayWebDialogOptions extends js.Object {
  
  /**
    * Optional parameter that determines whether the dialog box displays as a popup (false) or within an IFrame (true).
    * This setting is only applicable to custom functions running on Excel Online.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var displayInIFrame: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional parameter that defines the height of the dialog box as a percentage of the current display.
    * For example, accepts strings such as: '50%', '50'.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var height: js.UndefOr[String] = js.native
  
  /**
    * Optional callback that runs when the dialog box is closed.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Optional callback that runs when the dialog box sends a message to its parent.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onMessage: js.UndefOr[js.Function2[/* message */ String, /* dialog */ js.UndefOr[Dialog], Unit]] = js.native
  
  /**
    * Optional callback that runs when the dialog box sends an error.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var onRuntimeError: js.UndefOr[js.Function2[/* error */ Error, /* dialog */ js.UndefOr[Dialog], Unit]] = js.native
  
  /**
    * Optional parameter that defines the width of dialog as a percentage of window.
    * For example, accepts strings such as: '50%', '50'.
    *
    * [Api set: SharedRuntime 1.1]
    *
    */
  var width: js.UndefOr[String] = js.native
}
object DisplayWebDialogOptions {
  
  @scala.inline
  def apply(): DisplayWebDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayWebDialogOptions]
  }
  
  @scala.inline
  implicit class DisplayWebDialogOptionsOps[Self <: DisplayWebDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setDisplayInIFrame(value: Boolean): Self = this.set("displayInIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayInIFrame: Self = this.set("displayInIFrame", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnMessage(value: (/* message */ String, /* dialog */ js.UndefOr[Dialog]) => Unit): Self = this.set("onMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMessage: Self = this.set("onMessage", js.undefined)
    
    @scala.inline
    def setOnRuntimeError(value: (/* error */ Error, /* dialog */ js.UndefOr[Dialog]) => Unit): Self = this.set("onRuntimeError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRuntimeError: Self = this.set("onRuntimeError", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
