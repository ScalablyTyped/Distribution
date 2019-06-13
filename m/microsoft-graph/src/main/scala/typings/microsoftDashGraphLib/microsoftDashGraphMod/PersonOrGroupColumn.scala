package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonOrGroupColumn extends js.Object {
  /** Indicates whether multiple values can be selected from the source. */
  var allowMultipleSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly. */
  var chooseFromType: js.UndefOr[java.lang.String] = js.undefined
  /** How to display the information about the person or group chosen. See below. */
  var displayAs: js.UndefOr[java.lang.String] = js.undefined
}

object PersonOrGroupColumn {
  @scala.inline
  def apply(
    allowMultipleSelection: js.UndefOr[scala.Boolean] = js.undefined,
    chooseFromType: java.lang.String = null,
    displayAs: java.lang.String = null
  ): PersonOrGroupColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleSelection)) __obj.updateDynamic("allowMultipleSelection")(allowMultipleSelection)
    if (chooseFromType != null) __obj.updateDynamic("chooseFromType")(chooseFromType)
    if (displayAs != null) __obj.updateDynamic("displayAs")(displayAs)
    __obj.asInstanceOf[PersonOrGroupColumn]
  }
}

