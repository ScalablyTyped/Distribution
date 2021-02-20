package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.datasetsMod.datasets.IDataSet
import typings.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.AlignmentEnum
import typings.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.pagesMod.pages.DataView
import typings.mendixmodelsdk.pagesMod.pages.DivContainer
import typings.mendixmodelsdk.pagesMod.pages.GroupBox
import typings.mendixmodelsdk.pagesMod.pages.Header
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.pagesMod.pages.Layout
import typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.pagesMod.pages.ListView
import typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.pagesMod.pages.MasterDetailRegion
import typings.mendixmodelsdk.pagesMod.pages.NativeLayoutContent
import typings.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.pagesMod.pages.Snippet
import typings.mendixmodelsdk.pagesMod.pages.SplitPane
import typings.mendixmodelsdk.pagesMod.pages.TabPage
import typings.mendixmodelsdk.pagesMod.pages.TableCell
import typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.pagesMod.pages.VerticalFlow
import typings.mendixmodelsdk.pagesMod.pages.WebLayoutContent
import typings.mendixmodelsdk.pagesMod.pages.Widget
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/reports", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object reports {
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AggregateFunctionEnum")
    @js.native
    class AggregateFunctionEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object AggregateFunctionEnum {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AggregateFunctionEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AggregateFunctionEnum.Average")
      @js.native
      def Average: AggregateFunctionEnum = js.native
      @scala.inline
      def Average_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Average")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AggregateFunctionEnum.Count")
      @js.native
      def Count: AggregateFunctionEnum = js.native
      @scala.inline
      def Count_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Count")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AggregateFunctionEnum.Maximum")
      @js.native
      def Maximum: AggregateFunctionEnum = js.native
      @scala.inline
      def Maximum_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AggregateFunctionEnum.Minimum")
      @js.native
      def Minimum: AggregateFunctionEnum = js.native
      @scala.inline
      def Minimum_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AggregateFunctionEnum.Sum")
      @js.native
      def Sum: AggregateFunctionEnum = js.native
      @scala.inline
      def Sum_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sum")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio")
    @js.native
    class AspectRatio protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object AspectRatio {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio.FourToThree")
      @js.native
      def FourToThree: AspectRatio = js.native
      @scala.inline
      def FourToThree_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FourToThree")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio.NineToSixteen")
      @js.native
      def NineToSixteen: AspectRatio = js.native
      @scala.inline
      def NineToSixteen_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NineToSixteen")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio.OneToOne")
      @js.native
      def OneToOne: AspectRatio = js.native
      @scala.inline
      def OneToOne_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneToOne")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio.SixteenToNine")
      @js.native
      def SixteenToNine: AspectRatio = js.native
      @scala.inline
      def SixteenToNine_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SixteenToNine")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio.ThreeToFour")
      @js.native
      def ThreeToFour: AspectRatio = js.native
      @scala.inline
      def ThreeToFour_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToFour")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio.ThreeToTwo")
      @js.native
      def ThreeToTwo: AspectRatio = js.native
      @scala.inline
      def ThreeToTwo_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToTwo")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.AspectRatio.TwoToThree")
      @js.native
      def TwoToThree: AspectRatio = js.native
      @scala.inline
      def TwoToThree_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoToThree")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-grid relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport")
    @js.native
    class BasicReport protected () extends ReportWidget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def aggregates: IList[BasicReportAggregate] = js.native
      
      def columns: IList[BasicReportColumn] = js.native
      
      def isPagingEnabled: Boolean = js.native
      def isPagingEnabled_=(newValue: Boolean): Unit = js.native
      
      def pageSize: Double = js.native
      def pageSize_=(newValue: Double): Unit = js.native
      
      def showExportButton: Boolean = js.native
      def showExportButton_=(newValue: Boolean): Unit = js.native
      
      def zoomInfo: ReportZoomInfo = js.native
      def zoomInfo_=(newValue: ReportZoomInfo): Unit = js.native
    }
    object BasicReport {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.create")
      @js.native
      def create(model: IModel): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInBuildingBlockUnderWidget")
      @js.native
      def createInBuildingBlockUnderWidget(container: BuildingBlock): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInBuildingBlockUnderWidgets")
      @js.native
      def createInBuildingBlockUnderWidgets(container: BuildingBlock): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInDataViewUnderFooterWidget")
      @js.native
      def createInDataViewUnderFooterWidget(container: DataView): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInDataViewUnderFooterWidgets")
      @js.native
      def createInDataViewUnderFooterWidgets(container: DataView): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInDataViewUnderWidget")
      @js.native
      def createInDataViewUnderWidget(container: DataView): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInDataViewUnderWidgets")
      @js.native
      def createInDataViewUnderWidgets(container: DataView): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInDivContainerUnderWidget")
      @js.native
      def createInDivContainerUnderWidget(container: DivContainer): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInDivContainerUnderWidgets")
      @js.native
      def createInDivContainerUnderWidgets(container: DivContainer): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInGroupBoxUnderWidget")
      @js.native
      def createInGroupBoxUnderWidget(container: GroupBox): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInGroupBoxUnderWidgets")
      @js.native
      def createInGroupBoxUnderWidgets(container: GroupBox): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInHeaderUnderLeftWidget")
      @js.native
      def createInHeaderUnderLeftWidget(container: Header): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInHeaderUnderLeftWidgets")
      @js.native
      def createInHeaderUnderLeftWidgets(container: Header): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInHeaderUnderRightWidget")
      @js.native
      def createInHeaderUnderRightWidget(container: Header): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInHeaderUnderRightWidgets")
      @js.native
      def createInHeaderUnderRightWidgets(container: Header): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInLayoutCallArgumentUnderWidget")
      @js.native
      def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInLayoutCallArgumentUnderWidgets")
      @js.native
      def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInLayoutGridColumnUnderWidget")
      @js.native
      def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInLayoutGridColumnUnderWidgets")
      @js.native
      def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInLayoutUnderWidget")
      @js.native
      def createInLayoutUnderWidget(container: Layout): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInLayoutUnderWidgets")
      @js.native
      def createInLayoutUnderWidgets(container: Layout): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInListViewTemplateUnderWidget")
      @js.native
      def createInListViewTemplateUnderWidget(container: ListViewTemplate): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInListViewTemplateUnderWidgets")
      @js.native
      def createInListViewTemplateUnderWidgets(container: ListViewTemplate): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInListViewUnderWidget")
      @js.native
      def createInListViewUnderWidget(container: ListView): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInListViewUnderWidgets")
      @js.native
      def createInListViewUnderWidgets(container: ListView): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInMasterDetailRegionUnderWidget")
      @js.native
      def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInNativeLayoutCallArgumentUnderWidgets")
      @js.native
      def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInNativeLayoutContentUnderSidebarWidgets")
      @js.native
      def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInNativeLayoutContentUnderWidgets")
      @js.native
      def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInNativeLayoutUnderHeaderWidget")
      @js.native
      def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInNativeLayoutUnderWidgets")
      @js.native
      def createInNativeLayoutUnderWidgets(container: NativeLayout): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInNavigationListItemUnderWidget")
      @js.native
      def createInNavigationListItemUnderWidget(container: NavigationListItem): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInNavigationListItemUnderWidgets")
      @js.native
      def createInNavigationListItemUnderWidgets(container: NavigationListItem): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInReportPaneUnderParameterWidget")
      @js.native
      def createInReportPaneUnderParameterWidget(container: ReportPane): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInReportPaneUnderReportWidget")
      @js.native
      def createInReportPaneUnderReportWidget(container: ReportPane): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInScrollContainerRegionUnderWidget")
      @js.native
      def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInScrollContainerRegionUnderWidgets")
      @js.native
      def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInSnippetUnderWidget")
      @js.native
      def createInSnippetUnderWidget(container: Snippet): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInSnippetUnderWidgets")
      @js.native
      def createInSnippetUnderWidgets(container: Snippet): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInSplitPaneUnderFirstWidget")
      @js.native
      def createInSplitPaneUnderFirstWidget(container: SplitPane): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInSplitPaneUnderFirstWidgets")
      @js.native
      def createInSplitPaneUnderFirstWidgets(container: SplitPane): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInSplitPaneUnderSecondWidget")
      @js.native
      def createInSplitPaneUnderSecondWidget(container: SplitPane): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInSplitPaneUnderSecondWidgets")
      @js.native
      def createInSplitPaneUnderSecondWidgets(container: SplitPane): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInTabPageUnderWidget")
      @js.native
      def createInTabPageUnderWidget(container: TabPage): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInTabPageUnderWidgets")
      @js.native
      def createInTabPageUnderWidgets(container: TabPage): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInTableCellUnderWidget")
      @js.native
      def createInTableCellUnderWidget(container: TableCell): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInTableCellUnderWidgets")
      @js.native
      def createInTableCellUnderWidgets(container: TableCell): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInTemplateGridContentsUnderWidget")
      @js.native
      def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInTemplateGridContentsUnderWidgets")
      @js.native
      def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInVerticalFlowUnderWidgets")
      @js.native
      def createInVerticalFlowUnderWidgets(container: VerticalFlow): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInWebLayoutContentUnderWidgets")
      @js.native
      def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): BasicReport = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.createInWidgetValueUnderWidgets")
      @js.native
      def createInWidgetValueUnderWidgets(container: WidgetValue): BasicReport = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReport.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate")
    @js.native
    class BasicReportAggregate protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def aggregateFunction: AggregateFunctionEnum = js.native
      def aggregateFunction_=(newValue: AggregateFunctionEnum): Unit = js.native
      
      def applicablePerColumn: IList[Boolean] = js.native
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsBasicReport: BasicReport = js.native
    }
    object BasicReportAggregate {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate.create")
      @js.native
      def create(model: IModel): BasicReportAggregate = js.native
      
      /**
        * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
        * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
        * of the parent BasicReport element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate.createIn")
      @js.native
      def createIn(container: BasicReport): BasicReportAggregate = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportAggregate.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn")
    @js.native
    class BasicReportColumn protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def alignment: AlignmentEnum = js.native
      def alignment_=(newValue: AlignmentEnum): Unit = js.native
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsBasicReport: BasicReport = js.native
      
      def dataSetColumnName: String = js.native
      def dataSetColumnName_=(newValue: String): Unit = js.native
      
      def format: ColumnFormat = js.native
      def format_=(newValue: ColumnFormat): Unit = js.native
      
      def width: Double = js.native
      def width_=(newValue: Double): Unit = js.native
    }
    object BasicReportColumn {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn.create")
      @js.native
      def create(model: IModel): BasicReportColumn = js.native
      
      /**
        * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
        * The new BasicReportColumn will be automatically stored in the 'columns' property
        * of the parent BasicReport element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn.createIn")
      @js.native
      def createIn(container: BasicReport): BasicReportColumn = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.BasicReportColumn.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ChartType")
    @js.native
    class ChartType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ChartType {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ChartType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ChartType.Area")
      @js.native
      def Area: ChartType = js.native
      @scala.inline
      def Area_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Area")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ChartType.HorizontalBars")
      @js.native
      def HorizontalBars: ChartType = js.native
      @scala.inline
      def HorizontalBars_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HorizontalBars")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ChartType.Lines")
      @js.native
      def Lines: ChartType = js.native
      @scala.inline
      def Lines_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lines")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ChartType.VerticalBars")
      @js.native
      def VerticalBars: ChartType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ChartType.VerticalBars3D")
      @js.native
      def VerticalBars3D: ChartType = js.native
      @scala.inline
      def VerticalBars3D_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars3D")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def VerticalBars_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ColumnFormat")
    @js.native
    class ColumnFormat protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ColumnFormat {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ColumnFormat")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ColumnFormat.Default")
      @js.native
      def Default: ColumnFormat = js.native
      @scala.inline
      def Default_=(x: ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ColumnFormat.MonthName")
      @js.native
      def MonthName: ColumnFormat = js.native
      @scala.inline
      def MonthName_=(x: ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ColumnFormat.WeekdayName")
      @js.native
      def WeekdayName: ColumnFormat = js.native
      @scala.inline
      def WeekdayName_=(x: ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeekdayName")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.DateRangeFieldEnum")
    @js.native
    class DateRangeFieldEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object DateRangeFieldEnum {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.DateRangeFieldEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.DateRangeFieldEnum.Month")
      @js.native
      def Month: DateRangeFieldEnum = js.native
      @scala.inline
      def Month_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.DateRangeFieldEnum.Period")
      @js.native
      def Period: DateRangeFieldEnum = js.native
      @scala.inline
      def Period_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.DateRangeFieldEnum.Quarter")
      @js.native
      def Quarter: DateRangeFieldEnum = js.native
      @scala.inline
      def Quarter_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.DateRangeFieldEnum.Week")
      @js.native
      def Week: DateRangeFieldEnum = js.native
      @scala.inline
      def Week_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.DateRangeFieldEnum.Year")
      @js.native
      def Year: DateRangeFieldEnum = js.native
      @scala.inline
      def Year_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-button relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton")
    @js.native
    class ReportButton protected () extends Widget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
    }
    object ReportButton {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.create")
      @js.native
      def create(model: IModel): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInBuildingBlockUnderWidget")
      @js.native
      def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInBuildingBlockUnderWidgets")
      @js.native
      def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInDataViewUnderFooterWidget")
      @js.native
      def createInDataViewUnderFooterWidget(container: DataView): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInDataViewUnderFooterWidgets")
      @js.native
      def createInDataViewUnderFooterWidgets(container: DataView): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInDataViewUnderWidget")
      @js.native
      def createInDataViewUnderWidget(container: DataView): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInDataViewUnderWidgets")
      @js.native
      def createInDataViewUnderWidgets(container: DataView): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInDivContainerUnderWidget")
      @js.native
      def createInDivContainerUnderWidget(container: DivContainer): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInDivContainerUnderWidgets")
      @js.native
      def createInDivContainerUnderWidgets(container: DivContainer): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInGroupBoxUnderWidget")
      @js.native
      def createInGroupBoxUnderWidget(container: GroupBox): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInGroupBoxUnderWidgets")
      @js.native
      def createInGroupBoxUnderWidgets(container: GroupBox): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInHeaderUnderLeftWidget")
      @js.native
      def createInHeaderUnderLeftWidget(container: Header): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInHeaderUnderLeftWidgets")
      @js.native
      def createInHeaderUnderLeftWidgets(container: Header): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInHeaderUnderRightWidget")
      @js.native
      def createInHeaderUnderRightWidget(container: Header): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInHeaderUnderRightWidgets")
      @js.native
      def createInHeaderUnderRightWidgets(container: Header): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInLayoutCallArgumentUnderWidget")
      @js.native
      def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInLayoutCallArgumentUnderWidgets")
      @js.native
      def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInLayoutGridColumnUnderWidget")
      @js.native
      def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInLayoutGridColumnUnderWidgets")
      @js.native
      def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInLayoutUnderWidget")
      @js.native
      def createInLayoutUnderWidget(container: Layout): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInLayoutUnderWidgets")
      @js.native
      def createInLayoutUnderWidgets(container: Layout): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInListViewTemplateUnderWidget")
      @js.native
      def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInListViewTemplateUnderWidgets")
      @js.native
      def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInListViewUnderWidget")
      @js.native
      def createInListViewUnderWidget(container: ListView): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInListViewUnderWidgets")
      @js.native
      def createInListViewUnderWidgets(container: ListView): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInMasterDetailRegionUnderWidget")
      @js.native
      def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInNativeLayoutCallArgumentUnderWidgets")
      @js.native
      def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInNativeLayoutContentUnderSidebarWidgets")
      @js.native
      def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInNativeLayoutContentUnderWidgets")
      @js.native
      def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInNativeLayoutUnderHeaderWidget")
      @js.native
      def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInNativeLayoutUnderWidgets")
      @js.native
      def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInNavigationListItemUnderWidget")
      @js.native
      def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInNavigationListItemUnderWidgets")
      @js.native
      def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInReportPaneUnderParameterWidget")
      @js.native
      def createInReportPaneUnderParameterWidget(container: ReportPane): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInReportPaneUnderReportWidget")
      @js.native
      def createInReportPaneUnderReportWidget(container: ReportPane): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInScrollContainerRegionUnderWidget")
      @js.native
      def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInScrollContainerRegionUnderWidgets")
      @js.native
      def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInSnippetUnderWidget")
      @js.native
      def createInSnippetUnderWidget(container: Snippet): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInSnippetUnderWidgets")
      @js.native
      def createInSnippetUnderWidgets(container: Snippet): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInSplitPaneUnderFirstWidget")
      @js.native
      def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInSplitPaneUnderFirstWidgets")
      @js.native
      def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInSplitPaneUnderSecondWidget")
      @js.native
      def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInSplitPaneUnderSecondWidgets")
      @js.native
      def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInTabPageUnderWidget")
      @js.native
      def createInTabPageUnderWidget(container: TabPage): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInTabPageUnderWidgets")
      @js.native
      def createInTabPageUnderWidgets(container: TabPage): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInTableCellUnderWidget")
      @js.native
      def createInTableCellUnderWidget(container: TableCell): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInTableCellUnderWidgets")
      @js.native
      def createInTableCellUnderWidgets(container: TableCell): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInTemplateGridContentsUnderWidget")
      @js.native
      def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInTemplateGridContentsUnderWidgets")
      @js.native
      def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInVerticalFlowUnderWidgets")
      @js.native
      def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInWebLayoutContentUnderWidgets")
      @js.native
      def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportButton = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.createInWidgetValueUnderWidgets")
      @js.native
      def createInWidgetValueUnderWidgets(container: WidgetValue): ReportButton = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportButton.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/report-chart relevant document}
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart")
    @js.native
    class ReportChart protected () extends ReportWidget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def aspectRatio: AspectRatio = js.native
      def aspectRatio_=(newValue: AspectRatio): Unit = js.native
      
      def seriess: IList[ReportChartSeries] = js.native
      
      def `type`: ChartType = js.native
      def type_=(newValue: ChartType): Unit = js.native
      
      def xAxisCaption: Text = js.native
      def xAxisCaption_=(newValue: Text): Unit = js.native
      
      def xAxisColumn: String = js.native
      def xAxisColumn_=(newValue: String): Unit = js.native
      
      def xAxisFormat: ColumnFormat = js.native
      def xAxisFormat_=(newValue: ColumnFormat): Unit = js.native
      
      def yAxisCaption: Text = js.native
      def yAxisCaption_=(newValue: Text): Unit = js.native
      
      def yAxisMaximum: Double = js.native
      def yAxisMaximum_=(newValue: Double): Unit = js.native
      
      def yAxisMinimum: Double = js.native
      def yAxisMinimum_=(newValue: Double): Unit = js.native
      
      def yAxisPrecision: Double = js.native
      def yAxisPrecision_=(newValue: Double): Unit = js.native
      
      def yAxisUseMinMax: Boolean = js.native
      def yAxisUseMinMax_=(newValue: Boolean): Unit = js.native
    }
    object ReportChart {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.create")
      @js.native
      def create(model: IModel): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInBuildingBlockUnderWidget")
      @js.native
      def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInBuildingBlockUnderWidgets")
      @js.native
      def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInDataViewUnderFooterWidget")
      @js.native
      def createInDataViewUnderFooterWidget(container: DataView): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInDataViewUnderFooterWidgets")
      @js.native
      def createInDataViewUnderFooterWidgets(container: DataView): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInDataViewUnderWidget")
      @js.native
      def createInDataViewUnderWidget(container: DataView): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInDataViewUnderWidgets")
      @js.native
      def createInDataViewUnderWidgets(container: DataView): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInDivContainerUnderWidget")
      @js.native
      def createInDivContainerUnderWidget(container: DivContainer): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInDivContainerUnderWidgets")
      @js.native
      def createInDivContainerUnderWidgets(container: DivContainer): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInGroupBoxUnderWidget")
      @js.native
      def createInGroupBoxUnderWidget(container: GroupBox): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInGroupBoxUnderWidgets")
      @js.native
      def createInGroupBoxUnderWidgets(container: GroupBox): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInHeaderUnderLeftWidget")
      @js.native
      def createInHeaderUnderLeftWidget(container: Header): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInHeaderUnderLeftWidgets")
      @js.native
      def createInHeaderUnderLeftWidgets(container: Header): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInHeaderUnderRightWidget")
      @js.native
      def createInHeaderUnderRightWidget(container: Header): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInHeaderUnderRightWidgets")
      @js.native
      def createInHeaderUnderRightWidgets(container: Header): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInLayoutCallArgumentUnderWidget")
      @js.native
      def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInLayoutCallArgumentUnderWidgets")
      @js.native
      def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInLayoutGridColumnUnderWidget")
      @js.native
      def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInLayoutGridColumnUnderWidgets")
      @js.native
      def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInLayoutUnderWidget")
      @js.native
      def createInLayoutUnderWidget(container: Layout): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInLayoutUnderWidgets")
      @js.native
      def createInLayoutUnderWidgets(container: Layout): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInListViewTemplateUnderWidget")
      @js.native
      def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInListViewTemplateUnderWidgets")
      @js.native
      def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInListViewUnderWidget")
      @js.native
      def createInListViewUnderWidget(container: ListView): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInListViewUnderWidgets")
      @js.native
      def createInListViewUnderWidgets(container: ListView): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInMasterDetailRegionUnderWidget")
      @js.native
      def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInNativeLayoutCallArgumentUnderWidgets")
      @js.native
      def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInNativeLayoutContentUnderSidebarWidgets")
      @js.native
      def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInNativeLayoutContentUnderWidgets")
      @js.native
      def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInNativeLayoutUnderHeaderWidget")
      @js.native
      def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInNativeLayoutUnderWidgets")
      @js.native
      def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInNavigationListItemUnderWidget")
      @js.native
      def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInNavigationListItemUnderWidgets")
      @js.native
      def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInReportPaneUnderParameterWidget")
      @js.native
      def createInReportPaneUnderParameterWidget(container: ReportPane): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInReportPaneUnderReportWidget")
      @js.native
      def createInReportPaneUnderReportWidget(container: ReportPane): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInScrollContainerRegionUnderWidget")
      @js.native
      def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInScrollContainerRegionUnderWidgets")
      @js.native
      def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInSnippetUnderWidget")
      @js.native
      def createInSnippetUnderWidget(container: Snippet): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInSnippetUnderWidgets")
      @js.native
      def createInSnippetUnderWidgets(container: Snippet): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInSplitPaneUnderFirstWidget")
      @js.native
      def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInSplitPaneUnderFirstWidgets")
      @js.native
      def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInSplitPaneUnderSecondWidget")
      @js.native
      def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInSplitPaneUnderSecondWidgets")
      @js.native
      def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInTabPageUnderWidget")
      @js.native
      def createInTabPageUnderWidget(container: TabPage): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInTabPageUnderWidgets")
      @js.native
      def createInTabPageUnderWidgets(container: TabPage): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInTableCellUnderWidget")
      @js.native
      def createInTableCellUnderWidget(container: TableCell): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInTableCellUnderWidgets")
      @js.native
      def createInTableCellUnderWidgets(container: TableCell): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInTemplateGridContentsUnderWidget")
      @js.native
      def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInTemplateGridContentsUnderWidgets")
      @js.native
      def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInVerticalFlowUnderWidgets")
      @js.native
      def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInWebLayoutContentUnderWidgets")
      @js.native
      def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportChart = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.createInWidgetValueUnderWidgets")
      @js.native
      def createInWidgetValueUnderWidgets(container: WidgetValue): ReportChart = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChart.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries")
    @js.native
    class ReportChartSeries protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsReportChart: ReportChart = js.native
      
      def dataSetColumn: String = js.native
      def dataSetColumn_=(newValue: String): Unit = js.native
    }
    object ReportChartSeries {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries.create")
      @js.native
      def create(model: IModel): ReportChartSeries = js.native
      
      /**
        * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
        * The new ReportChartSeries will be automatically stored in the 'seriess' property
        * of the parent ReportChart element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries.createIn")
      @js.native
      def createIn(container: ReportChart): ReportChartSeries = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportChartSeries.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/date-range-field relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField")
    @js.native
    class ReportDateRangeField protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsReportDateRangeSelector: ReportDateRangeSelector = js.native
      
      def `type`: DateRangeFieldEnum = js.native
      def type_=(newValue: DateRangeFieldEnum): Unit = js.native
    }
    object ReportDateRangeField {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField.create")
      @js.native
      def create(model: IModel): ReportDateRangeField = js.native
      
      /**
        * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
        * The new ReportDateRangeField will be automatically stored in the 'fields' property
        * of the parent ReportDateRangeSelector element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField.createIn")
      @js.native
      def createIn(container: ReportDateRangeSelector): ReportDateRangeField = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeField.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-date-parameter relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector")
    @js.native
    class ReportDateRangeSelector protected () extends ReportParameter {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def fields: IList[ReportDateRangeField] = js.native
      
      def fieldsPerRow: Double = js.native
      def fieldsPerRow_=(newValue: Double): Unit = js.native
      
      def fromCaption: Text = js.native
      def fromCaption_=(newValue: Text): Unit = js.native
      
      def maxYear: Double = js.native
      def maxYear_=(newValue: Double): Unit = js.native
      
      def minYear: Double = js.native
      def minYear_=(newValue: Double): Unit = js.native
      
      def showFromToRange: Boolean = js.native
      def showFromToRange_=(newValue: Boolean): Unit = js.native
      
      def toCaption: Text = js.native
      def toCaption_=(newValue: Text): Unit = js.native
    }
    object ReportDateRangeSelector {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.create")
      @js.native
      def create(model: IModel): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInBuildingBlockUnderWidget")
      @js.native
      def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInBuildingBlockUnderWidgets")
      @js.native
      def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInDataViewUnderFooterWidget")
      @js.native
      def createInDataViewUnderFooterWidget(container: DataView): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInDataViewUnderFooterWidgets")
      @js.native
      def createInDataViewUnderFooterWidgets(container: DataView): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInDataViewUnderWidget")
      @js.native
      def createInDataViewUnderWidget(container: DataView): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInDataViewUnderWidgets")
      @js.native
      def createInDataViewUnderWidgets(container: DataView): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInDivContainerUnderWidget")
      @js.native
      def createInDivContainerUnderWidget(container: DivContainer): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInDivContainerUnderWidgets")
      @js.native
      def createInDivContainerUnderWidgets(container: DivContainer): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInGroupBoxUnderWidget")
      @js.native
      def createInGroupBoxUnderWidget(container: GroupBox): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInGroupBoxUnderWidgets")
      @js.native
      def createInGroupBoxUnderWidgets(container: GroupBox): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInHeaderUnderLeftWidget")
      @js.native
      def createInHeaderUnderLeftWidget(container: Header): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInHeaderUnderLeftWidgets")
      @js.native
      def createInHeaderUnderLeftWidgets(container: Header): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInHeaderUnderRightWidget")
      @js.native
      def createInHeaderUnderRightWidget(container: Header): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInHeaderUnderRightWidgets")
      @js.native
      def createInHeaderUnderRightWidgets(container: Header): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInLayoutCallArgumentUnderWidget")
      @js.native
      def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInLayoutCallArgumentUnderWidgets")
      @js.native
      def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInLayoutGridColumnUnderWidget")
      @js.native
      def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInLayoutGridColumnUnderWidgets")
      @js.native
      def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInLayoutUnderWidget")
      @js.native
      def createInLayoutUnderWidget(container: Layout): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInLayoutUnderWidgets")
      @js.native
      def createInLayoutUnderWidgets(container: Layout): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInListViewTemplateUnderWidget")
      @js.native
      def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInListViewTemplateUnderWidgets")
      @js.native
      def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInListViewUnderWidget")
      @js.native
      def createInListViewUnderWidget(container: ListView): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInListViewUnderWidgets")
      @js.native
      def createInListViewUnderWidgets(container: ListView): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInMasterDetailRegionUnderWidget")
      @js.native
      def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInNativeLayoutCallArgumentUnderWidgets")
      @js.native
      def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInNativeLayoutContentUnderSidebarWidgets")
      @js.native
      def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInNativeLayoutContentUnderWidgets")
      @js.native
      def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInNativeLayoutUnderHeaderWidget")
      @js.native
      def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInNativeLayoutUnderWidgets")
      @js.native
      def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInNavigationListItemUnderWidget")
      @js.native
      def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInNavigationListItemUnderWidgets")
      @js.native
      def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInReportPaneUnderParameterWidget")
      @js.native
      def createInReportPaneUnderParameterWidget(container: ReportPane): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInReportPaneUnderReportWidget")
      @js.native
      def createInReportPaneUnderReportWidget(container: ReportPane): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInScrollContainerRegionUnderWidget")
      @js.native
      def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInScrollContainerRegionUnderWidgets")
      @js.native
      def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInSnippetUnderWidget")
      @js.native
      def createInSnippetUnderWidget(container: Snippet): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInSnippetUnderWidgets")
      @js.native
      def createInSnippetUnderWidgets(container: Snippet): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInSplitPaneUnderFirstWidget")
      @js.native
      def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInSplitPaneUnderFirstWidgets")
      @js.native
      def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInSplitPaneUnderSecondWidget")
      @js.native
      def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInSplitPaneUnderSecondWidgets")
      @js.native
      def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInTabPageUnderWidget")
      @js.native
      def createInTabPageUnderWidget(container: TabPage): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInTabPageUnderWidgets")
      @js.native
      def createInTabPageUnderWidgets(container: TabPage): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInTableCellUnderWidget")
      @js.native
      def createInTableCellUnderWidget(container: TableCell): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInTableCellUnderWidgets")
      @js.native
      def createInTableCellUnderWidgets(container: TableCell): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInTemplateGridContentsUnderWidget")
      @js.native
      def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInTemplateGridContentsUnderWidgets")
      @js.native
      def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInVerticalFlowUnderWidgets")
      @js.native
      def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInWebLayoutContentUnderWidgets")
      @js.native
      def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportDateRangeSelector = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.createInWidgetValueUnderWidgets")
      @js.native
      def createInWidgetValueUnderWidgets(container: WidgetValue): ReportDateRangeSelector = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDateRangeSelector.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-parameter relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown")
    @js.native
    class ReportDropDown protected () extends ReportParameter {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attribute: IAttribute | Null = js.native
      
      def attributeQualifiedName: String | Null = js.native
      
      def attribute_=(newValue: IAttribute | Null): Unit = js.native
    }
    object ReportDropDown {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.create")
      @js.native
      def create(model: IModel): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInBuildingBlockUnderWidget")
      @js.native
      def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInBuildingBlockUnderWidgets")
      @js.native
      def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInDataViewUnderFooterWidget")
      @js.native
      def createInDataViewUnderFooterWidget(container: DataView): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInDataViewUnderFooterWidgets")
      @js.native
      def createInDataViewUnderFooterWidgets(container: DataView): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInDataViewUnderWidget")
      @js.native
      def createInDataViewUnderWidget(container: DataView): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInDataViewUnderWidgets")
      @js.native
      def createInDataViewUnderWidgets(container: DataView): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInDivContainerUnderWidget")
      @js.native
      def createInDivContainerUnderWidget(container: DivContainer): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInDivContainerUnderWidgets")
      @js.native
      def createInDivContainerUnderWidgets(container: DivContainer): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInGroupBoxUnderWidget")
      @js.native
      def createInGroupBoxUnderWidget(container: GroupBox): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInGroupBoxUnderWidgets")
      @js.native
      def createInGroupBoxUnderWidgets(container: GroupBox): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInHeaderUnderLeftWidget")
      @js.native
      def createInHeaderUnderLeftWidget(container: Header): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInHeaderUnderLeftWidgets")
      @js.native
      def createInHeaderUnderLeftWidgets(container: Header): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInHeaderUnderRightWidget")
      @js.native
      def createInHeaderUnderRightWidget(container: Header): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInHeaderUnderRightWidgets")
      @js.native
      def createInHeaderUnderRightWidgets(container: Header): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInLayoutCallArgumentUnderWidget")
      @js.native
      def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInLayoutCallArgumentUnderWidgets")
      @js.native
      def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInLayoutGridColumnUnderWidget")
      @js.native
      def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInLayoutGridColumnUnderWidgets")
      @js.native
      def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInLayoutUnderWidget")
      @js.native
      def createInLayoutUnderWidget(container: Layout): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInLayoutUnderWidgets")
      @js.native
      def createInLayoutUnderWidgets(container: Layout): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInListViewTemplateUnderWidget")
      @js.native
      def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInListViewTemplateUnderWidgets")
      @js.native
      def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInListViewUnderWidget")
      @js.native
      def createInListViewUnderWidget(container: ListView): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInListViewUnderWidgets")
      @js.native
      def createInListViewUnderWidgets(container: ListView): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInMasterDetailRegionUnderWidget")
      @js.native
      def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInNativeLayoutCallArgumentUnderWidgets")
      @js.native
      def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInNativeLayoutContentUnderSidebarWidgets")
      @js.native
      def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInNativeLayoutContentUnderWidgets")
      @js.native
      def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInNativeLayoutUnderHeaderWidget")
      @js.native
      def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInNativeLayoutUnderWidgets")
      @js.native
      def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInNavigationListItemUnderWidget")
      @js.native
      def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInNavigationListItemUnderWidgets")
      @js.native
      def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInReportPaneUnderParameterWidget")
      @js.native
      def createInReportPaneUnderParameterWidget(container: ReportPane): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInReportPaneUnderReportWidget")
      @js.native
      def createInReportPaneUnderReportWidget(container: ReportPane): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInScrollContainerRegionUnderWidget")
      @js.native
      def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInScrollContainerRegionUnderWidgets")
      @js.native
      def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInSnippetUnderWidget")
      @js.native
      def createInSnippetUnderWidget(container: Snippet): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInSnippetUnderWidgets")
      @js.native
      def createInSnippetUnderWidgets(container: Snippet): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInSplitPaneUnderFirstWidget")
      @js.native
      def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInSplitPaneUnderFirstWidgets")
      @js.native
      def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInSplitPaneUnderSecondWidget")
      @js.native
      def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInSplitPaneUnderSecondWidgets")
      @js.native
      def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInTabPageUnderWidget")
      @js.native
      def createInTabPageUnderWidget(container: TabPage): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInTabPageUnderWidgets")
      @js.native
      def createInTabPageUnderWidgets(container: TabPage): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInTableCellUnderWidget")
      @js.native
      def createInTableCellUnderWidget(container: TableCell): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInTableCellUnderWidgets")
      @js.native
      def createInTableCellUnderWidgets(container: TableCell): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInTemplateGridContentsUnderWidget")
      @js.native
      def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInTemplateGridContentsUnderWidgets")
      @js.native
      def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInVerticalFlowUnderWidgets")
      @js.native
      def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInWebLayoutContentUnderWidgets")
      @js.native
      def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportDropDown = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.createInWidgetValueUnderWidgets")
      @js.native
      def createInWidgetValueUnderWidgets(container: WidgetValue): ReportDropDown = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportDropDown.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide6/report-pane relevant section in reference guide}
      *
      * In version 6.10.0: deleted
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane")
    @js.native
    class ReportPane protected () extends Widget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def generateOnLoad: Boolean = js.native
      def generateOnLoad_=(newValue: Boolean): Unit = js.native
      
      def parameterWidget: Widget | Null = js.native
      def parameterWidget_=(newValue: Widget | Null): Unit = js.native
      
      def reportWidget: Widget | Null = js.native
      def reportWidget_=(newValue: Widget | Null): Unit = js.native
    }
    object ReportPane {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.create")
      @js.native
      def create(model: IModel): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInDataViewUnderFooterWidget")
      @js.native
      def createInDataViewUnderFooterWidget(container: DataView): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInDataViewUnderWidget")
      @js.native
      def createInDataViewUnderWidget(container: DataView): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInDivContainerUnderWidget")
      @js.native
      def createInDivContainerUnderWidget(container: DivContainer): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInGroupBoxUnderWidget")
      @js.native
      def createInGroupBoxUnderWidget(container: GroupBox): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInHeaderUnderLeftWidget")
      @js.native
      def createInHeaderUnderLeftWidget(container: Header): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInHeaderUnderRightWidget")
      @js.native
      def createInHeaderUnderRightWidget(container: Header): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInLayoutCallArgumentUnderWidget")
      @js.native
      def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInLayoutGridColumnUnderWidget")
      @js.native
      def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInLayoutUnderWidget")
      @js.native
      def createInLayoutUnderWidget(container: Layout): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInListViewTemplateUnderWidget")
      @js.native
      def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInListViewUnderWidget")
      @js.native
      def createInListViewUnderWidget(container: ListView): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInNavigationListItemUnderWidget")
      @js.native
      def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInReportPaneUnderParameterWidget")
      @js.native
      def createInReportPaneUnderParameterWidget(container: ReportPane): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInReportPaneUnderReportWidget")
      @js.native
      def createInReportPaneUnderReportWidget(container: ReportPane): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInScrollContainerRegionUnderWidget")
      @js.native
      def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInSnippetUnderWidget")
      @js.native
      def createInSnippetUnderWidget(container: Snippet): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInSplitPaneUnderFirstWidget")
      @js.native
      def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInSplitPaneUnderSecondWidget")
      @js.native
      def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInTabPageUnderWidget")
      @js.native
      def createInTabPageUnderWidget(container: TabPage): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInTableCellUnderWidget")
      @js.native
      def createInTableCellUnderWidget(container: TableCell): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInTemplateGridContentsUnderWidget")
      @js.native
      def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportPane = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.createInVerticalFlowUnderWidgets")
      @js.native
      def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportPane = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportPane.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportParameter")
    @js.native
    abstract class ReportParameter protected () extends Widget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 6.10.0: introduced
        */
      def parameter: IDataSetParameter | Null = js.native
      
      /**
        * In version 6.10.0: deleted
        */
      def parameterName: String = js.native
      def parameterName_=(newValue: String): Unit = js.native
      
      def parameterQualifiedName: String | Null = js.native
      
      def parameter_=(newValue: IDataSetParameter | Null): Unit = js.native
    }
    object ReportParameter {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/report-widgets relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget")
    @js.native
    abstract class ReportWidget protected () extends Widget {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def dataSet: IDataSet | Null = js.native
      
      def dataSetQualifiedName: String | Null = js.native
      
      def dataSet_=(newValue: IDataSet | Null): Unit = js.native
      
      /**
        * In version 6.10.0: introduced
        */
      def generateOnLoad: Boolean = js.native
      def generateOnLoad_=(newValue: Boolean): Unit = js.native
    }
    object ReportWidget {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportWidget.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo")
    @js.native
    class ReportZoomInfo protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsBasicReport: BasicReport = js.native
      
      def mappings: IList[ReportZoomMapping] = js.native
      
      def targetPage: IPage | Null = js.native
      
      def targetPageQualifiedName: String | Null = js.native
      
      def targetPage_=(newValue: IPage | Null): Unit = js.native
    }
    object ReportZoomInfo {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo.create")
      @js.native
      def create(model: IModel): ReportZoomInfo = js.native
      
      /**
        * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
        * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
        * of the parent BasicReport element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo.createIn")
      @js.native
      def createIn(container: BasicReport): ReportZoomInfo = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomInfo.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping")
    @js.native
    class ReportZoomMapping protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsReportZoomInfo: ReportZoomInfo = js.native
      
      def sourceReportColumnName: String = js.native
      def sourceReportColumnName_=(newValue: String): Unit = js.native
      
      def targetParameterName: String = js.native
      def targetParameterName_=(newValue: String): Unit = js.native
    }
    object ReportZoomMapping {
      
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping.create")
      @js.native
      def create(model: IModel): ReportZoomMapping = js.native
      
      /**
        * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
        * The new ReportZoomMapping will be automatically stored in the 'mappings' property
        * of the parent ReportZoomInfo element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping.createIn")
      @js.native
      def createIn(container: ReportZoomInfo): ReportZoomMapping = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/reports", "reports.ReportZoomMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
  }
}
