package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInstanceUpgradeableResponse extends js.Object {
  
  /** Additional information about upgrade. */
  var upgradeInfo: js.UndefOr[String] = js.native
  
  /** The version this instance will be upgraded to if calling the upgrade endpoint. This field will only be populated if field upgradeable is true. */
  var upgradeVersion: js.UndefOr[String] = js.native
  
  /** If an instance is upgradeable. */
  var upgradeable: js.UndefOr[Boolean] = js.native
}
object IsInstanceUpgradeableResponse {
  
  @scala.inline
  def apply(): IsInstanceUpgradeableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsInstanceUpgradeableResponse]
  }
  
  @scala.inline
  implicit class IsInstanceUpgradeableResponseOps[Self <: IsInstanceUpgradeableResponse] (val x: Self) extends AnyVal {
    
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
    def setUpgradeInfo(value: String): Self = this.set("upgradeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeInfo: Self = this.set("upgradeInfo", js.undefined)
    
    @scala.inline
    def setUpgradeVersion(value: String): Self = this.set("upgradeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeVersion: Self = this.set("upgradeVersion", js.undefined)
    
    @scala.inline
    def setUpgradeable(value: Boolean): Self = this.set("upgradeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeable: Self = this.set("upgradeable", js.undefined)
  }
}
