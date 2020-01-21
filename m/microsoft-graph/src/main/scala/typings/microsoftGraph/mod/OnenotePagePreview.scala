package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenotePagePreview extends js.Object {
  var links: js.UndefOr[OnenotePagePreviewLinks] = js.undefined
  var previewText: js.UndefOr[String] = js.undefined
}

object OnenotePagePreview {
  @scala.inline
  def apply(links: OnenotePagePreviewLinks = null, previewText: String = null): OnenotePagePreview = {
    val __obj = js.Dynamic.literal()
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (previewText != null) __obj.updateDynamic("previewText")(previewText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenotePagePreview]
  }
}

