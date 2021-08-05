package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoragePlanInformation extends StObject {
  
  // Indicates whether there are higher storage quota plans available. Read-only.
  var upgradeAvailable: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object StoragePlanInformation {
  
  inline def apply(): StoragePlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoragePlanInformation]
  }
  
  extension [Self <: StoragePlanInformation](x: Self) {
    
    inline def setUpgradeAvailable(value: NullableOption[Boolean]): Self = StObject.set(x, "upgradeAvailable", value.asInstanceOf[js.Any])
    
    inline def setUpgradeAvailableNull: Self = StObject.set(x, "upgradeAvailable", null)
    
    inline def setUpgradeAvailableUndefined: Self = StObject.set(x, "upgradeAvailable", js.undefined)
  }
}
