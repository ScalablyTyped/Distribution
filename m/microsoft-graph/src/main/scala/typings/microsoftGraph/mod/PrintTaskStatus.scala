package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskStatus extends StObject {
  
  // A human-readable description of the current processing state of the printTask.
  var description: js.UndefOr[String] = js.undefined
  
  // The current processing state of the printTask. Valid values are described in the following table.
  var state: js.UndefOr[PrintTaskProcessingState] = js.undefined
}
object PrintTaskStatus {
  
  inline def apply(): PrintTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTaskStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintTaskStatus] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setState(value: PrintTaskProcessingState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
