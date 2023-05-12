package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typings.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/user-task relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IWorkflowActivity because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IUserTask because var conflicts: caption, containerAsFlow, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined userTaskEntity, userTaskEntityQualifiedName, page, pageQualifiedName, taskPage, outcomes, allowedModuleRoles, allowedModuleRolesQualifiedNames */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTask")
@js.native
open class UserTask protected () extends WorkflowActivity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.6.0: deleted
    * In version 9.0.3: introduced
    */
  def allowedModuleRoles: IList[IModuleRole] = js.native
  
  def allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FUserTask: js.Array[String] = js.native
  
  /**
    * In version 9.6.0: deleted
    * In version 9.0.3: introduced
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FUserTask: IList[IModuleRole] = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def autoAssignSingleTargetUser: Boolean = js.native
  def autoAssignSingleTargetUser_=(newValue: Boolean): Unit = js.native
  
  @JSName("containerAsFlow")
  def containerAsFlow_MUserTask: Flow = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def dueDate: String = js.native
  def dueDate_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.0.5: introduced
    */
  def onCreatedEvent: UserTaskEvent = js.native
  def onCreatedEvent_=(newValue: UserTaskEvent): Unit = js.native
  
  def outcomes: IList[UserTaskOutcome] = js.native
  @JSName("outcomes")
  val outcomes_FUserTask: IList[IUserTaskOutcome] = js.native
  
  /**
    * In version 9.11.0: deleted
    */
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  @JSName("pageQualifiedName")
  val pageQualifiedName_FUserTask: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  /**
    * In version 9.11.0: deleted
    */
  @JSName("page")
  val page_FUserTask: IPage | Null = js.native
  
  def taskDescription: StringTemplate = js.native
  def taskDescription_=(newValue: StringTemplate): Unit = js.native
  
  def taskName: StringTemplate = js.native
  def taskName_=(newValue: StringTemplate): Unit = js.native
  
  /**
    * In version 9.12.0: added public
    * In version 9.11.0: introduced
    */
  def taskPage: PageReference = js.native
  def taskPage_=(newValue: PageReference): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.12.0: added public
    * In version 9.11.0: introduced
    */
  @JSName("taskPage")
  val taskPage_FUserTask: IPageReference = js.native
  
  def userSource: UserSource = js.native
  def userSource_=(newValue: UserSource): Unit = js.native
  
  /**
    * In version 9.22.0: introduced
    */
  def userTaskCompletion: UserTaskCompletion = js.native
  def userTaskCompletion_=(newValue: UserTaskCompletion): Unit = js.native
  
  /**
    * In version 9.10.0: deleted
    * In version 9.6.0: introduced
    */
  def userTaskEntity: IEntity | Null = js.native
  
  def userTaskEntityQualifiedName: String | Null = js.native
  @JSName("userTaskEntityQualifiedName")
  val userTaskEntityQualifiedName_FUserTask: String | Null = js.native
  
  def userTaskEntity_=(newValue: IEntity | Null): Unit = js.native
  /**
    * In version 9.10.0: deleted
    * In version 9.6.0: introduced
    */
  @JSName("userTaskEntity")
  val userTaskEntity_FUserTask: IEntity | Null = js.native
}
object UserTask {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTask")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new UserTask instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): UserTask = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[UserTask]
  
  /**
    * Creates and returns a new UserTask instance in the SDK and on the server.
    * The new UserTask will be automatically stored in the 'activities' property
    * of the parent Flow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: Flow): UserTask = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[UserTask]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTask.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTask.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
