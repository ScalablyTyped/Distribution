package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosLobApp
  extends StObject
     with MobileLobApp {
  
  // The iOS architecture for which this app can run on.
  var applicableDeviceType: js.UndefOr[IosDeviceType] = js.undefined
  
  // The build number of iOS Line of Business (LoB) app.
  var buildNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Identity Name.
  var bundleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The expiration time.
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[IosMinimumOperatingSystem]] = js.undefined
  
  // The version number of iOS Line of Business (LoB) app.
  var versionNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosLobApp {
  
  inline def apply(): IosLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosLobApp]
  }
  
  extension [Self <: IosLobApp](x: Self) {
    
    inline def setApplicableDeviceType(value: IosDeviceType): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    inline def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    inline def setBuildNumber(value: NullableOption[String]): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setMinimumSupportedOperatingSystem(value: NullableOption[IosMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    inline def setVersionNumber(value: NullableOption[String]): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
