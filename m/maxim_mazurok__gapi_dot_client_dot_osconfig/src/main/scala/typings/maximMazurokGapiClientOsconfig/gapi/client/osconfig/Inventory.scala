package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inventory extends StObject {
  
  /**
    * Inventory items related to the VM keyed by an opaque unique identifier for each inventory item. The identifier is unique to each distinct and addressable inventory item and will
    * change, when there is a new package version.
    */
  var items: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.osconfig.gapi.client.osconfig.InventoryItem} */ js.Any
  ] = js.undefined
  
  /** Output only. The `Inventory` API resource name. Format: `projects/{project_number}/locations/{location}/instances/{instance_id}/inventory` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Base level operating system information for the VM. */
  var osInfo: js.UndefOr[InventoryOsInfo] = js.undefined
  
  /** Output only. Timestamp of the last reported inventory for the VM. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Inventory {
  
  inline def apply(): Inventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inventory]
  }
  
  extension [Self <: Inventory](x: Self) {
    
    inline def setItems(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.osconfig.gapi.client.osconfig.InventoryItem} */ js.Any
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsInfo(value: InventoryOsInfo): Self = StObject.set(x, "osInfo", value.asInstanceOf[js.Any])
    
    inline def setOsInfoUndefined: Self = StObject.set(x, "osInfo", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
