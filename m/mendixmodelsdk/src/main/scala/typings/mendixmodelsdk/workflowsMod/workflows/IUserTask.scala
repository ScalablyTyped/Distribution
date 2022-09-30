package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/user-task relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@js.native
trait IUserTask
  extends StObject
     with IWorkflowActivity {
  
  /**
    * In version 9.6.0: deleted
    * In version 9.0.3: introduced
    */
  val allowedModuleRoles: IList[IModuleRole] = js.native
  
  val allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  
  val outcomes: IList[IUserTaskOutcome] = js.native
  
  /**
    * In version 9.11.0: deleted
    */
  val page: IPage | Null = js.native
  
  val pageQualifiedName: String | Null = js.native
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.12.0: added public
    * In version 9.11.0: introduced
    */
  val taskPage: IPageReference = js.native
  
  /**
    * In version 9.10.0: deleted
    * In version 9.6.0: introduced
    */
  val userTaskEntity: IEntity | Null = js.native
  
  val userTaskEntityQualifiedName: String | Null = js.native
}
