package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsListReposResponseItemLicense extends js.Object {
  var key: String
  var name: String
  var node_id: String
  var spdx_id: String
  var url: String
}

object TeamsListReposResponseItemLicense {
  @scala.inline
  def apply(key: String, name: String, node_id: String, spdx_id: String, url: String): TeamsListReposResponseItemLicense = {
    val __obj = js.Dynamic.literal(key = key, name = name, node_id = node_id, spdx_id = spdx_id, url = url)
  
    __obj.asInstanceOf[TeamsListReposResponseItemLicense]
  }
}

