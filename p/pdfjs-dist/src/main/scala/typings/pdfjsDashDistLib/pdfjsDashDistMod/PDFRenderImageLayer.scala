package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderImageLayer extends js.Object {
  def appendImage(): scala.Unit
  def beginLayout(): scala.Unit
  def endLayout(): scala.Unit
}

object PDFRenderImageLayer {
  @scala.inline
  def apply(appendImage: () => scala.Unit, beginLayout: () => scala.Unit, endLayout: () => scala.Unit): PDFRenderImageLayer = {
    val __obj = js.Dynamic.literal(appendImage = js.Any.fromFunction0(appendImage), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
  
    __obj.asInstanceOf[PDFRenderImageLayer]
  }
}

