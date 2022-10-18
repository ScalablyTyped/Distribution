package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "settings.RuntimeSettings")
@js.native
open class RuntimeSettings protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.settings.RuntimeSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object RuntimeSettings {
  
  @JSImport("mendixmodelsdk", "settings.RuntimeSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenSettingsMod.settings.RuntimeSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenSettingsMod.settings.RuntimeSettings]
  
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * The new RuntimeSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenSettingsMod.settings.ProjectSettings): typings.mendixmodelsdk.srcGenSettingsMod.settings.RuntimeSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenSettingsMod.settings.RuntimeSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.RuntimeSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.RuntimeSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
