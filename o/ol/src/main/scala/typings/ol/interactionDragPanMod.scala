package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragPanMod {
  
  @JSImport("ol/interaction/DragPan", JSImport.Default)
  @js.native
  open class default () extends DragPan {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait DragPan
    extends typings.ol.interactionPointerMod.default
  
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var kinetic: js.UndefOr[typings.ol.kineticMod.default] = js.undefined
    
    var onFocusOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setKinetic(value: typings.ol.kineticMod.default): Self = StObject.set(x, "kinetic", value.asInstanceOf[js.Any])
      
      inline def setKineticUndefined: Self = StObject.set(x, "kinetic", js.undefined)
      
      inline def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      inline def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
    }
  }
}
