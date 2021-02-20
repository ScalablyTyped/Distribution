package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceGroup extends StObject {
  
  /** Required. The display name of the inventory source group. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the inventory source group. Assigned by the system. */
  var inventorySourceGroupId: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the inventory source group. */
  var name: js.UndefOr[String] = js.native
}
object InventorySourceGroup {
  
  @scala.inline
  def apply(): InventorySourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceGroup]
  }
  
  @scala.inline
  implicit class InventorySourceGroupMutableBuilder[Self <: InventorySourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setInventorySourceGroupId(value: String): Self = StObject.set(x, "inventorySourceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventorySourceGroupIdUndefined: Self = StObject.set(x, "inventorySourceGroupId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
