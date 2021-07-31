package typings.ol

import typings.ol.conditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardPanMod {
  
  @JSImport("ol/interaction/KeyboardPan", JSImport.Default)
  @js.native
  class default () extends KeyboardPan {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait KeyboardPan
    extends typings.ol.interactionInteractionMod.default
  
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var pixelDelta: js.UndefOr[Double] = js.undefined
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
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setPixelDelta(value: Double): Self = StObject.set(x, "pixelDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelDeltaUndefined: Self = StObject.set(x, "pixelDelta", js.undefined)
    }
  }
}
