package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureScoreControlStateUpdate extends js.Object {
  /** Assigns the control to the user who will take the action. */
  var assignedTo: js.UndefOr[java.lang.String] = js.undefined
  /** Provides optional comment about the control. */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** State of the control, which can be modified via a PATCH command (for example, ignored, thirdParty). */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the user who updated tenant state. */
  var updatedBy: js.UndefOr[java.lang.String] = js.undefined
  /** Time at which the control state was updated. */
  var updatedDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object SecureScoreControlStateUpdate {
  @scala.inline
  def apply(
    assignedTo: java.lang.String = null,
    comment: java.lang.String = null,
    state: java.lang.String = null,
    updatedBy: java.lang.String = null,
    updatedDateTime: java.lang.String = null
  ): SecureScoreControlStateUpdate = {
    val __obj = js.Dynamic.literal()
    if (assignedTo != null) __obj.updateDynamic("assignedTo")(assignedTo)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (state != null) __obj.updateDynamic("state")(state)
    if (updatedBy != null) __obj.updateDynamic("updatedBy")(updatedBy)
    if (updatedDateTime != null) __obj.updateDynamic("updatedDateTime")(updatedDateTime)
    __obj.asInstanceOf[SecureScoreControlStateUpdate]
  }
}

