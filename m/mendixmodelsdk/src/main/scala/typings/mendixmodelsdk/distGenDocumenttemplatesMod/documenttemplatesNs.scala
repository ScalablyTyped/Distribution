package typings.mendixmodelsdk.distGenDocumenttemplatesMod

import typings.mendixmodelsdk.distCommonMod.commonNs.IColor
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IDataType
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.AttributeWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.BorderStyle
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.ConditionSettings
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataGrid
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridCell
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataView
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DataViewContents
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicImageViewer
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicLabel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.EntityWidget
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.FontFamily
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Footer
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Grid
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortBar
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortItem
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Header
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.LineBreak
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.PageBreak
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.StaticImageViewer
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.StaticLabel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Style
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Table
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.TableCell
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.TableRow
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGrid
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGridContents
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.TextAlign
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Title
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.Widget
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AttributeRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.EntityRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.Condition
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.FormattingInfo
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SortDirection
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates")
@js.native
object documenttemplatesNs extends js.Object {
  @js.native
  abstract class AttributeWidget protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: AttributeRef | Null = js.native
  }
  
  @js.native
  class BorderStyle () extends AbstractEnum
  
  @js.native
  class ConditionSettings protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var attribute: IAttribute | Null = js.native
    val attributeQualifiedName: String | Null = js.native
    val conditions: IList[Condition] = js.native
    val containerAsTableRow: TableRow = js.native
    @JSName("model")
    var model_ConditionSettings: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-grid-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataGrid protected () extends Grid {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val columns: IList[DataGridColumn] = js.native
    val weights: IList[Double] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/columns-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataGridCell protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDataGridColumn: DataGridColumn = js.native
    @JSName("model")
    var model_DataGridCell: IModel = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/columns-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataGridColumn protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: AttributeRef | Null = js.native
    var caption: Text = js.native
    val containerAsDataGrid: DataGrid = js.native
    var evenRowsCell: DataGridCell | Null = js.native
    var formattingInfo: FormattingInfo = js.native
    @JSName("model")
    var model_DataGridColumn: IModel = js.native
    var oddRowsCell: DataGridCell = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-view-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataView protected () extends EntityWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var contents: DataViewContents = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
  }
  
  @js.native
  class DataViewContents protected () extends DropZone {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/document-templates relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class DocumentTemplate protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    var canvasWidth: Double = js.native
    var footer: Footer | Null = js.native
    var header: Header | Null = js.native
    var marginBottomInInch: Double = js.native
    var marginLeftInInch: Double = js.native
    var marginRightInInch: Double = js.native
    var marginTopInInch: Double = js.native
    var pageHeight: String = js.native
    var pageWidth: String = js.native
    var ppi: Double = js.native
    var showHeaderAndFooterOnFirstPage: Boolean = js.native
    var style: Style = js.native
    val toplevels: IList[Widget] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplateParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDocumentTemplate, name, `type`, parameterType */ @js.native
  class DocumentTemplateParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDocumentTemplate: DocumentTemplate | IDocumentTemplate = js.native
    @JSName("model")
    var model_DocumentTemplateParameter: IModel = js.native
    var name: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: DataType | IDataType = js.native
    val qualifiedName: String | Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: Null | String = js.native
  }
  
  @js.native
  abstract class DropZone protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDataView: DataView = js.native
    val containerAsDocumentTemplate: DocumentTemplate = js.native
    val containerAsTableRow: TableRow = js.native
    val containerAsTemplateGrid: TemplateGrid = js.native
    @JSName("model")
    var model_DropZone: IModel = js.native
    var widget: Widget | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/dynamic-image-(document-template) relevant section in reference guide}
    */
  @js.native
  class DynamicImageViewer protected () extends EntityWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var defaultImage: IImage | Null = js.native
    val defaultImageQualifiedName: String | Null = js.native
    var height: Double = js.native
    var useThumbnail: Boolean = js.native
    var width: Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/dynamic-label-(document-template) relevant section in reference guide}
    */
  @js.native
  class DynamicLabel protected () extends AttributeWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var formattingInfo: FormattingInfo = js.native
    var renderXHTML: Boolean = js.native
    var style: Style = js.native
  }
  
  @js.native
  abstract class EntityWidget protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyEntityPath.
      *
      * In version 7.11.0: deleted
      */
    var entityPath: String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var entityRef: EntityRef | Null = js.native
  }
  
  @js.native
  class FontFamily () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/footer-(document-template) relevant section in reference guide}
    */
  @js.native
  class Footer protected () extends DropZone {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var bottomMargin: Double = js.native
  }
  
  @js.native
  abstract class Grid protected () extends EntityWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var cellPadding: Double = js.native
    var cellSpacing: Double = js.native
    var microflow: IMicroflow | Null = js.native
    val microflowQualifiedName: String | Null = js.native
    var sortBar: GridSortBar = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/sort-bar relevant section in reference guide}
    */
  @js.native
  class GridSortBar protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsGrid: Grid = js.native
    @JSName("model")
    var model_GridSortBar: IModel = js.native
    val sortItems: IList[GridSortItem] = js.native
  }
  
  @js.native
  class GridSortItem protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: AttributeRef = js.native
    val containerAsGridSortBar: GridSortBar = js.native
    @JSName("model")
    var model_GridSortItem: IModel = js.native
    var sortOrder: SortDirection = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/header-(document-template) relevant section in reference guide}
    */
  @js.native
  class Header protected () extends DropZone {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var topMargin: Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/document-templates relevant section in reference guide}
    */
  @js.native
  trait IDocumentTemplate extends IDocument
  
  @js.native
  trait IDocumentTemplateParameter
    extends IElement
       with IByNameReferrable {
    val containerAsDocumentTemplate: IDocumentTemplate = js.native
    @JSName("model")
    val model_IDocumentTemplateParameter: IModel = js.native
    val name: String = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.9.0: introduced
      */
    val parameterType: IDataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    val `type`: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/line-break-(document-template) relevant section in reference guide}
    */
  @js.native
  class LineBreak protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/page-break-(document-template) relevant section in reference guide}
    */
  @js.native
  class PageBreak protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/static-image-(document-template) relevant section in reference guide}
    */
  @js.native
  class StaticImageViewer protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var height: Double = js.native
    var image: IImage | Null = js.native
    val imageQualifiedName: String | Null = js.native
    var width: Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/static-label-(document-template) relevant section in reference guide}
    */
  @js.native
  class StaticLabel protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: Text = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
    */
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
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/table-(document-template) relevant section in reference guide}
    */
  @js.native
  class Table protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var cellPadding: Double = js.native
    var cellSpacing: Double = js.native
    val columnWeights: IList[Double] = js.native
    val rows: IList[TableRow] = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/cell-(document-template) relevant section in reference guide}
    */
  @js.native
  class TableCell protected () extends DropZone {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var colSpan: Double = js.native
    var isPartOfSpan: Boolean = js.native
    var rowSpan: Double = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/row-(document-template) relevant section in reference guide}
    */
  @js.native
  class TableRow protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val cells: IList[TableCell] = js.native
    var conditionSettings: ConditionSettings = js.native
    val containerAsTable: Table = js.native
    @JSName("model")
    var model_TableRow: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/template-grid-(document-template) relevant section in reference guide}
    */
  @js.native
  class TemplateGrid protected () extends Grid {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var evenRowsContents: TemplateGridContents | Null = js.native
    var numberOfColumns: Double = js.native
    var oddRowsContents: TemplateGridContents = js.native
  }
  
  @js.native
  class TemplateGridContents protected () extends DropZone {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class TextAlign () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/title-(document-template) relevant section in reference guide}
    */
  @js.native
  class Title protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: Text = js.native
    var style: Style = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DocumentTemplates`.
    */
  @js.native
  abstract class Widget protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDocumentTemplate: DocumentTemplate = js.native
    val containerAsDropZone: DropZone = js.native
    @JSName("model")
    var model_Widget: IModel = js.native
    var name: String = js.native
  }
  
  /* static members */
  @js.native
  object AttributeWidget extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object BorderStyle extends js.Object {
    var Dashed: BorderStyle = js.native
    var Dotted: BorderStyle = js.native
    var None: BorderStyle = js.native
    var Solid: BorderStyle = js.native
  }
  
  /* static members */
  @js.native
  object ConditionSettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConditionSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ConditionSettings = js.native
    /**
      * Creates and returns a new ConditionSettings instance in the SDK and on the server.
      * The new ConditionSettings will be automatically stored in the 'conditionSettings' property
      * of the parent TableRow element passed as argument.
      */
    def createIn(container: TableRow): ConditionSettings = js.native
  }
  
  /* static members */
  @js.native
  object DataGrid extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataGrid instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataGrid = js.native
    /**
      * Creates and returns a new DataGrid instance in the SDK and on the server.
      * The new DataGrid will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DataGrid = js.native
    /**
      * Creates and returns a new DataGrid instance in the SDK and on the server.
      * The new DataGrid will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): DataGrid = js.native
  }
  
  /* static members */
  @js.native
  object DataGridCell extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataGridCell instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataGridCell = js.native
    /**
      * Creates and returns a new DataGridCell instance in the SDK and on the server.
      * The new DataGridCell will be automatically stored in the 'evenRowsCell' property
      * of the parent DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderEvenRowsCell(container: DataGridColumn): DataGridCell = js.native
    /**
      * Creates and returns a new DataGridCell instance in the SDK and on the server.
      * The new DataGridCell will be automatically stored in the 'oddRowsCell' property
      * of the parent DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderOddRowsCell(container: DataGridColumn): DataGridCell = js.native
  }
  
  /* static members */
  @js.native
  object DataGridColumn extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataGridColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataGridColumn = js.native
    /**
      * Creates and returns a new DataGridColumn instance in the SDK and on the server.
      * The new DataGridColumn will be automatically stored in the 'columns' property
      * of the parent DataGrid element passed as argument.
      */
    def createIn(container: DataGrid): DataGridColumn = js.native
  }
  
  /* static members */
  @js.native
  object DataView extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataView instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataView = js.native
    /**
      * Creates and returns a new DataView instance in the SDK and on the server.
      * The new DataView will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DataView = js.native
    /**
      * Creates and returns a new DataView instance in the SDK and on the server.
      * The new DataView will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): DataView = js.native
  }
  
  /* static members */
  @js.native
  object DataViewContents extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataViewContents instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataViewContents = js.native
    /**
      * Creates and returns a new DataViewContents instance in the SDK and on the server.
      * The new DataViewContents will be automatically stored in the 'contents' property
      * of the parent DataView element passed as argument.
      */
    def createIn(container: DataView): DataViewContents = js.native
  }
  
  /* static members */
  @js.native
  object DocumentTemplate extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new DocumentTemplate unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): DocumentTemplate = js.native
  }
  
  /* static members */
  @js.native
  object DocumentTemplateParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DropZone extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DynamicImageViewer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DynamicImageViewer = js.native
    /**
      * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
      * The new DynamicImageViewer will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DynamicImageViewer = js.native
    /**
      * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
      * The new DynamicImageViewer will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): DynamicImageViewer = js.native
  }
  
  /* static members */
  @js.native
  object DynamicLabel extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DynamicLabel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DynamicLabel = js.native
    /**
      * Creates and returns a new DynamicLabel instance in the SDK and on the server.
      * The new DynamicLabel will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DynamicLabel = js.native
    /**
      * Creates and returns a new DynamicLabel instance in the SDK and on the server.
      * The new DynamicLabel will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): DynamicLabel = js.native
  }
  
  /* static members */
  @js.native
  object EntityWidget extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object FontFamily extends js.Object {
    var Arial: FontFamily = js.native
    var Courier: FontFamily = js.native
    var Helvetica: FontFamily = js.native
    var Tahoma: FontFamily = js.native
    var Times: FontFamily = js.native
  }
  
  /* static members */
  @js.native
  object Footer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Footer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Footer = js.native
    /**
      * Creates and returns a new Footer instance in the SDK and on the server.
      * The new Footer will be automatically stored in the 'footer' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createIn(container: DocumentTemplate): Footer = js.native
  }
  
  /* static members */
  @js.native
  object Grid extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object GridSortBar extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new GridSortBar instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): GridSortBar = js.native
    /**
      * Creates and returns a new GridSortBar instance in the SDK and on the server.
      * The new GridSortBar will be automatically stored in the 'sortBar' property
      * of the parent Grid element passed as argument.
      */
    def createIn(container: Grid): GridSortBar = js.native
  }
  
  /* static members */
  @js.native
  object GridSortItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new GridSortItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): GridSortItem = js.native
    /**
      * Creates and returns a new GridSortItem instance in the SDK and on the server.
      * The new GridSortItem will be automatically stored in the 'sortItems' property
      * of the parent GridSortBar element passed as argument.
      */
    def createIn(container: GridSortBar): GridSortItem = js.native
  }
  
  /* static members */
  @js.native
  object Header extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Header instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Header = js.native
    /**
      * Creates and returns a new Header instance in the SDK and on the server.
      * The new Header will be automatically stored in the 'header' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createIn(container: DocumentTemplate): Header = js.native
  }
  
  /* static members */
  @js.native
  object LineBreak extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new LineBreak instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): LineBreak = js.native
    /**
      * Creates and returns a new LineBreak instance in the SDK and on the server.
      * The new LineBreak will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): LineBreak = js.native
    /**
      * Creates and returns a new LineBreak instance in the SDK and on the server.
      * The new LineBreak will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): LineBreak = js.native
  }
  
  /* static members */
  @js.native
  object PageBreak extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PageBreak instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PageBreak = js.native
    /**
      * Creates and returns a new PageBreak instance in the SDK and on the server.
      * The new PageBreak will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): PageBreak = js.native
    /**
      * Creates and returns a new PageBreak instance in the SDK and on the server.
      * The new PageBreak will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): PageBreak = js.native
  }
  
  /* static members */
  @js.native
  object StaticImageViewer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StaticImageViewer = js.native
    /**
      * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
      * The new StaticImageViewer will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): StaticImageViewer = js.native
    /**
      * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
      * The new StaticImageViewer will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): StaticImageViewer = js.native
  }
  
  /* static members */
  @js.native
  object StaticLabel extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StaticLabel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StaticLabel = js.native
    /**
      * Creates and returns a new StaticLabel instance in the SDK and on the server.
      * The new StaticLabel will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): StaticLabel = js.native
    /**
      * Creates and returns a new StaticLabel instance in the SDK and on the server.
      * The new StaticLabel will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): StaticLabel = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object Table extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Table instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Table = js.native
    /**
      * Creates and returns a new Table instance in the SDK and on the server.
      * The new Table will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): Table = js.native
    /**
      * Creates and returns a new Table instance in the SDK and on the server.
      * The new Table will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): Table = js.native
  }
  
  /* static members */
  @js.native
  object TableCell extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TableCell instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TableCell = js.native
    /**
      * Creates and returns a new TableCell instance in the SDK and on the server.
      * The new TableCell will be automatically stored in the 'cells' property
      * of the parent TableRow element passed as argument.
      */
    def createIn(container: TableRow): TableCell = js.native
  }
  
  /* static members */
  @js.native
  object TableRow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TableRow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TableRow = js.native
    /**
      * Creates and returns a new TableRow instance in the SDK and on the server.
      * The new TableRow will be automatically stored in the 'rows' property
      * of the parent Table element passed as argument.
      */
    def createIn(container: Table): TableRow = js.native
  }
  
  /* static members */
  @js.native
  object TemplateGrid extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TemplateGrid instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TemplateGrid = js.native
    /**
      * Creates and returns a new TemplateGrid instance in the SDK and on the server.
      * The new TemplateGrid will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): TemplateGrid = js.native
    /**
      * Creates and returns a new TemplateGrid instance in the SDK and on the server.
      * The new TemplateGrid will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): TemplateGrid = js.native
  }
  
  /* static members */
  @js.native
  object TemplateGridContents extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TemplateGridContents = js.native
    /**
      * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
      * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
      * of the parent TemplateGrid element passed as argument.
      */
    def createInTemplateGridUnderEvenRowsContents(container: TemplateGrid): TemplateGridContents = js.native
    /**
      * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
      * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
      * of the parent TemplateGrid element passed as argument.
      */
    def createInTemplateGridUnderOddRowsContents(container: TemplateGrid): TemplateGridContents = js.native
  }
  
  /* static members */
  @js.native
  object TextAlign extends js.Object {
    var Center: TextAlign = js.native
    var Left: TextAlign = js.native
    var Right: TextAlign = js.native
  }
  
  /* static members */
  @js.native
  object Title extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new Title instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): Title = js.native
    /**
      * Creates and returns a new Title instance in the SDK and on the server.
      * The new Title will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): Title = js.native
    /**
      * Creates and returns a new Title instance in the SDK and on the server.
      * The new Title will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: DropZone): Title = js.native
  }
  
  /* static members */
  @js.native
  object Widget extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
}

