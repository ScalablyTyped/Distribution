package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleClickZoomMod {
  
  @JSImport("ol/interaction/DoubleClickZoom", JSImport.Default)
  @js.native
  class default () extends DoubleClickZoom {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait DoubleClickZoom
    extends typings.ol.interactionInteractionMod.default
  
  trait Options extends StObject {
    
    var delta: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
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
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
}
