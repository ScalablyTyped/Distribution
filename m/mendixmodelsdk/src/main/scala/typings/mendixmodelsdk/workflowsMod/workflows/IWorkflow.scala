package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
@js.native
trait IWorkflow extends IDocument {
  
  val contextEntity: IEntity | Null = js.native
  
  val contextEntityQualifiedName: String | Null = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  val flow: IFlow = js.native
  
  val overviewPage: IPage | Null = js.native
  
  val overviewPageQualifiedName: String | Null = js.native
  
  val title: String = js.native
}
