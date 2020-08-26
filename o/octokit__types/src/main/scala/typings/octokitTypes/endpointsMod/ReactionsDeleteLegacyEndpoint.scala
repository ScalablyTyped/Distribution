package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`12`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  reaction_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
@js.native
trait ReactionsDeleteLegacyEndpoint extends js.Object {
  var mediaType: `12` = js.native
  var reaction_id: Double = js.native
}

object ReactionsDeleteLegacyEndpoint {
  @scala.inline
  def apply(mediaType: `12`, reaction_id: Double): ReactionsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], reaction_id = reaction_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsDeleteLegacyEndpoint]
  }
  @scala.inline
  implicit class ReactionsDeleteLegacyEndpointOps[Self <: ReactionsDeleteLegacyEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMediaType(value: `12`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReaction_id(value: Double): Self = this.set("reaction_id", value.asInstanceOf[js.Any])
  }
  
}

