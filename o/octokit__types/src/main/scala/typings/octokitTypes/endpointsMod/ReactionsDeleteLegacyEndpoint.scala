package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  reaction_id  :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
trait ReactionsDeleteLegacyEndpoint extends js.Object {
  var mediaType: `9`
  var reaction_id: Double
}

object ReactionsDeleteLegacyEndpoint {
  @scala.inline
  def apply(mediaType: `9`, reaction_id: Double): ReactionsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteLegacyEndpoint]
  }
}

