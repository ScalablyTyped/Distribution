package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.commonMod.common.IColor
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.Style")
@js.native
open class Style protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
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
object Style {
  
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.Style")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  /* static member */
  inline def createInDataGridCellUnderStyle(container: DataGridCell): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridCellUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderStyle(container: DataGridColumn): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderStyle(container: DocumentTemplate): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  /* static member */
  inline def createInDynamicLabelUnderStyle(container: DynamicLabel): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicLabelUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  /* static member */
  inline def createInGridUnderStyle(container: Grid): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  /* static member */
  inline def createInStaticLabelUnderStyle(container: StaticLabel): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticLabelUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  /* static member */
  inline def createInTableCellUnderStyle(container: TableCell): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  /* static member */
  inline def createInTableUnderStyle(container: Table): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  /* static member */
  inline def createInTitleUnderStyle(container: Title): Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTitleUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[Style]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.Style.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.Style.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
