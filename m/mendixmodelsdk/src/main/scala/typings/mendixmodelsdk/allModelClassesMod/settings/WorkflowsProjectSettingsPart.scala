package typings.mendixmodelsdk.allModelClassesMod.settings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.8.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart")
@js.native
class WorkflowsProjectSettingsPart protected ()
  extends typings.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WorkflowsProjectSettingsPart {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart]
  
  /**
    * Creates and returns a new WorkflowsProjectSettingsPart instance in the SDK and on the server.
    * The new WorkflowsProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.settingsMod.settings.ProjectSettings): typings.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.settingsMod.settings.WorkflowsProjectSettingsPart]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.WorkflowsProjectSettingsPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
