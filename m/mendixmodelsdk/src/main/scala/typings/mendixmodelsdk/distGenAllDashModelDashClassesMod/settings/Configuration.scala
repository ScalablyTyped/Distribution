package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/configuration relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.Configuration")
@js.native
class Configuration protected ()
  extends typings.mendixmodelsdk.distGenSettingsMod.settings.Configuration {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.Configuration")
@js.native
object Configuration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenSettingsMod.settings.Configuration = js.native
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * The new Configuration will be automatically stored in the 'configurations' property
    * of the parent ConfigurationSettings element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenSettingsMod.settings.ConfigurationSettings): typings.mendixmodelsdk.distGenSettingsMod.settings.Configuration = js.native
}

