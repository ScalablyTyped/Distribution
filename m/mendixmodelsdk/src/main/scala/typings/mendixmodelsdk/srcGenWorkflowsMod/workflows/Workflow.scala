package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenSecurityMod.security.IModuleRole
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/workflows relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IWorkflow because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined title, contextEntity, contextEntityQualifiedName, parameter, workflowEntity, workflowEntityQualifiedName, workflowType, overviewPage, overviewPageQualifiedName, flow, allowedModuleRoles, allowedModuleRolesQualifiedNames */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Workflow")
@js.native
open class Workflow protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  
  /**
    * In version 9.11.0: introduced
    */
  def adminPage: PageReference | Null = js.native
  def adminPage_=(newValue: PageReference | Null): Unit = js.native
  
  /**
    * In version 9.6.0: deleted
    */
  def allowedModuleRoles: IList[IModuleRole] = js.native
  
  def allowedModuleRolesQualifiedNames: js.Array[String] = js.native
  @JSName("allowedModuleRolesQualifiedNames")
  val allowedModuleRolesQualifiedNames_FWorkflow: js.Array[String] = js.native
  
  /**
    * In version 9.6.0: deleted
    */
  @JSName("allowedModuleRoles")
  val allowedModuleRoles_FWorkflow: IList[IModuleRole] = js.native
  
  /**
    * In version 9.15.0: introduced
    */
  def annotation: Annotation | Null = js.native
  def annotation_=(newValue: Annotation | Null): Unit = js.native
  
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MWorkflow: FolderBase = js.native
  
  /**
    * In version 9.6.0: deleted
    */
  def contextEntity: IEntity | Null = js.native
  
  def contextEntityQualifiedName: String | Null = js.native
  @JSName("contextEntityQualifiedName")
  val contextEntityQualifiedName_FWorkflow: String | Null = js.native
  
  def contextEntity_=(newValue: IEntity | Null): Unit = js.native
  /**
    * In version 9.6.0: deleted
    */
  @JSName("contextEntity")
  val contextEntity_FWorkflow: IEntity | Null = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def dueDate: String = js.native
  def dueDate_=(newValue: String): Unit = js.native
  
  def flow: Flow = js.native
  def flow_=(newValue: Flow): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("flow")
  val flow_FWorkflow: IFlow = js.native
  
  /**
    * In version 9.11.0: deleted
    */
  def overviewPage: IPage | Null = js.native
  
  def overviewPageQualifiedName: String | Null = js.native
  @JSName("overviewPageQualifiedName")
  val overviewPageQualifiedName_FWorkflow: String | Null = js.native
  
  def overviewPage_=(newValue: IPage | Null): Unit = js.native
  /**
    * In version 9.11.0: deleted
    */
  @JSName("overviewPage")
  val overviewPage_FWorkflow: IPage | Null = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def parameter: Parameter = js.native
  def parameter_=(newValue: Parameter): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.6.0: introduced
    */
  @JSName("parameter")
  val parameter_FWorkflow: IParameter = js.native
  
  def title: String = js.native
  def title_=(newValue: String): Unit = js.native
  @JSName("title")
  val title_FWorkflow: String = js.native
  
  /**
    * In version 9.12.0: introduced
    */
  def usertaskOnStateChangeEvent: MicroflowEventHandler | Null = js.native
  def usertaskOnStateChangeEvent_=(newValue: MicroflowEventHandler | Null): Unit = js.native
  
  def workflowDescription: StringTemplate = js.native
  def workflowDescription_=(newValue: StringTemplate): Unit = js.native
  
  /**
    * In version 9.7.0: deleted
    * In version 9.6.0: introduced
    */
  def workflowEntity: IEntity | Null = js.native
  
  def workflowEntityQualifiedName: String | Null = js.native
  @JSName("workflowEntityQualifiedName")
  val workflowEntityQualifiedName_FWorkflow: String | Null = js.native
  
  def workflowEntity_=(newValue: IEntity | Null): Unit = js.native
  /**
    * In version 9.7.0: deleted
    * In version 9.6.0: introduced
    */
  @JSName("workflowEntity")
  val workflowEntity_FWorkflow: IEntity | Null = js.native
  
  def workflowName: StringTemplate = js.native
  def workflowName_=(newValue: StringTemplate): Unit = js.native
  
  /**
    * In version 9.12.0: introduced
    */
  def workflowOnStateChangeEvent: MicroflowEventHandler | Null = js.native
  def workflowOnStateChangeEvent_=(newValue: MicroflowEventHandler | Null): Unit = js.native
  
  /**
    * In version 9.10.0: deleted
    * In version 9.7.0: introduced
    */
  def workflowType: WorkflowType = js.native
  def workflowType_=(newValue: WorkflowType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.10.0: deleted
    * In version 9.7.0: introduced
    */
  @JSName("workflowType")
  val workflowType_FWorkflow: IWorkflowType = js.native
}
object Workflow {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Workflow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Workflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): Workflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Workflow]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Workflow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Workflow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
