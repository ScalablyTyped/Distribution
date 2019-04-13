package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesGetResponse extends js.Object {
  var body: java.lang.String
  var conditions: js.Array[java.lang.String]
  var description: java.lang.String
  var featured: scala.Boolean
  var html_url: java.lang.String
  var implementation: java.lang.String
  var key: java.lang.String
  var limitations: js.Array[java.lang.String]
  var name: java.lang.String
  var node_id: java.lang.String
  var permissions: js.Array[java.lang.String]
  var spdx_id: java.lang.String
  var url: java.lang.String
}

object LicensesGetResponse {
  @scala.inline
  def apply(
    body: java.lang.String,
    conditions: js.Array[java.lang.String],
    description: java.lang.String,
    featured: scala.Boolean,
    html_url: java.lang.String,
    implementation: java.lang.String,
    key: java.lang.String,
    limitations: js.Array[java.lang.String],
    name: java.lang.String,
    node_id: java.lang.String,
    permissions: js.Array[java.lang.String],
    spdx_id: java.lang.String,
    url: java.lang.String
  ): LicensesGetResponse = {
    val __obj = js.Dynamic.literal(body = body, conditions = conditions, description = description, featured = featured, html_url = html_url, implementation = implementation, key = key, limitations = limitations, name = name, node_id = node_id, permissions = permissions, spdx_id = spdx_id, url = url)
  
    __obj.asInstanceOf[LicensesGetResponse]
  }
}

