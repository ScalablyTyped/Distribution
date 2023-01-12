package typings.nivoStream

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStreamDotsItemMod {
  
  @JSImport("@nivo/stream/dist/types/StreamDotsItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StreamDotsItem(param0: StreamDotsItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StreamDotsItem")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StreamDotsItemProps extends StObject {
    
    var borderColor: String
    
    var borderWidth: Double
    
    var color: String
    
    var size: Double
    
    var x: Double
    
    var y: Double
  }
  object StreamDotsItemProps {
    
    inline def apply(borderColor: String, borderWidth: Double, color: String, size: Double, x: Double, y: Double): StreamDotsItemProps = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamDotsItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamDotsItemProps] (val x: Self) extends AnyVal {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
