package typings.opentok.mod

import typings.opentok.opentokStrings.`1280x720`
import typings.opentok.opentokStrings.`640x480`
import typings.opentok.opentokStrings.auto
import typings.opentok.opentokStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastOptions extends StObject {
  
  var layout: BroadcastLayout
  
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  var outputs: BroadcastOutputOptions
  
  var resolution: js.UndefOr[`640x480` | `1280x720`] = js.undefined
  
  var streamMode: js.UndefOr[auto | manual] = js.undefined
}
object BroadcastOptions {
  
  inline def apply(layout: BroadcastLayout, outputs: BroadcastOutputOptions): BroadcastOptions = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastOptions] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: BroadcastLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setOutputs(value: BroadcastOutputOptions): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: `640x480` | `1280x720`): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setStreamMode(value: auto | manual): Self = StObject.set(x, "streamMode", value.asInstanceOf[js.Any])
    
    inline def setStreamModeUndefined: Self = StObject.set(x, "streamMode", js.undefined)
  }
}
