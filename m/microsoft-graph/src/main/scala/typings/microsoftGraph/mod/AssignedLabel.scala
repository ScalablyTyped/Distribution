package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedLabel extends StObject {
  
  // The display name of the label. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier of the label.
  var labelId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AssignedLabel {
  
  inline def apply(): AssignedLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedLabel]
  }
  
  extension [Self <: AssignedLabel](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabelId(value: NullableOption[String]): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdNull: Self = StObject.set(x, "labelId", null)
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
  }
}
