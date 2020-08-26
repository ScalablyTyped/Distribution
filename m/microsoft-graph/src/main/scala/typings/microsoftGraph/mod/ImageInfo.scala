package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageInfo extends js.Object {
  /**
    * Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization.
    * For example – a high contrast image
    */
  var addImageQuery: js.UndefOr[Boolean] = js.native
  // Optional; alt-text accessible content for the image
  var alternateText: js.UndefOr[String] = js.native
  var alternativeText: js.UndefOr[String] = js.native
  // Optional; URI that points to an icon which represents the application used to generate the activity
  var iconUrl: js.UndefOr[String] = js.native
}

object ImageInfo {
  @scala.inline
  def apply(): ImageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageInfo]
  }
  @scala.inline
  implicit class ImageInfoOps[Self <: ImageInfo] (val x: Self) extends AnyVal {
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
    def setAddImageQuery(value: Boolean): Self = this.set("addImageQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddImageQuery: Self = this.set("addImageQuery", js.undefined)
    @scala.inline
    def setAlternateText(value: String): Self = this.set("alternateText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateText: Self = this.set("alternateText", js.undefined)
    @scala.inline
    def setAlternativeText(value: String): Self = this.set("alternativeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativeText: Self = this.set("alternativeText", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
  }
  
}

