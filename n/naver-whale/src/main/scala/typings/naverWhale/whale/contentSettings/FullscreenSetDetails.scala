package typings.naverWhale.whale.contentSettings

import typings.naverWhale.naverWhaleStrings.allow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullscreenSetDetails
  extends typings.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_FullscreenSetDetails: allow = js.native
}
object FullscreenSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow): FullscreenSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullscreenSetDetails]
  }
  
  @scala.inline
  implicit class FullscreenSetDetailsMutableBuilder[Self <: FullscreenSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
