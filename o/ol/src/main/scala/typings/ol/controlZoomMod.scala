package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlZoomMod {
  
  @JSImport("ol/control/Zoom", JSImport.Default)
  @js.native
  open class default () extends Zoom {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var delta: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[HTMLElement | String] = js.undefined
    
    var zoomInClassName: js.UndefOr[String] = js.undefined
    
    var zoomInLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    var zoomInTipLabel: js.UndefOr[String] = js.undefined
    
    var zoomOutClassName: js.UndefOr[String] = js.undefined
    
    var zoomOutLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    var zoomOutTipLabel: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setZoomInClassName(value: String): Self = StObject.set(x, "zoomInClassName", value.asInstanceOf[js.Any])
      
      inline def setZoomInClassNameUndefined: Self = StObject.set(x, "zoomInClassName", js.undefined)
      
      inline def setZoomInLabel(value: String | HTMLElement): Self = StObject.set(x, "zoomInLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomInLabelUndefined: Self = StObject.set(x, "zoomInLabel", js.undefined)
      
      inline def setZoomInTipLabel(value: String): Self = StObject.set(x, "zoomInTipLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomInTipLabelUndefined: Self = StObject.set(x, "zoomInTipLabel", js.undefined)
      
      inline def setZoomOutClassName(value: String): Self = StObject.set(x, "zoomOutClassName", value.asInstanceOf[js.Any])
      
      inline def setZoomOutClassNameUndefined: Self = StObject.set(x, "zoomOutClassName", js.undefined)
      
      inline def setZoomOutLabel(value: String | HTMLElement): Self = StObject.set(x, "zoomOutLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomOutLabelUndefined: Self = StObject.set(x, "zoomOutLabel", js.undefined)
      
      inline def setZoomOutTipLabel(value: String): Self = StObject.set(x, "zoomOutTipLabel", value.asInstanceOf[js.Any])
      
      inline def setZoomOutTipLabelUndefined: Self = StObject.set(x, "zoomOutTipLabel", js.undefined)
    }
  }
  
  @js.native
  trait Zoom
    extends typings.ol.controlControlMod.default
}
