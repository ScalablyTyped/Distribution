package typings.nivoTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.NamedExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod {
  
  @JSImport("@nivo/tooltip/dist/types/Chip", "Chip")
  @js.native
  val Chip: NamedExoticComponent[ChipProps] = js.native
  
  trait ChipProps extends StObject {
    
    var color: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ChipProps {
    
    inline def apply(color: String): ChipProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipProps]
    }
    
    extension [Self <: ChipProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
