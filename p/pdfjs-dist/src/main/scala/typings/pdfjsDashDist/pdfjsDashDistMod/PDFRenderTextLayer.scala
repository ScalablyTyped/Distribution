package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderTextLayer extends js.Object {
  def appendText(): Unit
  def beginLayout(): Unit
  def endLayout(): Unit
}

object PDFRenderTextLayer {
  @scala.inline
  def apply(appendText: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal(appendText = js.Any.fromFunction0(appendText), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
  
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
}

