package typings
package mendixmodelsdkLib.distGenDocumenttemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates")
@js.native
object documenttemplatesNs extends js.Object {
  @js.native
  abstract class AttributeWidget protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: java.lang.String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef | scala.Null = js.native
  }
  
  @js.native
  class BorderStyle ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class ConditionSettings protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
    val conditions: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.Condition] = js.native
    val containerAsTableRow: TableRow = js.native
    @JSName("model")
    var model_ConditionSettings: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-grid-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataGrid protected () extends Grid {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val columns: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataGridColumn] = js.native
    val weights: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[scala.Double] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/columns-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataGridCell protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDataGridColumn: DataGridColumn = js.native
    @JSName("model")
    var model_DataGridCell: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/columns-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataGridColumn protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: java.lang.String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef | scala.Null = js.native
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    val containerAsDataGrid: DataGrid = js.native
    var evenRowsCell: DataGridCell | scala.Null = js.native
    var formattingInfo: mendixmodelsdkLib.distGenPagesMod.pagesNs.FormattingInfo = js.native
    @JSName("model")
    var model_DataGridColumn: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var oddRowsCell: DataGridCell = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-view-(document-template) relevant section in reference guide}
    */
  @js.native
  class DataView protected () extends EntityWidget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var contents: DataViewContents = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class DataViewContents protected () extends DropZone {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/document-templates relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplate because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class DocumentTemplate protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var canvasWidth: scala.Double = js.native
    var footer: Footer | scala.Null = js.native
    var header: Header | scala.Null = js.native
    var marginBottomInInch: scala.Double = js.native
    var marginLeftInInch: scala.Double = js.native
    var marginRightInInch: scala.Double = js.native
    var marginTopInInch: scala.Double = js.native
    var pageHeight: java.lang.String = js.native
    var pageWidth: java.lang.String = js.native
    var ppi: scala.Double = js.native
    var showHeaderAndFooterOnFirstPage: scala.Boolean = js.native
    var style: Style = js.native
    val toplevels: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[Widget] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplateParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDocumentTemplate, name, `type`, parameterType, asLoaded, load, load, load, load */ @js.native
  class DocumentTemplateParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDocumentTemplate: DocumentTemplate | IDocumentTemplate = js.native
    @JSName("model")
    var model_DocumentTemplateParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType | mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: scala.Null | java.lang.String = js.native
  }
  
  @js.native
  abstract class DropZone protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDataView: DataView = js.native
    val containerAsDocumentTemplate: DocumentTemplate = js.native
    val containerAsTableRow: TableRow = js.native
    val containerAsTemplateGrid: TemplateGrid = js.native
    @JSName("model")
    var model_DropZone: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var widget: Widget | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/dynamic-image-(document-template) relevant section in reference guide}
    */
  @js.native
  class DynamicImageViewer protected () extends EntityWidget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var defaultImage: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val defaultImageQualifiedName: java.lang.String | scala.Null = js.native
    var height: scala.Double = js.native
    var useThumbnail: scala.Boolean = js.native
    var width: scala.Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/dynamic-label-(document-template) relevant section in reference guide}
    */
  @js.native
  class DynamicLabel protected () extends AttributeWidget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var formattingInfo: mendixmodelsdkLib.distGenPagesMod.pagesNs.FormattingInfo = js.native
    var renderXHTML: scala.Boolean = js.native
    var style: Style = js.native
  }
  
  @js.native
  abstract class EntityWidget protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyEntityPath.
      *
      * In version 7.11.0: deleted
      */
    var entityPath: java.lang.String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var entityRef: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.EntityRef | scala.Null = js.native
  }
  
  @js.native
  class FontFamily ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/footer-(document-template) relevant section in reference guide}
    */
  @js.native
  class Footer protected () extends DropZone {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var bottomMargin: scala.Double = js.native
  }
  
  @js.native
  abstract class Grid protected () extends EntityWidget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var cellPadding: scala.Double = js.native
    var cellSpacing: scala.Double = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    var sortBar: GridSortBar = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/sort-bar relevant section in reference guide}
    */
  @js.native
  class GridSortBar protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsGrid: Grid = js.native
    @JSName("model")
    var model_GridSortBar: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val sortItems: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[GridSortItem] = js.native
  }
  
  @js.native
  class GridSortItem protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    var attributePath: java.lang.String = js.native
    /**
      * In version 7.11.0: introduced
      */
    var attributeRef: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AttributeRef = js.native
    val containerAsGridSortBar: GridSortBar = js.native
    @JSName("model")
    var model_GridSortItem: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var sortOrder: mendixmodelsdkLib.distGenPagesMod.pagesNs.SortDirection = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/header-(document-template) relevant section in reference guide}
    */
  @js.native
  class Header protected () extends DropZone {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var topMargin: scala.Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/document-templates relevant section in reference guide}
    */
  @js.native
  trait IDocumentTemplate
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument
  
  @js.native
  trait IDocumentTemplateParameter
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsDocumentTemplate: IDocumentTemplate = js.native
    @JSName("model")
    val model_IDocumentTemplateParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.9.0: introduced
      */
    val parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    val `type`: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/line-break-(document-template) relevant section in reference guide}
    */
  @js.native
  class LineBreak protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/page-break-(document-template) relevant section in reference guide}
    */
  @js.native
  class PageBreak protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/static-image-(document-template) relevant section in reference guide}
    */
  @js.native
  class StaticImageViewer protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var height: scala.Double = js.native
    var image: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val imageQualifiedName: java.lang.String | scala.Null = js.native
    var width: scala.Double = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/static-label-(document-template) relevant section in reference guide}
    */
  @js.native
  class StaticLabel protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
    */
  @js.native
  class Style protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var backgroundColor: mendixmodelsdkLib.distCommonMod.commonNs.IColor = js.native
    var bold: scala.Boolean = js.native
    var borderColorBottom: mendixmodelsdkLib.distCommonMod.commonNs.IColor = js.native
    var borderColorLeft: mendixmodelsdkLib.distCommonMod.commonNs.IColor = js.native
    var borderColorRight: mendixmodelsdkLib.distCommonMod.commonNs.IColor = js.native
    var borderColorTop: mendixmodelsdkLib.distCommonMod.commonNs.IColor = js.native
    var borderStyleBottom: BorderStyle = js.native
    var borderStyleLeft: BorderStyle = js.native
    var borderStyleRight: BorderStyle = js.native
    var borderStyleTop: BorderStyle = js.native
    var borderWidthBottom: scala.Double = js.native
    var borderWidthLeft: scala.Double = js.native
    var borderWidthRight: scala.Double = js.native
    var borderWidthTop: scala.Double = js.native
    val containerAsDataGridCell: DataGridCell = js.native
    val containerAsDataGridColumn: DataGridColumn = js.native
    val containerAsDocumentTemplate: DocumentTemplate = js.native
    val containerAsDynamicLabel: DynamicLabel = js.native
    val containerAsGrid: Grid = js.native
    val containerAsStaticLabel: StaticLabel = js.native
    val containerAsTable: Table = js.native
    val containerAsTableCell: TableCell = js.native
    val containerAsTitle: Title = js.native
    var customStyles: java.lang.String = js.native
    var fontColor: mendixmodelsdkLib.distCommonMod.commonNs.IColor = js.native
    var fontFamily: FontFamily = js.native
    var fontSize: scala.Double = js.native
    var italic: scala.Boolean = js.native
    @JSName("model")
    var model_Style: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var overrideBackgroundColor: scala.Boolean = js.native
    var overrideBold: scala.Boolean = js.native
    var overrideFontColor: scala.Boolean = js.native
    var overrideFontFamily: scala.Boolean = js.native
    var overrideFontSize: scala.Boolean = js.native
    var overrideItalic: scala.Boolean = js.native
    var textAlign: TextAlign = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/table-(document-template) relevant section in reference guide}
    */
  @js.native
  class Table protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var cellPadding: scala.Double = js.native
    var cellSpacing: scala.Double = js.native
    val columnWeights: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[scala.Double] = js.native
    val rows: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[TableRow] = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/cell-(document-template) relevant section in reference guide}
    */
  @js.native
  class TableCell protected () extends DropZone {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var colSpan: scala.Double = js.native
    var isPartOfSpan: scala.Boolean = js.native
    var rowSpan: scala.Double = js.native
    var style: Style = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/row-(document-template) relevant section in reference guide}
    */
  @js.native
  class TableRow protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val cells: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[TableCell] = js.native
    var conditionSettings: ConditionSettings = js.native
    val containerAsTable: Table = js.native
    @JSName("model")
    var model_TableRow: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/template-grid-(document-template) relevant section in reference guide}
    */
  @js.native
  class TemplateGrid protected () extends Grid {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var evenRowsContents: TemplateGridContents | scala.Null = js.native
    var numberOfColumns: scala.Double = js.native
    var oddRowsContents: TemplateGridContents = js.native
  }
  
  @js.native
  class TemplateGridContents protected () extends DropZone {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class TextAlign ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/title-(document-template) relevant section in reference guide}
    */
  @js.native
  class Title protected () extends Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    var style: Style = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DocumentTemplates`.
    */
  @js.native
  abstract class Widget protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDocumentTemplate: DocumentTemplate = js.native
    val containerAsDropZone: DropZone = js.native
    @JSName("model")
    var model_Widget: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object AttributeWidget extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object BorderStyle extends js.Object {
    var Dashed: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.BorderStyle = js.native
    var Dotted: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.BorderStyle = js.native
    var None: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.BorderStyle = js.native
    var Solid: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.BorderStyle = js.native
  }
  
  /* static members */
  @js.native
  object ConditionSettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConditionSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.ConditionSettings = js.native
    /**
      * Creates and returns a new ConditionSettings instance in the SDK and on the server.
      * The new ConditionSettings will be automatically stored in the 'conditionSettings' property
      * of the parent TableRow element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TableRow): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.ConditionSettings = js.native
  }
  
  /* static members */
  @js.native
  object DataGrid extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataGrid instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGrid = js.native
    /**
      * Creates and returns a new DataGrid instance in the SDK and on the server.
      * The new DataGrid will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGrid = js.native
    /**
      * Creates and returns a new DataGrid instance in the SDK and on the server.
      * The new DataGrid will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGrid = js.native
  }
  
  /* static members */
  @js.native
  object DataGridCell extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataGridCell instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridCell = js.native
    /**
      * Creates and returns a new DataGridCell instance in the SDK and on the server.
      * The new DataGridCell will be automatically stored in the 'evenRowsCell' property
      * of the parent DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderEvenRowsCell(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridCell = js.native
    /**
      * Creates and returns a new DataGridCell instance in the SDK and on the server.
      * The new DataGridCell will be automatically stored in the 'oddRowsCell' property
      * of the parent DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderOddRowsCell(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridCell = js.native
  }
  
  /* static members */
  @js.native
  object DataGridColumn extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataGridColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn = js.native
    /**
      * Creates and returns a new DataGridColumn instance in the SDK and on the server.
      * The new DataGridColumn will be automatically stored in the 'columns' property
      * of the parent DataGrid element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGrid): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn = js.native
  }
  
  /* static members */
  @js.native
  object DataView extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataView instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataView = js.native
    /**
      * Creates and returns a new DataView instance in the SDK and on the server.
      * The new DataView will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataView = js.native
    /**
      * Creates and returns a new DataView instance in the SDK and on the server.
      * The new DataView will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataView = js.native
  }
  
  /* static members */
  @js.native
  object DataViewContents extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataViewContents instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataViewContents = js.native
    /**
      * Creates and returns a new DataViewContents instance in the SDK and on the server.
      * The new DataViewContents will be automatically stored in the 'contents' property
      * of the parent DataView element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataView): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataViewContents = js.native
  }
  
  /* static members */
  @js.native
  object DocumentTemplate extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates a new DocumentTemplate unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate = js.native
  }
  
  /* static members */
  @js.native
  object DocumentTemplateParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DropZone extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DynamicImageViewer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicImageViewer = js.native
    /**
      * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
      * The new DynamicImageViewer will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicImageViewer = js.native
    /**
      * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
      * The new DynamicImageViewer will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicImageViewer = js.native
  }
  
  /* static members */
  @js.native
  object DynamicLabel extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DynamicLabel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicLabel = js.native
    /**
      * Creates and returns a new DynamicLabel instance in the SDK and on the server.
      * The new DynamicLabel will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicLabel = js.native
    /**
      * Creates and returns a new DynamicLabel instance in the SDK and on the server.
      * The new DynamicLabel will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicLabel = js.native
  }
  
  /* static members */
  @js.native
  object EntityWidget extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object FontFamily extends js.Object {
    var Arial: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.FontFamily = js.native
    var Courier: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.FontFamily = js.native
    var Helvetica: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.FontFamily = js.native
    var Tahoma: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.FontFamily = js.native
    var Times: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.FontFamily = js.native
  }
  
  /* static members */
  @js.native
  object Footer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Footer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Footer = js.native
    /**
      * Creates and returns a new Footer instance in the SDK and on the server.
      * The new Footer will be automatically stored in the 'footer' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Footer = js.native
  }
  
  /* static members */
  @js.native
  object Grid extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object GridSortBar extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new GridSortBar instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortBar = js.native
    /**
      * Creates and returns a new GridSortBar instance in the SDK and on the server.
      * The new GridSortBar will be automatically stored in the 'sortBar' property
      * of the parent Grid element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Grid): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortBar = js.native
  }
  
  /* static members */
  @js.native
  object GridSortItem extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new GridSortItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortItem = js.native
    /**
      * Creates and returns a new GridSortItem instance in the SDK and on the server.
      * The new GridSortItem will be automatically stored in the 'sortItems' property
      * of the parent GridSortBar element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortBar): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.GridSortItem = js.native
  }
  
  /* static members */
  @js.native
  object Header extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Header instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Header = js.native
    /**
      * Creates and returns a new Header instance in the SDK and on the server.
      * The new Header will be automatically stored in the 'header' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Header = js.native
  }
  
  /* static members */
  @js.native
  object LineBreak extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new LineBreak instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.LineBreak = js.native
    /**
      * Creates and returns a new LineBreak instance in the SDK and on the server.
      * The new LineBreak will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.LineBreak = js.native
    /**
      * Creates and returns a new LineBreak instance in the SDK and on the server.
      * The new LineBreak will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.LineBreak = js.native
  }
  
  /* static members */
  @js.native
  object PageBreak extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PageBreak instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.PageBreak = js.native
    /**
      * Creates and returns a new PageBreak instance in the SDK and on the server.
      * The new PageBreak will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.PageBreak = js.native
    /**
      * Creates and returns a new PageBreak instance in the SDK and on the server.
      * The new PageBreak will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.PageBreak = js.native
  }
  
  /* static members */
  @js.native
  object StaticImageViewer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticImageViewer = js.native
    /**
      * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
      * The new StaticImageViewer will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticImageViewer = js.native
    /**
      * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
      * The new StaticImageViewer will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticImageViewer = js.native
  }
  
  /* static members */
  @js.native
  object StaticLabel extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StaticLabel instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticLabel = js.native
    /**
      * Creates and returns a new StaticLabel instance in the SDK and on the server.
      * The new StaticLabel will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticLabel = js.native
    /**
      * Creates and returns a new StaticLabel instance in the SDK and on the server.
      * The new StaticLabel will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticLabel = js.native
  }
  
  /* static members */
  @js.native
  object Style extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent DataGridCell element passed as argument.
      */
    def createInDataGridCellUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridCell): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DataGridColumn): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent DynamicLabel element passed as argument.
      */
    def createInDynamicLabelUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DynamicLabel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent Grid element passed as argument.
      */
    def createInGridUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Grid): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent StaticLabel element passed as argument.
      */
    def createInStaticLabelUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.StaticLabel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent TableCell element passed as argument.
      */
    def createInTableCellUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TableCell): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent Table element passed as argument.
      */
    def createInTableUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Table): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
    /**
      * Creates and returns a new Style instance in the SDK and on the server.
      * The new Style will be automatically stored in the 'style' property
      * of the parent Title element passed as argument.
      */
    def createInTitleUnderStyle(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Title): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Style = js.native
  }
  
  /* static members */
  @js.native
  object Table extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Table instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Table = js.native
    /**
      * Creates and returns a new Table instance in the SDK and on the server.
      * The new Table will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Table = js.native
    /**
      * Creates and returns a new Table instance in the SDK and on the server.
      * The new Table will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Table = js.native
  }
  
  /* static members */
  @js.native
  object TableCell extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new TableCell instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TableCell = js.native
    /**
      * Creates and returns a new TableCell instance in the SDK and on the server.
      * The new TableCell will be automatically stored in the 'cells' property
      * of the parent TableRow element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TableRow): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TableCell = js.native
  }
  
  /* static members */
  @js.native
  object TableRow extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new TableRow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TableRow = js.native
    /**
      * Creates and returns a new TableRow instance in the SDK and on the server.
      * The new TableRow will be automatically stored in the 'rows' property
      * of the parent Table element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Table): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TableRow = js.native
  }
  
  /* static members */
  @js.native
  object TemplateGrid extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new TemplateGrid instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGrid = js.native
    /**
      * Creates and returns a new TemplateGrid instance in the SDK and on the server.
      * The new TemplateGrid will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGrid = js.native
    /**
      * Creates and returns a new TemplateGrid instance in the SDK and on the server.
      * The new TemplateGrid will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGrid = js.native
  }
  
  /* static members */
  @js.native
  object TemplateGridContents extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGridContents = js.native
    /**
      * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
      * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
      * of the parent TemplateGrid element passed as argument.
      */
    def createInTemplateGridUnderEvenRowsContents(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGrid): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGridContents = js.native
    /**
      * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
      * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
      * of the parent TemplateGrid element passed as argument.
      */
    def createInTemplateGridUnderOddRowsContents(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGrid): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TemplateGridContents = js.native
  }
  
  /* static members */
  @js.native
  object TextAlign extends js.Object {
    var Center: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TextAlign = js.native
    var Left: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TextAlign = js.native
    var Right: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.TextAlign = js.native
  }
  
  /* static members */
  @js.native
  object Title extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Title instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Title = js.native
    /**
      * Creates and returns a new Title instance in the SDK and on the server.
      * The new Title will be automatically stored in the 'toplevels' property
      * of the parent DocumentTemplate element passed as argument.
      */
    def createInDocumentTemplateUnderToplevels(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplate): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Title = js.native
    /**
      * Creates and returns a new Title instance in the SDK and on the server.
      * The new Title will be automatically stored in the 'widget' property
      * of the parent DropZone element passed as argument.
      */
    def createInDropZoneUnderWidget(container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DropZone): mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.Title = js.native
  }
  
  /* static members */
  @js.native
  object Widget extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  }
  
}

