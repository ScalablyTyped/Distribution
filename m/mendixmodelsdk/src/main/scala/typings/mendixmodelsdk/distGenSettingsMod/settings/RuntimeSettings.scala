package typings.mendixmodelsdk.distGenSettingsMod.settings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.RuntimeSettings")
@js.native
class RuntimeSettings protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRuntimeSettings: IModel = js.native
  def afterStartupMicroflow(): IMicroflow | Null = js.native
  def afterStartupMicroflow(newValue: IMicroflow): js.Any = js.native
  def afterStartupMicroflowQualifiedName(): String | Null = js.native
  @JSName("afterStartupMicroflow")
  def afterStartupMicroflow_Any(): js.Any = js.native
  def allowUserMultipleSessions(): Boolean = js.native
  def allowUserMultipleSessions(newValue: Boolean): js.Any = js.native
  def beforeShutdownMicroflow(): IMicroflow | Null = js.native
  def beforeShutdownMicroflow(newValue: IMicroflow): js.Any = js.native
  def beforeShutdownMicroflowQualifiedName(): String | Null = js.native
  @JSName("beforeShutdownMicroflow")
  def beforeShutdownMicroflow_Any(): js.Any = js.native
  def defaultTimeZoneCode(): String = js.native
  def defaultTimeZoneCode(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.10.0: introduced
    */
  def enableDataStorageNewQueryHandling(): Boolean = js.native
  def enableDataStorageNewQueryHandling(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.5.0: introduced
    */
  def enableDataStorageOptimisticLocking(): Boolean = js.native
  def enableDataStorageOptimisticLocking(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.1.0: introduced
    */
  def enforceDataStorageUniqueness(): Boolean = js.native
  def enforceDataStorageUniqueness(newValue: Boolean): js.Any = js.native
  def firstDayOfWeek(): FirstDayOfWeekEnum = js.native
  def firstDayOfWeek(newValue: FirstDayOfWeekEnum): js.Any = js.native
  def hashAlgorithm(): HashAlgorithmType = js.native
  def hashAlgorithm(newValue: HashAlgorithmType): js.Any = js.native
  def healthCheckMicroflow(): IMicroflow | Null = js.native
  def healthCheckMicroflow(newValue: IMicroflow): js.Any = js.native
  def healthCheckMicroflowQualifiedName(): String | Null = js.native
  @JSName("healthCheckMicroflow")
  def healthCheckMicroflow_Any(): js.Any = js.native
  def roundingMode(): RoundingMode = js.native
  def roundingMode(newValue: RoundingMode): js.Any = js.native
  def scheduledEventTimeZoneCode(): String = js.native
  def scheduledEventTimeZoneCode(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.15.0: introduced
    */
  def useDeprecatedClientForWebServiceCalls(): Boolean = js.native
  def useDeprecatedClientForWebServiceCalls(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.RuntimeSettings")
@js.native
object RuntimeSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RuntimeSettings = js.native
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * The new RuntimeSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: ProjectSettings): RuntimeSettings = js.native
}

