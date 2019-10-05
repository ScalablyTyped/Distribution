package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distCommonMod.common.IColor
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Style")
@js.native
class Style protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var backgroundColor: IColor = js.native
  var bold: Boolean = js.native
  var borderColorBottom: IColor = js.native
  var borderColorLeft: IColor = js.native
  var borderColorRight: IColor = js.native
  var borderColorTop: IColor = js.native
  var borderStyleBottom: BorderStyle = js.native
  var borderStyleLeft: BorderStyle = js.native
  var borderStyleRight: BorderStyle = js.native
  var borderStyleTop: BorderStyle = js.native
  var borderWidthBottom: Double = js.native
  var borderWidthLeft: Double = js.native
  var borderWidthRight: Double = js.native
  var borderWidthTop: Double = js.native
  val containerAsDataGridCell: DataGridCell = js.native
  val containerAsDataGridColumn: DataGridColumn = js.native
  val containerAsDocumentTemplate: DocumentTemplate = js.native
  val containerAsDynamicLabel: DynamicLabel = js.native
  val containerAsGrid: Grid = js.native
  val containerAsStaticLabel: StaticLabel = js.native
  val containerAsTable: Table = js.native
  val containerAsTableCell: TableCell = js.native
  val containerAsTitle: Title = js.native
  var customStyles: String = js.native
  var fontColor: IColor = js.native
  var fontFamily: FontFamily = js.native
  var fontSize: Double = js.native
  var italic: Boolean = js.native
  @JSName("model")
  var model_Style: IModel = js.native
  var overrideBackgroundColor: Boolean = js.native
  var overrideBold: Boolean = js.native
  var overrideFontColor: Boolean = js.native
  var overrideFontFamily: Boolean = js.native
  var overrideFontSize: Boolean = js.native
  var overrideItalic: Boolean = js.native
  var textAlign: TextAlign = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.Style")
@js.native
object Style extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  def createInDataGridCellUnderStyle(container: DataGridCell): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderStyle(container: DataGridColumn): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderStyle(container: DocumentTemplate): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderStyle(container: DynamicLabel): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  def createInGridUnderStyle(container: Grid): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  def createInStaticLabelUnderStyle(container: StaticLabel): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  def createInTableCellUnderStyle(container: TableCell): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  def createInTableUnderStyle(container: Table): Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  def createInTitleUnderStyle(container: Title): Style = js.native
}

