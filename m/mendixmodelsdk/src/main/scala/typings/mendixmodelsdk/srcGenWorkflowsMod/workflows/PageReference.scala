package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.12.0: added public
  * In version 9.11.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IPageReference because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsUserTask, containerAsWorkflow, page, pageQualifiedName */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.PageReference")
@js.native
open class PageReference protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsUserTask: UserTask = js.native
  @JSName("containerAsUserTask")
  val containerAsUserTask_FPageReference: IUserTask = js.native
  
  def containerAsWorkflow: Workflow = js.native
  @JSName("containerAsWorkflow")
  val containerAsWorkflow_FPageReference: IWorkflow = js.native
  
  /**
    * In version 9.12.0: added public
    */
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  @JSName("pageQualifiedName")
  val pageQualifiedName_FPageReference: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  /**
    * In version 9.12.0: added public
    */
  @JSName("page")
  val page_FPageReference: IPage | Null = js.native
}
object PageReference {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.PageReference")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PageReference]
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * The new PageReference will be automatically stored in the 'taskPage' property
    * of the parent UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInUserTaskUnderTaskPage(container: UserTask): PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderTaskPage")(container.asInstanceOf[js.Any]).asInstanceOf[PageReference]
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * The new PageReference will be automatically stored in the 'adminPage' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderAdminPage(container: Workflow): PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderAdminPage")(container.asInstanceOf[js.Any]).asInstanceOf[PageReference]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.PageReference.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.PageReference.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
