package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(node_id = node_id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitUpdateRefResponse]
  }
}

