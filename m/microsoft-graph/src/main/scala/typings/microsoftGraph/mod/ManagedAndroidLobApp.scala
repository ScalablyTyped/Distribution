package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAndroidLobApp
  extends StObject
     with ManagedMobileLobApp {
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[AndroidMinimumOperatingSystem]] = js.undefined
  
  // The package identifier.
  var packageId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version code of managed Android Line of Business (LoB) app.
  var versionCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version name of managed Android Line of Business (LoB) app.
  var versionName: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedAndroidLobApp {
  
  inline def apply(): ManagedAndroidLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAndroidLobApp]
  }
  
  extension [Self <: ManagedAndroidLobApp](x: Self) {
    
    inline def setMinimumSupportedOperatingSystem(value: NullableOption[AndroidMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    inline def setPackageId(value: NullableOption[String]): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdNull: Self = StObject.set(x, "packageId", null)
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
    
    inline def setVersionCode(value: NullableOption[String]): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeNull: Self = StObject.set(x, "versionCode", null)
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionName(value: NullableOption[String]): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameNull: Self = StObject.set(x, "versionName", null)
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
