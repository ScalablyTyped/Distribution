package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@js.native
trait ICallWorkflowActivity
  extends StObject
     with IWorkflowActivity {
  
  val workflow: IWorkflow | Null = js.native
  
  val workflowQualifiedName: String | Null = js.native
}
