package typings.nivoTooltip

import typings.nivoTooltip.distTypesTypesMod.CrosshairType
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCrosshairMod {
  
  @JSImport("@nivo/tooltip/dist/types/Crosshair", "Crosshair")
  @js.native
  val Crosshair: MemoExoticComponent[js.Function1[/* hasWidthHeightTypeXY */ CrosshairProps, Element]] = js.native
  
  trait CrosshairProps extends StObject {
    
    var height: Double
    
    var `type`: CrosshairType
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object CrosshairProps {
    
    inline def apply(height: Double, `type`: CrosshairType, width: Double, x: Double, y: Double): CrosshairProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrosshairProps]
    }
    
    extension [Self <: CrosshairProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: CrosshairType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
