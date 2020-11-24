package typings.phonegapPluginPush.PhonegapPluginPush

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * TODO: document all possible properties (I only got the android ones)
	 *
	 * Loosened up with a dictionary notation, but all non-defined properties need to use (map['prop']) notation
	 *
	 * Ideally the developer would overload (merged declaration) this or create a new interface that would extend this one
	 * so that he could specify any custom code without having to use array notation (map['prop']) for all of them.
	 */
@js.native
trait NotificationEventAdditionalData
  extends /* name */ StringDictionary[js.Any] {
  
  /**
  		 * Will be true if the application is started by clicking on the push notification, false if the app is already started. (Android/iOS only)
  		 */
  var coldstart: js.UndefOr[Boolean] = js.native
  
  var collapse_key: js.UndefOr[String] = js.native
  
  /**
  		 * Whether the notification was received while the app was in the foreground
  		 */
  var foreground: js.UndefOr[Boolean] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var notId: js.UndefOr[String] = js.native
}
object NotificationEventAdditionalData {
  
  @scala.inline
  def apply(): NotificationEventAdditionalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationEventAdditionalData]
  }
  
  @scala.inline
  implicit class NotificationEventAdditionalDataOps[Self <: NotificationEventAdditionalData] (val x: Self) extends AnyVal {
    
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
    def setColdstart(value: Boolean): Self = this.set("coldstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColdstart: Self = this.set("coldstart", js.undefined)
    
    @scala.inline
    def setCollapse_key(value: String): Self = this.set("collapse_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse_key: Self = this.set("collapse_key", js.undefined)
    
    @scala.inline
    def setForeground(value: Boolean): Self = this.set("foreground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeground: Self = this.set("foreground", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setNotId(value: String): Self = this.set("notId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotId: Self = this.set("notId", js.undefined)
  }
}
