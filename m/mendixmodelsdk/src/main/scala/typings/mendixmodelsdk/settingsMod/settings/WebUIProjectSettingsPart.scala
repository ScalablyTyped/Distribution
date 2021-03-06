package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart")
@js.native
class WebUIProjectSettingsPart protected () extends ProjectSettingsPart {
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
  
  def theme: String = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def themeConversionStatus: ThemeConversionStatusEnum = js.native
  def themeConversionStatus_=(newValue: ThemeConversionStatusEnum): Unit = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def themeModuleName: String = js.native
  def themeModuleName_=(newValue: String): Unit = js.native
  
  def theme_=(newValue: String): Unit = js.native
}
object WebUIProjectSettingsPart {
  
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart.create")
  @js.native
  def create(model: IModel): WebUIProjectSettingsPart = js.native
  
  /**
    * Creates and returns a new WebUIProjectSettingsPart instance in the SDK and on the server.
    * The new WebUIProjectSettingsPart will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart.createIn")
  @js.native
  def createIn(container: ProjectSettings): WebUIProjectSettingsPart = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.WebUIProjectSettingsPart.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
