package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetRefResponseData extends js.Object {
  var node_id: String
  var `object`: Type
  var ref: String
  var url: String
}

object GitGetRefResponseData {
  @scala.inline
  def apply(node_id: String, `object`: Type, ref: String, url: String): GitGetRefResponseData = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitGetRefResponseData]
  }
}

