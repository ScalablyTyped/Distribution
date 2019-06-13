package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationTerm extends js.Object {
  /** Display name of the term. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** End of the term. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** ID of term in the syncing system. */
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  /** Start of the term. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object EducationTerm {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    endDate: java.lang.String = null,
    externalId: java.lang.String = null,
    startDate: java.lang.String = null
  ): EducationTerm = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[EducationTerm]
  }
}

