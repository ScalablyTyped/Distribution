package typings
package pdfjsDashDistLib.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerParams extends js.Object {
  var container: stdLib.HTMLElement
  var viewer: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object PDFViewerParams {
  @scala.inline
  def apply(container: stdLib.HTMLElement, viewer: stdLib.HTMLElement = null): PDFViewerParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    if (viewer != null) __obj.updateDynamic("viewer")(viewer)
    __obj.asInstanceOf[PDFViewerParams]
  }
}

