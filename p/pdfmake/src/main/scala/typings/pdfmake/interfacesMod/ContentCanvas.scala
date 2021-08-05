package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentCanvas
  extends StObject
     with ContentBase
     with _Content {
  
  var canvas: js.Array[CanvasElement]
}
object ContentCanvas {
  
  inline def apply(canvas: js.Array[CanvasElement]): ContentCanvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCanvas]
  }
  
  extension [Self <: ContentCanvas](x: Self) {
    
    inline def setCanvas(value: js.Array[CanvasElement]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasVarargs(value: CanvasElement*): Self = StObject.set(x, "canvas", js.Array(value :_*))
  }
}
