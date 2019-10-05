package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObject
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate")
@js.native
class ClientTemplate protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsButton: Button = js.native
  val containerAsControlBarButton: ControlBarButton = js.native
  val containerAsCustomWidget: CustomWidget = js.native
  val containerAsDataGrid: DataGrid = js.native
  val containerAsDynamicText: DynamicText = js.native
  val containerAsGroupBox: GroupBox = js.native
  val containerAsInputWidget: InputWidget = js.native
  val containerAsWidgetObject: WidgetObject = js.native
  val containerAsWidgetValue: WidgetValue = js.native
  @JSName("model")
  var model_ClientTemplate: IModel = js.native
  val parameters: IList[ClientTemplateParameter] = js.native
  var template: Text = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplate")
@js.native
object ClientTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  def createInButtonUnderCaption(container: Button): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderCaption(container: ControlBarButton): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInDataGridUnderCaption(container: DataGrid): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  def createInDynamicTextUnderContent(container: DynamicText): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  def createInGroupBoxUnderCaption(container: GroupBox): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInInputWidgetUnderLabelTemplate(container: InputWidget): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  def createInWidgetValueUnderTextTemplate(container: WidgetValue): ClientTemplate = js.native
}

