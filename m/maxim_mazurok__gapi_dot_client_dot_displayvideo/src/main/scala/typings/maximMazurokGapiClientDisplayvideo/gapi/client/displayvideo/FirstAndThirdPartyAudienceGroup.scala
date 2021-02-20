package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirstAndThirdPartyAudienceGroup extends StObject {
  
  /** Required. All first and third party audience targeting settings in first and third party audience group. Repeated settings with same id are not allowed. */
  var settings: js.UndefOr[js.Array[FirstAndThirdPartyAudienceTargetingSetting]] = js.native
}
object FirstAndThirdPartyAudienceGroup {
  
  @scala.inline
  def apply(): FirstAndThirdPartyAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstAndThirdPartyAudienceGroup]
  }
  
  @scala.inline
  implicit class FirstAndThirdPartyAudienceGroupMutableBuilder[Self <: FirstAndThirdPartyAudienceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettings(value: js.Array[FirstAndThirdPartyAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: FirstAndThirdPartyAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
