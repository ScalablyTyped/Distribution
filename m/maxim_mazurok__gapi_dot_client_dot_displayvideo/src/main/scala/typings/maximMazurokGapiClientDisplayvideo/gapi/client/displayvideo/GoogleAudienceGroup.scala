package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAudienceGroup extends StObject {
  
  /** Required. All Google audience targeting settings in Google audience group. Repeated settings with same id will be ignored. */
  var settings: js.UndefOr[js.Array[GoogleAudienceTargetingSetting]] = js.native
}
object GoogleAudienceGroup {
  
  @scala.inline
  def apply(): GoogleAudienceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAudienceGroup]
  }
  
  @scala.inline
  implicit class GoogleAudienceGroupMutableBuilder[Self <: GoogleAudienceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettings(value: js.Array[GoogleAudienceTargetingSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: GoogleAudienceTargetingSetting*): Self = StObject.set(x, "settings", js.Array(value :_*))
  }
}
