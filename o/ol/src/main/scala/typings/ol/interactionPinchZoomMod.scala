package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionPinchZoomMod {
  
  @JSImport("ol/interaction/PinchZoom", JSImport.Default)
  @js.native
  open class default () extends PinchZoom {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  @js.native
  trait PinchZoom
    extends typings.ol.interactionPointerMod.default
}
