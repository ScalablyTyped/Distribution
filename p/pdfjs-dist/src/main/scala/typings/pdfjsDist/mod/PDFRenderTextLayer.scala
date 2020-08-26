package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFRenderTextLayer extends js.Object {
  def appendText(): Unit = js.native
  def beginLayout(): Unit = js.native
  def endLayout(): Unit = js.native
}

object PDFRenderTextLayer {
  @scala.inline
  def apply(appendText: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal(appendText = js.Any.fromFunction0(appendText), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
  @scala.inline
  implicit class PDFRenderTextLayerOps[Self <: PDFRenderTextLayer] (val x: Self) extends AnyVal {
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
    def setAppendText(value: () => Unit): Self = this.set("appendText", js.Any.fromFunction0(value))
    @scala.inline
    def setBeginLayout(value: () => Unit): Self = this.set("beginLayout", js.Any.fromFunction0(value))
    @scala.inline
    def setEndLayout(value: () => Unit): Self = this.set("endLayout", js.Any.fromFunction0(value))
  }
  
}

