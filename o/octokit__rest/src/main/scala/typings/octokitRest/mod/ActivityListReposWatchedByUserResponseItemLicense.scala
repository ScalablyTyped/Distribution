package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListReposWatchedByUserResponseItemLicense extends js.Object {
  var key: String
  var name: String
  var node_id: String
  var spdx_id: String
  var url: String
}

object ActivityListReposWatchedByUserResponseItemLicense {
  @scala.inline
  def apply(key: String, name: String, node_id: String, spdx_id: String, url: String): ActivityListReposWatchedByUserResponseItemLicense = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], spdx_id = spdx_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityListReposWatchedByUserResponseItemLicense]
  }
}

