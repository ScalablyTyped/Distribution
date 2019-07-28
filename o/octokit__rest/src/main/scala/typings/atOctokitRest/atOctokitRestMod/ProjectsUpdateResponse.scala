package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateResponse extends js.Object {
  var body: String
  var columns_url: String
  var created_at: String
  var creator: ProjectsUpdateResponseCreator
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var number: Double
  var owner_url: String
  var state: String
  var updated_at: String
  var url: String
}

object ProjectsUpdateResponse {
  @scala.inline
  def apply(
    body: String,
    columns_url: String,
    created_at: String,
    creator: ProjectsUpdateResponseCreator,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    number: Double,
    owner_url: String,
    state: String,
    updated_at: String,
    url: String
  ): ProjectsUpdateResponse = {
    val __obj = js.Dynamic.literal(body = body, columns_url = columns_url, created_at = created_at, creator = creator, html_url = html_url, id = id, name = name, node_id = node_id, number = number, owner_url = owner_url, state = state, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ProjectsUpdateResponse]
  }
}

