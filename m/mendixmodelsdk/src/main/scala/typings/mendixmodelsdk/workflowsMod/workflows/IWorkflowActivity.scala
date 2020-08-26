package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Workflows`.
  */
/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@js.native
trait IWorkflowActivity extends IElement {
  /**
    * In version 8.12.0: added public
    */
  val caption: String = js.native
  val containerAsWorkflow: IWorkflow = js.native
  @JSName("model")
  val model_IWorkflowActivity: IModel = js.native
}

