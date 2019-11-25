package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenotePagePreviewLinks extends js.Object {
  var previewImageUrl: js.UndefOr[ExternalLink] = js.undefined
}

object OnenotePagePreviewLinks {
  @scala.inline
  def apply(previewImageUrl: ExternalLink = null): OnenotePagePreviewLinks = {
    val __obj = js.Dynamic.literal()
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenotePagePreviewLinks]
  }
}

