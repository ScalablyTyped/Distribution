package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetSuiteResponseApp extends js.Object {
  var created_at: java.lang.String
  var description: java.lang.String
  var external_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var node_id: java.lang.String
  var owner: ChecksGetSuiteResponseAppOwner
  var updated_at: java.lang.String
}

object ChecksGetSuiteResponseApp {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    description: java.lang.String,
    external_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    node_id: java.lang.String,
    owner: ChecksGetSuiteResponseAppOwner,
    updated_at: java.lang.String
  ): ChecksGetSuiteResponseApp = {
    val __obj = js.Dynamic.literal(created_at = created_at, description = description, external_url = external_url, html_url = html_url, id = id, name = name, node_id = node_id, owner = owner, updated_at = updated_at)
  
    __obj.asInstanceOf[ChecksGetSuiteResponseApp]
  }
}

