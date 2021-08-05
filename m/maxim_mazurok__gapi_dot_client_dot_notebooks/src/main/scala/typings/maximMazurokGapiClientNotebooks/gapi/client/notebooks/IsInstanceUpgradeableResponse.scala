package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsInstanceUpgradeableResponse extends StObject {
  
  /** Additional information about upgrade. */
  var upgradeInfo: js.UndefOr[String] = js.undefined
  
  /** The version this instance will be upgraded to if calling the upgrade endpoint. This field will only be populated if field upgradeable is true. */
  var upgradeVersion: js.UndefOr[String] = js.undefined
  
  /** If an instance is upgradeable. */
  var upgradeable: js.UndefOr[Boolean] = js.undefined
}
object IsInstanceUpgradeableResponse {
  
  inline def apply(): IsInstanceUpgradeableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsInstanceUpgradeableResponse]
  }
  
  extension [Self <: IsInstanceUpgradeableResponse](x: Self) {
    
    inline def setUpgradeInfo(value: String): Self = StObject.set(x, "upgradeInfo", value.asInstanceOf[js.Any])
    
    inline def setUpgradeInfoUndefined: Self = StObject.set(x, "upgradeInfo", js.undefined)
    
    inline def setUpgradeVersion(value: String): Self = StObject.set(x, "upgradeVersion", value.asInstanceOf[js.Any])
    
    inline def setUpgradeVersionUndefined: Self = StObject.set(x, "upgradeVersion", js.undefined)
    
    inline def setUpgradeable(value: Boolean): Self = StObject.set(x, "upgradeable", value.asInstanceOf[js.Any])
    
    inline def setUpgradeableUndefined: Self = StObject.set(x, "upgradeable", js.undefined)
  }
}
