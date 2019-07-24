package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerExternalReference extends js.Object {
  // A name alias to describe the reference.
  var alias: js.UndefOr[java.lang.String] = js.undefined
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.undefined
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Used to set the relative priority order in which the reference will be shown as a preview on the task.
  var previewPriority: js.UndefOr[java.lang.String] = js.undefined
  // Used to describe the type of the reference. Types include: PowerPoint, Word, Excel, Other.
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PlannerExternalReference {
  @scala.inline
  def apply(
    alias: java.lang.String = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedDateTime: java.lang.String = null,
    previewPriority: java.lang.String = null,
    `type`: java.lang.String = null
  ): PlannerExternalReference = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (previewPriority != null) __obj.updateDynamic("previewPriority")(previewPriority)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlannerExternalReference]
  }
}

