package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterStatus extends StObject {
  
  // A human-readable description of the printer's current processing state. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The list of details describing why the printer is in the current state. Valid values are described in the following
    * table. Read-only.
    */
  var details: js.UndefOr[js.Array[PrinterProcessingStateDetail]] = js.undefined
  
  // The current processing state. Valid values are described in the following table. Read-only.
  var state: js.UndefOr[PrinterProcessingState] = js.undefined
}
object PrinterStatus {
  
  inline def apply(): PrinterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterStatus] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: js.Array[PrinterProcessingStateDetail]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: PrinterProcessingStateDetail*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setState(value: PrinterProcessingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
