package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  column_id  :number,   name  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsUpdateColumnEndpoint extends js.Object {
  var column_id: Double
  var mediaType: `8`
  /**
    * The new name of the column.
    */
  var name: String
}

object ProjectsUpdateColumnEndpoint {
  @scala.inline
  def apply(column_id: Double, mediaType: `8`, name: String): ProjectsUpdateColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateColumnEndpoint]
  }
}

