package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstAndThirdPartyAudienceGroup extends StObject {
  
  /** Required. All first and third party audience targeting settings in first and third party audience group. Repeated settings with same id are not allowed. */
  var settings: js.UndefOr[js.Array[FirstAndThirdPartyAudienceTargetingSetting]] = js.undefined
}
object FirstAndThirdPartyAudienceGroup {
  
  inline def apply(): FirstAndThirdPartyAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstAndThirdPartyAudienceGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstAndThirdPartyAudienceGroup] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: js.Array[FirstAndThirdPartyAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setSettingsVarargs(value: FirstAndThirdPartyAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value*))
  }
}
