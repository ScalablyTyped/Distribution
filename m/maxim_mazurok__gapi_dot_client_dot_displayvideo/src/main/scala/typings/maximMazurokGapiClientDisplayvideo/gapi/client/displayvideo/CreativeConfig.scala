package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeConfig extends js.Object {
  
  /** The type of creative that can be assigned to the inventory source. */
  var creativeType: js.UndefOr[String] = js.native
  
  /** The configuration for display creatives. Applicable when creative_type is `CREATIVE_TYPE_STANDARD`. */
  var displayCreativeConfig: js.UndefOr[InventorySourceDisplayCreativeConfig] = js.native
  
  /** The configuration for video creatives. Applicable when creative_type is `CREATIVE_TYPE_VIDEO`. */
  var videoCreativeConfig: js.UndefOr[InventorySourceVideoCreativeConfig] = js.native
}
object CreativeConfig {
  
  @scala.inline
  def apply(): CreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeConfig]
  }
  
  @scala.inline
  implicit class CreativeConfigOps[Self <: CreativeConfig] (val x: Self) extends AnyVal {
    
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
    def setCreativeType(value: String): Self = this.set("creativeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeType: Self = this.set("creativeType", js.undefined)
    
    @scala.inline
    def setDisplayCreativeConfig(value: InventorySourceDisplayCreativeConfig): Self = this.set("displayCreativeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayCreativeConfig: Self = this.set("displayCreativeConfig", js.undefined)
    
    @scala.inline
    def setVideoCreativeConfig(value: InventorySourceVideoCreativeConfig): Self = this.set("videoCreativeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoCreativeConfig: Self = this.set("videoCreativeConfig", js.undefined)
  }
}
