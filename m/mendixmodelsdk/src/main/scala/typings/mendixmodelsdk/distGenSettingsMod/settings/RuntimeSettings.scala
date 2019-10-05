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
  var afterStartupMicroflow: IMicroflow | Null = js.native
  val afterStartupMicroflowQualifiedName: String | Null = js.native
  var allowUserMultipleSessions: Boolean = js.native
  var beforeShutdownMicroflow: IMicroflow | Null = js.native
  val beforeShutdownMicroflowQualifiedName: String | Null = js.native
  var defaultTimeZoneCode: String = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.10.0: introduced
    */
  var enableDataStorageNewQueryHandling: Boolean = js.native
  /**
    * In version 7.5.0: introduced
    */
  var enableDataStorageOptimisticLocking: Boolean = js.native
  /**
    * In version 7.1.0: introduced
    */
  var enforceDataStorageUniqueness: Boolean = js.native
  var firstDayOfWeek: FirstDayOfWeekEnum = js.native
  var hashAlgorithm: HashAlgorithmType = js.native
  var healthCheckMicroflow: IMicroflow | Null = js.native
  val healthCheckMicroflowQualifiedName: String | Null = js.native
  var roundingMode: RoundingMode = js.native
  var scheduledEventTimeZoneCode: String = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.15.0: introduced
    */
  var useDeprecatedClientForWebServiceCalls: Boolean = js.native
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

