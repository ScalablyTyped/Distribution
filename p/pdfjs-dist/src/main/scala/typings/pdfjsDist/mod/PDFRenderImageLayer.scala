package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFRenderImageLayer extends js.Object {
  
  def appendImage(): Unit = js.native
  
  def beginLayout(): Unit = js.native
  
  def endLayout(): Unit = js.native
}
object PDFRenderImageLayer {
  
  @scala.inline
  def apply(appendImage: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderImageLayer = {
    val __obj = js.Dynamic.literal(appendImage = js.Any.fromFunction0(appendImage), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
    __obj.asInstanceOf[PDFRenderImageLayer]
  }
  
  @scala.inline
  implicit class PDFRenderImageLayerOps[Self <: PDFRenderImageLayer] (val x: Self) extends AnyVal {
    
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
    def setAppendImage(value: () => Unit): Self = this.set("appendImage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeginLayout(value: () => Unit): Self = this.set("beginLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndLayout(value: () => Unit): Self = this.set("endLayout", js.Any.fromFunction0(value))
  }
}
