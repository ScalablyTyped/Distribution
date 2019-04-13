package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUpdateRefResponse extends js.Object {
  var node_id: java.lang.String
  var `object`: GitUpdateRefResponseObject
  var ref: java.lang.String
  var url: java.lang.String
}

object GitUpdateRefResponse {
  @scala.inline
  def apply(
    node_id: java.lang.String,
    `object`: GitUpdateRefResponseObject,
    ref: java.lang.String,
    url: java.lang.String
  ): GitUpdateRefResponse = {
    val __obj = js.Dynamic.literal(node_id = node_id, ref = ref, url = url)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[GitUpdateRefResponse]
  }
}

