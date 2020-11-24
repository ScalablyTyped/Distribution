package typings.phonegapPluginPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearBadge extends js.Object {
  
  /**
  			 * If true the icon badge will be cleared on init and before push messages are processed. Default is false.
  			 */
  var clearBadge: js.UndefOr[Boolean] = js.native
  
  /**
  			 * If true the app clears all pending notifications when it is closed. Default is true.
  			 */
  var clearNotifications: js.UndefOr[Boolean] = js.native
  
  /**
  			 * If true will always show a notification, even when the app is on the foreground. Default is false.
  			 */
  var forceShow: js.UndefOr[Boolean] = js.native
  
  /**
  			 * The name of a drawable resource to use as the small-icon. The name should not include the extension.
  			 */
  var icon: js.UndefOr[String] = js.native
  
  /**
  			 * Sets the background color of the small icon on Android 5.0 and greater.
  			 * Supported Formats - http://developer.android.com/reference/android/graphics/Color.html#parseColor(java.lang.String)
  			 */
  var iconColor: js.UndefOr[String] = js.native
  
  /**
  			 * The key to search for text of notification. Default is 'message'.
  			 */
  var messageKey: js.UndefOr[String] = js.native
  
  /**
  			 * If true it plays the sound specified in the push data or the default system sound. Default is true.
  			 */
  var sound: js.UndefOr[Boolean] = js.native
  
  /**
  			 * The key to search for title of notification. Default is 'title'.
  			 */
  var titleKey: js.UndefOr[String] = js.native
  
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a GcmPubSub topic.
  			 */
  var topics: js.UndefOr[js.Array[String]] = js.native
  
  /**
  			 * If true the device vibrates on receipt of notification. Default is true.
  			 */
  var vibrate: js.UndefOr[Boolean] = js.native
}
object ClearBadge {
  
  @scala.inline
  def apply(): ClearBadge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearBadge]
  }
  
  @scala.inline
  implicit class ClearBadgeOps[Self <: ClearBadge] (val x: Self) extends AnyVal {
    
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
    def setClearBadge(value: Boolean): Self = this.set("clearBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBadge: Self = this.set("clearBadge", js.undefined)
    
    @scala.inline
    def setClearNotifications(value: Boolean): Self = this.set("clearNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearNotifications: Self = this.set("clearNotifications", js.undefined)
    
    @scala.inline
    def setForceShow(value: Boolean): Self = this.set("forceShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceShow: Self = this.set("forceShow", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setMessageKey(value: String): Self = this.set("messageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageKey: Self = this.set("messageKey", js.undefined)
    
    @scala.inline
    def setSound(value: Boolean): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setTitleKey(value: String): Self = this.set("titleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleKey: Self = this.set("titleKey", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: String*): Self = this.set("topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: js.Array[String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
    
    @scala.inline
    def setVibrate(value: Boolean): Self = this.set("vibrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVibrate: Self = this.set("vibrate", js.undefined)
  }
}
