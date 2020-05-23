package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  column_id  :number,   position  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsMoveColumnEndpoint extends js.Object {
  var column_id: Double
  var mediaType: `8`
  /**
    * Can be one of `first`, `last`, or `after:<column_id>`, where `<column_id>` is the `id` value of a column in the same project.
    */
  var position: String
}

object ProjectsMoveColumnEndpoint {
  @scala.inline
  def apply(column_id: Double, mediaType: `8`, position: String): ProjectsMoveColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveColumnEndpoint]
  }
}

