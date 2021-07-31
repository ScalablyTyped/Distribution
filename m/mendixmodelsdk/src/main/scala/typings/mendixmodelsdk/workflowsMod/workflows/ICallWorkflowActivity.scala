package typings.mendixmodelsdk.workflowsMod.workflows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
@js.native
trait ICallWorkflowActivity
  extends StObject
     with IWorkflowActivity {
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  val workflow: IWorkflow | Null = js.native
  
  val workflowQualifiedName: String | Null = js.native
}
