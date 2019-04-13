package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddDeployKeyResponse extends js.Object {
  var created_at: java.lang.String
  var id: scala.Double
  var key: java.lang.String
  var read_only: scala.Boolean
  var title: java.lang.String
  var url: java.lang.String
  var verified: scala.Boolean
}

object ReposAddDeployKeyResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    id: scala.Double,
    key: java.lang.String,
    read_only: scala.Boolean,
    title: java.lang.String,
    url: java.lang.String,
    verified: scala.Boolean
  ): ReposAddDeployKeyResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id, key = key, read_only = read_only, title = title, url = url, verified = verified)
  
    __obj.asInstanceOf[ReposAddDeployKeyResponse]
  }
}

