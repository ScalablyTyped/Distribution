package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppMsiInformation extends js.Object {
  
  // The MSI package type. Possible values are: perMachine, perUser, dualPurpose.
  var packageType: js.UndefOr[Win32LobAppMsiPackageType] = js.native
  
  // The MSI product code.
  var productCode: js.UndefOr[NullableOption[String]] = js.native
  
  // The MSI product name.
  var productName: js.UndefOr[NullableOption[String]] = js.native
  
  // The MSI product version.
  var productVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // The MSI publisher.
  var publisher: js.UndefOr[NullableOption[String]] = js.native
  
  // Whether the MSI app requires the machine to reboot to complete installation.
  var requiresReboot: js.UndefOr[Boolean] = js.native
  
  // The MSI upgrade code.
  var upgradeCode: js.UndefOr[NullableOption[String]] = js.native
}
object Win32LobAppMsiInformation {
  
  @scala.inline
  def apply(): Win32LobAppMsiInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppMsiInformation]
  }
  
  @scala.inline
  implicit class Win32LobAppMsiInformationOps[Self <: Win32LobAppMsiInformation] (val x: Self) extends AnyVal {
    
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
    def setPackageType(value: Win32LobAppMsiPackageType): Self = this.set("packageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageType: Self = this.set("packageType", js.undefined)
    
    @scala.inline
    def setProductCode(value: NullableOption[String]): Self = this.set("productCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCode: Self = this.set("productCode", js.undefined)
    
    @scala.inline
    def setProductCodeNull: Self = this.set("productCode", null)
    
    @scala.inline
    def setProductName(value: NullableOption[String]): Self = this.set("productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    
    @scala.inline
    def setProductNameNull: Self = this.set("productName", null)
    
    @scala.inline
    def setProductVersion(value: NullableOption[String]): Self = this.set("productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductVersion: Self = this.set("productVersion", js.undefined)
    
    @scala.inline
    def setProductVersionNull: Self = this.set("productVersion", null)
    
    @scala.inline
    def setPublisher(value: NullableOption[String]): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPublisherNull: Self = this.set("publisher", null)
    
    @scala.inline
    def setRequiresReboot(value: Boolean): Self = this.set("requiresReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresReboot: Self = this.set("requiresReboot", js.undefined)
    
    @scala.inline
    def setUpgradeCode(value: NullableOption[String]): Self = this.set("upgradeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeCode: Self = this.set("upgradeCode", js.undefined)
    
    @scala.inline
    def setUpgradeCodeNull: Self = this.set("upgradeCode", null)
  }
}
