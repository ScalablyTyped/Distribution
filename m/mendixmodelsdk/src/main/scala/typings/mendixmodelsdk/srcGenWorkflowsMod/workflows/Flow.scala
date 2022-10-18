package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IFlow because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsOutcome, containerAsWorkflow, activities */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Flow")
@js.native
open class Flow protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def activities: IList[WorkflowActivity] = js.native
  @JSName("activities")
  val activities_FFlow: IList[IWorkflowActivity] = js.native
  
  def containerAsOutcome: Outcome = js.native
  @JSName("containerAsOutcome")
  val containerAsOutcome_FFlow: IOutcome = js.native
  
  def containerAsWorkflow: Workflow = js.native
  @JSName("containerAsWorkflow")
  val containerAsWorkflow_FFlow: IWorkflow = js.native
}
object Flow {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Flow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Flow]
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * The new Flow will be automatically stored in the 'flow' property
    * of the parent Outcome element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInOutcomeUnderFlow(container: Outcome): Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOutcomeUnderFlow")(container.asInstanceOf[js.Any]).asInstanceOf[Flow]
  
  /**
    * Creates and returns a new Flow instance in the SDK and on the server.
    * The new Flow will be automatically stored in the 'flow' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInWorkflowUnderFlow(container: Workflow): Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderFlow")(container.asInstanceOf[js.Any]).asInstanceOf[Flow]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Flow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.Flow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
