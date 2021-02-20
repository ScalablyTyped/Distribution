package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionNetworkLearningSummary extends Entity {
  
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.native
  
  // Website url
  var url: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsInformationProtectionNetworkLearningSummary {
  
  @scala.inline
  def apply(): WindowsInformationProtectionNetworkLearningSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionNetworkLearningSummary]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionNetworkLearningSummaryMutableBuilder[Self <: WindowsInformationProtectionNetworkLearningSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCountUndefined: Self = StObject.set(x, "deviceCount", js.undefined)
    
    @scala.inline
    def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
