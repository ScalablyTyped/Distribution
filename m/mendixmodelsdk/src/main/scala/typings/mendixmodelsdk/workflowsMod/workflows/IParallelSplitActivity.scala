package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.instancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/parallel-split relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@js.native
trait IParallelSplitActivity
  extends StObject
     with IWorkflowActivity {
  
  val outcomes: IList[IParallelSplitOutcome] = js.native
}
