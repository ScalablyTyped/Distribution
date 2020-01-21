package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuggested extends js.Object {
  /** Whether the suggestion item is selected or not. */
  var suggested: js.UndefOr[Boolean] = js.undefined
}

object AnonSuggested {
  @scala.inline
  def apply(suggested: js.UndefOr[Boolean] = js.undefined): AnonSuggested = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suggested)) __obj.updateDynamic("suggested")(suggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuggested]
  }
}

