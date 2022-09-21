package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAudienceGroup extends StObject {
  
  /** Required. All Google audience targeting settings in Google audience group. Repeated settings with same id will be ignored. */
  var settings: js.UndefOr[js.Array[GoogleAudienceTargetingSetting]] = js.undefined
}
object GoogleAudienceGroup {
  
  inline def apply(): GoogleAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAudienceGroup]
  }
  
  extension [Self <: GoogleAudienceGroup](x: Self) {
    
    inline def setSettings(value: js.Array[GoogleAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: GoogleAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
