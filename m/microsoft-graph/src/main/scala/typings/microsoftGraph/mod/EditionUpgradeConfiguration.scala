package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditionUpgradeConfiguration extends DeviceConfiguration {
  
  // Edition Upgrade License File Content.
  var license: js.UndefOr[NullableOption[String]] = js.native
  
  // Edition Upgrade License Type. Possible values are: productKey, licenseFile.
  var licenseType: js.UndefOr[EditionUpgradeLicenseType] = js.native
  
  // Edition Upgrade Product Key.
  var productKey: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Edition Upgrade Target Edition. Possible values are: windows10Enterprise, windows10EnterpriseN, windows10Education,
    * windows10EducationN, windows10MobileEnterprise, windows10HolographicEnterprise, windows10Professional,
    * windows10ProfessionalN, windows10ProfessionalEducation, windows10ProfessionalEducationN,
    * windows10ProfessionalWorkstation, windows10ProfessionalWorkstationN.
    */
  var targetEdition: js.UndefOr[Windows10EditionType] = js.native
}
object EditionUpgradeConfiguration {
  
  @scala.inline
  def apply(): EditionUpgradeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditionUpgradeConfiguration]
  }
  
  @scala.inline
  implicit class EditionUpgradeConfigurationOps[Self <: EditionUpgradeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLicense(value: NullableOption[String]): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    
    @scala.inline
    def setLicenseNull: Self = this.set("license", null)
    
    @scala.inline
    def setLicenseType(value: EditionUpgradeLicenseType): Self = this.set("licenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseType: Self = this.set("licenseType", js.undefined)
    
    @scala.inline
    def setProductKey(value: NullableOption[String]): Self = this.set("productKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductKey: Self = this.set("productKey", js.undefined)
    
    @scala.inline
    def setProductKeyNull: Self = this.set("productKey", null)
    
    @scala.inline
    def setTargetEdition(value: Windows10EditionType): Self = this.set("targetEdition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetEdition: Self = this.set("targetEdition", js.undefined)
  }
}
