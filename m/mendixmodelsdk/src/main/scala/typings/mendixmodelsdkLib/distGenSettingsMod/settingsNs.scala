package typings
package mendixmodelsdkLib.distGenSettingsMod

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
  class Certificate protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsCertificateSettings: CertificateSettings = js.native
    var data: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_Certificate: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var `type`: CertificateType = js.native
  }
  
  @js.native
  class CertificateSettings protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val certificates: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Certificate] = js.native
  }
  
  @js.native
  class CertificateType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/configuration relevant section in reference guide}
    */
  @js.native
  class Configuration protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var adminPortNumber: scala.Double = js.native
    var adminPortOnlyLocal: scala.Boolean = js.native
    var applicationRootUrl: java.lang.String = js.native
    val constantValues: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ConstantValue] = js.native
    val containerAsConfigurationSettings: ConfigurationSettings = js.native
    val customSettings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[CustomSetting] = js.native
    var databaseName: java.lang.String = js.native
    var databasePassword: java.lang.String = js.native
    var databaseType: DatabaseType = js.native
    var databaseUrl: java.lang.String = js.native
    var databaseUseIntegratedSecurity: scala.Boolean = js.native
    var databaseUserName: java.lang.String = js.native
    /**
      * In version 7.21.0: deleted
      */
    var emulateCloudSecurity: scala.Boolean = js.native
    var extraJvmParameters: java.lang.String = js.native
    var maxJavaHeapSize: scala.Double = js.native
    @JSName("model")
    var model_Configuration: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var runtimePortNumber: scala.Double = js.native
    var runtimePortOnlyLocal: scala.Boolean = js.native
  }
  
  @js.native
  class ConfigurationSettings protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val configurations: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Configuration] = js.native
  }
  
  @js.native
  class ConstantValue protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var constant: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant = js.native
    val constantQualifiedName: java.lang.String = js.native
    val containerAsConfiguration: Configuration = js.native
    @JSName("model")
    var model_ConstantValue: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var value: java.lang.String = js.native
  }
  
  @js.native
  class CustomSetting protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsConfiguration: Configuration = js.native
    @JSName("model")
    var model_CustomSetting: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    var value: java.lang.String = js.native
  }
  
  @js.native
  class DatabaseType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class FirstDayOfWeekEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class HashAlgorithmType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-settings relevant section in reference guide}
    */
  @js.native
  trait IProjectSettings
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProjectDocument
  
  @js.native
  class IntegrationProjectSettingsPart protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 6.9.0: introduced
    */
  @js.native
  class JavaActionsSettings protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var generatePostfixesForParameters: scala.Boolean = js.native
  }
  
  @js.native
  class Language protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var checkCompleteness: scala.Boolean = js.native
    var code: java.lang.String = js.native
    val containerAsLanguageSettings: LanguageSettings = js.native
    var customDateFormat: java.lang.String = js.native
    var customDateTimeFormat: java.lang.String = js.native
    var customTimeFormat: java.lang.String = js.native
    @JSName("model")
    var model_Language: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class LanguageSettings protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var defaultLanguageCode: java.lang.String = js.native
    val languages: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Language] = js.native
  }
  
  @js.native
  class ModelerSettings protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var lowerCaseMicroflowVariables: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-settings relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenSettingsMod.settingsNs.IProjectSettings because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ProjectSettings protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.ProjectDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
    @JSName("containerAsProject")
    val containerAsProject_ProjectSettings: mendixmodelsdkLib.distGenProjectsMod.projectsNs.Project = js.native
    val settingsParts: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ProjectSettingsPart] = js.native
  }
  
  @js.native
  abstract class ProjectSettingsPart protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsProjectSettings: ProjectSettings = js.native
    @JSName("model")
    var model_ProjectSettingsPart: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class RoundingMode ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class RuntimeSettings protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var afterStartupMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val afterStartupMicroflowQualifiedName: java.lang.String | scala.Null = js.native
    var allowUserMultipleSessions: scala.Boolean = js.native
    var beforeShutdownMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val beforeShutdownMicroflowQualifiedName: java.lang.String | scala.Null = js.native
    var defaultTimeZoneCode: java.lang.String = js.native
    /**
      * In version 8.0.0: deleted
      * In version 7.10.0: introduced
      */
    var enableDataStorageNewQueryHandling: scala.Boolean = js.native
    /**
      * In version 7.5.0: introduced
      */
    var enableDataStorageOptimisticLocking: scala.Boolean = js.native
    /**
      * In version 7.1.0: introduced
      */
    var enforceDataStorageUniqueness: scala.Boolean = js.native
    var firstDayOfWeek: FirstDayOfWeekEnum = js.native
    var hashAlgorithm: HashAlgorithmType = js.native
    var healthCheckMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val healthCheckMicroflowQualifiedName: java.lang.String | scala.Null = js.native
    var roundingMode: RoundingMode = js.native
    var scheduledEventTimeZoneCode: java.lang.String = js.native
    /**
      * In version 8.0.0: deleted
      * In version 7.15.0: introduced
      */
    var useDeprecatedClientForWebServiceCalls: scala.Boolean = js.native
  }
  
  @js.native
  class WebUIProjectSettingsPart protected () extends ProjectSettingsPart {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 6.6.0: introduced
      */
    var enableDownloadResources: scala.Boolean = js.native
    /**
      * In version 7.0.2: introduced
      */
    var enableMicroflowReachabilityAnalysis: scala.Boolean = js.native
    var enableWidgetBundling: scala.Boolean = js.native
    /**
      * In version 6.2.0: deleted
      */
    var feedbackWidgetUpdated: scala.Boolean = js.native
    var theme: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var themeModuleName: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object Certificate extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Certificate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.Certificate = js.native
    /**
      * Creates and returns a new Certificate instance in the SDK and on the server.
      * The new Certificate will be automatically stored in the 'certificates' property
      * of the parent CertificateSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.CertificateSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.Certificate = js.native
  }
  
  /* static members */
  @js.native
  object CertificateSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CertificateSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.CertificateSettings = js.native
    /**
      * Creates and returns a new CertificateSettings instance in the SDK and on the server.
      * The new CertificateSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.CertificateSettings = js.native
  }
  
  /* static members */
  @js.native
  object CertificateType extends js.Object {
    var Authority: mendixmodelsdkLib.distGenSettingsMod.settingsNs.CertificateType = js.native
    var Client: mendixmodelsdkLib.distGenSettingsMod.settingsNs.CertificateType = js.native
  }
  
  /* static members */
  @js.native
  object Configuration extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Configuration instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.Configuration = js.native
    /**
      * Creates and returns a new Configuration instance in the SDK and on the server.
      * The new Configuration will be automatically stored in the 'configurations' property
      * of the parent ConfigurationSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ConfigurationSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.Configuration = js.native
  }
  
  /* static members */
  @js.native
  object ConfigurationSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConfigurationSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.ConfigurationSettings = js.native
    /**
      * Creates and returns a new ConfigurationSettings instance in the SDK and on the server.
      * The new ConfigurationSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.ConfigurationSettings = js.native
  }
  
  /* static members */
  @js.native
  object ConstantValue extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConstantValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.ConstantValue = js.native
    /**
      * Creates and returns a new ConstantValue instance in the SDK and on the server.
      * The new ConstantValue will be automatically stored in the 'constantValues' property
      * of the parent Configuration element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.Configuration): mendixmodelsdkLib.distGenSettingsMod.settingsNs.ConstantValue = js.native
  }
  
  /* static members */
  @js.native
  object CustomSetting extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new CustomSetting instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.CustomSetting = js.native
    /**
      * Creates and returns a new CustomSetting instance in the SDK and on the server.
      * The new CustomSetting will be automatically stored in the 'customSettings' property
      * of the parent Configuration element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.Configuration): mendixmodelsdkLib.distGenSettingsMod.settingsNs.CustomSetting = js.native
  }
  
  /* static members */
  @js.native
  object DatabaseType extends js.Object {
    var Db2: mendixmodelsdkLib.distGenSettingsMod.settingsNs.DatabaseType = js.native
    var Hsqldb: mendixmodelsdkLib.distGenSettingsMod.settingsNs.DatabaseType = js.native
    var MySql: mendixmodelsdkLib.distGenSettingsMod.settingsNs.DatabaseType = js.native
    var Oracle: mendixmodelsdkLib.distGenSettingsMod.settingsNs.DatabaseType = js.native
    var PostgreSql: mendixmodelsdkLib.distGenSettingsMod.settingsNs.DatabaseType = js.native
    var SqlServer: mendixmodelsdkLib.distGenSettingsMod.settingsNs.DatabaseType = js.native
  }
  
  /* static members */
  @js.native
  object FirstDayOfWeekEnum extends js.Object {
    var Default: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
    var Friday: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
    var Monday: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
    var Saturday: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
    var Sunday: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
    var Thursday: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
    var Tuesday: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
    var Wednesday: mendixmodelsdkLib.distGenSettingsMod.settingsNs.FirstDayOfWeekEnum = js.native
  }
  
  /* static members */
  @js.native
  object HashAlgorithmType extends js.Object {
    var BCrypt: mendixmodelsdkLib.distGenSettingsMod.settingsNs.HashAlgorithmType = js.native
    var MD5: mendixmodelsdkLib.distGenSettingsMod.settingsNs.HashAlgorithmType = js.native
    var SHA256: mendixmodelsdkLib.distGenSettingsMod.settingsNs.HashAlgorithmType = js.native
    var SSHA256: mendixmodelsdkLib.distGenSettingsMod.settingsNs.HashAlgorithmType = js.native
  }
  
  /* static members */
  @js.native
  object IntegrationProjectSettingsPart extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.IntegrationProjectSettingsPart = js.native
    /**
      * Creates and returns a new IntegrationProjectSettingsPart instance in the SDK and on the server.
      * The new IntegrationProjectSettingsPart will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.IntegrationProjectSettingsPart = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionsSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.JavaActionsSettings = js.native
    /**
      * Creates and returns a new JavaActionsSettings instance in the SDK and on the server.
      * The new JavaActionsSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.JavaActionsSettings = js.native
  }
  
  /* static members */
  @js.native
  object Language extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Language instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.Language = js.native
    /**
      * Creates and returns a new Language instance in the SDK and on the server.
      * The new Language will be automatically stored in the 'languages' property
      * of the parent LanguageSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.LanguageSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.Language = js.native
  }
  
  /* static members */
  @js.native
  object LanguageSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new LanguageSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.LanguageSettings = js.native
    /**
      * Creates and returns a new LanguageSettings instance in the SDK and on the server.
      * The new LanguageSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.LanguageSettings = js.native
  }
  
  /* static members */
  @js.native
  object ModelerSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ModelerSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.ModelerSettings = js.native
    /**
      * Creates and returns a new ModelerSettings instance in the SDK and on the server.
      * The new ModelerSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.ModelerSettings = js.native
  }
  
  /* static members */
  @js.native
  object ProjectSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ProjectSettings unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject): mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings = js.native
  }
  
  /* static members */
  @js.native
  object ProjectSettingsPart extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object RoundingMode extends js.Object {
    var HalfEven: mendixmodelsdkLib.distGenSettingsMod.settingsNs.RoundingMode = js.native
    var HalfUp: mendixmodelsdkLib.distGenSettingsMod.settingsNs.RoundingMode = js.native
  }
  
  /* static members */
  @js.native
  object RuntimeSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.RuntimeSettings = js.native
    /**
      * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
      * The new RuntimeSettings will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.RuntimeSettings = js.native
  }
  
  /* static members */
  @js.native
  object WebUIProjectSettingsPart extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSettingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSettingsMod.settingsNs.WebUIProjectSettingsPart = js.native
    /**
      * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
      * The new WebUIProjectSettingsPart will be automatically stored in the 'settingsParts' property
      * of the parent ProjectSettings element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenSettingsMod.settingsNs.ProjectSettings): mendixmodelsdkLib.distGenSettingsMod.settingsNs.WebUIProjectSettingsPart = js.native
  }
  
}

