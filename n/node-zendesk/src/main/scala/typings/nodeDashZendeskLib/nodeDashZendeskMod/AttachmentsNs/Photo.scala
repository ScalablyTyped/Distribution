package typings
package nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo
  extends nodeDashZendeskLib.nodeDashZendeskMod.PersistableModel {
  var content_type: java.lang.String
  var content_url: java.lang.String
  var file_name: java.lang.String
  var height: scala.Double
  var `inline`: scala.Boolean
  var size: scala.Double
  var url: java.lang.String
  var width: scala.Double
}

object Photo {
  @scala.inline
  def apply(
    content_type: java.lang.String,
    content_url: java.lang.String,
    file_name: java.lang.String,
    height: scala.Double,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    `inline`: scala.Boolean,
    size: scala.Double,
    url: java.lang.String,
    width: scala.Double
  ): Photo = {
    val __obj = js.Dynamic.literal(content_type = content_type, content_url = content_url, file_name = file_name, height = height, id = id, size = size, url = url, width = width)
    __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Photo]
  }
}

