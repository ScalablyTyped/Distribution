package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.10.0: introduced
  */
@js.native
trait IWorkflow extends IDocument {
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  val activities: IList[IWorkflowActivity] = js.native
  val contextEntity: IEntity | Null = js.native
  val contextEntityQualifiedName: String | Null = js.native
}

