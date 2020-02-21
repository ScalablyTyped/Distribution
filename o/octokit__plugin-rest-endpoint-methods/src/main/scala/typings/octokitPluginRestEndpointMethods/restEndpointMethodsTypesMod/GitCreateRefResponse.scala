package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateRefResponse extends js.Object {
  var node_id: String
  var `object`: GitCreateRefResponseObject
  var ref: String
  var url: String
}

object GitCreateRefResponse {
  @scala.inline
  def apply(node_id: String, `object`: GitCreateRefResponseObject, ref: String, url: String): GitCreateRefResponse = {
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateRefResponse]
  }
}

