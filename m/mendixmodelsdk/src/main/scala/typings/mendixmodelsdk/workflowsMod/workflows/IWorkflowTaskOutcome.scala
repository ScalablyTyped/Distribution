package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@js.native
trait IWorkflowTaskOutcome
  extends IElement
     with IByNameReferrable {
  /**
    * In version 8.11.0: introduced
    */
  val caption: String = js.native
  val containerAsWorkflowTask: IWorkflowTask = js.native
  @JSName("model")
  val model_IWorkflowTaskOutcome: IModel = js.native
  val name: String = js.native
}

