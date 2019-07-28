package typings.nodeDashZendesk.nodeDashZendeskMod.AttachmentsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.PersistableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends PersistableModel {
  var content_type: String
  var content_url: String
  var file_name: String
  var height: Double
  var `inline`: Boolean
  var size: Double
  var url: String
  var width: Double
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
    val __obj = js.Dynamic.literal(content_type = content_type, content_url = content_url, file_name = file_name, height = height, id = id, size = size, url = url, width = width)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Photo]
  }
}

