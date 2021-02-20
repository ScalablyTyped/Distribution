package typings.nivoTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.NamedExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod {
  
  @JSImport("@nivo/tooltip/dist/types/Chip", "Chip")
  @js.native
  val Chip: NamedExoticComponent[ChipProps] = js.native
  
  @js.native
  trait ChipProps extends StObject {
    
    var color: String = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ChipProps {
    
    @scala.inline
    def apply(color: String): ChipProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipProps]
    }
    
    @scala.inline
    implicit class ChipPropsMutableBuilder[Self <: ChipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
