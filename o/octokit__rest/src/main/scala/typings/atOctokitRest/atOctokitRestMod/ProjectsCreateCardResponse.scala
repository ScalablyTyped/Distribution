package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateCardResponse extends js.Object {
  var archived: Boolean
  var column_url: String
  var content_url: String
  var created_at: String
  var creator: ProjectsCreateCardResponseCreator
  var id: Double
  var node_id: String
  var note: String
  var project_url: String
  var updated_at: String
  var url: String
}

object ProjectsCreateCardResponse {
  @scala.inline
  def apply(
    archived: Boolean,
    column_url: String,
    content_url: String,
    created_at: String,
    creator: ProjectsCreateCardResponseCreator,
    id: Double,
    node_id: String,
    note: String,
    project_url: String,
    updated_at: String,
    url: String
  ): ProjectsCreateCardResponse = {
    val __obj = js.Dynamic.literal(archived = archived, column_url = column_url, content_url = content_url, created_at = created_at, creator = creator, id = id, node_id = node_id, note = note, project_url = project_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ProjectsCreateCardResponse]
  }
}

