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
  def apply(
    appendImage: js.Function0[scala.Unit],
    beginLayout: js.Function0[scala.Unit],
    endLayout: js.Function0[scala.Unit]
  ): PDFRenderImageLayer = {
    val __obj = js.Dynamic.literal(appendImage = appendImage, beginLayout = beginLayout, endLayout = endLayout)
  
    __obj.asInstanceOf[PDFRenderImageLayer]
  }
}

