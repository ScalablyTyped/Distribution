package typings.naverWhale.whale.contentSettings

import typings.naverWhale.naverWhaleStrings.allow
import typings.naverWhale.naverWhaleStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesSetDetails
  extends StObject
     with typings.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_ImagesSetDetails: allow | block
}
object ImagesSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block): ImagesSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagesSetDetails]
  }
  
  @scala.inline
  implicit class ImagesSetDetailsMutableBuilder[Self <: ImagesSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
