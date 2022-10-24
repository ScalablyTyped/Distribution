package typings.nivoTooltip

import typings.react.mod.MutableRefObject
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTooltipProviderMod {
  
  @JSImport("@nivo/tooltip/dist/types/TooltipProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TooltipProvider(param0: PropsWithChildren[TooltipProviderProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TooltipProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TooltipProviderProps extends StObject {
    
    var container: MutableRefObject[HTMLDivElement]
  }
  object TooltipProviderProps {
    
    inline def apply(container: MutableRefObject[HTMLDivElement]): TooltipProviderProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProviderProps]
    }
    
    extension [Self <: TooltipProviderProps](x: Self) {
      
      inline def setContainer(value: MutableRefObject[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
