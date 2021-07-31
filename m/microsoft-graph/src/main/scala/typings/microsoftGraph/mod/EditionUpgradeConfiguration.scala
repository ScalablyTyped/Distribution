package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditionUpgradeConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Edition Upgrade License File Content.
  var license: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Edition Upgrade License Type. Possible values are: productKey, licenseFile.
  var licenseType: js.UndefOr[EditionUpgradeLicenseType] = js.undefined
  
  // Edition Upgrade Product Key.
  var productKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Edition Upgrade Target Edition. Possible values are: windows10Enterprise, windows10EnterpriseN, windows10Education,
    * windows10EducationN, windows10MobileEnterprise, windows10HolographicEnterprise, windows10Professional,
    * windows10ProfessionalN, windows10ProfessionalEducation, windows10ProfessionalEducationN,
    * windows10ProfessionalWorkstation, windows10ProfessionalWorkstationN.
    */
  var targetEdition: js.UndefOr[Windows10EditionType] = js.undefined
}
object EditionUpgradeConfiguration {
  
  @scala.inline
  def apply(): EditionUpgradeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditionUpgradeConfiguration]
  }
  
  @scala.inline
  implicit class EditionUpgradeConfigurationMutableBuilder[Self <: EditionUpgradeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicense(value: NullableOption[String]): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseNull: Self = StObject.set(x, "license", null)
    
    @scala.inline
    def setLicenseType(value: EditionUpgradeLicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    @scala.inline
    def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    @scala.inline
    def setProductKey(value: NullableOption[String]): Self = StObject.set(x, "productKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductKeyNull: Self = StObject.set(x, "productKey", null)
    
    @scala.inline
    def setProductKeyUndefined: Self = StObject.set(x, "productKey", js.undefined)
    
    @scala.inline
    def setTargetEdition(value: Windows10EditionType): Self = StObject.set(x, "targetEdition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEditionUndefined: Self = StObject.set(x, "targetEdition", js.undefined)
  }
}
