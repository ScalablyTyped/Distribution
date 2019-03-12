package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderTextLayer extends js.Object {
  def appendText(): scala.Unit
  def beginLayout(): scala.Unit
  def endLayout(): scala.Unit
}

object PDFRenderTextLayer {
  @scala.inline
  def apply(appendText: () => scala.Unit, beginLayout: () => scala.Unit, endLayout: () => scala.Unit): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal(appendText = js.Any.fromFunction0(appendText), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
  
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
}

