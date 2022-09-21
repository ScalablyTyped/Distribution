package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelBrandingSettings extends StObject {
  
  /** Branding properties for the channel view. */
  var channel: js.UndefOr[ChannelSettings] = js.undefined
  
  /** Additional experimental branding properties. */
  var hints: js.UndefOr[js.Array[PropertyValue]] = js.undefined
  
  /** Branding properties for branding images. */
  var image: js.UndefOr[ImageSettings] = js.undefined
  
  /** Branding properties for the watch page. */
  var watch: js.UndefOr[WatchSettings] = js.undefined
}
object ChannelBrandingSettings {
  
  inline def apply(): ChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBrandingSettings]
  }
  
  extension [Self <: ChannelBrandingSettings](x: Self) {
    
    inline def setChannel(value: ChannelSettings): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setHints(value: js.Array[PropertyValue]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHintsVarargs(value: PropertyValue*): Self = StObject.set(x, "hints", js.Array(value*))
    
    inline def setImage(value: ImageSettings): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setWatch(value: WatchSettings): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
