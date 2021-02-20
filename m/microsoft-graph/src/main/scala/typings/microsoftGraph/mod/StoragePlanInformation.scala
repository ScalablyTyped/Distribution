package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoragePlanInformation extends StObject {
  
  // Indicates whether there are higher storage quota plans available. Read-only.
  var upgradeAvailable: js.UndefOr[NullableOption[Boolean]] = js.native
}
object StoragePlanInformation {
  
  @scala.inline
  def apply(): StoragePlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoragePlanInformation]
  }
  
  @scala.inline
  implicit class StoragePlanInformationMutableBuilder[Self <: StoragePlanInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpgradeAvailable(value: NullableOption[Boolean]): Self = StObject.set(x, "upgradeAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradeAvailableNull: Self = StObject.set(x, "upgradeAvailable", null)
    
    @scala.inline
    def setUpgradeAvailableUndefined: Self = StObject.set(x, "upgradeAvailable", js.undefined)
  }
}
