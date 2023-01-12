package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUniversalAppX
  extends StObject
     with MobileLobApp {
  
  // The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral.
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.undefined
  
  /**
    * The Windows device type(s) for which this app can run on. Possible values are: none, desktop, mobile, holographic,
    * team.
    */
  var applicableDeviceTypes: js.UndefOr[WindowsDeviceType] = js.undefined
  
  // The Identity Name.
  var identityName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Identity Publisher Hash.
  var identityPublisherHash: js.UndefOr[String] = js.undefined
  
  // The Identity Resource Identifier.
  var identityResourceIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identity version.
  var identityVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether or not the app is a bundle.
  var isBundle: js.UndefOr[Boolean] = js.undefined
  
  // The value for the minimum applicable operating system.
  var minimumSupportedOperatingSystem: js.UndefOr[WindowsMinimumOperatingSystem] = js.undefined
}
object WindowsUniversalAppX {
  
  inline def apply(): WindowsUniversalAppX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUniversalAppX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsUniversalAppX] (val x: Self) extends AnyVal {
    
    inline def setApplicableArchitectures(value: WindowsArchitecture): Self = StObject.set(x, "applicableArchitectures", value.asInstanceOf[js.Any])
    
    inline def setApplicableArchitecturesUndefined: Self = StObject.set(x, "applicableArchitectures", js.undefined)
    
    inline def setApplicableDeviceTypes(value: WindowsDeviceType): Self = StObject.set(x, "applicableDeviceTypes", value.asInstanceOf[js.Any])
    
    inline def setApplicableDeviceTypesUndefined: Self = StObject.set(x, "applicableDeviceTypes", js.undefined)
    
    inline def setIdentityName(value: NullableOption[String]): Self = StObject.set(x, "identityName", value.asInstanceOf[js.Any])
    
    inline def setIdentityNameNull: Self = StObject.set(x, "identityName", null)
    
    inline def setIdentityNameUndefined: Self = StObject.set(x, "identityName", js.undefined)
    
    inline def setIdentityPublisherHash(value: String): Self = StObject.set(x, "identityPublisherHash", value.asInstanceOf[js.Any])
    
    inline def setIdentityPublisherHashUndefined: Self = StObject.set(x, "identityPublisherHash", js.undefined)
    
    inline def setIdentityResourceIdentifier(value: NullableOption[String]): Self = StObject.set(x, "identityResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setIdentityResourceIdentifierNull: Self = StObject.set(x, "identityResourceIdentifier", null)
    
    inline def setIdentityResourceIdentifierUndefined: Self = StObject.set(x, "identityResourceIdentifier", js.undefined)
    
    inline def setIdentityVersion(value: NullableOption[String]): Self = StObject.set(x, "identityVersion", value.asInstanceOf[js.Any])
    
    inline def setIdentityVersionNull: Self = StObject.set(x, "identityVersion", null)
    
    inline def setIdentityVersionUndefined: Self = StObject.set(x, "identityVersion", js.undefined)
    
    inline def setIsBundle(value: Boolean): Self = StObject.set(x, "isBundle", value.asInstanceOf[js.Any])
    
    inline def setIsBundleUndefined: Self = StObject.set(x, "isBundle", js.undefined)
    
    inline def setMinimumSupportedOperatingSystem(value: WindowsMinimumOperatingSystem): Self = StObject.set(x, "minimumSupportedOperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setMinimumSupportedOperatingSystemUndefined: Self = StObject.set(x, "minimumSupportedOperatingSystem", js.undefined)
  }
}
