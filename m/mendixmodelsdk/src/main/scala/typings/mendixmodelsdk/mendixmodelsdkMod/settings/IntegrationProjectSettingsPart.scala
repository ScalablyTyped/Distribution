package typings.mendixmodelsdk.mendixmodelsdkMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.IntegrationProjectSettingsPart")
@js.native
class IntegrationProjectSettingsPart protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings.IntegrationProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "settings.IntegrationProjectSettingsPart")
@js.native
object IntegrationProjectSettingsPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenSettingsMod.settings.IntegrationProjectSettingsPart = js.native
  /**
    * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
    * The new IntegrationProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenSettingsMod.settings.ProjectSettings): typings.mendixmodelsdk.distGenSettingsMod.settings.IntegrationProjectSettingsPart = js.native
}

