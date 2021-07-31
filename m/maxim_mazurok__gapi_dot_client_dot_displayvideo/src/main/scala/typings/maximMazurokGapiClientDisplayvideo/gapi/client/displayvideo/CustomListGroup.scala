package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomListGroup extends StObject {
  
  /** Required. All custom list targeting settings in custom list group. Repeated settings with same id will be ignored. */
  var settings: js.UndefOr[js.Array[CustomListTargetingSetting]] = js.undefined
}
object CustomListGroup {
  
  @scala.inline
  def apply(): CustomListGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomListGroup]
  }
  
  @scala.inline
  implicit class CustomListGroupMutableBuilder[Self <: CustomListGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettings(value: js.Array[CustomListTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: CustomListTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
