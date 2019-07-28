package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderImageLayer extends js.Object {
  def appendImage(): Unit
  def beginLayout(): Unit
  def endLayout(): Unit
}

object PDFRenderImageLayer {
  @scala.inline
  def apply(appendImage: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderImageLayer = {
    val __obj = js.Dynamic.literal(appendImage = js.Any.fromFunction0(appendImage), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
  
    __obj.asInstanceOf[PDFRenderImageLayer]
  }
}

