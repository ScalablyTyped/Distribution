package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlannerTaskDetails
  extends StObject
     with Entity {
  
  // The collection of checklist items on the task.
  var checklist: js.UndefOr[NullableOption[PlannerChecklistItems]] = js.undefined
  
  // Description of the task.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * This sets the type of preview that shows up on the task. The possible values are: automatic, noPreview, checklist,
    * description, reference. When set to automatic the displayed preview is chosen by the app viewing the task.
    */
  var previewType: js.UndefOr[NullableOption[PlannerPreviewType]] = js.undefined
  
  // The collection of references on the task.
  var references: js.UndefOr[NullableOption[PlannerExternalReferences]] = js.undefined
}
object PlannerTaskDetails {
  
  inline def apply(): PlannerTaskDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlannerTaskDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlannerTaskDetails] (val x: Self) extends AnyVal {
    
    inline def setChecklist(value: NullableOption[PlannerChecklistItems]): Self = StObject.set(x, "checklist", value.asInstanceOf[js.Any])
    
    inline def setChecklistNull: Self = StObject.set(x, "checklist", null)
    
    inline def setChecklistUndefined: Self = StObject.set(x, "checklist", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPreviewType(value: NullableOption[PlannerPreviewType]): Self = StObject.set(x, "previewType", value.asInstanceOf[js.Any])
    
    inline def setPreviewTypeNull: Self = StObject.set(x, "previewType", null)
    
    inline def setPreviewTypeUndefined: Self = StObject.set(x, "previewType", js.undefined)
    
    inline def setReferences(value: NullableOption[PlannerExternalReferences]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesNull: Self = StObject.set(x, "references", null)
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
  }
}
