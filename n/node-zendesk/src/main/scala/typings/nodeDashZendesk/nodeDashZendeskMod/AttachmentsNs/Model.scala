package typings.nodeDashZendesk.nodeDashZendeskMod.AttachmentsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
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
    val __obj = js.Dynamic.literal(content_type = content_type, content_url = content_url, file_name = file_name, height = height, id = id, size = size, thumbnails = thumbnails, url = url, width = width)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Model]
  }
}

