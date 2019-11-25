package typings.pdfjsDashDist.pdfjsDashDistMod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFRenderParams extends js.Object {
  var canvasContext: CanvasRenderingContext2D
  var continueCallback: js.UndefOr[js.Function1[/* _continue */ js.Function0[Unit], Unit]] = js.undefined
  var imageLayer: js.UndefOr[PDFRenderImageLayer] = js.undefined
  var textLayer: js.UndefOr[PDFRenderTextLayer] = js.undefined
  var viewport: js.UndefOr[PDFPageViewport] = js.undefined
}

object PDFRenderParams {
  @scala.inline
  def apply(
    canvasContext: CanvasRenderingContext2D,
    continueCallback: /* _continue */ js.Function0[Unit] => Unit = null,
    imageLayer: PDFRenderImageLayer = null,
    textLayer: PDFRenderTextLayer = null,
    viewport: PDFPageViewport = null
  ): PDFRenderParams = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any])
    if (continueCallback != null) __obj.updateDynamic("continueCallback")(js.Any.fromFunction1(continueCallback))
    if (imageLayer != null) __obj.updateDynamic("imageLayer")(imageLayer.asInstanceOf[js.Any])
    if (textLayer != null) __obj.updateDynamic("textLayer")(textLayer.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRenderParams]
  }
}

