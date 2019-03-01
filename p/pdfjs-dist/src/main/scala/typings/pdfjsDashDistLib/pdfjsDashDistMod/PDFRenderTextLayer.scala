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
  def apply(
    appendText: js.Function0[scala.Unit],
    beginLayout: js.Function0[scala.Unit],
    endLayout: js.Function0[scala.Unit]
  ): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendText")(appendText)
    __obj.updateDynamic("beginLayout")(beginLayout)
    __obj.updateDynamic("endLayout")(endLayout)
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
}

