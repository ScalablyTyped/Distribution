package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  key  :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'scarlet-witch'> */
trait CodesOfConductGetConductCodeEndpoint extends js.Object {
  var key: String
  var mediaType: `3`
}

object CodesOfConductGetConductCodeEndpoint {
  @scala.inline
  def apply(key: String, mediaType: `3`): CodesOfConductGetConductCodeEndpoint = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetConductCodeEndpoint]
  }
}

