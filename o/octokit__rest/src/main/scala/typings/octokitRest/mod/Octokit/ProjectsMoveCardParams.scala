package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsMoveCardParams extends js.Object {
  var card_id: Double
  /**
    * The `id` value of a column in the same project.
    */
  var column_id: js.UndefOr[Double] = js.undefined
  /**
    * Can be one of `top`, `bottom`, or `after:<card_id>`, where `<card_id>` is the `id` value of a card in the same column, or in the new column specified by `column_id`.
    */
  var position: String
}

object ProjectsMoveCardParams {
  @scala.inline
  def apply(card_id: Double, position: String, column_id: Int | Double = null): ProjectsMoveCardParams = {
    val __obj = js.Dynamic.literal(card_id = card_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (column_id != null) __obj.updateDynamic("column_id")(column_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveCardParams]
  }
}

