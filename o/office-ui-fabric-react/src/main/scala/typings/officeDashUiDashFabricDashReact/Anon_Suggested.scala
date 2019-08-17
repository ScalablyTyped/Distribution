package typings.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Suggested extends js.Object {
  /** Whether the suggestion item is selected or not. */
  var suggested: js.UndefOr[Boolean] = js.undefined
}

object Anon_Suggested {
  @scala.inline
  def apply(suggested: js.UndefOr[Boolean] = js.undefined): Anon_Suggested = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suggested)) __obj.updateDynamic("suggested")(suggested)
    __obj.asInstanceOf[Anon_Suggested]
  }
}

