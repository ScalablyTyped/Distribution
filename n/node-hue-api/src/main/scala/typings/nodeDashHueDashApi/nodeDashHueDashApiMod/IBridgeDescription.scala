package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import typings.nodeDashHueDashApi.Anon_Description
import typings.nodeDashHueDashApi.Anon_Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeDescription extends js.Object {
  var icons: js.UndefOr[js.Array[IBridgeIcon]] = js.undefined
  var manufacturer: String
  var model: Anon_Description
  var name: String
  var url: String
  var version: Anon_Major
}

object IBridgeDescription {
  @scala.inline
  def apply(
    manufacturer: String,
    model: Anon_Description,
    name: String,
    url: String,
    version: Anon_Major,
    icons: js.Array[IBridgeIcon] = null
  ): IBridgeDescription = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeDescription]
  }
}

