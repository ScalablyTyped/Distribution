package typings.nodeDashZendesk.nodeDashZendeskMod.Attachments

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
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Photo]
  }
}

