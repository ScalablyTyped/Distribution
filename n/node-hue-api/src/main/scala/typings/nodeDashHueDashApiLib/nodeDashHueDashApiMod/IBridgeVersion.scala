package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeVersion extends js.Object {
  var name: java.lang.String
  var version: nodeDashHueDashApiLib.Anon_Api
}

object IBridgeVersion {
  @scala.inline
  def apply(name: java.lang.String, version: nodeDashHueDashApiLib.Anon_Api): IBridgeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IBridgeVersion]
  }
}

