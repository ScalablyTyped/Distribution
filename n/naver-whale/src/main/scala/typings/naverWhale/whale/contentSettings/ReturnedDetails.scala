package typings.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnedDetails extends StObject {
  
  /** The content setting. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any
}
object ReturnedDetails {
  
  inline def apply(setting: js.Any): ReturnedDetails = {
    val __obj = js.Dynamic.literal(setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedDetails]
  }
  
  extension [Self <: ReturnedDetails](x: Self) {
    
    inline def setSetting(value: js.Any): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
