package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceColumn extends js.Object {
  // If true, allows custom values that aren't in the configured choices.
  var allowTextEntry: js.UndefOr[Boolean] = js.undefined
  // The list of values available for this column.
  var choices: js.UndefOr[js.Array[String]] = js.undefined
  // How the choices are to be presented in the UX. Must be one of checkBoxes, dropDownMenu, or radioButtons
  var displayAs: js.UndefOr[String] = js.undefined
}

object ChoiceColumn {
  @scala.inline
  def apply(
    allowTextEntry: js.UndefOr[Boolean] = js.undefined,
    choices: js.Array[String] = null,
    displayAs: String = null
  ): ChoiceColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTextEntry)) __obj.updateDynamic("allowTextEntry")(allowTextEntry.get.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (displayAs != null) __obj.updateDynamic("displayAs")(displayAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceColumn]
  }
}

