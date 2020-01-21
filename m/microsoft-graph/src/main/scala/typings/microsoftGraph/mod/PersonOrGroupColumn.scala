package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonOrGroupColumn extends js.Object {
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleSelection: js.UndefOr[Boolean] = js.undefined
  // Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
  var chooseFromType: js.UndefOr[String] = js.undefined
  // How to display the information about the person or group chosen. See below.
  var displayAs: js.UndefOr[String] = js.undefined
}

object PersonOrGroupColumn {
  @scala.inline
  def apply(
    allowMultipleSelection: js.UndefOr[Boolean] = js.undefined,
    chooseFromType: String = null,
    displayAs: String = null
  ): PersonOrGroupColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleSelection)) __obj.updateDynamic("allowMultipleSelection")(allowMultipleSelection.asInstanceOf[js.Any])
    if (chooseFromType != null) __obj.updateDynamic("chooseFromType")(chooseFromType.asInstanceOf[js.Any])
    if (displayAs != null) __obj.updateDynamic("displayAs")(displayAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonOrGroupColumn]
  }
}

