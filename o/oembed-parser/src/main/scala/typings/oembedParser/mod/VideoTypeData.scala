package typings.oembedParser.mod

import typings.oembedParser.oembedParserStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoTypeData extends OembedData {
  /** The height in pixels required to display the HTML. */
  var height: Double = js.native
  /**
    * The HTML required to embed a video player.
    * The HTML should have no padding or margins.
    * Consumers may wish to load the HTML in an off-domain iframe to avoid XSS vulnerabilities.
    */
  var html: String = js.native
  @JSName("type")
  val type_VideoTypeData: video = js.native
  /** The width in pixels required to display the HTML. */
  var width: Double = js.native
}

object VideoTypeData {
  @scala.inline
  def apply(height: Double, html: String, `type`: video, version: String, width: Double): VideoTypeData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTypeData]
  }
  @scala.inline
  implicit class VideoTypeDataOps[Self <: VideoTypeData] (val x: Self) extends AnyVal {
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
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: video): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

