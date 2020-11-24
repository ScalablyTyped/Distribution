package typings.naverWhale.whale.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationOptions extends js.Object {
  
  /**
    * Optional.
    * A URL to the app icon mask. URLs have the same restrictions as iconUrl. The app icon mask should be in alpha channel, as only the alpha channel of the image will be considered.
    * @since Chrome 38.
    */
  var appIconMaskUrl: js.UndefOr[String] = js.native
  
  /** Optional. Text and icons for up to two notification action buttons. */
  var buttons: js.UndefOr[js.Array[typings.chrome.chrome.notifications.ButtonOptions]] = js.native
  
  /**
    * Optional.
    * Alternate notification content with a lower-weight font.
    * @since Chrome 31.
    */
  var contextMessage: js.UndefOr[String] = js.native
  
  /** Optional. A timestamp associated with the notification, in milliseconds past the epoch (e.g. Date.now() + n). */
  var eventTime: js.UndefOr[Double] = js.native
  
  /**
    * Optional.
    * A URL to the sender's avatar, app icon, or a thumbnail for image notifications.
    * URLs can be a data URL, a blob URL, or a URL relative to a resource within this extension's .crx file Required for notifications.create method.
    */
  var iconUrl: js.UndefOr[String] = js.native
  
  /** Optional. A URL to the image thumbnail for image-type notifications. URLs have the same restrictions as iconUrl. */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * Whether to show UI indicating that the app will visibly respond to clicks on the body of a notification.
    * @since Chrome 32.
    */
  var isClickable: js.UndefOr[Boolean] = js.native
  
  /** Optional. Items for multi-item notifications. */
  var items: js.UndefOr[js.Array[typings.chrome.chrome.notifications.ItemOptions]] = js.native
  
  /** Optional. Main notification content. Required for notifications.create method. */
  var message: js.UndefOr[String] = js.native
  
  /** Optional. Priority ranges from -2 to 2. -2 is lowest priority. 2 is highest. Zero is default. */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * Optional.
    * Current progress ranges from 0 to 100.
    * @since Chrome 30.
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * Indicates that the notification should remain visible on screen until the user activates or dismisses the notification.
    * This defaults to false.
    * @since Chrome 50
    */
  var requireInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.
    * Indicates that no sounds or vibrations should be made when the notification is being shown. This defaults to false.
    * @since Chrome 70
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /** Optional. Title of the notification (e.g. sender name for email). Required for notifications.create method. */
  var title: js.UndefOr[String] = js.native
  
  /** Optional. Which type of notification to display. Required for notifications.create method. */
  var `type`: js.UndefOr[String] = js.native
}
object NotificationOptions {
  
  @scala.inline
  def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  @scala.inline
  implicit class NotificationOptionsOps[Self <: NotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setAppIconMaskUrl(value: String): Self = this.set("appIconMaskUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppIconMaskUrl: Self = this.set("appIconMaskUrl", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: typings.chrome.chrome.notifications.ButtonOptions*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[typings.chrome.chrome.notifications.ButtonOptions]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setContextMessage(value: String): Self = this.set("contextMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMessage: Self = this.set("contextMessage", js.undefined)
    
    @scala.inline
    def setEventTime(value: Double): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setIsClickable(value: Boolean): Self = this.set("isClickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClickable: Self = this.set("isClickable", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: typings.chrome.chrome.notifications.ItemOptions*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[typings.chrome.chrome.notifications.ItemOptions]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRequireInteraction(value: Boolean): Self = this.set("requireInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireInteraction: Self = this.set("requireInteraction", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
