package typings.microsoftGraph.mod

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
  implicit class MicrosoftStoreForBusinessAppOps[Self <: MicrosoftStoreForBusinessApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLicenseType(value: MicrosoftStoreForBusinessLicenseType): Self = this.set("licenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseType: Self = this.set("licenseType", js.undefined)
    
    @scala.inline
    def setPackageIdentityName(value: NullableOption[String]): Self = this.set("packageIdentityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageIdentityName: Self = this.set("packageIdentityName", js.undefined)
    
    @scala.inline
    def setPackageIdentityNameNull: Self = this.set("packageIdentityName", null)
    
    @scala.inline
    def setProductKey(value: NullableOption[String]): Self = this.set("productKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductKey: Self = this.set("productKey", js.undefined)
    
    @scala.inline
    def setProductKeyNull: Self = this.set("productKey", null)
    
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = this.set("totalLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalLicenseCount: Self = this.set("totalLicenseCount", js.undefined)
    
    @scala.inline
    def setUsedLicenseCount(value: Double): Self = this.set("usedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedLicenseCount: Self = this.set("usedLicenseCount", js.undefined)
  }
}
