package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosVppApp extends MobileApp {
  
  // The store URL.
  var appStoreUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The applicable iOS Device Type.
  var applicableDeviceType: js.UndefOr[NullableOption[IosDeviceType]] = js.native
  
  // The Identity Name.
  var bundleId: js.UndefOr[NullableOption[String]] = js.native
  
  // The supported License Type.
  var licensingType: js.UndefOr[NullableOption[VppLicensingType]] = js.native
  
  // The VPP application release date and time.
  var releaseDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The total number of VPP licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.native
  
  // The number of VPP licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.native
  
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.native
  
  // The Apple Id associated with the given Apple Volume Purchase Program Token.
  var vppTokenAppleId: js.UndefOr[NullableOption[String]] = js.native
  
  // The organization associated with the Apple Volume Purchase Program Token
  var vppTokenOrganizationName: js.UndefOr[NullableOption[String]] = js.native
}
object IosVppApp {
  
  @scala.inline
  def apply(): IosVppApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppApp]
  }
  
  @scala.inline
  implicit class IosVppAppOps[Self <: IosVppApp] (val x: Self) extends AnyVal {
    
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
    def setAppStoreUrl(value: NullableOption[String]): Self = this.set("appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStoreUrl: Self = this.set("appStoreUrl", js.undefined)
    
    @scala.inline
    def setAppStoreUrlNull: Self = this.set("appStoreUrl", null)
    
    @scala.inline
    def setApplicableDeviceType(value: NullableOption[IosDeviceType]): Self = this.set("applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableDeviceType: Self = this.set("applicableDeviceType", js.undefined)
    
    @scala.inline
    def setApplicableDeviceTypeNull: Self = this.set("applicableDeviceType", null)
    
    @scala.inline
    def setBundleId(value: NullableOption[String]): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setBundleIdNull: Self = this.set("bundleId", null)
    
    @scala.inline
    def setLicensingType(value: NullableOption[VppLicensingType]): Self = this.set("licensingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicensingType: Self = this.set("licensingType", js.undefined)
    
    @scala.inline
    def setLicensingTypeNull: Self = this.set("licensingType", null)
    
    @scala.inline
    def setReleaseDateTime(value: NullableOption[String]): Self = this.set("releaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseDateTime: Self = this.set("releaseDateTime", js.undefined)
    
    @scala.inline
    def setReleaseDateTimeNull: Self = this.set("releaseDateTime", null)
    
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = this.set("totalLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalLicenseCount: Self = this.set("totalLicenseCount", js.undefined)
    
    @scala.inline
    def setUsedLicenseCount(value: Double): Self = this.set("usedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedLicenseCount: Self = this.set("usedLicenseCount", js.undefined)
    
    @scala.inline
    def setVppTokenAccountType(value: VppTokenAccountType): Self = this.set("vppTokenAccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVppTokenAccountType: Self = this.set("vppTokenAccountType", js.undefined)
    
    @scala.inline
    def setVppTokenAppleId(value: NullableOption[String]): Self = this.set("vppTokenAppleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVppTokenAppleId: Self = this.set("vppTokenAppleId", js.undefined)
    
    @scala.inline
    def setVppTokenAppleIdNull: Self = this.set("vppTokenAppleId", null)
    
    @scala.inline
    def setVppTokenOrganizationName(value: NullableOption[String]): Self = this.set("vppTokenOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVppTokenOrganizationName: Self = this.set("vppTokenOrganizationName", js.undefined)
    
    @scala.inline
    def setVppTokenOrganizationNameNull: Self = this.set("vppTokenOrganizationName", null)
  }
}
