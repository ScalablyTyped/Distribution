package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionAppLearningSummary extends Entity {
  
  // Application Name
  var applicationName: js.UndefOr[NullableOption[String]] = js.native
  
  // Application Type. Possible values are: universal, desktop.
  var applicationType: js.UndefOr[ApplicationType] = js.native
  
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.native
}
object WindowsInformationProtectionAppLearningSummary {
  
  @scala.inline
  def apply(): WindowsInformationProtectionAppLearningSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionAppLearningSummary]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionAppLearningSummaryMutableBuilder[Self <: WindowsInformationProtectionAppLearningSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: NullableOption[String]): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setApplicationType(value: ApplicationType): Self = StObject.set(x, "applicationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationTypeUndefined: Self = StObject.set(x, "applicationType", js.undefined)
    
    @scala.inline
    def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCountUndefined: Self = StObject.set(x, "deviceCount", js.undefined)
  }
}
