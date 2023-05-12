package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOSLobApp
  extends StObject
     with MobileLobApp {
  
  // The build number of the package. This should match the package CFBundleShortVersionString of the .pkg file.
  var buildNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The primary bundleId of the package.
  var bundleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of ComplexType macOSLobChildApp objects. Represents the apps expected to be installed by the package.
  var childApps: js.UndefOr[NullableOption[js.Array[MacOSLobChildApp]]] = js.undefined
  
  /**
    * When TRUE, indicates that the app's version will NOT be used to detect if the app is installed on a device. When FALSE,
    * indicates that the app's version will be used to detect if the app is installed on a device. Set this to true for apps
    * that use a self update feature.
    */
  var ignoreVersionDetection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, indicates that the app will be installed as managed (requires macOS 11.0 and other managed package
    * restrictions). When FALSE, indicates that the app will be installed as unmanaged.
    */
  var installAsManaged: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The MD5 hash codes. This is empty if the package was uploaded directly. If the Intune App Wrapping Tool is used to
    * create a .intunemac, this value can be found inside the Detection.xml file.
    */
  var md5Hash: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The chunk size for MD5 hash. This is '0' or empty if the package was uploaded directly. If the Intune App Wrapping Tool
    * is used to create a .intunemac, this value can be found inside the Detection.xml file.
    */
  var md5HashChunkSize: js.UndefOr[Double] = js.undefined
  
  // ComplexType macOSMinimumOperatingSystem that indicates the minimum operating system applicable for the application.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[MacOSMinimumOperatingSystem]] = js.undefined
  
  // The version number of the package. This should match the package CFBundleVersion in the packageinfo file.
  var versionNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object MacOSLobApp {
  
  inline def apply(): MacOSLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacOSLobApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacOSLobApp] (val x: Self) extends AnyVal {
    
    inline def setBuildNumber(value: NullableOption[String]): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberNull: Self = StObject.set(x, "buildNumber", null)
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setChildApps(value: NullableOption[js.Array[MacOSLobChildApp]]): Self = StObject.set(x, "childApps", value.asInstanceOf[js.Any])
    
    inline def setChildAppsNull: Self = StObject.set(x, "childApps", null)
    
    inline def setChildAppsUndefined: Self = StObject.set(x, "childApps", js.undefined)
    
    inline def setChildAppsVarargs(value: MacOSLobChildApp*): Self = StObject.set(x, "childApps", js.Array(value*))
    
    inline def setIgnoreVersionDetection(value: Boolean): Self = StObject.set(x, "ignoreVersionDetection", value.asInstanceOf[js.Any])
    
    inline def setIgnoreVersionDetectionUndefined: Self = StObject.set(x, "ignoreVersionDetection", js.undefined)
    
    inline def setInstallAsManaged(value: Boolean): Self = StObject.set(x, "installAsManaged", value.asInstanceOf[js.Any])
    
    inline def setInstallAsManagedUndefined: Self = StObject.set(x, "installAsManaged", js.undefined)
    
    inline def setMd5Hash(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashChunkSize(value: Double): Self = StObject.set(x, "md5HashChunkSize", value.asInstanceOf[js.Any])
    
    inline def setMd5HashChunkSizeUndefined: Self = StObject.set(x, "md5HashChunkSize", js.undefined)
    
    inline def setMd5HashNull: Self = StObject.set(x, "md5Hash", null)
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setMd5HashVarargs(value: String*): Self = StObject.set(x, "md5Hash", js.Array(value*))
    
    inline def setMinimumSupportedOperatingSystem(value: NullableOption[MacOSMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    inline def setVersionNumber(value: NullableOption[String]): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
