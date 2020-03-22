package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], column_url = column_url.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsCreateCardResponse]
  }
}

