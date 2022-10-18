package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
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
  * In version 9.10.0: deleted
  * In version 9.7.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IWorkflowType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsWorkflow, entity, entityQualifiedName */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowType")
@js.native
open class WorkflowType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsWorkflow: Workflow = js.native
  @JSName("containerAsWorkflow")
  val containerAsWorkflow_FWorkflowType: IWorkflow = js.native
  
  def entity: IEntity | Null = js.native
  
  def entityQualifiedName: String | Null = js.native
  @JSName("entityQualifiedName")
  val entityQualifiedName_FWorkflowType: String | Null = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  @JSName("entity")
  val entity_FWorkflowType: IEntity | Null = js.native
}
object WorkflowType {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WorkflowType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WorkflowType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WorkflowType]
  
  /**
    * Creates and returns a new WorkflowType instance in the SDK and on the server.
    * The new WorkflowType will be automatically stored in the 'workflowType' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.7.0 to 9.9.0
    */
  /* static member */
  inline def createIn(container: Workflow): WorkflowType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WorkflowType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.WorkflowType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
