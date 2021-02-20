package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class IosVppAppMutableBuilder[Self <: IosVppApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    @scala.inline
    def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    @scala.inline
    def setApplicableDeviceType(value: NullableOption[IosDeviceType]): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableDeviceTypeNull: Self = StObject.set(x, "applicableDeviceType", null)
    
    @scala.inline
    def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    @scala.inline
    def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setLicensingType(value: NullableOption[VppLicensingType]): Self = StObject.set(x, "licensingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensingTypeNull: Self = StObject.set(x, "licensingType", null)
    
    @scala.inline
    def setLicensingTypeUndefined: Self = StObject.set(x, "licensingType", js.undefined)
    
    @scala.inline
    def setReleaseDateTime(value: NullableOption[String]): Self = StObject.set(x, "releaseDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDateTimeNull: Self = StObject.set(x, "releaseDateTime", null)
    
    @scala.inline
    def setReleaseDateTimeUndefined: Self = StObject.set(x, "releaseDateTime", js.undefined)
    
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalLicenseCountUndefined: Self = StObject.set(x, "totalLicenseCount", js.undefined)
    
    @scala.inline
    def setUsedLicenseCount(value: Double): Self = StObject.set(x, "usedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedLicenseCountUndefined: Self = StObject.set(x, "usedLicenseCount", js.undefined)
    
    @scala.inline
    def setVppTokenAccountType(value: VppTokenAccountType): Self = StObject.set(x, "vppTokenAccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVppTokenAccountTypeUndefined: Self = StObject.set(x, "vppTokenAccountType", js.undefined)
    
    @scala.inline
    def setVppTokenAppleId(value: NullableOption[String]): Self = StObject.set(x, "vppTokenAppleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVppTokenAppleIdNull: Self = StObject.set(x, "vppTokenAppleId", null)
    
    @scala.inline
    def setVppTokenAppleIdUndefined: Self = StObject.set(x, "vppTokenAppleId", js.undefined)
    
    @scala.inline
    def setVppTokenOrganizationName(value: NullableOption[String]): Self = StObject.set(x, "vppTokenOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVppTokenOrganizationNameNull: Self = StObject.set(x, "vppTokenOrganizationName", null)
    
    @scala.inline
    def setVppTokenOrganizationNameUndefined: Self = StObject.set(x, "vppTokenOrganizationName", js.undefined)
  }
}
