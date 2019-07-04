package typings
package nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends Photo {
  var thumbnails: js.Array[Photo]
}

object Model {
  @scala.inline
  def apply(
    content_type: java.lang.String,
    content_url: java.lang.String,
    file_name: java.lang.String,
    height: scala.Double,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    `inline`: scala.Boolean,
    size: scala.Double,
    thumbnails: js.Array[Photo],
    url: java.lang.String,
    width: scala.Double
  ): Model = {
    val __obj = js.Dynamic.literal(content_type = content_type, content_url = content_url, file_name = file_name, height = height, id = id, size = size, thumbnails = thumbnails, url = url, width = width)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Model]
  }
}

