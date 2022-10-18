package typings.nivoTooltip

import typings.nivoTooltip.distTypesTypesMod.TooltipAnchor
import typings.nivoTooltip.nivoTooltipBooleans.`false`
import typings.nivoTooltip.nivoTooltipBooleans.`true`
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesContextMod {
  
  @JSImport("@nivo/tooltip/dist/types/context", "TooltipActionsContext")
  @js.native
  val TooltipActionsContext: Context[TooltipActionsContextData] = js.native
  
  @JSImport("@nivo/tooltip/dist/types/context", "TooltipStateContext")
  @js.native
  val TooltipStateContext: Context[TooltipStateContextData] = js.native
  
  @JSImport("@nivo/tooltip/dist/types/context", "hiddenTooltipState")
  @js.native
  val hiddenTooltipState: TooltipStateContextDataHidden = js.native
  
  @js.native
  trait TooltipActionsContextData extends StObject {
    
    def hideTooltip(): Unit = js.native
    
    def showTooltipAt(content: Element, position: js.Tuple2[Double, Double]): Unit = js.native
    def showTooltipAt(content: Element, position: js.Tuple2[Double, Double], anchor: TooltipAnchor): Unit = js.native
    
    def showTooltipFromEvent(content: Element, event: MouseEvent[typings.std.Element, NativeMouseEvent]): Unit = js.native
    def showTooltipFromEvent(content: Element, event: MouseEvent[typings.std.Element, NativeMouseEvent], anchor: TooltipAnchor): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoTooltip.distTypesContextMod.TooltipStateContextDataVisible
    - typings.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden
  */
  trait TooltipStateContextData extends StObject
  object TooltipStateContextData {
    
    inline def TooltipStateContextDataHidden(anchor: Null, content: Null, position: js.Tuple2[Null, Null]): typings.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = false, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden]
    }
    
    inline def TooltipStateContextDataVisible(anchor: TooltipAnchor, content: Element, position: js.Tuple2[Double, Double]): typings.nivoTooltip.distTypesContextMod.TooltipStateContextDataVisible = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = true, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoTooltip.distTypesContextMod.TooltipStateContextDataVisible]
    }
  }
  
  trait TooltipStateContextDataHidden
    extends StObject
       with TooltipStateContextData {
    
    var anchor: Null
    
    var content: Null
    
    var isVisible: `false`
    
    var position: js.Tuple2[Null, Null]
  }
  object TooltipStateContextDataHidden {
    
    inline def apply(anchor: Null, content: Null, position: js.Tuple2[Null, Null]): TooltipStateContextDataHidden = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = false, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipStateContextDataHidden]
    }
    
    extension [Self <: TooltipStateContextDataHidden](x: Self) {
      
      inline def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: `false`): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: js.Tuple2[Null, Null]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipStateContextDataVisible
    extends StObject
       with TooltipStateContextData {
    
    var anchor: TooltipAnchor
    
    var content: Element
    
    var isVisible: `true`
    
    var position: js.Tuple2[Double, Double]
  }
  object TooltipStateContextDataVisible {
    
    inline def apply(anchor: TooltipAnchor, content: Element, position: js.Tuple2[Double, Double]): TooltipStateContextDataVisible = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = true, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipStateContextDataVisible]
    }
    
    extension [Self <: TooltipStateContextDataVisible](x: Self) {
      
      inline def setAnchor(value: TooltipAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: `true`): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
