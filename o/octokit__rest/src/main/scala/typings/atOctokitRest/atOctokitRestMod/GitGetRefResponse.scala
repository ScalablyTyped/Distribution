package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetRefResponse extends js.Object {
  var node_id: String
  var `object`: GitGetRefResponseObject
  var ref: String
  var url: String
}

object GitGetRefResponse {
  @scala.inline
  def apply(node_id: String, `object`: GitGetRefResponseObject, ref: String, url: String): GitGetRefResponse = {
    val __obj = js.Dynamic.literal(node_id = node_id, ref = ref, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitGetRefResponse]
  }
}

