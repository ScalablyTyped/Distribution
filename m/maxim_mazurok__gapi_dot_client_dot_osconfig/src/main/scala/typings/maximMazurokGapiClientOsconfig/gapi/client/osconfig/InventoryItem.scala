package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItem extends StObject {
  
  /** Software package available to be installed on the VM instance. */
  var availablePackage: js.UndefOr[InventorySoftwarePackage] = js.undefined
  
  /** When this inventory item was first detected. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Identifier for this item, unique across items for this VM. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Software package present on the VM instance. */
  var installedPackage: js.UndefOr[InventorySoftwarePackage] = js.undefined
  
  /** The origin of this inventory item. */
  var originType: js.UndefOr[String] = js.undefined
  
  /** The specific type of inventory, correlating to its specific details. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** When this inventory item was last modified. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object InventoryItem {
  
  inline def apply(): InventoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItem] (val x: Self) extends AnyVal {
    
    inline def setAvailablePackage(value: InventorySoftwarePackage): Self = StObject.set(x, "availablePackage", value.asInstanceOf[js.Any])
    
    inline def setAvailablePackageUndefined: Self = StObject.set(x, "availablePackage", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstalledPackage(value: InventorySoftwarePackage): Self = StObject.set(x, "installedPackage", value.asInstanceOf[js.Any])
    
    inline def setInstalledPackageUndefined: Self = StObject.set(x, "installedPackage", js.undefined)
    
    inline def setOriginType(value: String): Self = StObject.set(x, "originType", value.asInstanceOf[js.Any])
    
    inline def setOriginTypeUndefined: Self = StObject.set(x, "originType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
