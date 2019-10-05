package typings.mendixmodelsdk.distGenSettingsMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart")
@js.native
class WebUIProjectSettingsPart protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 6.6.0: introduced
    */
  var enableDownloadResources: Boolean = js.native
  /**
    * In version 7.0.2: introduced
    */
  var enableMicroflowReachabilityAnalysis: Boolean = js.native
  var enableWidgetBundling: Boolean = js.native
  /**
    * In version 6.2.0: deleted
    */
  var feedbackWidgetUpdated: Boolean = js.native
  var theme: String = js.native
  /**
    * In version 8.0.0: introduced
    */
  var themeConversionStatus: ThemeConversionStatusEnum = js.native
  /**
    * In version 7.9.0: introduced
    */
  var themeModuleName: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart")
@js.native
object WebUIProjectSettingsPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WebUIProjectSettingsPart = js.native
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * The new WebUIProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: ProjectSettings): WebUIProjectSettingsPart = js.native
}

