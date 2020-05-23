package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  card_id  :number,   position  :string,   column_id ? :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsMoveCardEndpoint extends js.Object {
  var card_id: Double
  /**
    * The `id` value of a column in the same project.
    */
  var column_id: js.UndefOr[Double] = js.undefined
  var mediaType: `8`
  /**
    * Can be one of `top`, `bottom`, or `after:<card_id>`, where `<card_id>` is the `id` value of a card in the same column, or in the new column specified by `column_id`.
    */
  var position: String
}

object ProjectsMoveCardEndpoint {
  @scala.inline
  def apply(card_id: Double, mediaType: `8`, position: String, column_id: js.UndefOr[Double] = js.undefined): ProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (!js.isUndefined(column_id)) __obj.updateDynamic("column_id")(column_id.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveCardEndpoint]
  }
}

