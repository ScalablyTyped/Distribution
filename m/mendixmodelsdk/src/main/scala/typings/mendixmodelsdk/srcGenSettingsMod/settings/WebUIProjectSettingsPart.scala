package typings.mendixmodelsdk.srcGenSettingsMod.settings

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/settings", "settings.WebUIProjectSettingsPart")
@js.native
open class WebUIProjectSettingsPart protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 6.6.0: introduced
    */
  def enableDownloadResources: Boolean = js.native
  def enableDownloadResources_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.0.2: introduced
    */
  def enableMicroflowReachabilityAnalysis: Boolean = js.native
  def enableMicroflowReachabilityAnalysis_=(newValue: Boolean): Unit = js.native
  
  def enableWidgetBundling: Boolean = js.native
  def enableWidgetBundling_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 6.2.0: deleted
    */
  def feedbackWidgetUpdated: Boolean = js.native
  def feedbackWidgetUpdated_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.2.0: deleted
    */
  def theme: String = js.native
  
  /**
    * In version 9.0.1: deleted
    * In version 8.0.0: introduced
    */
  def themeConversionStatus: ThemeConversionStatusEnum = js.native
  def themeConversionStatus_=(newValue: ThemeConversionStatusEnum): Unit = js.native
  
  /**
    * In version 9.2.0: deleted
    * In version 7.9.0: introduced
    */
  def themeModuleName: String = js.native
  def themeModuleName_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.3.0: introduced
    */
  def themeModuleOrder: IList[ThemeModuleEntry] = js.native
  
  def theme_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  def useOptimizedClient: UseOptimizedClient = js.native
  def useOptimizedClient_=(newValue: UseOptimizedClient): Unit = js.native
}
object WebUIProjectSettingsPart {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.WebUIProjectSettingsPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WebUIProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WebUIProjectSettingsPart]
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * The new WebUIProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  /* static member */
  inline def createIn(container: ProjectSettings): WebUIProjectSettingsPart = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WebUIProjectSettingsPart]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.WebUIProjectSettingsPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.WebUIProjectSettingsPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
