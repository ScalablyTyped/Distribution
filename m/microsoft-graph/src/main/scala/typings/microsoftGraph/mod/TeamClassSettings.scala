package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamClassSettings extends StObject {
  
  /**
    * If set to true, enables sending of weekly assignments digest emails to parents/guardians, provided the tenant admin has
    * enabled the setting globally.
    */
  var notifyGuardiansAboutAssignments: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object TeamClassSettings {
  
  @scala.inline
  def apply(): TeamClassSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeamClassSettings]
  }
  
  @scala.inline
  implicit class TeamClassSettingsMutableBuilder[Self <: TeamClassSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyGuardiansAboutAssignments(value: NullableOption[Boolean]): Self = StObject.set(x, "notifyGuardiansAboutAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyGuardiansAboutAssignmentsNull: Self = StObject.set(x, "notifyGuardiansAboutAssignments", null)
    
    @scala.inline
    def setNotifyGuardiansAboutAssignmentsUndefined: Self = StObject.set(x, "notifyGuardiansAboutAssignments", js.undefined)
  }
}
