package typings.pdfmake.interfacesMod

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
  implicit class ContentCanvasOps[Self <: ContentCanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanvasVarargs(value: CanvasElement*): Self = this.set("canvas", js.Array(value :_*))
    
    @scala.inline
    def setCanvas(value: js.Array[CanvasElement]): Self = this.set("canvas", value.asInstanceOf[js.Any])
  }
}
