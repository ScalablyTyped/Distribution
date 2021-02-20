package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedAndroidLobApp extends ManagedMobileLobApp {
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[NullableOption[AndroidMinimumOperatingSystem]] = js.native
  
  // The package identifier.
  var packageId: js.UndefOr[NullableOption[String]] = js.native
  
  // The version code of managed Android Line of Business (LoB) app.
  var versionCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The version name of managed Android Line of Business (LoB) app.
  var versionName: js.UndefOr[NullableOption[String]] = js.native
}
object ManagedAndroidLobApp {
  
  @scala.inline
  def apply(): ManagedAndroidLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAndroidLobApp]
  }
  
  @scala.inline
  implicit class ManagedAndroidLobAppMutableBuilder[Self <: ManagedAndroidLobApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: NullableOption[AndroidMinimumOperatingSystem]): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedOperatingSystemNull: Self = StObject.set(x, "minimumSupportedOperatingSystem", null)
    
    @scala.inline
    def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
    
    @scala.inline
    def setPackageId(value: NullableOption[String]): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIdNull: Self = StObject.set(x, "packageId", null)
    
    @scala.inline
    def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
    
    @scala.inline
    def setVersionCode(value: NullableOption[String]): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodeNull: Self = StObject.set(x, "versionCode", null)
    
    @scala.inline
    def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    @scala.inline
    def setVersionName(value: NullableOption[String]): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameNull: Self = StObject.set(x, "versionName", null)
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
