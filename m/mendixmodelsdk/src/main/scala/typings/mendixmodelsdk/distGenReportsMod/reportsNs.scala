package typings.mendixmodelsdk.distGenReportsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSet
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSetParameter
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IAttribute
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.AlignmentEnum
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DataView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Header
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Layout
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.LayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.LayoutGridColumn
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ListView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ListViewTemplate
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.MasterDetailRegion
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.NativeLayoutContent
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.NavigationListItem
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ScrollContainerRegion
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Snippet
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SplitPane
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TableCell
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TemplateGridContents
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.VerticalFlow
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.WebLayoutContent
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Widget
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.AggregateFunctionEnum
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportAggregate
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportColumn
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ChartType
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ColumnFormat
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.DateRangeFieldEnum
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChartSeries
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeField
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportParameter
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportWidget
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportZoomInfo
import typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportZoomMapping
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports")
@js.native
object reportsNs extends js.Object {
  @js.native
  class AggregateFunctionEnum () extends AbstractEnum
  
  @js.native
  class AspectRatio () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-grid relevant section in reference guide}
    */
  @js.native
  class BasicReport protected () extends ReportWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val aggregates: IList[BasicReportAggregate] = js.native
    val columns: IList[BasicReportColumn] = js.native
    var isPagingEnabled: Boolean = js.native
    var pageSize: Double = js.native
    var showExportButton: Boolean = js.native
    var zoomInfo: ReportZoomInfo = js.native
  }
  
  @js.native
  class BasicReportAggregate protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var aggregateFunction: AggregateFunctionEnum = js.native
    val applicablePerColumn: IList[Boolean] = js.native
    var caption: Text = js.native
    val containerAsBasicReport: BasicReport = js.native
    @JSName("model")
    var model_BasicReportAggregate: IModel = js.native
  }
  
  @js.native
  class BasicReportColumn protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var alignment: AlignmentEnum = js.native
    var caption: Text = js.native
    val containerAsBasicReport: BasicReport = js.native
    var dataSetColumnName: String = js.native
    var format: ColumnFormat = js.native
    @JSName("model")
    var model_BasicReportColumn: IModel = js.native
    var width: Double = js.native
  }
  
  @js.native
  class ChartType () extends AbstractEnum
  
  @js.native
  class ColumnFormat () extends AbstractEnum
  
  @js.native
  class DateRangeFieldEnum () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-button relevant section in reference guide}
    */
  @js.native
  class ReportButton protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: Text = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-chart relevant section in reference guide}
    */
  @js.native
  class ReportChart protected () extends ReportWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var aspectRatio: AspectRatio = js.native
    val seriess: IList[ReportChartSeries] = js.native
    var `type`: ChartType = js.native
    var xAxisCaption: Text = js.native
    var xAxisColumn: String = js.native
    var xAxisFormat: ColumnFormat = js.native
    var yAxisCaption: Text = js.native
    var yAxisMaximum: Double = js.native
    var yAxisMinimum: Double = js.native
    var yAxisPrecision: Double = js.native
    var yAxisUseMinMax: Boolean = js.native
  }
  
  @js.native
  class ReportChartSeries protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: Text = js.native
    val containerAsReportChart: ReportChart = js.native
    var dataSetColumn: String = js.native
    @JSName("model")
    var model_ReportChartSeries: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/date-range-field relevant section in reference guide}
    */
  @js.native
  class ReportDateRangeField protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: Text = js.native
    val containerAsReportDateRangeSelector: ReportDateRangeSelector = js.native
    @JSName("model")
    var model_ReportDateRangeField: IModel = js.native
    var `type`: DateRangeFieldEnum = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-date-parameter relevant section in reference guide}
    */
  @js.native
  class ReportDateRangeSelector protected () extends ReportParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val fields: IList[ReportDateRangeField] = js.native
    var fieldsPerRow: Double = js.native
    var fromCaption: Text = js.native
    var maxYear: Double = js.native
    var minYear: Double = js.native
    var showFromToRange: Boolean = js.native
    var toCaption: Text = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-parameter relevant section in reference guide}
    */
  @js.native
  class ReportDropDown protected () extends ReportParameter {
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
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-pane relevant section in reference guide}
    *
    * In version 6.10.0: deleted
    */
  @js.native
  class ReportPane protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var generateOnLoad: Boolean = js.native
    var parameterWidget: Widget | Null = js.native
    var reportWidget: Widget | Null = js.native
  }
  
  @js.native
  abstract class ReportParameter protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 6.10.0: introduced
      */
    var parameter: IDataSetParameter | Null = js.native
    /**
      * In version 6.10.0: deleted
      */
    var parameterName: String = js.native
    val parameterQualifiedName: String | Null = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-widgets relevant section in reference guide}
    */
  @js.native
  abstract class ReportWidget protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var dataSet: IDataSet | Null = js.native
    val dataSetQualifiedName: String | Null = js.native
    /**
      * In version 6.10.0: introduced
      */
    var generateOnLoad: Boolean = js.native
  }
  
  @js.native
  class ReportZoomInfo protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsBasicReport: BasicReport = js.native
    val mappings: IList[ReportZoomMapping] = js.native
    @JSName("model")
    var model_ReportZoomInfo: IModel = js.native
    var targetPage: IPage | Null = js.native
    val targetPageQualifiedName: String | Null = js.native
  }
  
  @js.native
  class ReportZoomMapping protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsReportZoomInfo: ReportZoomInfo = js.native
    @JSName("model")
    var model_ReportZoomMapping: IModel = js.native
    var sourceReportColumnName: String = js.native
    var targetParameterName: String = js.native
  }
  
  /* static members */
  @js.native
  object AggregateFunctionEnum extends js.Object {
    var Average: AggregateFunctionEnum = js.native
    var Count: AggregateFunctionEnum = js.native
    var Maximum: AggregateFunctionEnum = js.native
    var Minimum: AggregateFunctionEnum = js.native
    var Sum: AggregateFunctionEnum = js.native
  }
  
  /* static members */
  @js.native
  object AspectRatio extends js.Object {
    var FourToThree: AspectRatio = js.native
    var NineToSixteen: AspectRatio = js.native
    var OneToOne: AspectRatio = js.native
    var SixteenToNine: AspectRatio = js.native
    var ThreeToFour: AspectRatio = js.native
    var ThreeToTwo: AspectRatio = js.native
    var TwoToThree: AspectRatio = js.native
  }
  
  /* static members */
  @js.native
  object BasicReport extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: ReportPane): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: ReportPane): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): BasicReport = js.native
  }
  
  /* static members */
  @js.native
  object BasicReportAggregate extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BasicReportAggregate = js.native
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
      * of the parent BasicReport element passed as argument.
      */
    def createIn(container: BasicReport): BasicReportAggregate = js.native
  }
  
  /* static members */
  @js.native
  object BasicReportColumn extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BasicReportColumn = js.native
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * The new BasicReportColumn will be automatically stored in the 'columns' property
      * of the parent BasicReport element passed as argument.
      */
    def createIn(container: BasicReport): BasicReportColumn = js.native
  }
  
  /* static members */
  @js.native
  object ChartType extends js.Object {
    var Area: ChartType = js.native
    var HorizontalBars: ChartType = js.native
    var Lines: ChartType = js.native
    var VerticalBars: ChartType = js.native
    var VerticalBars3D: ChartType = js.native
  }
  
  /* static members */
  @js.native
  object ColumnFormat extends js.Object {
    var Default: ColumnFormat = js.native
    var MonthName: ColumnFormat = js.native
    var WeekdayName: ColumnFormat = js.native
  }
  
  /* static members */
  @js.native
  object DateRangeFieldEnum extends js.Object {
    var Month: DateRangeFieldEnum = js.native
    var Period: DateRangeFieldEnum = js.native
    var Quarter: DateRangeFieldEnum = js.native
    var Week: DateRangeFieldEnum = js.native
    var Year: DateRangeFieldEnum = js.native
  }
  
  /* static members */
  @js.native
  object ReportButton extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: ReportPane): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: ReportPane): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportButton = js.native
  }
  
  /* static members */
  @js.native
  object ReportChart extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: ReportPane): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: ReportPane): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportChart = js.native
  }
  
  /* static members */
  @js.native
  object ReportChartSeries extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportChartSeries = js.native
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * The new ReportChartSeries will be automatically stored in the 'seriess' property
      * of the parent ReportChart element passed as argument.
      */
    def createIn(container: ReportChart): ReportChartSeries = js.native
  }
  
  /* static members */
  @js.native
  object ReportDateRangeField extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportDateRangeField = js.native
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * The new ReportDateRangeField will be automatically stored in the 'fields' property
      * of the parent ReportDateRangeSelector element passed as argument.
      */
    def createIn(container: ReportDateRangeSelector): ReportDateRangeField = js.native
  }
  
  /* static members */
  @js.native
  object ReportDateRangeSelector extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: ReportPane): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: ReportPane): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportDateRangeSelector = js.native
  }
  
  /* static members */
  @js.native
  object ReportDropDown extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: ReportPane): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: ReportPane): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportDropDown = js.native
  }
  
  /* static members */
  @js.native
  object ReportPane extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 6.9.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInDataViewUnderWidget(container: DataView): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInHeaderUnderLeftWidget(container: Header): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInHeaderUnderRightWidget(container: Header): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInLayoutUnderWidget(container: Layout): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInListViewUnderWidget(container: ListView): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: ReportPane): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: ReportPane): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInSnippetUnderWidget(container: Snippet): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInTabPageUnderWidget(container: TabPage): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInTableCellUnderWidget(container: TableCell): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportPane = js.native
  }
  
  /* static members */
  @js.native
  object ReportParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ReportWidget extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ReportZoomInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportZoomInfo = js.native
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
      * of the parent BasicReport element passed as argument.
      */
    def createIn(container: BasicReport): ReportZoomInfo = js.native
  }
  
  /* static members */
  @js.native
  object ReportZoomMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ReportZoomMapping = js.native
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * The new ReportZoomMapping will be automatically stored in the 'mappings' property
      * of the parent ReportZoomInfo element passed as argument.
      */
    def createIn(container: ReportZoomInfo): ReportZoomMapping = js.native
  }
  
}

