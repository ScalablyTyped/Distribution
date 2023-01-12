package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionNetworkLearningSummary
  extends StObject
     with Entity {
  
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.undefined
  
  // Website url
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsInformationProtectionNetworkLearningSummary {
  
  inline def apply(): WindowsInformationProtectionNetworkLearningSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionNetworkLearningSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsInformationProtectionNetworkLearningSummary] (val x: Self) extends AnyVal {
    
    inline def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
    
    inline def setDeviceCountUndefined: Self = StObject.set(x, "deviceCount", js.undefined)
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
