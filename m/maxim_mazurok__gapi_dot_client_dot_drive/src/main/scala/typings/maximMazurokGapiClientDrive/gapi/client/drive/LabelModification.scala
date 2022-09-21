package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelModification extends StObject {
  
  /** The list of modifications to this label's fields. */
  var fieldModifications: js.UndefOr[js.Array[LabelFieldModification]] = js.undefined
  
  /** This is always drive#labelModification. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The ID of the label to modify. */
  var labelId: js.UndefOr[String] = js.undefined
  
  /** If true, the label will be removed from the file. */
  var removeLabel: js.UndefOr[Boolean] = js.undefined
}
object LabelModification {
  
  inline def apply(): LabelModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelModification]
  }
  
  extension [Self <: LabelModification](x: Self) {
    
    inline def setFieldModifications(value: js.Array[LabelFieldModification]): Self = StObject.set(x, "fieldModifications", value.asInstanceOf[js.Any])
    
    inline def setFieldModificationsUndefined: Self = StObject.set(x, "fieldModifications", js.undefined)
    
    inline def setFieldModificationsVarargs(value: LabelFieldModification*): Self = StObject.set(x, "fieldModifications", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setRemoveLabel(value: Boolean): Self = StObject.set(x, "removeLabel", value.asInstanceOf[js.Any])
    
    inline def setRemoveLabelUndefined: Self = StObject.set(x, "removeLabel", js.undefined)
  }
}
