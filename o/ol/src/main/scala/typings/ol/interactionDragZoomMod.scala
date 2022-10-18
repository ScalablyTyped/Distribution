package typings.ol

import typings.ol.eventsConditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDragZoomMod {
  
  @JSImport("ol/interaction/DragZoom", JSImport.Default)
  @js.native
  open class default () extends DragZoom {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait DragZoom
    extends typings.ol.interactionDragBoxMod.default
  
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var minArea: js.UndefOr[Double] = js.undefined
    
    var out: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMinArea(value: Double): Self = StObject.set(x, "minArea", value.asInstanceOf[js.Any])
      
      inline def setMinAreaUndefined: Self = StObject.set(x, "minArea", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    }
  }
}
