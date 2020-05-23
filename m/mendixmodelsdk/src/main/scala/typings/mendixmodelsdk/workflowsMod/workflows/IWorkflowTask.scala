package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@js.native
trait IWorkflowTask
  extends IWorkflowActivity
     with IByNameReferrable {
  val name: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  val possibleOutcomes: IList[IWorkflowTaskOutcome] = js.native
}

