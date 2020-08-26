package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenotePagePreviewLinks extends js.Object {
  var previewImageUrl: js.UndefOr[ExternalLink] = js.native
}

object OnenotePagePreviewLinks {
  @scala.inline
  def apply(): OnenotePagePreviewLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePagePreviewLinks]
  }
  @scala.inline
  implicit class OnenotePagePreviewLinksOps[Self <: OnenotePagePreviewLinks] (val x: Self) extends AnyVal {
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
    def setPreviewImageUrl(value: ExternalLink): Self = this.set("previewImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewImageUrl: Self = this.set("previewImageUrl", js.undefined)
  }
  
}

