package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.commonMod.common.IColor
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
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
  @JSName("model")
  var model_FStyle: IModel = js.native
  def backgroundColor: IColor = js.native
  def backgroundColor_=(newValue: IColor): Unit = js.native
  def bold: Boolean = js.native
  def bold_=(newValue: Boolean): Unit = js.native
  def borderColorBottom: IColor = js.native
  def borderColorBottom_=(newValue: IColor): Unit = js.native
  def borderColorLeft: IColor = js.native
  def borderColorLeft_=(newValue: IColor): Unit = js.native
  def borderColorRight: IColor = js.native
  def borderColorRight_=(newValue: IColor): Unit = js.native
  def borderColorTop: IColor = js.native
  def borderColorTop_=(newValue: IColor): Unit = js.native
  def borderStyleBottom: BorderStyle = js.native
  def borderStyleBottom_=(newValue: BorderStyle): Unit = js.native
  def borderStyleLeft: BorderStyle = js.native
  def borderStyleLeft_=(newValue: BorderStyle): Unit = js.native
  def borderStyleRight: BorderStyle = js.native
  def borderStyleRight_=(newValue: BorderStyle): Unit = js.native
  def borderStyleTop: BorderStyle = js.native
  def borderStyleTop_=(newValue: BorderStyle): Unit = js.native
  def borderWidthBottom: Double = js.native
  def borderWidthBottom_=(newValue: Double): Unit = js.native
  def borderWidthLeft: Double = js.native
  def borderWidthLeft_=(newValue: Double): Unit = js.native
  def borderWidthRight: Double = js.native
  def borderWidthRight_=(newValue: Double): Unit = js.native
  def borderWidthTop: Double = js.native
  def borderWidthTop_=(newValue: Double): Unit = js.native
  def containerAsDataGridCell: DataGridCell = js.native
  def containerAsDataGridColumn: DataGridColumn = js.native
  def containerAsDocumentTemplate: DocumentTemplate = js.native
  def containerAsDynamicLabel: DynamicLabel = js.native
  def containerAsGrid: Grid = js.native
  def containerAsStaticLabel: StaticLabel = js.native
  def containerAsTable: Table = js.native
  def containerAsTableCell: TableCell = js.native
  def containerAsTitle: Title = js.native
  def customStyles: String = js.native
  def customStyles_=(newValue: String): Unit = js.native
  def fontColor: IColor = js.native
  def fontColor_=(newValue: IColor): Unit = js.native
  def fontFamily: FontFamily = js.native
  def fontFamily_=(newValue: FontFamily): Unit = js.native
  def fontSize: Double = js.native
  def fontSize_=(newValue: Double): Unit = js.native
  def italic: Boolean = js.native
  def italic_=(newValue: Boolean): Unit = js.native
  def overrideBackgroundColor: Boolean = js.native
  def overrideBackgroundColor_=(newValue: Boolean): Unit = js.native
  def overrideBold: Boolean = js.native
  def overrideBold_=(newValue: Boolean): Unit = js.native
  def overrideFontColor: Boolean = js.native
  def overrideFontColor_=(newValue: Boolean): Unit = js.native
  def overrideFontFamily: Boolean = js.native
  def overrideFontFamily_=(newValue: Boolean): Unit = js.native
  def overrideFontSize: Boolean = js.native
  def overrideFontSize_=(newValue: Boolean): Unit = js.native
  def overrideItalic: Boolean = js.native
  def overrideItalic_=(newValue: Boolean): Unit = js.native
  def textAlign: TextAlign = js.native
  def textAlign_=(newValue: TextAlign): Unit = js.native
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

