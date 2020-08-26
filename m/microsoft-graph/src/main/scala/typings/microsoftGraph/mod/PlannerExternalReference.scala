package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlannerExternalReference extends js.Object {
  // A name alias to describe the reference.
  var alias: js.UndefOr[String] = js.native
  // Read-only. User ID by which this is last modified.
  var lastModifiedBy: js.UndefOr[IdentitySet] = js.native
  /**
    * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Used to set the relative priority order in which the reference will be shown as a preview on the task.
  var previewPriority: js.UndefOr[String] = js.native
  // Used to describe the type of the reference. Types include: PowerPoint, Word, Excel, Other.
  var `type`: js.UndefOr[String] = js.native
}

object PlannerExternalReference {
  @scala.inline
  def apply(): PlannerExternalReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerExternalReference]
  }
  @scala.inline
  implicit class PlannerExternalReferenceOps[Self <: PlannerExternalReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: IdentitySet): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("lastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setPreviewPriority(value: String): Self = this.set("previewPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviewPriority: Self = this.set("previewPriority", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

