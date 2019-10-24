package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitListMatchingRefsResponseItem extends js.Object {
  var node_id: String
  var `object`: GitListMatchingRefsResponseItemObject
  var ref: String
  var url: String
}

object GitListMatchingRefsResponseItem {
  @scala.inline
  def apply(node_id: String, `object`: GitListMatchingRefsResponseItemObject, ref: String, url: String): GitListMatchingRefsResponseItem = {
    val __obj = js.Dynamic.literal(node_id = node_id, ref = ref, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitListMatchingRefsResponseItem]
  }
}

