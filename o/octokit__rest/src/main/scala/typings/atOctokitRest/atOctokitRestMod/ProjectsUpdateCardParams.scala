package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateCardParams extends js.Object {
  /**
    * Use `true` to archive a project card. Specify `false` if you need to restore a previously archived project card.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  var card_id: Double
  /**
    * The card's note content. Only valid for cards without another type of content, so this cannot be specified if the card already has a `content_id` and `content_type`.
    */
  var note: js.UndefOr[String] = js.undefined
}

object ProjectsUpdateCardParams {
  @scala.inline
  def apply(card_id: Double, archived: js.UndefOr[Boolean] = js.undefined, note: String = null): ProjectsUpdateCardParams = {
    val __obj = js.Dynamic.literal(card_id = card_id)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ProjectsUpdateCardParams]
  }
}

