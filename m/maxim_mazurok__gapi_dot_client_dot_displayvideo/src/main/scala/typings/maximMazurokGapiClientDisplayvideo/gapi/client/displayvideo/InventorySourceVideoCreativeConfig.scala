package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventorySourceVideoCreativeConfig extends StObject {
  
  /** The duration requirements for the video creatives that can be assigned to the inventory source. */
  var duration: js.UndefOr[String] = js.undefined
}
object InventorySourceVideoCreativeConfig {
  
  inline def apply(): InventorySourceVideoCreativeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySourceVideoCreativeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventorySourceVideoCreativeConfig] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
