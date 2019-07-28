package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddDeployKeyResponse extends js.Object {
  var created_at: String
  var id: Double
  var key: String
  var read_only: Boolean
  var title: String
  var url: String
  var verified: Boolean
}

object ReposAddDeployKeyResponse {
  @scala.inline
  def apply(
    created_at: String,
    id: Double,
    key: String,
    read_only: Boolean,
    title: String,
    url: String,
    verified: Boolean
  ): ReposAddDeployKeyResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, id = id, key = key, read_only = read_only, title = title, url = url, verified = verified)
  
    __obj.asInstanceOf[ReposAddDeployKeyResponse]
  }
}

