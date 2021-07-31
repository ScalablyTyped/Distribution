package typings.mendixmodelsdk.workflowsMod.workflows

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IOutcome because Already inherited
- typings.mendixmodelsdk.workflowsMod.workflows.IWorkflowTaskOutcome because var conflicts: containerAsExclusiveSplitActivity, containerAsParallelSplitActivity, containerAsWorkflowTask, flow, id, isLoaded, model, structureTypeName, unit. Inlined name, caption */ @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTaskOutcome")
@js.native
class WorkflowTaskOutcome protected ()
  extends Outcome
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  @JSName("caption")
  val caption_FWorkflowTaskOutcome: String = js.native
  
  @JSName("containerAsWorkflowTask")
  def containerAsWorkflowTask_MWorkflowTaskOutcome: WorkflowTask = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  val name_FWorkflowTaskOutcome: String = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MWorkflowTaskOutcome: String | Null = js.native
}
object WorkflowTaskOutcome {
  
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTaskOutcome")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): WorkflowTaskOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WorkflowTaskOutcome]
  
  /**
    * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
    * The new WorkflowTaskOutcome will be automatically stored in the 'outcomes' property
    * of the parent WorkflowTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createIn(container: WorkflowTask): WorkflowTaskOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WorkflowTaskOutcome]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTaskOutcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/workflows", "workflows.WorkflowTaskOutcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
