package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenClientMod.client.SupportedPlatform
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidgetType")
@js.native
class CustomWidgetType protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCustomWidgetType: IModel = js.native
  def containerAsCustomWidget(): CustomWidget = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  /**
    * In version 7.1.0: deleted
    * In version 7.0.0: introduced
    */
  def experimentalApi(): Boolean = js.native
  def experimentalApi(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.3.0: introduced
    */
  def helpUrl(): String = js.native
  def helpUrl(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  def labeled(): Boolean = js.native
  def labeled(newValue: Boolean): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def needsEntityContext(): Boolean = js.native
  def needsEntityContext(newValue: Boolean): js.Any = js.native
  def objectType(): WidgetObjectType = js.native
  def objectType(newValue: WidgetObjectType): js.Any = js.native
  def offlineCapable(): Boolean = js.native
  def offlineCapable(newValue: Boolean): js.Any = js.native
  def phoneGapEnabled(): Boolean = js.native
  def phoneGapEnabled(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.19.0: introduced
    */
  def pluginWidget(): Boolean = js.native
  def pluginWidget(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def supportedPlatform(): SupportedPlatform = js.native
  def supportedPlatform(newValue: SupportedPlatform): js.Any = js.native
  def widgetId(): String = js.native
  def widgetId(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.CustomWidgetType")
@js.native
object CustomWidgetType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
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
}

