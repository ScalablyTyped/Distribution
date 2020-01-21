package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.CustomSetting")
@js.native
class CustomSetting protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCustomSetting: IModel = js.native
  def containerAsConfiguration(): Configuration = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def value(): String = js.native
  def value(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.CustomSetting")
@js.native
object CustomSetting extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomSetting instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CustomSetting = js.native
  /**
    * Creates and returns a new CustomSetting instance in the SDK and on the server.
    * The new CustomSetting will be automatically stored in the 'customSettings' property
    * of the parent Configuration element passed as argument.
    */
  def createIn(container: Configuration): CustomSetting = js.native
}

