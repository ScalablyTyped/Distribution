package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateCardResponse extends js.Object {
  var archived: scala.Boolean
  var column_url: java.lang.String
  var content_url: java.lang.String
  var created_at: java.lang.String
  var creator: ProjectsCreateCardResponseCreator
  var id: scala.Double
  var node_id: java.lang.String
  var note: java.lang.String
  var project_url: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object ProjectsCreateCardResponse {
  @scala.inline
  def apply(
    archived: scala.Boolean,
    column_url: java.lang.String,
    content_url: java.lang.String,
    created_at: java.lang.String,
    creator: ProjectsCreateCardResponseCreator,
    id: scala.Double,
    node_id: java.lang.String,
    note: java.lang.String,
    project_url: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): ProjectsCreateCardResponse = {
    val __obj = js.Dynamic.literal(archived = archived, column_url = column_url, content_url = content_url, created_at = created_at, creator = creator, id = id, node_id = node_id, note = note, project_url = project_url, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[ProjectsCreateCardResponse]
  }
}

