package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesListResponseItem extends js.Object {
  var key: java.lang.String
  var name: java.lang.String
  var node_id: js.UndefOr[java.lang.String] = js.undefined
  var spdx_id: java.lang.String
  var url: java.lang.String
}

object LicensesListResponseItem {
  @scala.inline
  def apply(
    key: java.lang.String,
    name: java.lang.String,
    spdx_id: java.lang.String,
    url: java.lang.String,
    node_id: java.lang.String = null
  ): LicensesListResponseItem = {
    val __obj = js.Dynamic.literal(key = key, name = name, spdx_id = spdx_id, url = url)
    if (node_id != null) __obj.updateDynamic("node_id")(node_id)
    __obj.asInstanceOf[LicensesListResponseItem]
  }
}

