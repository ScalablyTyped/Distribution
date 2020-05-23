package typings.onfleetNodeOnfleet.tasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskCompletionRequirements extends js.Object {
  var minimumAge: js.UndefOr[Double] = js.undefined
  var notes: js.UndefOr[Boolean] = js.undefined
  var photo: js.UndefOr[Boolean] = js.undefined
  var signature: js.UndefOr[Boolean] = js.undefined
}

object TaskCompletionRequirements {
  @scala.inline
  def apply(
    minimumAge: js.UndefOr[Double] = js.undefined,
    notes: js.UndefOr[Boolean] = js.undefined,
    photo: js.UndefOr[Boolean] = js.undefined,
    signature: js.UndefOr[Boolean] = js.undefined
  ): TaskCompletionRequirements = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minimumAge)) __obj.updateDynamic("minimumAge")(minimumAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notes)) __obj.updateDynamic("notes")(notes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(photo)) __obj.updateDynamic("photo")(photo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signature)) __obj.updateDynamic("signature")(signature.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskCompletionRequirements]
  }
}

