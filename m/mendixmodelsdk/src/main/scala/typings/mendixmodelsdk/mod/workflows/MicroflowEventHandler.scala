package typings.mendixmodelsdk.mod.workflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenSettingsMod.settings.WorkflowsProjectSettingsPart
import typings.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.12.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.MicroflowEventHandler")
@js.native
open class MicroflowEventHandler protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.workflows.MicroflowEventHandler {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowEventHandler {
  
  @JSImport("mendixmodelsdk", "workflows.MicroflowEventHandler")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowEventHandler instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler]
  
  /**
    * Creates and returns a new MicroflowEventHandler instance in the SDK and on the server.
    * The new MicroflowEventHandler will be automatically stored in the 'usertaskOnStateChangeEvent' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.12.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderUsertaskOnStateChangeEvent(container: typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Workflow): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderUsertaskOnStateChangeEvent")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler]
  
  /**
    * Creates and returns a new MicroflowEventHandler instance in the SDK and on the server.
    * The new MicroflowEventHandler will be automatically stored in the 'workflowOnStateChangeEvent' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.12.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderWorkflowOnStateChangeEvent(container: typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.Workflow): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderWorkflowOnStateChangeEvent")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler]
  
  /**
    * Creates and returns a new MicroflowEventHandler instance in the SDK and on the server.
    * The new MicroflowEventHandler will be automatically stored in the 'usertaskOnStateChangeEvent' property
    * of the parent settings.WorkflowsProjectSettingsPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.12.0 and higher
    */
  /* static member */
  inline def createInWorkflowsProjectSettingsPartUnderUsertaskOnStateChangeEvent(container: WorkflowsProjectSettingsPart): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowsProjectSettingsPartUnderUsertaskOnStateChangeEvent")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler]
  
  /**
    * Creates and returns a new MicroflowEventHandler instance in the SDK and on the server.
    * The new MicroflowEventHandler will be automatically stored in the 'workflowOnStateChangeEvent' property
    * of the parent settings.WorkflowsProjectSettingsPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.12.0 and higher
    */
  /* static member */
  inline def createInWorkflowsProjectSettingsPartUnderWorkflowOnStateChangeEvent(container: WorkflowsProjectSettingsPart): typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowsProjectSettingsPartUnderWorkflowOnStateChangeEvent")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWorkflowsMod.workflows.MicroflowEventHandler]
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.MicroflowEventHandler.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.MicroflowEventHandler.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
