package typings.naverWhale.whale.contentSettings

import typings.naverWhale.naverWhaleStrings.allow
import typings.naverWhale.naverWhaleStrings.ask
import typings.naverWhale.naverWhaleStrings.block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PpapiBrokerSetDetails
  extends StObject
     with typings.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_PpapiBrokerSetDetails: allow | block | ask
}
object PpapiBrokerSetDetails {
  
  inline def apply(primaryPattern: String, setting: allow | block | ask): PpapiBrokerSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpapiBrokerSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PpapiBrokerSetDetails] (val x: Self) extends AnyVal {
    
    inline def setSetting(value: allow | block | ask): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
