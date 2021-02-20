package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceDisplayCreativeConfig extends StObject {
  
  /** The size requirements for display creatives that can be assigned to the inventory source. */
  var creativeSize: js.UndefOr[Dimensions] = js.native
}
object InventorySourceDisplayCreativeConfig {
  
  @scala.inline
  def apply(): InventorySourceDisplayCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceDisplayCreativeConfig]
  }
  
  @scala.inline
  implicit class InventorySourceDisplayCreativeConfigMutableBuilder[Self <: InventorySourceDisplayCreativeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeSize(value: Dimensions): Self = StObject.set(x, "creativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeSizeUndefined: Self = StObject.set(x, "creativeSize", js.undefined)
  }
}
