package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsAppX
  extends StObject
     with MobileLobApp {
  
  /**
    * The Windows architecture(s) on which this app can run. Possible values are: none, x86, x64, arm, neutral; default value
    * is none. Possible values are: none, x86, x64, arm, neutral.
    */
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.undefined
  
  // The identity name of the uploaded app package. For example: 'Contoso.DemoApp'.
  var identityName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The identity publisher hash of the uploaded app package. This is the hash of the publisher from the manifest. For
    * example: 'AB82CD0XYZ'.
    */
  var identityPublisherHash: js.UndefOr[String] = js.undefined
  
  // The identity resource identifier of the uploaded app package. For example: 'TestResourceId'.
  var identityResourceIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identity version of the uploaded app package. For example: '1.0.0.0'.
  var identityVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * When TRUE, indicates that the app is a bundle. When FALSE, indicates that the app is not a bundle. By default, property
    * is set to FALSE.
    */
  var isBundle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value for the minimum applicable operating system. Valid values for a WindowsAppX app include v8_0, v8_1 and v10_0.
    * If the app is a bundle, the minimum supported OS has to be at least v8_1.
    */
  var minimumSupportedOperatingSystem: js.UndefOr[WindowsMinimumOperatingSystem] = js.undefined
}
object WindowsAppX {
  
  inline def apply(): WindowsAppX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsAppX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsAppX] (val x: Self) extends AnyVal {
    
    inline def setApplicableArchitectures(value: WindowsArchitecture): Self = StObject.set(x, "applicableArchitectures", value.asInstanceOf[js.Any])
    
    inline def setApplicableArchitecturesUndefined: Self = StObject.set(x, "applicableArchitectures", js.undefined)
    
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
