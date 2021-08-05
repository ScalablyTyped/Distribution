package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceFilter extends StObject {
  
  /**
    * Inventory Sources to download by ID. All IDs must belong to the same Advertiser or Partner specified in CreateSdfDownloadTaskRequest. Leave empty to download all Inventory Sources
    * for the selected Advertiser or Partner.
    */
  var inventorySourceIds: js.UndefOr[js.Array[String]] = js.undefined
}
object InventorySourceFilter {
  
  inline def apply(): InventorySourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceFilter]
  }
  
  extension [Self <: InventorySourceFilter](x: Self) {
    
    inline def setInventorySourceIds(value: js.Array[String]): Self = StObject.set(x, "inventorySourceIds", value.asInstanceOf[js.Any])
    
    inline def setInventorySourceIdsUndefined: Self = StObject.set(x, "inventorySourceIds", js.undefined)
    
    inline def setInventorySourceIdsVarargs(value: String*): Self = StObject.set(x, "inventorySourceIds", js.Array(value :_*))
  }
}
