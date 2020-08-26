package typings.nodeZendesk.mod.Attachments

import typings.nodeZendesk.mod.PersistableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Photo extends PersistableModel {
  var content_type: String = js.native
  var content_url: String = js.native
  var file_name: String = js.native
  var height: Double = js.native
  var `inline`: Boolean = js.native
  var size: Double = js.native
  var url: String = js.native
  var width: Double = js.native
}

object Photo {
  @scala.inline
  def apply(
    content_type: String,
    content_url: String,
    file_name: String,
    height: Double,
    id: ZendeskID,
    `inline`: Boolean,
    size: Double,
    url: String,
    width: Double
  ): Photo = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Photo]
  }
  @scala.inline
  implicit class PhotoOps[Self <: Photo] (val x: Self) extends AnyVal {
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
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_url(value: String): Self = this.set("content_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile_name(value: String): Self = this.set("file_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

