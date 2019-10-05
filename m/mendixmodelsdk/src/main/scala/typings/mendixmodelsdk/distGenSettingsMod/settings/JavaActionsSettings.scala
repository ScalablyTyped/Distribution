package typings.mendixmodelsdk.distGenSettingsMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.0.0: deleted
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.JavaActionsSettings")
@js.native
class JavaActionsSettings protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var generatePostfixesForParameters: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.JavaActionsSettings")
@js.native
object JavaActionsSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): JavaActionsSettings = js.native
  /**
    * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
    * The new JavaActionsSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 to 7.23.0
    */
  def createIn(container: ProjectSettings): JavaActionsSettings = js.native
}

