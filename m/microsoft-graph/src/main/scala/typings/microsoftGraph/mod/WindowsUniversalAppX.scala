package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsUniversalAppX extends MobileLobApp {
  
  // The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral.
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.native
  
  /**
    * The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic,
    * team.
    */
  var applicableDeviceTypes: js.UndefOr[WindowsDeviceType] = js.native
  
  // The Identity Name.
  var identityName: js.UndefOr[NullableOption[String]] = js.native
  
  // The Identity Publisher Hash.
  var identityPublisherHash: js.UndefOr[String] = js.native
  
  // The Identity Resource Identifier.
  var identityResourceIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // The identity version.
  var identityVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether or not the app is a bundle.
  var isBundle: js.UndefOr[Boolean] = js.native
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[WindowsMinimumOperatingSystem] = js.native
}
object WindowsUniversalAppX {
  
  @scala.inline
  def apply(): WindowsUniversalAppX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUniversalAppX]
  }
  
  @scala.inline
  implicit class WindowsUniversalAppXMutableBuilder[Self <: WindowsUniversalAppX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicableArchitectures(value: WindowsArchitecture): Self = StObject.set(x, "applicableArchitectures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableArchitecturesUndefined: Self = StObject.set(x, "applicableArchitectures", js.undefined)
    
    @scala.inline
    def setApplicableDeviceTypes(value: WindowsDeviceType): Self = StObject.set(x, "applicableDeviceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableDeviceTypesUndefined: Self = StObject.set(x, "applicableDeviceTypes", js.undefined)
    
    @scala.inline
    def setIdentityName(value: NullableOption[String]): Self = StObject.set(x, "identityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityNameNull: Self = StObject.set(x, "identityName", null)
    
    @scala.inline
    def setIdentityNameUndefined: Self = StObject.set(x, "identityName", js.undefined)
    
    @scala.inline
    def setIdentityPublisherHash(value: String): Self = StObject.set(x, "identityPublisherHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPublisherHashUndefined: Self = StObject.set(x, "identityPublisherHash", js.undefined)
    
    @scala.inline
    def setIdentityResourceIdentifier(value: NullableOption[String]): Self = StObject.set(x, "identityResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityResourceIdentifierNull: Self = StObject.set(x, "identityResourceIdentifier", null)
    
    @scala.inline
    def setIdentityResourceIdentifierUndefined: Self = StObject.set(x, "identityResourceIdentifier", js.undefined)
    
    @scala.inline
    def setIdentityVersion(value: NullableOption[String]): Self = StObject.set(x, "identityVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityVersionNull: Self = StObject.set(x, "identityVersion", null)
    
    @scala.inline
    def setIdentityVersionUndefined: Self = StObject.set(x, "identityVersion", js.undefined)
    
    @scala.inline
    def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBundleUndefined: Self = StObject.set(x, "isBundle", js.undefined)
    
    @scala.inline
    def setMinimumSupportedOperatingSystem(value: WindowsMinimumOperatingSystem): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
  }
}
