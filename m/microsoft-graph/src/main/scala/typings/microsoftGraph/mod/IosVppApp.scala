package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosVppApp
  extends StObject
     with MobileApp {
  
  // The store URL.
  var appStoreUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The applicable iOS Device Type.
  var applicableDeviceType: js.UndefOr[NullableOption[IosDeviceType]] = js.undefined
  
  // The Identity Name.
  var bundleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The supported License Type.
  var licensingType: js.UndefOr[NullableOption[VppLicensingType]] = js.undefined
  
  // The VPP application release date and time.
  var releaseDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The total number of VPP licenses.
  var totalLicenseCount: js.UndefOr[Double] = js.undefined
  
  // The number of VPP licenses in use.
  var usedLicenseCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.undefined
  
  // The Apple Id associated with the given Apple Volume Purchase Program Token.
  var vppTokenAppleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The organization associated with the Apple Volume Purchase Program Token
  var vppTokenOrganizationName: js.UndefOr[NullableOption[String]] = js.undefined
}
object IosVppApp {
  
  inline def apply(): IosVppApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppApp]
  }
  
  extension [Self <: IosVppApp](x: Self) {
    
    inline def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    inline def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    inline def setApplicableDeviceType(value: NullableOption[IosDeviceType]): Self = StObject.set(x, "applicableDeviceType", value.asInstanceOf[js.Any])
    
    inline def setApplicableDeviceTypeNull: Self = StObject.set(x, "applicableDeviceType", null)
    
    inline def setApplicableDeviceTypeUndefined: Self = StObject.set(x, "applicableDeviceType", js.undefined)
    
    inline def setBundleId(value: NullableOption[String]): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdNull: Self = StObject.set(x, "bundleId", null)
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setLicensingType(value: NullableOption[VppLicensingType]): Self = StObject.set(x, "licensingType", value.asInstanceOf[js.Any])
    
    inline def setLicensingTypeNull: Self = StObject.set(x, "licensingType", null)
    
    inline def setLicensingTypeUndefined: Self = StObject.set(x, "licensingType", js.undefined)
    
    inline def setReleaseDateTime(value: NullableOption[String]): Self = StObject.set(x, "releaseDateTime", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateTimeNull: Self = StObject.set(x, "releaseDateTime", null)
    
    inline def setReleaseDateTimeUndefined: Self = StObject.set(x, "releaseDateTime", js.undefined)
    
    inline def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setTotalLicenseCountUndefined: Self = StObject.set(x, "totalLicenseCount", js.undefined)
    
    inline def setUsedLicenseCount(value: Double): Self = StObject.set(x, "usedLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setUsedLicenseCountUndefined: Self = StObject.set(x, "usedLicenseCount", js.undefined)
    
    inline def setVppTokenAccountType(value: VppTokenAccountType): Self = StObject.set(x, "vppTokenAccountType", value.asInstanceOf[js.Any])
    
    inline def setVppTokenAccountTypeUndefined: Self = StObject.set(x, "vppTokenAccountType", js.undefined)
    
    inline def setVppTokenAppleId(value: NullableOption[String]): Self = StObject.set(x, "vppTokenAppleId", value.asInstanceOf[js.Any])
    
    inline def setVppTokenAppleIdNull: Self = StObject.set(x, "vppTokenAppleId", null)
    
    inline def setVppTokenAppleIdUndefined: Self = StObject.set(x, "vppTokenAppleId", js.undefined)
    
    inline def setVppTokenOrganizationName(value: NullableOption[String]): Self = StObject.set(x, "vppTokenOrganizationName", value.asInstanceOf[js.Any])
    
    inline def setVppTokenOrganizationNameNull: Self = StObject.set(x, "vppTokenOrganizationName", null)
    
    inline def setVppTokenOrganizationNameUndefined: Self = StObject.set(x, "vppTokenOrganizationName", js.undefined)
  }
}
