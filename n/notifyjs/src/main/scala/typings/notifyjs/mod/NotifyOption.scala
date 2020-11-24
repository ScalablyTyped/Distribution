package typings.notifyjs.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the Notify's optional parameter.
  */
@js.native
trait NotifyOption extends js.Object {
  
  /**
    * notification message body
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * path for icon to display in notification
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * callback when notification is clicked
    */
  var notifyClick: js.UndefOr[js.Function] = js.native
  
  /**
    * callback when notification is closed
    */
  var notifyClose: js.UndefOr[js.Function] = js.native
  
  /**
    * callback when notification throws an error
    */
  var notifyError: js.UndefOr[js.Function] = js.native
  
  /**
    * callback when notification is shown
    */
  var notifyShow: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  
  /**
    * callback when user has denied permission
    */
  var permissionDenied: js.UndefOr[js.Function] = js.native
  
  /**
    *  callback when user has granted permission
    */
  var permissionGranted: js.UndefOr[js.Function] = js.native
  
  /**
    * whether we expect for user interaction or not
    * in case value is true the timeout for closing the notification won't be set
    */
  var requireInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * whether this notification should be silent or not
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * unique identifier to stop duplicate notifications
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * number of seconds to close the notification automatically
    */
  var timeout: js.UndefOr[Double] = js.native
}
object NotifyOption {
  
  @scala.inline
  def apply(): NotifyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyOption]
  }
  
  @scala.inline
  implicit class NotifyOptionOps[Self <: NotifyOption] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setNotifyClick(value: js.Function): Self = this.set("notifyClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyClick: Self = this.set("notifyClick", js.undefined)
    
    @scala.inline
    def setNotifyClose(value: js.Function): Self = this.set("notifyClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyClose: Self = this.set("notifyClose", js.undefined)
    
    @scala.inline
    def setNotifyError(value: js.Function): Self = this.set("notifyError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyError: Self = this.set("notifyError", js.undefined)
    
    @scala.inline
    def setNotifyShow(value: /* e */ Event => _): Self = this.set("notifyShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyShow: Self = this.set("notifyShow", js.undefined)
    
    @scala.inline
    def setPermissionDenied(value: js.Function): Self = this.set("permissionDenied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionDenied: Self = this.set("permissionDenied", js.undefined)
    
    @scala.inline
    def setPermissionGranted(value: js.Function): Self = this.set("permissionGranted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionGranted: Self = this.set("permissionGranted", js.undefined)
    
    @scala.inline
    def setRequireInteraction(value: Boolean): Self = this.set("requireInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireInteraction: Self = this.set("requireInteraction", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
