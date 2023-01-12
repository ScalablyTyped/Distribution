package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeConfig extends StObject {
  
  /** The type of creative that can be assigned to the inventory source. Only the following types are supported: * `CREATIVE_TYPE_STANDARD` * `CREATIVE_TYPE_VIDEO` */
  var creativeType: js.UndefOr[String] = js.undefined
  
  /** The configuration for display creatives. Applicable when creative_type is `CREATIVE_TYPE_STANDARD`. */
  var displayCreativeConfig: js.UndefOr[InventorySourceDisplayCreativeConfig] = js.undefined
  
  /** The configuration for video creatives. Applicable when creative_type is `CREATIVE_TYPE_VIDEO`. */
  var videoCreativeConfig: js.UndefOr[InventorySourceVideoCreativeConfig] = js.undefined
}
object CreativeConfig {
  
  inline def apply(): CreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreativeConfig] (val x: Self) extends AnyVal {
    
    inline def setCreativeType(value: String): Self = StObject.set(x, "creativeType", value.asInstanceOf[js.Any])
    
    inline def setCreativeTypeUndefined: Self = StObject.set(x, "creativeType", js.undefined)
    
    inline def setDisplayCreativeConfig(value: InventorySourceDisplayCreativeConfig): Self = StObject.set(x, "displayCreativeConfig", value.asInstanceOf[js.Any])
    
    inline def setDisplayCreativeConfigUndefined: Self = StObject.set(x, "displayCreativeConfig", js.undefined)
    
    inline def setVideoCreativeConfig(value: InventorySourceVideoCreativeConfig): Self = StObject.set(x, "videoCreativeConfig", value.asInstanceOf[js.Any])
    
    inline def setVideoCreativeConfigUndefined: Self = StObject.set(x, "videoCreativeConfig", js.undefined)
  }
}
