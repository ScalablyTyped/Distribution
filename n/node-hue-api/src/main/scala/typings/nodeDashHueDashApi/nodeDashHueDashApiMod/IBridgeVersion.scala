package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import typings.nodeDashHueDashApi.Anon_Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeVersion extends js.Object {
  var name: String
  var version: Anon_Api
}

object IBridgeVersion {
  @scala.inline
  def apply(name: String, version: Anon_Api): IBridgeVersion = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[IBridgeVersion]
  }
}

