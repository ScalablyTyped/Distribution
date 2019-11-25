package typings.atOnfleetNodeDashOnfleet.resourcesTasksMod

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
    minimumAge: Int | Double = null,
    notes: js.UndefOr[Boolean] = js.undefined,
    photo: js.UndefOr[Boolean] = js.undefined,
    signature: js.UndefOr[Boolean] = js.undefined
  ): TaskCompletionRequirements = {
    val __obj = js.Dynamic.literal()
    if (minimumAge != null) __obj.updateDynamic("minimumAge")(minimumAge.asInstanceOf[js.Any])
    if (!js.isUndefined(notes)) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(photo)) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (!js.isUndefined(signature)) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskCompletionRequirements]
  }
}

