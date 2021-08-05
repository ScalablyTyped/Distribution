package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomListGroup extends StObject {
  
  /** Required. All custom list targeting settings in custom list group. Repeated settings with same id will be ignored. */
  var settings: js.UndefOr[js.Array[CustomListTargetingSetting]] = js.undefined
}
object CustomListGroup {
  
  inline def apply(): CustomListGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomListGroup]
  }
  
  extension [Self <: CustomListGroup](x: Self) {
    
    inline def setSettings(value: js.Array[CustomListTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: CustomListTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
