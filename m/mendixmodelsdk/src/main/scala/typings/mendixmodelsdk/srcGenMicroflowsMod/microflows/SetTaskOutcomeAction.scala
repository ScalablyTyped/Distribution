package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.IUserTaskOutcome
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/complete-task relevant section in reference guide}
  *
  * In version 9.0.5: removed experimental
  * In version 9.0.2: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SetTaskOutcomeAction")
@js.native
open class SetTaskOutcomeAction protected () extends MicroflowAction {
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
  def outcome: IUserTaskOutcome | Null = js.native
  
  def outcomeQualifiedName: String | Null = js.native
  
  /**
    * In version 9.19.0: introduced
    */
  def outcomeValue: String = js.native
  def outcomeValue_=(newValue: String): Unit = js.native
  
  def outcome_=(newValue: IUserTaskOutcome | Null): Unit = js.native
  
  def workflowTaskVariable: String = js.native
  def workflowTaskVariable_=(newValue: String): Unit = js.native
}
object SetTaskOutcomeAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SetTaskOutcomeAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SetTaskOutcomeAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeAction]
  
  /**
    * Creates and returns a new SetTaskOutcomeAction instance in the SDK and on the server.
    * The new SetTaskOutcomeAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: ActionActivity): SetTaskOutcomeAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[SetTaskOutcomeAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SetTaskOutcomeAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SetTaskOutcomeAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
