package typings.naverWhale.whale.contentSettings

import typings.naverWhale.naverWhaleStrings.allow
import typings.naverWhale.naverWhaleStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JavascriptSetDetails
  extends typings.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_JavascriptSetDetails: allow | block = js.native
}
object JavascriptSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block): JavascriptSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavascriptSetDetails]
  }
  
  @scala.inline
  implicit class JavascriptSetDetailsMutableBuilder[Self <: JavascriptSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
