package typings.phonegapPluginPush.anon

import typings.phonegapPluginPush.PhonegapPluginPush.CategoryArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alert extends js.Object {
  
  /**
  			 * If true|"true" the device shows an alert on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var alert: js.UndefOr[Boolean | String] = js.native
  
  /**
  			 * If true|"true" the device sets the badge number on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var badge: js.UndefOr[Boolean | String] = js.native
  
  /**
  			 * The data required in order to enable Action Buttons for iOS.
  			 * Action Buttons on iOS - https://github.com/phonegap/phonegap-plugin-push/blob/master/docs/PAYLOAD.md#action-buttons-1
  			 */
  var categories: js.UndefOr[CategoryArray] = js.native
  
  /**
  			 * If true|"true" the badge will be cleared on app startup. Defaults to false|"false".
  			 */
  var clearBadge: js.UndefOr[Boolean | String] = js.native
  
  /**
  			 * Whether to use prod or sandbox GCM setting. Defaults to false.
  			 */
  var fcmSandbox: js.UndefOr[Boolean] = js.native
  
  /**
  			 * If true|"true" the device plays a sound on receipt of notification.
  			 * Default is false|"false".
  			 * Note: the value you set this option to the first time you call the init method will be how the application always acts.
  			 * Once this is set programmatically in the init method it can only be changed manually by the user in Settings>Notifications>App Name.
  			 * This is normal iOS behaviour.
  			 */
  var sound: js.UndefOr[Boolean | String] = js.native
  
  /**
  			 * If the array contains one or more strings each string will be used to subscribe to a FcmPubSub topic. Defaults to [].
  			 */
  var topics: js.UndefOr[js.Array[String]] = js.native
  
  /**
  			 * If true|"true" the device will be set up to receive VoIP Push notifications and the other options will be ignored
  			 * since VoIP notifications are silent notifications that should be handled in the "notification" event.
  			 * Default is false|"false".
  			 */
  var voip: js.UndefOr[Boolean | String] = js.native
}
object Alert {
  
  @scala.inline
  def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: Boolean | String): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    
    @scala.inline
    def setBadge(value: Boolean | String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setCategories(value: CategoryArray): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setClearBadge(value: Boolean | String): Self = this.set("clearBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearBadge: Self = this.set("clearBadge", js.undefined)
    
    @scala.inline
    def setFcmSandbox(value: Boolean): Self = this.set("fcmSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFcmSandbox: Self = this.set("fcmSandbox", js.undefined)
    
    @scala.inline
    def setSound(value: Boolean | String): Self = this.set("sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("sound", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: String*): Self = this.set("topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: js.Array[String]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
    
    @scala.inline
    def setVoip(value: Boolean | String): Self = this.set("voip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoip: Self = this.set("voip", js.undefined)
  }
}
