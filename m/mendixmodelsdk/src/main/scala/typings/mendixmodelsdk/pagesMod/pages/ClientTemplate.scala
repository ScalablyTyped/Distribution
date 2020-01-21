package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
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
  @JSName("model")
  var model_FClientTemplate: IModel = js.native
  def containerAsButton(): Button = js.native
  def containerAsControlBarButton(): ControlBarButton = js.native
  def containerAsCustomWidget(): CustomWidget = js.native
  def containerAsDataGrid(): DataGrid = js.native
  def containerAsDynamicText(): DynamicText = js.native
  def containerAsGroupBox(): GroupBox = js.native
  def containerAsInputWidget(): InputWidget = js.native
  def containerAsWidgetObject(): WidgetObject = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
  /**
    * In version 8.3.0: introduced
    */
  def fallback(): Text = js.native
  def fallback(newValue: Text): js.Any = js.native
  def parameters(): IList[ClientTemplateParameter] = js.native
  def template(): Text = js.native
  def template(newValue: Text): js.Any = js.native
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

