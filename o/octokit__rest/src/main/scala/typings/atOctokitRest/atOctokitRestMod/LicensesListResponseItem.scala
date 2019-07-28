package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesListResponseItem extends js.Object {
  var key: String
  var name: String
  var node_id: js.UndefOr[String] = js.undefined
  var spdx_id: String
  var url: String
}

object LicensesListResponseItem {
  @scala.inline
  def apply(key: String, name: String, spdx_id: String, url: String, node_id: String = null): LicensesListResponseItem = {
    val __obj = js.Dynamic.literal(key = key, name = name, spdx_id = spdx_id, url = url)
    if (node_id != null) __obj.updateDynamic("node_id")(node_id)
    __obj.asInstanceOf[LicensesListResponseItem]
  }
}

