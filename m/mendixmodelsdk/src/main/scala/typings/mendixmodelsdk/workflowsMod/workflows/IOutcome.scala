package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/workflows relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@js.native
trait IOutcome
  extends StObject
     with IElement {
  
  val containerAsConditionOutcomeActivity: IConditionOutcomeActivity = js.native
  
  val containerAsParallelSplitActivity: IParallelSplitActivity = js.native
  
  val containerAsUserTask: IUserTask = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val flow: IFlow = js.native
  
  @JSName("model")
  val model_IOutcome: IModel = js.native
}
