package typings.pdfjsDashDist.pdfjsDashDistMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerParams extends js.Object {
  var container: HTMLElement
  var viewer: js.UndefOr[HTMLElement] = js.undefined
}

object PDFViewerParams {
  @scala.inline
  def apply(container: HTMLElement, viewer: HTMLElement = null): PDFViewerParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    if (viewer != null) __obj.updateDynamic("viewer")(viewer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerParams]
  }
}

