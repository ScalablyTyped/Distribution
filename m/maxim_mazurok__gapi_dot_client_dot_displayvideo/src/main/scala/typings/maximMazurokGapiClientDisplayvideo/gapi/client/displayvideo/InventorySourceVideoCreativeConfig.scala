package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventorySourceVideoCreativeConfig extends js.Object {
  
  /** The duration requirements for the video creatives that can be assigned to the inventory source. */
  var duration: js.UndefOr[String] = js.native
}
object InventorySourceVideoCreativeConfig {
  
  @scala.inline
  def apply(): InventorySourceVideoCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceVideoCreativeConfig]
  }
  
  @scala.inline
  implicit class InventorySourceVideoCreativeConfigOps[Self <: InventorySourceVideoCreativeConfig] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
  }
}
