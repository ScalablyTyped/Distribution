package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo")
@js.native
class FormattingInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  
  def containerAsDataGridColumn: DataGridColumn = js.native
  
  def containerAsDatePicker: DatePicker = js.native
  
  def containerAsDynamicLabel: DynamicLabel = js.native
  
  def containerAsGridColumn: GridColumn = js.native
  
  def containerAsReferenceSelector: ReferenceSelector = js.native
  
  def containerAsTextBox: TextBox = js.native
  
  def customDateFormat: String = js.native
  def customDateFormat_=(newValue: String): Unit = js.native
  
  def dateFormat: DateFormat = js.native
  def dateFormat_=(newValue: DateFormat): Unit = js.native
  
  def decimalPrecision: Double = js.native
  def decimalPrecision_=(newValue: Double): Unit = js.native
  
  def enumFormat: EnumFormat = js.native
  def enumFormat_=(newValue: EnumFormat): Unit = js.native
  
  def groupDigits: Boolean = js.native
  def groupDigits_=(newValue: Boolean): Unit = js.native
}
object FormattingInfo {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.create")
  @js.native
  def create(model: IModel): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.createInClientTemplateParameterUnderFormattingInfo")
  @js.native
  def createInClientTemplateParameterUnderFormattingInfo(container: ClientTemplateParameter): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.createInDataGridColumnUnderFormattingInfo")
  @js.native
  def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.createInDatePickerUnderFormattingInfo")
  @js.native
  def createInDatePickerUnderFormattingInfo(container: DatePicker): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.createInDynamicLabelUnderFormattingInfo")
  @js.native
  def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.createInGridColumnUnderFormattingInfo")
  @js.native
  def createInGridColumnUnderFormattingInfo(container: GridColumn): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.createInReferenceSelectorUnderFormattingInfo")
  @js.native
  def createInReferenceSelectorUnderFormattingInfo(container: ReferenceSelector): FormattingInfo = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.createInTextBoxUnderFormattingInfo")
  @js.native
  def createInTextBoxUnderFormattingInfo(container: TextBox): FormattingInfo = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormattingInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
