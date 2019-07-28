package typings.mendixmodelsdk.distGenSettingsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Project
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.ProjectDocument
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.Certificate
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.CertificateSettings
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.CertificateType
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.Configuration
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.ConfigurationSettings
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.ConstantValue
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.CustomSetting
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.DatabaseType
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.HashAlgorithmType
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.IntegrationProjectSettingsPart
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.JavaActionsSettings
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.Language
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.LanguageSettings
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.ModelerSettings
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.ProjectSettings
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.ProjectSettingsPart
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.RoundingMode
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.RuntimeSettings
import typings.mendixmodelsdk.distGenSettingsMod.settingsNs.WebUIProjectSettingsPart
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/settings", "settings")
@js.native
object settingsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Settings`.
    */
  @js.native
  class Certificate protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCertificateSettings: CertificateSettings = js.native
    var data: String | Null = js.native
    @JSName("model")
    var model_Certificate: IModel = js.native
    var `type`: CertificateType = js.native
  }
  
  @js.native
  class CertificateSettings protected () extends ProjectSettingsPart {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val certificates: IList[Certificate] = js.native
  }
  
  @js.native
  class CertificateType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/configuration relevant section in reference guide}
    */
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
  
  @js.native
  class ConfigurationSettings protected () extends ProjectSettingsPart {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val configurations: IList[Configuration] = js.native
  }
  
  @js.native
  class ConstantValue protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var constant: IConstant = js.native
    val constantQualifiedName: String = js.native
    val containerAsConfiguration: Configuration = js.native
    @JSName("model")
    var model_ConstantValue: IModel = js.native
    var value: String = js.native
  }
  
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
    val containerAsConfiguration: Configuration = js.native
    @JSName("model")
    var model_CustomSetting: IModel = js.native
    var name: String = js.native
    var value: String = js.native
  }
  
  @js.native
  class DatabaseType () extends AbstractEnum
  
  @js.native
  class FirstDayOfWeekEnum () extends AbstractEnum
  
  @js.native
  class HashAlgorithmType () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-settings relevant section in reference guide}
    */
  @js.native
  trait IProjectSettings extends IProjectDocument
  
  @js.native
  class IntegrationProjectSettingsPart protected () extends ProjectSettingsPart {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 6.9.0: introduced
    */
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
  
  @js.native
  class LanguageSettings protected () extends ProjectSettingsPart {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var defaultLanguageCode: String = js.native
    val languages: IList[Language] = js.native
  }
  
  @js.native
  class ModelerSettings protected () extends ProjectSettingsPart {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var lowerCaseMicroflowVariables: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-settings relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenSettingsMod.settingsNs.IProjectSettings because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ProjectSettings protected () extends ProjectDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    @JSName("containerAsProject")
    val containerAsProject_ProjectSettings: Project = js.native
    val settingsParts: IList[ProjectSettingsPart] = js.native
  }
  
  @js.native
  abstract class ProjectSettingsPart protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsProjectSettings: ProjectSettings = js.native
    @JSName("model")
    var model_ProjectSettingsPart: IModel = js.native
  }
  
  @js.native
  class RoundingMode () extends AbstractEnum
  
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
      * In version 7.9.0: introduced
      */
    var themeModuleName: String = js.native
  }
  
  /* static members */
  @js.native
  object Certificate extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Certificate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Certificate = js.native
    /**
      * Creates and returns a new Certificate instance in the SDK and on the server.
      * The new Certificate will be automatically stored in the 'certificates' property
      * of the parent CertificateSettings element passed as argument.
      */
    def createIn(container: CertificateSettings): Certificate = js.native
  }
  
  /* static members */
  @js.native
  object CertificateSettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new CertificateSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): CertificateSettings = js.native
    /**
      * Creates and returns a new CertificateSettings instance in the SDK and on the server.
      * The new CertificateSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: ProjectSettings): CertificateSettings = js.native
  }
  
  /* static members */
  @js.native
  object CertificateType extends js.Object {
    var Authority: CertificateType = js.native
    var Client: CertificateType = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object ConfigurationSettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConfigurationSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ConfigurationSettings = js.native
    /**
      * Creates and returns a new ConfigurationSettings instance in the SDK and on the server.
      * The new ConfigurationSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: ProjectSettings): ConfigurationSettings = js.native
  }
  
  /* static members */
  @js.native
  object ConstantValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConstantValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ConstantValue = js.native
    /**
      * Creates and returns a new ConstantValue instance in the SDK and on the server.
      * The new ConstantValue will be automatically stored in the 'constantValues' property
      * of the parent Configuration element passed as argument.
      */
    def createIn(container: Configuration): ConstantValue = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object DatabaseType extends js.Object {
    var Db2: DatabaseType = js.native
    var Hsqldb: DatabaseType = js.native
    var MySql: DatabaseType = js.native
    var Oracle: DatabaseType = js.native
    var PostgreSql: DatabaseType = js.native
    var SqlServer: DatabaseType = js.native
  }
  
  /* static members */
  @js.native
  object FirstDayOfWeekEnum extends js.Object {
    var Default: FirstDayOfWeekEnum = js.native
    var Friday: FirstDayOfWeekEnum = js.native
    var Monday: FirstDayOfWeekEnum = js.native
    var Saturday: FirstDayOfWeekEnum = js.native
    var Sunday: FirstDayOfWeekEnum = js.native
    var Thursday: FirstDayOfWeekEnum = js.native
    var Tuesday: FirstDayOfWeekEnum = js.native
    var Wednesday: FirstDayOfWeekEnum = js.native
  }
  
  /* static members */
  @js.native
  object HashAlgorithmType extends js.Object {
    var BCrypt: HashAlgorithmType = js.native
    var MD5: HashAlgorithmType = js.native
    var SHA256: HashAlgorithmType = js.native
    var SSHA256: HashAlgorithmType = js.native
  }
  
  /* static members */
  @js.native
  object IntegrationProjectSettingsPart extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IntegrationProjectSettingsPart = js.native
    /**
      * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
      * The new IntegrationProjectSettingsPart will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: ProjectSettings): IntegrationProjectSettingsPart = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
  @js.native
  object LanguageSettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new LanguageSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): LanguageSettings = js.native
    /**
      * Creates and returns a new LanguageSettings instance in the SDK and on the server.
      * The new LanguageSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: ProjectSettings): LanguageSettings = js.native
  }
  
  /* static members */
  @js.native
  object ModelerSettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ModelerSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ModelerSettings = js.native
    /**
      * Creates and returns a new ModelerSettings instance in the SDK and on the server.
      * The new ModelerSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: ProjectSettings): ModelerSettings = js.native
  }
  
  /* static members */
  @js.native
  object ProjectSettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ProjectSettings unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): ProjectSettings = js.native
  }
  
  /* static members */
  @js.native
  object ProjectSettingsPart extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RoundingMode extends js.Object {
    var HalfEven: RoundingMode = js.native
    var HalfUp: RoundingMode = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
}

