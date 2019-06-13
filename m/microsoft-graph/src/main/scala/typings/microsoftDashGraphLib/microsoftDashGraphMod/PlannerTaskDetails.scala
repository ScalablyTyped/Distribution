package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlannerTaskDetails extends Entity {
  /** The collection of checklist items on the task. */
  var checklist: js.UndefOr[PlannerChecklistItems] = js.undefined
  /** Description of the task */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist, description, reference.
    * When set to automatic the displayed preview is chosen by the app viewing the task.
    */
  var previewType: js.UndefOr[PlannerPreviewType] = js.undefined
  /** The collection of references on the task. */
  var references: js.UndefOr[PlannerExternalReferences] = js.undefined
}

object PlannerTaskDetails {
  @scala.inline
  def apply(
    checklist: PlannerChecklistItems = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    previewType: PlannerPreviewType = null,
    references: PlannerExternalReferences = null
  ): PlannerTaskDetails = {
    val __obj = js.Dynamic.literal()
    if (checklist != null) __obj.updateDynamic("checklist")(checklist)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (previewType != null) __obj.updateDynamic("previewType")(previewType)
    if (references != null) __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[PlannerTaskDetails]
  }
}

