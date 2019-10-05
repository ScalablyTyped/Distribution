package typings.mendixmodelsdk.mendixmodelsdkMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.LanguageSettings")
@js.native
class LanguageSettings protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings.LanguageSettings {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "settings.LanguageSettings")
@js.native
object LanguageSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new LanguageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenSettingsMod.settings.LanguageSettings = js.native
  /**
    * Creates and returns a new LanguageSettings instance in the SDK and on the server.
    * The new LanguageSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenSettingsMod.settings.ProjectSettings): typings.mendixmodelsdk.distGenSettingsMod.settings.LanguageSettings = js.native
}

