package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'sombra'> */
trait InteractionsRemoveRestrictionsForOrgEndpoint extends js.Object {
  var mediaType: `6`
  @JSName("org")
  var org_ : String
}

object InteractionsRemoveRestrictionsForOrgEndpoint {
  @scala.inline
  def apply(mediaType: `6`, org_ : String): InteractionsRemoveRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionsRemoveRestrictionsForOrgEndpoint]
  }
}

