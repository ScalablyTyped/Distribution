package typings
package nodeDashHueDashApiLib.nodeDashHueDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeDescription extends js.Object {
  var icons: js.UndefOr[js.Array[IBridgeIcon]] = js.undefined
  var manufacturer: java.lang.String
  var model: nodeDashHueDashApiLib.Anon_Description
  var name: java.lang.String
  var url: java.lang.String
  var version: nodeDashHueDashApiLib.Anon_Major
}

object IBridgeDescription {
  @scala.inline
  def apply(
    manufacturer: java.lang.String,
    model: nodeDashHueDashApiLib.Anon_Description,
    name: java.lang.String,
    url: java.lang.String,
    version: nodeDashHueDashApiLib.Anon_Major,
    icons: js.Array[IBridgeIcon] = null
  ): IBridgeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manufacturer")(manufacturer)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("version")(version)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    __obj.asInstanceOf[IBridgeDescription]
  }
}

