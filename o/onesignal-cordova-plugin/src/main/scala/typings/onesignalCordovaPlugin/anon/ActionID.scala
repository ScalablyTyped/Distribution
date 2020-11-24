package typings.onesignalCordovaPlugin.anon

import typings.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionID extends js.Object {
  
  var actionID: js.UndefOr[String] = js.native
  
  var `type`: OSActionType = js.native
}
object ActionID {
  
  @scala.inline
  def apply(`type`: OSActionType): ActionID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionID]
  }
  
  @scala.inline
  implicit class ActionIDOps[Self <: ActionID] (val x: Self) extends AnyVal {
    
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
    def setType(value: OSActionType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionID(value: String): Self = this.set("actionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionID: Self = this.set("actionID", js.undefined)
  }
}
