package typings.nivoTooltip

import typings.nivoTooltip.typesMod.TooltipAnchor
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipWrapperMod {
  
  @JSImport("@nivo/tooltip/dist/types/TooltipWrapper", "TooltipWrapper")
  @js.native
  val TooltipWrapper: NamedExoticComponent[PropsWithChildren[TooltipWrapperProps]] = js.native
  
  @js.native
  trait TooltipWrapperProps extends StObject {
    
    var anchor: TooltipAnchor = js.native
    
    var position: js.Tuple2[Double, Double] = js.native
  }
  object TooltipWrapperProps {
    
    @scala.inline
    def apply(anchor: TooltipAnchor, position: js.Tuple2[Double, Double]): TooltipWrapperProps = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipWrapperProps]
    }
    
    @scala.inline
    implicit class TooltipWrapperPropsMutableBuilder[Self <: TooltipWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: TooltipAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
