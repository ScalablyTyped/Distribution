package typings.nivoAxes.anon

import typings.nivoScales.distTypesTypesMod.ScaleValue
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAlign[Value /* <: ScaleValue */] extends StObject {
  
  var textAlign: CanvasTextAlign
  
  var textBaseline: CanvasTextBaseline
  
  var ticks: js.Array[Key[Value]]
}
object TextAlign {
  
  inline def apply[Value /* <: ScaleValue */](textAlign: CanvasTextAlign, textBaseline: CanvasTextBaseline, ticks: js.Array[Key[Value]]): TextAlign[Value] = {
    val __obj = js.Dynamic.literal(textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlign[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAlign[?], Value /* <: ScaleValue */] (val x: Self & TextAlign[Value]) extends AnyVal {
    
    inline def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: js.Array[Key[Value]]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksVarargs(value: Key[Value]*): Self = StObject.set(x, "ticks", js.Array(value*))
  }
}
