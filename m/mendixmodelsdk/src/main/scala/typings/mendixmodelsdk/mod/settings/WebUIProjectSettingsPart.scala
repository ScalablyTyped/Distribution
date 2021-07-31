package typings.mendixmodelsdk.mod.settings

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

@JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart")
@js.native
class WebUIProjectSettingsPart protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.settings.WebUIProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object WebUIProjectSettingsPart {
  
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.settingsMod.settings.WebUIProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.settingsMod.settings.WebUIProjectSettingsPart]
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * The new WebUIProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  /* static member */
  @scala.inline
  def createIn(container: typings.mendixmodelsdk.settingsMod.settings.ProjectSettings): typings.mendixmodelsdk.settingsMod.settings.WebUIProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.settingsMod.settings.WebUIProjectSettingsPart]
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.WebUIProjectSettingsPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
