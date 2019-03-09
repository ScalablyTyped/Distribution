package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerParams extends js.Object {
  var container: pdfjsDashDistLib.HTMLElement
  var viewer: js.UndefOr[pdfjsDashDistLib.HTMLElement] = js.undefined
}

object PDFViewerParams {
  @scala.inline
  def apply(container: pdfjsDashDistLib.HTMLElement, viewer: pdfjsDashDistLib.HTMLElement = null): PDFViewerParams = {
    val __obj = js.Dynamic.literal(container = container)
    if (viewer != null) __obj.updateDynamic("viewer")(viewer)
    __obj.asInstanceOf[PDFViewerParams]
  }
}

