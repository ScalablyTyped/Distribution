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
  def backgroundColor(): IColor = js.native
  def backgroundColor(newValue: IColor): js.Any = js.native
  def bold(): Boolean = js.native
  def bold(newValue: Boolean): js.Any = js.native
  def borderColorBottom(): IColor = js.native
  def borderColorBottom(newValue: IColor): js.Any = js.native
  def borderColorLeft(): IColor = js.native
  def borderColorLeft(newValue: IColor): js.Any = js.native
  def borderColorRight(): IColor = js.native
  def borderColorRight(newValue: IColor): js.Any = js.native
  def borderColorTop(): IColor = js.native
  def borderColorTop(newValue: IColor): js.Any = js.native
  def borderStyleBottom(): BorderStyle = js.native
  def borderStyleBottom(newValue: BorderStyle): js.Any = js.native
  def borderStyleLeft(): BorderStyle = js.native
  def borderStyleLeft(newValue: BorderStyle): js.Any = js.native
  def borderStyleRight(): BorderStyle = js.native
  def borderStyleRight(newValue: BorderStyle): js.Any = js.native
  def borderStyleTop(): BorderStyle = js.native
  def borderStyleTop(newValue: BorderStyle): js.Any = js.native
  def borderWidthBottom(): Double = js.native
  def borderWidthBottom(newValue: Double): js.Any = js.native
  def borderWidthLeft(): Double = js.native
  def borderWidthLeft(newValue: Double): js.Any = js.native
  def borderWidthRight(): Double = js.native
  def borderWidthRight(newValue: Double): js.Any = js.native
  def borderWidthTop(): Double = js.native
  def borderWidthTop(newValue: Double): js.Any = js.native
  def containerAsDataGridCell(): DataGridCell = js.native
  def containerAsDataGridColumn(): DataGridColumn = js.native
  def containerAsDocumentTemplate(): DocumentTemplate = js.native
  def containerAsDynamicLabel(): DynamicLabel = js.native
  def containerAsGrid(): Grid = js.native
  def containerAsStaticLabel(): StaticLabel = js.native
  def containerAsTable(): Table = js.native
  def containerAsTableCell(): TableCell = js.native
  def containerAsTitle(): Title = js.native
  def customStyles(): String = js.native
  def customStyles(newValue: String): js.Any = js.native
  def fontColor(): IColor = js.native
  def fontColor(newValue: IColor): js.Any = js.native
  def fontFamily(): FontFamily = js.native
  def fontFamily(newValue: FontFamily): js.Any = js.native
  def fontSize(): Double = js.native
  def fontSize(newValue: Double): js.Any = js.native
  def italic(): Boolean = js.native
  def italic(newValue: Boolean): js.Any = js.native
  def overrideBackgroundColor(): Boolean = js.native
  def overrideBackgroundColor(newValue: Boolean): js.Any = js.native
  def overrideBold(): Boolean = js.native
  def overrideBold(newValue: Boolean): js.Any = js.native
  def overrideFontColor(): Boolean = js.native
  def overrideFontColor(newValue: Boolean): js.Any = js.native
  def overrideFontFamily(): Boolean = js.native
  def overrideFontFamily(newValue: Boolean): js.Any = js.native
  def overrideFontSize(): Boolean = js.native
  def overrideFontSize(newValue: Boolean): js.Any = js.native
  def overrideItalic(): Boolean = js.native
  def overrideItalic(newValue: Boolean): js.Any = js.native
  def textAlign(): TextAlign = js.native
  def textAlign(newValue: TextAlign): js.Any = js.native
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

