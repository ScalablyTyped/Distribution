package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@js.native
trait IFlow
  extends StObject
     with IElement {
  
  val activities: IList[IWorkflowActivity] = js.native
  
  val containerAsOutcome: IOutcome = js.native
  
  val containerAsWorkflow: IWorkflow = js.native
  
  @JSName("model")
  val model_IFlow: IModel = js.native
}
