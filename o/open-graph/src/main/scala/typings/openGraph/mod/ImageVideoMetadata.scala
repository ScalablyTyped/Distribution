package typings.openGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageVideoMetadata extends Metadata {
  /** A description of what is in the image (not a caption). If the page specifies an `og:image` it should specify `og:image:alt`. */
  var alt: js.UndefOr[String | js.Array[String]] = js.native
  /** The number of pixels high. */
  var height: js.UndefOr[String | js.Array[String]] = js.native
  /** The  */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  /** The number of pixels wide. */
  var width: js.UndefOr[String | js.Array[String]] = js.native
}

object ImageVideoMetadata {
  @scala.inline
  def apply(): ImageVideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageVideoMetadata]
  }
  @scala.inline
  implicit class ImageVideoMetadataOps[Self <: ImageVideoMetadata] (val x: Self) extends AnyVal {
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
    def setAltVarargs(value: String*): Self = this.set("alt", js.Array(value :_*))
    @scala.inline
    def setAlt(value: String | js.Array[String]): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setHeightVarargs(value: String*): Self = this.set("height", js.Array(value :_*))
    @scala.inline
    def setHeight(value: String | js.Array[String]): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setUrlVarargs(value: String*): Self = this.set("url", js.Array(value :_*))
    @scala.inline
    def setUrl(value: String | js.Array[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidthVarargs(value: String*): Self = this.set("width", js.Array(value :_*))
    @scala.inline
    def setWidth(value: String | js.Array[String]): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

