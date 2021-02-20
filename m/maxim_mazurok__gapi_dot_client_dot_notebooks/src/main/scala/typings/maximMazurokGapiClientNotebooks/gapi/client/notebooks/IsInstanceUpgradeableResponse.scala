package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsInstanceUpgradeableResponse extends StObject {
  
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
  implicit class IsInstanceUpgradeableResponseMutableBuilder[Self <: IsInstanceUpgradeableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpgradeInfo(value: String): Self = StObject.set(x, "upgradeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeInfoUndefined: Self = StObject.set(x, "upgradeInfo", js.undefined)
    
    @scala.inline
    def setUpgradeVersion(value: String): Self = StObject.set(x, "upgradeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeVersionUndefined: Self = StObject.set(x, "upgradeVersion", js.undefined)
    
    @scala.inline
    def setUpgradeable(value: Boolean): Self = StObject.set(x, "upgradeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeableUndefined: Self = StObject.set(x, "upgradeable", js.undefined)
  }
}
