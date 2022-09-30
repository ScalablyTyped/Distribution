package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.workflowsMod.workflows.MicroflowEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: removed experimental
  * In version 8.8.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/settings", "settings.WorkflowsProjectSettingsPart")
@js.native
open class WorkflowsProjectSettingsPart protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.0.5: introduced
    */
  def defaultTaskParallelism: Double = js.native
  def defaultTaskParallelism_=(newValue: Double): Unit = js.native
  
  /**
    * In version 9.0.5: deleted
    */
  def enabled: Boolean = js.native
  def enabled_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.11.0: introduced
    */
  def userEntity: IEntity | Null = js.native
  
  def userEntityQualifiedName: String | Null = js.native
  
  def userEntity_=(newValue: IEntity | Null): Unit = js.native
  
  /**
    * In version 9.12.0: introduced
    */
  def usertaskOnStateChangeEvent: MicroflowEventHandler | Null = js.native
  def usertaskOnStateChangeEvent_=(newValue: MicroflowEventHandler | Null): Unit = js.native
  
  /**
    * In version 9.0.5: introduced
    */
  def workflowEngineParallelism: Double = js.native
  def workflowEngineParallelism_=(newValue: Double): Unit = js.native
  
  /**
    * In version 9.12.0: introduced
    */
  def workflowOnStateChangeEvent: MicroflowEventHandler | Null = js.native
  def workflowOnStateChangeEvent_=(newValue: MicroflowEventHandler | Null): Unit = js.native
}
object WorkflowsProjectSettingsPart {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.WorkflowsProjectSettingsPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WorkflowsProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WorkflowsProjectSettingsPart]
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * The new WorkflowsProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createIn(container: ProjectSettings): WorkflowsProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WorkflowsProjectSettingsPart]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.WorkflowsProjectSettingsPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.WorkflowsProjectSettingsPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
