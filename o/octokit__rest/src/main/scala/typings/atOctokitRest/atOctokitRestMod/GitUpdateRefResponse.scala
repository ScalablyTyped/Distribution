package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUpdateRefResponse extends js.Object {
  var node_id: String
  var `object`: GitUpdateRefResponseObject
  var ref: String
  var url: String
}

object GitUpdateRefResponse {
  @scala.inline
  def apply(node_id: String, `object`: GitUpdateRefResponseObject, ref: String, url: String): GitUpdateRefResponse = {
    val __obj = js.Dynamic.literal(node_id = node_id, ref = ref, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitUpdateRefResponse]
  }
}

