package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeVersion extends js.Object {
  var name: String
  var version: Api
}

object IBridgeVersion {
  @scala.inline
  def apply(name: String, version: Api): IBridgeVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeVersion]
  }
}

