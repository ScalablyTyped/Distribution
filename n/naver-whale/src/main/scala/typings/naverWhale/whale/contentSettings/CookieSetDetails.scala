package typings.naverWhale.whale.contentSettings

import typings.naverWhale.naverWhaleStrings.allow
import typings.naverWhale.naverWhaleStrings.block
import typings.naverWhale.naverWhaleStrings.session_only
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieSetDetails
  extends StObject
     with typings.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_CookieSetDetails: allow | block | session_only
}
object CookieSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block | session_only): CookieSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieSetDetails]
  }
  
  extension [Self <: CookieSetDetails](x: Self) {
    
    inline def setSetting(value: allow | block | session_only): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
