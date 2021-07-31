package typings.ol

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomMod {
  
  @JSImport("ol/control/Zoom", JSImport.Default)
  @js.native
  class default () extends Zoom {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var delta: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[HTMLElement | String] = js.undefined
    
    var zoomInLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    var zoomInTipLabel: js.UndefOr[String] = js.undefined
    
    var zoomOutLabel: js.UndefOr[String | HTMLElement] = js.undefined
    
    var zoomOutTipLabel: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setZoomInLabel(value: String | HTMLElement): Self = StObject.set(x, "zoomInLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomInLabelUndefined: Self = StObject.set(x, "zoomInLabel", js.undefined)
      
      @scala.inline
      def setZoomInTipLabel(value: String): Self = StObject.set(x, "zoomInTipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomInTipLabelUndefined: Self = StObject.set(x, "zoomInTipLabel", js.undefined)
      
      @scala.inline
      def setZoomOutLabel(value: String | HTMLElement): Self = StObject.set(x, "zoomOutLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOutLabelUndefined: Self = StObject.set(x, "zoomOutLabel", js.undefined)
      
      @scala.inline
      def setZoomOutTipLabel(value: String): Self = StObject.set(x, "zoomOutTipLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomOutTipLabelUndefined: Self = StObject.set(x, "zoomOutTipLabel", js.undefined)
    }
  }
  
  @js.native
  trait Zoom
    extends typings.ol.controlControlMod.default
}
