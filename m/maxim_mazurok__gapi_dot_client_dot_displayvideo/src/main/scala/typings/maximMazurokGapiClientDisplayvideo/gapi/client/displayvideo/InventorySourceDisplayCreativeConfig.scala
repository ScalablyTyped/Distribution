package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceDisplayCreativeConfig extends js.Object {
  
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
  implicit class InventorySourceDisplayCreativeConfigOps[Self <: InventorySourceDisplayCreativeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreativeSize(value: Dimensions): Self = this.set("creativeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeSize: Self = this.set("creativeSize", js.undefined)
  }
}
