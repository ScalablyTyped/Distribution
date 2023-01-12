package typings.nivoTooltip

import typings.nivoTooltip.distTypesTypesMod.TooltipAnchor
import typings.react.mod.NamedExoticComponent
import typings.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTooltipWrapperMod {
  
  @JSImport("@nivo/tooltip/dist/types/TooltipWrapper", "TooltipWrapper")
  @js.native
  val TooltipWrapper: NamedExoticComponent[PropsWithChildren[TooltipWrapperProps]] = js.native
  
  trait TooltipWrapperProps extends StObject {
    
    var anchor: TooltipAnchor
    
    var position: js.Tuple2[Double, Double]
  }
  object TooltipWrapperProps {
    
    inline def apply(anchor: TooltipAnchor, position: js.Tuple2[Double, Double]): TooltipWrapperProps = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipWrapperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipWrapperProps] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: TooltipAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
