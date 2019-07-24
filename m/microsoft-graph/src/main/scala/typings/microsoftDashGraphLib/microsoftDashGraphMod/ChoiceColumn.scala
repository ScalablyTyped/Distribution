package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceColumn extends js.Object {
  // If true, allows custom values that aren't in the configured choices.
  var allowTextEntry: js.UndefOr[scala.Boolean] = js.undefined
  // The list of values available for this column.
  var choices: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
  var displayAs: js.UndefOr[java.lang.String] = js.undefined
}

object ChoiceColumn {
  @scala.inline
  def apply(
    allowTextEntry: js.UndefOr[scala.Boolean] = js.undefined,
    choices: js.Array[java.lang.String] = null,
    displayAs: java.lang.String = null
  ): ChoiceColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTextEntry)) __obj.updateDynamic("allowTextEntry")(allowTextEntry)
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (displayAs != null) __obj.updateDynamic("displayAs")(displayAs)
    __obj.asInstanceOf[ChoiceColumn]
  }
}

