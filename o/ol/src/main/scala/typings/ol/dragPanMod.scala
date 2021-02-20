package typings.ol

import typings.ol.conditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragPanMod {
  
  @JSImport("ol/interaction/DragPan", JSImport.Default)
  @js.native
  class default () extends DragPan {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait DragPan
    extends typings.ol.pointerMod.default
  
  @js.native
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.native
    
    var kinetic: js.UndefOr[typings.ol.kineticMod.default] = js.native
    
    var onFocusOnly: js.UndefOr[Boolean] = js.native
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
      def setKinetic(value: typings.ol.kineticMod.default): Self = StObject.set(x, "kinetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKineticUndefined: Self = StObject.set(x, "kinetic", js.undefined)
      
      @scala.inline
      def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
    }
  }
}
