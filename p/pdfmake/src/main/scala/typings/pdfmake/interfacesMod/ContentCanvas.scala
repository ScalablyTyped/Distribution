package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentCanvas
  extends ContentBase
     with _Content {
  
  var canvas: js.Array[CanvasElement] = js.native
}
object ContentCanvas {
  
  @scala.inline
  def apply(canvas: js.Array[CanvasElement]): ContentCanvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentCanvas]
  }
  
  @scala.inline
  implicit class ContentCanvasMutableBuilder[Self <: ContentCanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: js.Array[CanvasElement]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasVarargs(value: CanvasElement*): Self = StObject.set(x, "canvas", js.Array(value :_*))
  }
}
