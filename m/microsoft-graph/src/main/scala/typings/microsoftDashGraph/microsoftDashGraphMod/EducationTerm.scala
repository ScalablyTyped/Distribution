package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationTerm extends js.Object {
  // Display name of the term.
  var displayName: js.UndefOr[String] = js.undefined
  // End of the term.
  var endDate: js.UndefOr[String] = js.undefined
  // ID of term in the syncing system.
  var externalId: js.UndefOr[String] = js.undefined
  // Start of the term.
  var startDate: js.UndefOr[String] = js.undefined
}

object EducationTerm {
  @scala.inline
  def apply(
    displayName: String = null,
    endDate: String = null,
    externalId: String = null,
    startDate: String = null
  ): EducationTerm = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EducationTerm]
  }
}

