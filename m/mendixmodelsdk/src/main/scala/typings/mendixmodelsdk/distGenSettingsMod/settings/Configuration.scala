package typings.mendixmodelsdk.distGenSettingsMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/configuration relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration")
@js.native
class Configuration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var adminPortNumber: Double = js.native
  var adminPortOnlyLocal: Boolean = js.native
  var applicationRootUrl: String = js.native
  val constantValues: IList[ConstantValue] = js.native
  val containerAsConfigurationSettings: ConfigurationSettings = js.native
  val customSettings: IList[CustomSetting] = js.native
  var databaseName: String = js.native
  var databasePassword: String = js.native
  var databaseType: DatabaseType = js.native
  var databaseUrl: String = js.native
  var databaseUseIntegratedSecurity: Boolean = js.native
  var databaseUserName: String = js.native
  /**
    * In version 7.21.0: deleted
    */
  var emulateCloudSecurity: Boolean = js.native
  var extraJvmParameters: String = js.native
  var maxJavaHeapSize: Double = js.native
  @JSName("model")
  var model_Configuration: IModel = js.native
  var name: String = js.native
  var runtimePortNumber: Double = js.native
  var runtimePortOnlyLocal: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration")
@js.native
object Configuration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Configuration = js.native
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * The new Configuration will be automatically stored in the 'configurations' property
    * of the parent ConfigurationSettings element passed as argument.
    */
  def createIn(container: ConfigurationSettings): Configuration = js.native
}

