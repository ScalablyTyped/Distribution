package typings.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MjmlCarouselImageProps extends js.Object {
  var alt: js.UndefOr[String] = js.native
  var src: js.UndefOr[String] = js.native
  var thumbnailsSrc: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object MjmlCarouselImageProps {
  @scala.inline
  def apply(): MjmlCarouselImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlCarouselImageProps]
  }
  @scala.inline
  implicit class MjmlCarouselImagePropsOps[Self <: MjmlCarouselImageProps] (val x: Self) extends AnyVal {
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
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setThumbnailsSrc(value: String): Self = this.set("thumbnailsSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailsSrc: Self = this.set("thumbnailsSrc", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

