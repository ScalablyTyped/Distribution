package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class PlannerTaskDetailsMutableBuilder[Self <: PlannerTaskDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecklist(value: NullableOption[PlannerChecklistItems]): Self = StObject.set(x, "checklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecklistNull: Self = StObject.set(x, "checklist", null)
    
    @scala.inline
    def setChecklistUndefined: Self = StObject.set(x, "checklist", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setPreviewType(value: NullableOption[PlannerPreviewType]): Self = StObject.set(x, "previewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewTypeNull: Self = StObject.set(x, "previewType", null)
    
    @scala.inline
    def setPreviewTypeUndefined: Self = StObject.set(x, "previewType", js.undefined)
    
    @scala.inline
    def setReferences(value: NullableOption[PlannerExternalReferences]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesNull: Self = StObject.set(x, "references", null)
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
  }
}
