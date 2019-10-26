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
  val containerAsCustomWidget: CustomWidget = js.native
  var description: String = js.native
  /**
    * In version 7.1.0: deleted
    * In version 7.0.0: introduced
    */
  var experimentalApi: Boolean = js.native
  /**
    * In version 8.3.0: introduced
    */
  var helpUrl: String = js.native
  /**
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  var labeled: Boolean = js.native
  @JSName("model")
  var model_CustomWidgetType: IModel = js.native
  var name: String = js.native
  var needsEntityContext: Boolean = js.native
  var objectType: WidgetObjectType = js.native
  var offlineCapable: Boolean = js.native
  var phoneGapEnabled: Boolean = js.native
  /**
    * In version 7.19.0: introduced
    */
  var pluginWidget: Boolean = js.native
  /**
    * In version 8.0.0: introduced
    */
  var supportedPlatform: SupportedPlatform = js.native
  var widgetId: String = js.native
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

