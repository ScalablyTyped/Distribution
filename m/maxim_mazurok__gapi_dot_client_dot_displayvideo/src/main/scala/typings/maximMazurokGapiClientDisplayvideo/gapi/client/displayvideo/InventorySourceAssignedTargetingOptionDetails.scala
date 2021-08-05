package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the inventory source. Should refer to the inventory_source_id field of an InventorySource resource. */
  var inventorySourceId: js.UndefOr[String] = js.undefined
}
object InventorySourceAssignedTargetingOptionDetails {
  
  inline def apply(): InventorySourceAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceAssignedTargetingOptionDetails]
  }
  
  extension [Self <: InventorySourceAssignedTargetingOptionDetails](x: Self) {
    
    inline def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
  }
}
