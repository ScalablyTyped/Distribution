package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.securityMod.security.IModuleRole
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
trait IWorkflow
  extends StObject
     with IDocument {
  
  /**
    * In version 9.6.0: deleted
    */
  val allowedModuleRoles: IList[IModuleRole] = js.native
  
  val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * In version 9.6.0: deleted
    */
  val contextEntity: IEntity | Null = js.native
  
  val contextEntityQualifiedName: String | Null = js.native
  
  /**
    * This property is required and cannot be set to null.
    */
  val flow: IFlow = js.native
  
  /**
    * In version 9.11.0: deleted
    */
  val overviewPage: IPage | Null = js.native
  
  val overviewPageQualifiedName: String | Null = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.6.0: introduced
    */
  val parameter: IParameter = js.native
  
  val title: String = js.native
  
  /**
    * In version 9.7.0: deleted
    * In version 9.6.0: introduced
    */
  val workflowEntity: IEntity | Null = js.native
  
  val workflowEntityQualifiedName: String | Null = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.10.0: deleted
    * In version 9.7.0: introduced
    */
  val workflowType: IWorkflowType = js.native
}
