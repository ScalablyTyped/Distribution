package typings.ol

import typings.ol.conditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragZoomMod {
  
  @JSImport("ol/interaction/DragZoom", JSImport.Default)
  @js.native
  class default () extends DragZoom {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait DragZoom
    extends typings.ol.dragBoxMod.default
  
  @js.native
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var condition: js.UndefOr[Condition] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var minArea: js.UndefOr[Double] = js.native
    
    var out: js.UndefOr[Boolean] = js.native
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
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setMinArea(value: Double): Self = StObject.set(x, "minArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinAreaUndefined: Self = StObject.set(x, "minArea", js.undefined)
      
      @scala.inline
      def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    }
  }
}
