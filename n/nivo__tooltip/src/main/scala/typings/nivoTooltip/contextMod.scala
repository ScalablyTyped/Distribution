package typings.nivoTooltip

import typings.nivoTooltip.nivoTooltipBooleans.`false`
import typings.nivoTooltip.nivoTooltipBooleans.`true`
import typings.nivoTooltip.typesMod.TooltipAnchor
import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
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
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoTooltip.contextMod.TooltipStateContextDataVisible
    - typings.nivoTooltip.contextMod.TooltipStateContextDataHidden
  */
  trait TooltipStateContextData extends StObject
  object TooltipStateContextData {
    
    @scala.inline
    def TooltipStateContextDataHidden(anchor: Null, content: Null, isVisible: `false`, position: js.Tuple2[Null, Null]): typings.nivoTooltip.contextMod.TooltipStateContextDataHidden = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoTooltip.contextMod.TooltipStateContextDataHidden]
    }
    
    @scala.inline
    def TooltipStateContextDataVisible(anchor: TooltipAnchor, content: Element, isVisible: `true`, position: js.Tuple2[Double, Double]): typings.nivoTooltip.contextMod.TooltipStateContextDataVisible = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nivoTooltip.contextMod.TooltipStateContextDataVisible]
    }
  }
  
  @js.native
  trait TooltipStateContextDataHidden extends TooltipStateContextData {
    
    var anchor: Null = js.native
    
    var content: Null = js.native
    
    var isVisible: `false` = js.native
    
    var position: js.Tuple2[Null, Null] = js.native
  }
  object TooltipStateContextDataHidden {
    
    @scala.inline
    def apply(anchor: Null, content: Null, isVisible: `false`, position: js.Tuple2[Null, Null]): TooltipStateContextDataHidden = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipStateContextDataHidden]
    }
    
    @scala.inline
    implicit class TooltipStateContextDataHiddenMutableBuilder[Self <: TooltipStateContextDataHidden] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: `false`): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: js.Tuple2[Null, Null]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipStateContextDataVisible extends TooltipStateContextData {
    
    var anchor: TooltipAnchor = js.native
    
    var content: Element = js.native
    
    var isVisible: `true` = js.native
    
    var position: js.Tuple2[Double, Double] = js.native
  }
  object TooltipStateContextDataVisible {
    
    @scala.inline
    def apply(anchor: TooltipAnchor, content: Element, isVisible: `true`, position: js.Tuple2[Double, Double]): TooltipStateContextDataVisible = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipStateContextDataVisible]
    }
    
    @scala.inline
    implicit class TooltipStateContextDataVisibleMutableBuilder[Self <: TooltipStateContextDataVisible] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: TooltipAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVisible(value: `true`): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
