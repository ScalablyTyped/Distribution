package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerExternalReference extends js.Object {
  // A name alias to describe the reference.
  var alias: js.UndefOr[String] = js.undefined
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  // Used to set the relative priority order in which the reference will be shown as a preview on the task.
  var previewPriority: js.UndefOr[String] = js.undefined
  // Used to describe the type of the reference. Types include: PowerPoint, Word, Excel, Other.
  var `type`: js.UndefOr[String] = js.undefined
}

object PlannerExternalReference {
  @scala.inline
  def apply(
    alias: String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: String = null,
    previewPriority: String = null,
    `type`: String = null
  ): PlannerExternalReference = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (previewPriority != null) __obj.updateDynamic("previewPriority")(previewPriority.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlannerExternalReference]
  }
}

