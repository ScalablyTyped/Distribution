package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(body = body, conditions = conditions, description = description, featured = featured, html_url = html_url, implementation = implementation, key = key, limitations = limitations, name = name, node_id = node_id, permissions = permissions, spdx_id = spdx_id, url = url)
  
    __obj.asInstanceOf[LicensesGetResponse]
  }
}

