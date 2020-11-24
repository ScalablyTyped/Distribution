package typings.mendixmodelsdk.customwidgetsMod.customwidgets

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.clientMod.client.SupportedPlatform
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidgetType")
@js.native
class CustomWidgetType protected () extends Element[IModel] {
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
    * In version 8.0.0: introduced
    */
  def supportedPlatform: SupportedPlatform = js.native
  def supportedPlatform_=(newValue: SupportedPlatform): Unit = js.native
  
  def widgetId: String = js.native
  def widgetId_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidgetType")
@js.native
object CustomWidgetType extends js.Object {
  
  /**
    * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CustomWidgetType = js.native
  
  /**
    * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
    * The new CustomWidgetType will be automatically stored in the 'type' property
    * of the parent CustomWidget element passed as argument.
    */
  def createIn(container: CustomWidget): CustomWidgetType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
