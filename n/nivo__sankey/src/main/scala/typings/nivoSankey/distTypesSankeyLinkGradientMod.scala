package typings.nivoSankey

import typings.nivoSankey.nivoSankeyStrings.horizontal
import typings.nivoSankey.nivoSankeyStrings.vertical
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyLinkGradientMod {
  
  @JSImport("@nivo/sankey/dist/types/SankeyLinkGradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SankeyLinkGradient(param0: SankeyLinkGradientProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SankeyLinkGradient")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SankeyLinkGradientProps extends StObject {
    
    var endColor: String
    
    var id: String
    
    var layout: horizontal | vertical
    
    var startColor: String
  }
  object SankeyLinkGradientProps {
    
    inline def apply(endColor: String, id: String, layout: horizontal | vertical, startColor: String): SankeyLinkGradientProps = {
      val __obj = js.Dynamic.literal(endColor = endColor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], startColor = startColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[SankeyLinkGradientProps]
    }
    
    extension [Self <: SankeyLinkGradientProps](x: Self) {
      
      inline def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    }
  }
}
