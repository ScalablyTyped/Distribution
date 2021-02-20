package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceAssignedTargetingOptionDetails extends StObject {
  
  /** Required. ID of the inventory source. Should refer to the inventory_source_id field of an InventorySource resource. */
  var inventorySourceId: js.UndefOr[String] = js.native
}
object InventorySourceAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): InventorySourceAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class InventorySourceAssignedTargetingOptionDetailsMutableBuilder[Self <: InventorySourceAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInventorySourceId(value: String): Self = StObject.set(x, "inventorySourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceIdUndefined: Self = StObject.set(x, "inventorySourceId", js.undefined)
  }
}
