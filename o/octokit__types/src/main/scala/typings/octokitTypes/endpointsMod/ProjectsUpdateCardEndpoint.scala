package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  card_id  :number,   note ? :string,   archived ? :boolean} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsUpdateCardEndpoint extends js.Object {
  /**
    * Use `true` to archive a project card. Specify `false` if you need to restore a previously archived project card.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  var card_id: Double
  var mediaType: `8`
  /**
    * The card's note content. Only valid for cards without another type of content, so this cannot be specified if the card already has a `content_id` and `content_type`.
    */
  var note: js.UndefOr[String] = js.undefined
}

object ProjectsUpdateCardEndpoint {
  @scala.inline
  def apply(card_id: Double, mediaType: `8`, archived: js.UndefOr[Boolean] = js.undefined, note: String = null): ProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.get.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateCardEndpoint]
  }
}

