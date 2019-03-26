package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderParams extends js.Object {
  var canvasContext: stdLib.CanvasRenderingContext2D
  var continueCallback: js.UndefOr[js.Function1[/* _continue */ js.Function0[scala.Unit], scala.Unit]] = js.undefined
  var imageLayer: js.UndefOr[PDFRenderImageLayer] = js.undefined
  var textLayer: js.UndefOr[PDFRenderTextLayer] = js.undefined
  var viewport: js.UndefOr[PDFPageViewport] = js.undefined
}

object PDFRenderParams {
  @scala.inline
  def apply(
    canvasContext: stdLib.CanvasRenderingContext2D,
    continueCallback: /* _continue */ js.Function0[scala.Unit] => scala.Unit = null,
    imageLayer: PDFRenderImageLayer = null,
    textLayer: PDFRenderTextLayer = null,
    viewport: PDFPageViewport = null
  ): PDFRenderParams = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext)
    if (continueCallback != null) __obj.updateDynamic("continueCallback")(js.Any.fromFunction1(continueCallback))
    if (imageLayer != null) __obj.updateDynamic("imageLayer")(imageLayer)
    if (textLayer != null) __obj.updateDynamic("textLayer")(textLayer)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[PDFRenderParams]
  }
}

