package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeIcon extends js.Object {
  var depth: String
  var height: String
  var mimetype: String
  var url: String
  var width: String
}

object IBridgeIcon {
  @scala.inline
  def apply(depth: String, height: String, mimetype: String, url: String, width: String): IBridgeIcon = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBridgeIcon]
  }
}

