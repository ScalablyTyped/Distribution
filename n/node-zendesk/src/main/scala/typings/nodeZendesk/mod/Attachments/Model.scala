package typings.nodeZendesk.mod.Attachments

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends Photo {
  var thumbnails: js.Array[Photo]
}

object Model {
  @scala.inline
  def apply(
    content_type: String,
    content_url: String,
    file_name: String,
    height: Double,
    id: ZendeskID,
    `inline`: Boolean,
    size: Double,
    thumbnails: js.Array[Photo],
    url: String,
    width: Double
  ): Model = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

