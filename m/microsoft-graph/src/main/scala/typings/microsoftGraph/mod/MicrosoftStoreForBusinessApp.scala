package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MicrosoftStoreForBusinessApp extends MobileApp {
  
  // The app license type. Possible values are: offline, online.
  var licenseType: js.UndefOr[MicrosoftStoreForBusinessLicenseType] = js.native
  
  // The app package identifier
  var packageIdentityName: js.UndefOr[NullableOption[String]] = js.native
  
  // The app product key
  var productKey: js.UndefOr[NullableOption[String]] = js.native
  
  // The total number of Microsoft Store for Business licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.native
  
  // The number of Microsoft Store for Business licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.native
}
object MicrosoftStoreForBusinessApp {
  
  @scala.inline
  def apply(): MicrosoftStoreForBusinessApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrosoftStoreForBusinessApp]
  }
  
  @scala.inline
  implicit class MicrosoftStoreForBusinessAppMutableBuilder[Self <: MicrosoftStoreForBusinessApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseType(value: MicrosoftStoreForBusinessLicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    @scala.inline
    def setPackageIdentityName(value: NullableOption[String]): Self = StObject.set(x, "packageIdentityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIdentityNameNull: Self = StObject.set(x, "packageIdentityName", null)
    
    @scala.inline
    def setPackageIdentityNameUndefined: Self = StObject.set(x, "packageIdentityName", js.undefined)
    
    @scala.inline
    def setProductKey(value: NullableOption[String]): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductKeyNull: Self = StObject.set(x, "productKey", null)
    
    @scala.inline
    def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalLicenseCountUndefined: Self = StObject.set(x, "totalLicenseCount", js.undefined)
    
    @scala.inline
    def setUsedLicenseCount(value: Double): Self = StObject.set(x, "usedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedLicenseCountUndefined: Self = StObject.set(x, "usedLicenseCount", js.undefined)
  }
}
