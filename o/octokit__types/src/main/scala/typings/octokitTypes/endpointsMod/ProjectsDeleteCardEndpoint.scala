package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  card_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsDeleteCardEndpoint extends js.Object {
  var card_id: Double
  var mediaType: `8`
}

object ProjectsDeleteCardEndpoint {
  @scala.inline
  def apply(card_id: Double, mediaType: `8`): ProjectsDeleteCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsDeleteCardEndpoint]
  }
}

