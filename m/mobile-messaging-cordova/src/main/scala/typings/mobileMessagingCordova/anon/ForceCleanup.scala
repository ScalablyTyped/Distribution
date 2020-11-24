package typings.mobileMessagingCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceCleanup extends js.Object {
  
  var forceCleanup: js.UndefOr[Boolean] = js.native
  
  var logging: js.UndefOr[Boolean] = js.native
  
  var notificationTypes: js.UndefOr[js.Array[String]] = js.native
}
object ForceCleanup {
  
  @scala.inline
  def apply(): ForceCleanup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceCleanup]
  }
  
  @scala.inline
  implicit class ForceCleanupOps[Self <: ForceCleanup] (val x: Self) extends AnyVal {
    
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
    def setForceCleanup(value: Boolean): Self = this.set("forceCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceCleanup: Self = this.set("forceCleanup", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setNotificationTypesVarargs(value: String*): Self = this.set("notificationTypes", js.Array(value :_*))
    
    @scala.inline
    def setNotificationTypes(value: js.Array[String]): Self = this.set("notificationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationTypes: Self = this.set("notificationTypes", js.undefined)
  }
}
