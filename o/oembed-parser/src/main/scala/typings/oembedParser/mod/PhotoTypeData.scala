package typings.oembedParser.mod

import typings.oembedParser.oembedParserStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoTypeData extends OembedData {
  /** The height in pixels of the image specified in the url parameter. */
  var height: Double = js.native
  @JSName("type")
  val type_PhotoTypeData: photo = js.native
  /**
    * The source URL of the image. Consumers should be able to insert this URL into an <img> element.
    * Only HTTP and HTTPS URLs are valid.
    */
  var url: String = js.native
  /** The width in pixels of the image specified in the url parameter. */
  var width: Double = js.native
}

object PhotoTypeData {
  @scala.inline
  def apply(height: Double, `type`: photo, url: String, version: String, width: Double): PhotoTypeData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoTypeData]
  }
  @scala.inline
  implicit class PhotoTypeDataOps[Self <: PhotoTypeData] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: photo): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

