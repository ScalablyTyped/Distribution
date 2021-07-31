package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksSetSuitesPreferencesParamsAutoTriggerChecks extends StObject {
  
  var app_id: Double
  
  var setting: Boolean
}
object ChecksSetSuitesPreferencesParamsAutoTriggerChecks {
  
  @scala.inline
  def apply(app_id: Double, setting: Boolean): ChecksSetSuitesPreferencesParamsAutoTriggerChecks = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesParamsAutoTriggerChecks]
  }
  
  @scala.inline
  implicit class ChecksSetSuitesPreferencesParamsAutoTriggerChecksMutableBuilder[Self <: ChecksSetSuitesPreferencesParamsAutoTriggerChecks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetting(value: Boolean): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
