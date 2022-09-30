package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/settings", "settings.RuntimeSettings")
@js.native
open class RuntimeSettings protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def afterStartupMicroflow: IMicroflow | Null = js.native
  
  def afterStartupMicroflowQualifiedName: String | Null = js.native
  
  def afterStartupMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def allowUserMultipleSessions: Boolean = js.native
  def allowUserMultipleSessions_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def bcryptCost: Double = js.native
  def bcryptCost_=(newValue: Double): Unit = js.native
  
  def beforeShutdownMicroflow: IMicroflow | Null = js.native
  
  def beforeShutdownMicroflowQualifiedName: String | Null = js.native
  
  def beforeShutdownMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def defaultTimeZoneCode: String = js.native
  def defaultTimeZoneCode_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    * In version 7.10.0: introduced
    */
  def enableDataStorageNewQueryHandling: Boolean = js.native
  def enableDataStorageNewQueryHandling_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.5.0: introduced
    */
  def enableDataStorageOptimisticLocking: Boolean = js.native
  def enableDataStorageOptimisticLocking_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.0.2: deleted
    * In version 7.1.0: introduced
    */
  def enforceDataStorageUniqueness: Boolean = js.native
  def enforceDataStorageUniqueness_=(newValue: Boolean): Unit = js.native
  
  def firstDayOfWeek: FirstDayOfWeekEnum = js.native
  def firstDayOfWeek_=(newValue: FirstDayOfWeekEnum): Unit = js.native
  
  def hashAlgorithm: HashAlgorithmType = js.native
  def hashAlgorithm_=(newValue: HashAlgorithmType): Unit = js.native
  
  def healthCheckMicroflow: IMicroflow | Null = js.native
  
  def healthCheckMicroflowQualifiedName: String | Null = js.native
  
  def healthCheckMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def roundingMode: RoundingMode = js.native
  def roundingMode_=(newValue: RoundingMode): Unit = js.native
  
  def scheduledEventTimeZoneCode: String = js.native
  def scheduledEventTimeZoneCode_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    * In version 7.15.0: introduced
    */
  def useDeprecatedClientForWebServiceCalls: Boolean = js.native
  def useDeprecatedClientForWebServiceCalls_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def useSystemContextForBackgroundTasks: Boolean = js.native
  def useSystemContextForBackgroundTasks_=(newValue: Boolean): Unit = js.native
}
object RuntimeSettings {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.RuntimeSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): RuntimeSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RuntimeSettings]
  
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * The new RuntimeSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  /* static member */
  inline def createIn(container: ProjectSettings): RuntimeSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[RuntimeSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.RuntimeSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.RuntimeSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
