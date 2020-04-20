package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo")
@js.native
class FormattingInfo protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FFormattingInfo: IModel = js.native
  def containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  def containerAsDataGridColumn: DataGridColumn = js.native
  def containerAsDatePicker: DatePicker = js.native
  def containerAsDynamicLabel: DynamicLabel = js.native
  def containerAsGridColumn: GridColumn = js.native
  def containerAsReferenceSelector: ReferenceSelector = js.native
  def containerAsTextBox: TextBox = js.native
  def customDateFormat: String = js.native
  def customDateFormat(newValue: String): js.Any = js.native
  def dateFormat: DateFormat = js.native
  def dateFormat(newValue: DateFormat): js.Any = js.native
  def decimalPrecision: Double = js.native
  def decimalPrecision(newValue: Double): js.Any = js.native
  def enumFormat: EnumFormat = js.native
  def enumFormat(newValue: EnumFormat): js.Any = js.native
  def groupDigits: Boolean = js.native
  def groupDigits(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo")
@js.native
object FormattingInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInClientTemplateParameterUnderFormattingInfo(container: ClientTemplateParameter): FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  def createInDatePickerUnderFormattingInfo(container: DatePicker): FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  def createInGridColumnUnderFormattingInfo(container: GridColumn): FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderFormattingInfo(container: ReferenceSelector): FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  def createInTextBoxUnderFormattingInfo(container: TextBox): FormattingInfo = js.native
}

