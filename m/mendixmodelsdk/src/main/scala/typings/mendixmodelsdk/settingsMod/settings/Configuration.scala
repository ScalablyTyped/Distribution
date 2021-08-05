package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/configuration relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration")
@js.native
class Configuration protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def adminPortNumber: Double = js.native
  def adminPortNumber_=(newValue: Double): Unit = js.native
  
  def adminPortOnlyLocal: Boolean = js.native
  def adminPortOnlyLocal_=(newValue: Boolean): Unit = js.native
  
  def applicationRootUrl: String = js.native
  def applicationRootUrl_=(newValue: String): Unit = js.native
  
  def constantValues: IList[ConstantValue] = js.native
  
  def containerAsConfigurationSettings: ConfigurationSettings = js.native
  
  def customSettings: IList[CustomSetting] = js.native
  
  def databaseName: String = js.native
  def databaseName_=(newValue: String): Unit = js.native
  
  def databasePassword: String = js.native
  def databasePassword_=(newValue: String): Unit = js.native
  
  def databaseType: DatabaseType = js.native
  def databaseType_=(newValue: DatabaseType): Unit = js.native
  
  def databaseUrl: String = js.native
  def databaseUrl_=(newValue: String): Unit = js.native
  
  def databaseUseIntegratedSecurity: Boolean = js.native
  def databaseUseIntegratedSecurity_=(newValue: Boolean): Unit = js.native
  
  def databaseUserName: String = js.native
  def databaseUserName_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.21.0: deleted
    */
  def emulateCloudSecurity: Boolean = js.native
  def emulateCloudSecurity_=(newValue: Boolean): Unit = js.native
  
  def extraJvmParameters: String = js.native
  def extraJvmParameters_=(newValue: String): Unit = js.native
  
  def maxJavaHeapSize: Double = js.native
  def maxJavaHeapSize_=(newValue: Double): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def runtimePortNumber: Double = js.native
  def runtimePortNumber_=(newValue: Double): Unit = js.native
  
  def runtimePortOnlyLocal: Boolean = js.native
  def runtimePortOnlyLocal_=(newValue: Boolean): Unit = js.native
}
object Configuration {
  
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  /**
    * Creates and returns a new Configuration instance in the SDK and on the server.
    * The new Configuration will be automatically stored in the 'configurations' property
    * of the parent ConfigurationSettings element passed as argument.
    */
  /* static member */
  inline def createIn(container: ConfigurationSettings): Configuration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Configuration]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.Configuration.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
