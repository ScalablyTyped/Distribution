package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inventory extends StObject {
  
  /**
    * Inventory items related to the VM keyed by an opaque unique identifier for each inventory item. The identifier is unique to each distinct and addressable inventory item and will
    * change, when there is a new package version.
    */
  var items: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.osconfig.gapi.client.osconfig.InventoryItem}
    */ typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.Inventory with TopLevel[js.Any]
  ] = js.native
  
  /** Base level operating system information for the VM. */
  var osInfo: js.UndefOr[InventoryOsInfo] = js.native
}
object Inventory {
  
  @scala.inline
  def apply(): Inventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inventory]
  }
  
  @scala.inline
  implicit class InventoryMutableBuilder[Self <: Inventory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.osconfig.gapi.client.osconfig.InventoryItem}
      */ typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.Inventory with TopLevel[js.Any]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setOsInfo(value: InventoryOsInfo): Self = StObject.set(x, "osInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsInfoUndefined: Self = StObject.set(x, "osInfo", js.undefined)
  }
}
