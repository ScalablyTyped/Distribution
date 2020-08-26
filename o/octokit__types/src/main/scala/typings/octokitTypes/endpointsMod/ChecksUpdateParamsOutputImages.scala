package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksUpdateParamsOutputImages extends js.Object {
  var alt: String = js.native
  var caption: js.UndefOr[String] = js.native
  var image_url: String = js.native
}

object ChecksUpdateParamsOutputImages {
  @scala.inline
  def apply(alt: String, image_url: String): ChecksUpdateParamsOutputImages = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], image_url = image_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutputImages]
  }
  @scala.inline
  implicit class ChecksUpdateParamsOutputImagesOps[Self <: ChecksUpdateParamsOutputImages] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
  }
  
}

