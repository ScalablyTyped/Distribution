package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskTrigger
  extends StObject
     with Entity {
  
  // An abstract definition that will be used to create a printTask when triggered by a print event. Read-only.
  var definition: js.UndefOr[PrintTaskDefinition] = js.undefined
  
  /**
    * The Universal Print event that will cause a new printTask to be triggered. Valid values are described in the following
    * table.
    */
  var event: js.UndefOr[PrintEvent] = js.undefined
}
object PrintTaskTrigger {
  
  inline def apply(): PrintTaskTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTaskTrigger]
  }
  
  extension [Self <: PrintTaskTrigger](x: Self) {
    
    inline def setDefinition(value: PrintTaskDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setEvent(value: PrintEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
