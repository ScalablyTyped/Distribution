package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionAppLearningSummary
  extends StObject
     with Entity {
  
  // Application Name
  var applicationName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Application Type. Possible values are: universal, desktop.
  var applicationType: js.UndefOr[ApplicationType] = js.undefined
  
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.undefined
}
object WindowsInformationProtectionAppLearningSummary {
  
  inline def apply(): WindowsInformationProtectionAppLearningSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionAppLearningSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsInformationProtectionAppLearningSummary] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: NullableOption[String]): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setApplicationType(value: ApplicationType): Self = StObject.set(x, "applicationType", value.asInstanceOf[js.Any])
    
    inline def setApplicationTypeUndefined: Self = StObject.set(x, "applicationType", js.undefined)
    
    inline def setDeviceCount(value: Double): Self = StObject.set(x, "deviceCount", value.asInstanceOf[js.Any])
    
    inline def setDeviceCountUndefined: Self = StObject.set(x, "deviceCount", js.undefined)
  }
}
