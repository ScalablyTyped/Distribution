package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintOperationStatus extends StObject {
  
  // A human-readable description of the printOperation's current processing state. Read-only.
  var description: js.UndefOr[String] = js.undefined
  
  // The printOperation's current processing state. Valid values are described in the following table. Read-only.
  var state: js.UndefOr[PrintOperationProcessingState] = js.undefined
}
object PrintOperationStatus {
  
  inline def apply(): PrintOperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOperationStatus]
  }
  
  extension [Self <: PrintOperationStatus](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setState(value: PrintOperationProcessingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
