package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MicrosoftStoreForBusinessApp
  extends StObject
     with MobileApp {
  
  // The app license type. Possible values are: offline, online.
  var licenseType: js.UndefOr[MicrosoftStoreForBusinessLicenseType] = js.undefined
  
  // The app package identifier
  var packageIdentityName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The app product key
  var productKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The total number of Microsoft Store for Business licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.undefined
  
  // The number of Microsoft Store for Business licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.undefined
}
object MicrosoftStoreForBusinessApp {
  
  inline def apply(): MicrosoftStoreForBusinessApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftStoreForBusinessApp]
  }
  
  extension [Self <: MicrosoftStoreForBusinessApp](x: Self) {
    
    inline def setLicenseType(value: MicrosoftStoreForBusinessLicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    inline def setPackageIdentityName(value: NullableOption[String]): Self = StObject.set(x, "packageIdentityName", value.asInstanceOf[js.Any])
    
    inline def setPackageIdentityNameNull: Self = StObject.set(x, "packageIdentityName", null)
    
    inline def setPackageIdentityNameUndefined: Self = StObject.set(x, "packageIdentityName", js.undefined)
    
    inline def setProductKey(value: NullableOption[String]): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    inline def setProductKeyNull: Self = StObject.set(x, "productKey", null)
    
    inline def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    inline def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setTotalLicenseCountUndefined: Self = StObject.set(x, "totalLicenseCount", js.undefined)
    
    inline def setUsedLicenseCount(value: Double): Self = StObject.set(x, "usedLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setUsedLicenseCountUndefined: Self = StObject.set(x, "usedLicenseCount", js.undefined)
  }
}
