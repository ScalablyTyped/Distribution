package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenClientMod.client.SupportedPlatform
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType")
@js.native
open class CustomWidgetType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsCustomWidget: CustomWidget = js.native
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.1.0: deleted
    * In version 7.0.0: introduced
    */
  def experimentalApi: Boolean = js.native
  def experimentalApi_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def helpUrl: String = js.native
  def helpUrl_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  def labeled: Boolean = js.native
  def labeled_=(newValue: Boolean): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def needsEntityContext: Boolean = js.native
  def needsEntityContext_=(newValue: Boolean): Unit = js.native
  
  def objectType: WidgetObjectType = js.native
  def objectType_=(newValue: WidgetObjectType): Unit = js.native
  
  def offlineCapable: Boolean = js.native
  def offlineCapable_=(newValue: Boolean): Unit = js.native
  
  def phoneGapEnabled: Boolean = js.native
  def phoneGapEnabled_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.19.0: introduced
    */
  def pluginWidget: Boolean = js.native
  def pluginWidget_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.4.0: introduced
    */
  def studioCategory: String = js.native
  def studioCategory_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.4.0: introduced
    */
  def studioProCategory: String = js.native
  def studioProCategory_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def supportedPlatform: SupportedPlatform = js.native
  def supportedPlatform_=(newValue: SupportedPlatform): Unit = js.native
  
  def widgetId: String = js.native
  def widgetId_=(newValue: String): Unit = js.native
}
object CustomWidgetType {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetType]
  
  /**
    * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
    * The new CustomWidgetType will be automatically stored in the 'type' property
    * of the parent CustomWidget element passed as argument.
    */
  /* static member */
  inline def createIn(container: CustomWidget): CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
