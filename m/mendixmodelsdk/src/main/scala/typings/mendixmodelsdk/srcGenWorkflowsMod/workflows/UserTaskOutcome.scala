package typings.mendixmodelsdk.srcGenWorkflowsMod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
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
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IOutcome because Already inherited
- typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IUserTaskOutcome because var conflicts: containerAsConditionOutcomeActivity, containerAsParallelSplitActivity, containerAsUserTask, flow, id, isLoaded, model, structureTypeName, unit. Inlined name, caption, value */ @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTaskOutcome")
@js.native
open class UserTaskOutcome protected ()
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
  
  /**
    * In version 9.19.0: deleted
    */
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  /**
    * In version 9.19.0: deleted
    */
  @JSName("caption")
  val caption_FUserTaskOutcome: String = js.native
  
  @JSName("containerAsUserTask")
  def containerAsUserTask_MUserTaskOutcome: UserTask = js.native
  
  /**
    * In version 9.19.0: deleted
    */
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  /**
    * In version 9.19.0: deleted
    */
  @JSName("name")
  val name_FUserTaskOutcome: String = js.native
  
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MUserTaskOutcome: String | Null = js.native
  
  /**
    * In version 9.19.0: introduced
    */
  def value: String = js.native
  def value_=(newValue: String): Unit = js.native
  /**
    * In version 9.19.0: introduced
    */
  @JSName("value")
  val value_FUserTaskOutcome: String = js.native
}
object UserTaskOutcome {
  
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTaskOutcome")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new UserTaskOutcome instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): UserTaskOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[UserTaskOutcome]
  
  /**
    * Creates and returns a new UserTaskOutcome instance in the SDK and on the server.
    * The new UserTaskOutcome will be automatically stored in the 'outcomes' property
    * of the parent UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: UserTask): UserTaskOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[UserTaskOutcome]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTaskOutcome.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/workflows", "workflows.UserTaskOutcome.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
