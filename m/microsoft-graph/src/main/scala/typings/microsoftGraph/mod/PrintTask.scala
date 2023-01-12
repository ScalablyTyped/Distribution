package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTask
  extends StObject
     with Entity {
  
  // The printTaskDefinition that was used to create this task. Read-only.
  var definition: js.UndefOr[PrintTaskDefinition] = js.undefined
  
  /**
    * The URL for the print entity that triggered this task. For example,
    * https://graph.microsoft.com/v1.0/print/printers/{printerId}/jobs/{jobId}. Read-only.
    */
  var parentUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The current execution status of this printTask. The calling application is responsible for updating this status when
    * processing is finished, unless the related printJob has been redirected to another printer. Failure to report
    * completion will result in the related print job being blocked from printing and eventually deleted.
    */
  var status: js.UndefOr[PrintTaskStatus] = js.undefined
  
  // The printTaskTrigger that triggered this task's execution. Read-only.
  var trigger: js.UndefOr[PrintTaskTrigger] = js.undefined
}
object PrintTask {
  
  inline def apply(): PrintTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintTask] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: PrintTaskDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setParentUrl(value: String): Self = StObject.set(x, "parentUrl", value.asInstanceOf[js.Any])
    
    inline def setParentUrlUndefined: Self = StObject.set(x, "parentUrl", js.undefined)
    
    inline def setStatus(value: PrintTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrigger(value: PrintTaskTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
