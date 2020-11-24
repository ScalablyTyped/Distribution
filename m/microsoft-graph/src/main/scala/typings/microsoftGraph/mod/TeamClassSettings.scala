package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamClassSettings extends js.Object {
  
  /**
    * If set to true, enables sending of weekly assignments digest emails to parents/guardians, provided the tenant admin has
    * enabled the setting globally.
    */
  var notifyGuardiansAboutAssignments: js.UndefOr[NullableOption[Boolean]] = js.native
}
object TeamClassSettings {
  
  @scala.inline
  def apply(): TeamClassSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamClassSettings]
  }
  
  @scala.inline
  implicit class TeamClassSettingsOps[Self <: TeamClassSettings] (val x: Self) extends AnyVal {
    
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
    def setNotifyGuardiansAboutAssignments(value: NullableOption[Boolean]): Self = this.set("notifyGuardiansAboutAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyGuardiansAboutAssignments: Self = this.set("notifyGuardiansAboutAssignments", js.undefined)
    
    @scala.inline
    def setNotifyGuardiansAboutAssignmentsNull: Self = this.set("notifyGuardiansAboutAssignments", null)
  }
}
