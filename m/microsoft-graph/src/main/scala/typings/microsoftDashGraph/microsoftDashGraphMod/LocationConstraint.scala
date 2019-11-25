package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationConstraint extends js.Object {
  /**
    * The client requests the service to include in the response a meeting location for the meeting. If this is true and all
    * the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the
    * resources are busy, findMeetingTimes would still look for meeting times without locations.
    */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  // Constraint information for one or more locations that the client requests for the meeting.
  var locations: js.UndefOr[js.Array[LocationConstraintItem]] = js.undefined
  // The client requests the service to suggest one or more meeting locations.
  var suggestLocation: js.UndefOr[Boolean] = js.undefined
}

object LocationConstraint {
  @scala.inline
  def apply(
    isRequired: js.UndefOr[Boolean] = js.undefined,
    locations: js.Array[LocationConstraintItem] = null,
    suggestLocation: js.UndefOr[Boolean] = js.undefined
  ): LocationConstraint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestLocation)) __obj.updateDynamic("suggestLocation")(suggestLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationConstraint]
  }
}

