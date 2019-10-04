package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DataView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Header
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "reports")
@js.native
object reportsNs extends js.Object {
  @js.native
  class AggregateFunctionEnum ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.AggregateFunctionEnum
  
  @js.native
  class AspectRatio ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.AspectRatio
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-grid relevant section in reference guide}
    */
  @js.native
  class BasicReport protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.BasicReport {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class BasicReportAggregate protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.BasicReportAggregate {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class BasicReportColumn protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.BasicReportColumn {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ChartType ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ChartType
  
  @js.native
  class ColumnFormat ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ColumnFormat
  
  @js.native
  class DateRangeFieldEnum ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.DateRangeFieldEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-button relevant section in reference guide}
    */
  @js.native
  class ReportButton protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportButton {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-chart relevant section in reference guide}
    */
  @js.native
  class ReportChart protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportChart {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ReportChartSeries protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportChartSeries {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/date-range-field relevant section in reference guide}
    */
  @js.native
  class ReportDateRangeField protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportDateRangeField {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-date-parameter relevant section in reference guide}
    */
  @js.native
  class ReportDateRangeSelector protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportDateRangeSelector {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-parameter relevant section in reference guide}
    */
  @js.native
  class ReportDropDown protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportDropDown {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-pane relevant section in reference guide}
    *
    * In version 6.10.0: deleted
    */
  @js.native
  class ReportPane protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportPane {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class ReportParameter protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportParameter {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/report-widgets relevant section in reference guide}
    */
  @js.native
  abstract class ReportWidget protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportWidget {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ReportZoomInfo protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportZoomInfo {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ReportZoomMapping protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.reportsNs.ReportZoomMapping {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object AggregateFunctionEnum extends js.Object {
    var Average: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Count: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Maximum: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Minimum: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Sum: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
  }
  
  /* static members */
  @js.native
  object AspectRatio extends js.Object {
    var FourToThree: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio = js.native
    var NineToSixteen: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio = js.native
    var OneToOne: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio = js.native
    var SixteenToNine: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio = js.native
    var ThreeToFour: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio = js.native
    var ThreeToTwo: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio = js.native
    var TwoToThree: typings.mendixmodelsdk.distGenReportsMod.reportsNs.AspectRatio = js.native
  }
  
  /* static members */
  @js.native
  object BasicReport extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
      * Creates and returns a new BasicReport instance in the SDK and on the server.
      * The new BasicReport will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport = js.native
  }
  
  /* static members */
  @js.native
  object BasicReportAggregate extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportAggregate = js.native
    /**
      * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
      * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
      * of the parent BasicReport element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportAggregate = js.native
  }
  
  /* static members */
  @js.native
  object BasicReportColumn extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportColumn = js.native
    /**
      * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
      * The new BasicReportColumn will be automatically stored in the 'columns' property
      * of the parent BasicReport element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport): typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReportColumn = js.native
  }
  
  /* static members */
  @js.native
  object ChartType extends js.Object {
    var Area: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ChartType = js.native
    var HorizontalBars: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ChartType = js.native
    var Lines: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ChartType = js.native
    var VerticalBars: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ChartType = js.native
    var VerticalBars3D: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ChartType = js.native
  }
  
  /* static members */
  @js.native
  object ColumnFormat extends js.Object {
    var Default: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ColumnFormat = js.native
    var MonthName: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ColumnFormat = js.native
    var WeekdayName: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ColumnFormat = js.native
  }
  
  /* static members */
  @js.native
  object DateRangeFieldEnum extends js.Object {
    var Month: typings.mendixmodelsdk.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Period: typings.mendixmodelsdk.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Quarter: typings.mendixmodelsdk.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Week: typings.mendixmodelsdk.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Year: typings.mendixmodelsdk.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
  }
  
  /* static members */
  @js.native
  object ReportButton extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
      * Creates and returns a new ReportButton instance in the SDK and on the server.
      * The new ReportButton will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportButton = js.native
  }
  
  /* static members */
  @js.native
  object ReportChart extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
      * Creates and returns a new ReportChart instance in the SDK and on the server.
      * The new ReportChart will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart = js.native
  }
  
  /* static members */
  @js.native
  object ReportChartSeries extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChartSeries = js.native
    /**
      * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
      * The new ReportChartSeries will be automatically stored in the 'seriess' property
      * of the parent ReportChart element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChart): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportChartSeries = js.native
  }
  
  /* static members */
  @js.native
  object ReportDateRangeField extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeField = js.native
    /**
      * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
      * The new ReportDateRangeField will be automatically stored in the 'fields' property
      * of the parent ReportDateRangeSelector element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeField = js.native
  }
  
  /* static members */
  @js.native
  object ReportDateRangeSelector extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
      * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
      * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
  }
  
  /* static members */
  @js.native
  object ReportDropDown extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
      * Creates and returns a new ReportDropDown instance in the SDK and on the server.
      * The new ReportDropDown will be automatically stored in the 'widgets' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportDropDown = js.native
  }
  
  /* static members */
  @js.native
  object ReportPane extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 6.9.0
      */
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'parameterWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderParameterWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'reportWidget' property
      * of the parent ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInReportPaneUnderReportWidget(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
      * Creates and returns a new ReportPane instance in the SDK and on the server.
      * The new ReportPane will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportPane = js.native
  }
  
  /* static members */
  @js.native
  object ReportParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ReportWidget extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ReportZoomInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportZoomInfo = js.native
    /**
      * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
      * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
      * of the parent BasicReport element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.BasicReport): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportZoomInfo = js.native
  }
  
  /* static members */
  @js.native
  object ReportZoomMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenReportsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportZoomMapping = js.native
    /**
      * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
      * The new ReportZoomMapping will be automatically stored in the 'mappings' property
      * of the parent ReportZoomInfo element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportZoomInfo): typings.mendixmodelsdk.distGenReportsMod.reportsNs.ReportZoomMapping = js.native
  }
  
}

