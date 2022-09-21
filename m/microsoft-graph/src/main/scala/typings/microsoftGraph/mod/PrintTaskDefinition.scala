package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskDefinition
  extends StObject
     with Entity {
  
  // The application that created the printTaskDefinition. Read-only.
  var createdBy: js.UndefOr[AppIdentity] = js.undefined
  
  // The name of the printTaskDefinition.
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tasks that have been created based on this definition. The list includes currently running tasks and recently
    * completed tasks. Read-only.
    */
  var tasks: js.UndefOr[NullableOption[js.Array[PrintTask]]] = js.undefined
}
object PrintTaskDefinition {
  
  inline def apply(): PrintTaskDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTaskDefinition]
  }
  
  extension [Self <: PrintTaskDefinition](x: Self) {
    
    inline def setCreatedBy(value: AppIdentity): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTasks(value: NullableOption[js.Array[PrintTask]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: PrintTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
