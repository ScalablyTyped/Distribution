package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlannerTaskDetails extends Entity {
  
  // The collection of checklist items on the task.
  var checklist: js.UndefOr[NullableOption[PlannerChecklistItems]] = js.native
  
  // Description of the task
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
    */
  var previewType: js.UndefOr[NullableOption[PlannerPreviewType]] = js.native
  
  // The collection of references on the task.
  var references: js.UndefOr[NullableOption[PlannerExternalReferences]] = js.native
}
object PlannerTaskDetails {
  
  @scala.inline
  def apply(): PlannerTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerTaskDetails]
  }
  
  @scala.inline
  implicit class PlannerTaskDetailsOps[Self <: PlannerTaskDetails] (val x: Self) extends AnyVal {
    
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
    def setChecklist(value: NullableOption[PlannerChecklistItems]): Self = this.set("checklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecklist: Self = this.set("checklist", js.undefined)
    
    @scala.inline
    def setChecklistNull: Self = this.set("checklist", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setPreviewType(value: NullableOption[PlannerPreviewType]): Self = this.set("previewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewType: Self = this.set("previewType", js.undefined)
    
    @scala.inline
    def setPreviewTypeNull: Self = this.set("previewType", null)
    
    @scala.inline
    def setReferences(value: NullableOption[PlannerExternalReferences]): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    
    @scala.inline
    def setReferencesNull: Self = this.set("references", null)
  }
}
