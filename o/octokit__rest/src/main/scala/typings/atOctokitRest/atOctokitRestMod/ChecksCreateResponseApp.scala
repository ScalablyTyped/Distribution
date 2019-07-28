package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponseApp extends js.Object {
  var created_at: String
  var description: String
  var external_url: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var owner: ChecksCreateResponseAppOwner
  var updated_at: String
}

object ChecksCreateResponseApp {
  @scala.inline
  def apply(
    created_at: String,
    description: String,
    external_url: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    owner: ChecksCreateResponseAppOwner,
    updated_at: String
  ): ChecksCreateResponseApp = {
    val __obj = js.Dynamic.literal(created_at = created_at, description = description, external_url = external_url, html_url = html_url, id = id, name = name, node_id = node_id, owner = owner, updated_at = updated_at)
  
    __obj.asInstanceOf[ChecksCreateResponseApp]
  }
}

