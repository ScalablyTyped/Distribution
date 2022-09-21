package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyLabelsRequest extends StObject {
  
  /** This is always drive#modifyLabelsRequest */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The list of modifications to apply to the labels on the file. */
  var labelModifications: js.UndefOr[js.Array[LabelModification]] = js.undefined
}
object ModifyLabelsRequest {
  
  inline def apply(): ModifyLabelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyLabelsRequest]
  }
  
  extension [Self <: ModifyLabelsRequest](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabelModifications(value: js.Array[LabelModification]): Self = StObject.set(x, "labelModifications", value.asInstanceOf[js.Any])
    
    inline def setLabelModificationsUndefined: Self = StObject.set(x, "labelModifications", js.undefined)
    
    inline def setLabelModificationsVarargs(value: LabelModification*): Self = StObject.set(x, "labelModifications", js.Array(value*))
  }
}
