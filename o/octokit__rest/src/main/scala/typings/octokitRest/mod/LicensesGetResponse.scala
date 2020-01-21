package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetResponse extends js.Object {
  var body: String
  var conditions: js.Array[String]
  var description: String
  var featured: Boolean
  var html_url: String
  var implementation: String
  var key: String
  var limitations: js.Array[String]
  var name: String
  var node_id: String
  var permissions: js.Array[String]
  var spdx_id: String
  var url: String
}

object LicensesGetResponse {
  @scala.inline
  def apply(
    body: String,
    conditions: js.Array[String],
    description: String,
    featured: Boolean,
    html_url: String,
    implementation: String,
    key: String,
    limitations: js.Array[String],
    name: String,
    node_id: String,
    permissions: js.Array[String],
    spdx_id: String,
    url: String
  ): LicensesGetResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], limitations = limitations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], spdx_id = spdx_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LicensesGetResponse]
  }
}

