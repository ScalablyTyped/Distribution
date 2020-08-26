package typings.pdfjsDist.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFRenderParams extends js.Object {
  var canvasContext: CanvasRenderingContext2D = js.native
  var continueCallback: js.UndefOr[js.Function1[/* _continue */ js.Function0[Unit], Unit]] = js.native
  var imageLayer: js.UndefOr[PDFRenderImageLayer] = js.native
  var renderInteractiveForms: js.UndefOr[Boolean] = js.native
  var textLayer: js.UndefOr[PDFRenderTextLayer] = js.native
  var viewport: js.UndefOr[PDFPageViewport] = js.native
}

object PDFRenderParams {
  @scala.inline
  def apply(canvasContext: CanvasRenderingContext2D): PDFRenderParams = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRenderParams]
  }
  @scala.inline
  implicit class PDFRenderParamsOps[Self <: PDFRenderParams] (val x: Self) extends AnyVal {
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
    def setCanvasContext(value: CanvasRenderingContext2D): Self = this.set("canvasContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinueCallback(value: /* _continue */ js.Function0[Unit] => Unit): Self = this.set("continueCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContinueCallback: Self = this.set("continueCallback", js.undefined)
    @scala.inline
    def setImageLayer(value: PDFRenderImageLayer): Self = this.set("imageLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLayer: Self = this.set("imageLayer", js.undefined)
    @scala.inline
    def setRenderInteractiveForms(value: Boolean): Self = this.set("renderInteractiveForms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderInteractiveForms: Self = this.set("renderInteractiveForms", js.undefined)
    @scala.inline
    def setTextLayer(value: PDFRenderTextLayer): Self = this.set("textLayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextLayer: Self = this.set("textLayer", js.undefined)
    @scala.inline
    def setViewport(value: PDFPageViewport): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
  
}

