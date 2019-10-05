package typings.mendixmodelsdk.distGenSettingsMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
@js.native
class Language protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var checkCompleteness: Boolean = js.native
  var code: String = js.native
  val containerAsLanguageSettings: LanguageSettings = js.native
  var customDateFormat: String = js.native
  var customDateTimeFormat: String = js.native
  var customTimeFormat: String = js.native
  @JSName("model")
  var model_Language: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Language")
@js.native
object Language extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Language = js.native
  /**
    * Creates and returns a new Language instance in the SDK and on the server.
    * The new Language will be automatically stored in the 'languages' property
    * of the parent LanguageSettings element passed as argument.
    */
  def createIn(container: LanguageSettings): Language = js.native
}

