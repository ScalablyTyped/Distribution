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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportsMod {
  
  @JSImport("mendixmodelsdk/src/gen/reports", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object reports {
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.AggregateFunctionEnum")
    @js.native
    open class AggregateFunctionEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object AggregateFunctionEnum {
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AggregateFunctionEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AggregateFunctionEnum.Average")
      @js.native
      def Average: AggregateFunctionEnum = js.native
      inline def Average_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Average")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AggregateFunctionEnum.Count")
      @js.native
      def Count: AggregateFunctionEnum = js.native
      inline def Count_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Count")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AggregateFunctionEnum.Maximum")
      @js.native
      def Maximum: AggregateFunctionEnum = js.native
      inline def Maximum_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Maximum")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AggregateFunctionEnum.Minimum")
      @js.native
      def Minimum: AggregateFunctionEnum = js.native
      inline def Minimum_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimum")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AggregateFunctionEnum.Sum")
      @js.native
      def Sum: AggregateFunctionEnum = js.native
      inline def Sum_=(x: AggregateFunctionEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sum")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio")
    @js.native
    open class AspectRatio protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object AspectRatio {
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio.FourToThree")
      @js.native
      def FourToThree: AspectRatio = js.native
      inline def FourToThree_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FourToThree")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio.NineToSixteen")
      @js.native
      def NineToSixteen: AspectRatio = js.native
      inline def NineToSixteen_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NineToSixteen")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio.OneToOne")
      @js.native
      def OneToOne: AspectRatio = js.native
      inline def OneToOne_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OneToOne")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio.SixteenToNine")
      @js.native
      def SixteenToNine: AspectRatio = js.native
      inline def SixteenToNine_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SixteenToNine")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio.ThreeToFour")
      @js.native
      def ThreeToFour: AspectRatio = js.native
      inline def ThreeToFour_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToFour")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio.ThreeToTwo")
      @js.native
      def ThreeToTwo: AspectRatio = js.native
      inline def ThreeToTwo_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThreeToTwo")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.AspectRatio.TwoToThree")
      @js.native
      def TwoToThree: AspectRatio = js.native
      inline def TwoToThree_=(x: AspectRatio): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TwoToThree")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-grid relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReport")
    @js.native
    open class BasicReport protected () extends ReportWidget {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReport")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      inline def createInBuildingBlockUnderWidget(container: BuildingBlock): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidget(container: DataView): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderFooterWidgets(container: DataView): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderWidget(container: DataView): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderWidgets(container: DataView): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDivContainerUnderWidget(container: DivContainer): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDivContainerUnderWidgets(container: DivContainer): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidget(container: GroupBox): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInGroupBoxUnderWidgets(container: GroupBox): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidget(container: Header): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderLeftWidgets(container: Header): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidget(container: Header): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderRightWidgets(container: Header): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutUnderWidget(container: Layout): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutUnderWidgets(container: Layout): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewUnderWidget(container: ListView): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewUnderWidgets(container: ListView): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderWidgets(container: NativeLayout): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidget(container: NavigationListItem): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderParameterWidget(container: ReportPane): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderReportWidget(container: ReportPane): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSnippetUnderWidget(container: Snippet): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInSnippetUnderWidgets(container: Snippet): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidget(container: SplitPane): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidget(container: SplitPane): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTabPageUnderWidget(container: TabPage): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTabPageUnderWidgets(container: TabPage): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTableCellUnderWidget(container: TableCell): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTableCellUnderWidgets(container: TableCell): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /**
        * Creates and returns a new BasicReport instance in the SDK and on the server.
        * The new BasicReport will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      inline def createInWidgetValueUnderWidgets(container: WidgetValue): BasicReport = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReport]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReport.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReport.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportAggregate")
    @js.native
    open class BasicReportAggregate protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportAggregate")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): BasicReportAggregate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BasicReportAggregate]
      
      /**
        * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
        * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
        * of the parent BasicReport element passed as argument.
        */
      /* static member */
      inline def createIn(container: BasicReport): BasicReportAggregate = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReportAggregate]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportAggregate.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportAggregate.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportColumn")
    @js.native
    open class BasicReportColumn protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportColumn")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): BasicReportColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[BasicReportColumn]
      
      /**
        * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
        * The new BasicReportColumn will be automatically stored in the 'columns' property
        * of the parent BasicReport element passed as argument.
        */
      /* static member */
      inline def createIn(container: BasicReport): BasicReportColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[BasicReportColumn]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportColumn.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.BasicReportColumn.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ChartType")
    @js.native
    open class ChartType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ChartType {
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ChartType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ChartType.Area")
      @js.native
      def Area: ChartType = js.native
      inline def Area_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Area")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ChartType.HorizontalBars")
      @js.native
      def HorizontalBars: ChartType = js.native
      inline def HorizontalBars_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HorizontalBars")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ChartType.Lines")
      @js.native
      def Lines: ChartType = js.native
      inline def Lines_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Lines")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ChartType.VerticalBars")
      @js.native
      def VerticalBars: ChartType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ChartType.VerticalBars3D")
      @js.native
      def VerticalBars3D: ChartType = js.native
      inline def VerticalBars3D_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars3D")(x.asInstanceOf[js.Any])
      
      inline def VerticalBars_=(x: ChartType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VerticalBars")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ColumnFormat")
    @js.native
    open class ColumnFormat protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ColumnFormat {
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ColumnFormat")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ColumnFormat.Default")
      @js.native
      def Default: ColumnFormat = js.native
      inline def Default_=(x: ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ColumnFormat.MonthName")
      @js.native
      def MonthName: ColumnFormat = js.native
      inline def MonthName_=(x: ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MonthName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ColumnFormat.WeekdayName")
      @js.native
      def WeekdayName: ColumnFormat = js.native
      inline def WeekdayName_=(x: ColumnFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WeekdayName")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.DateRangeFieldEnum")
    @js.native
    open class DateRangeFieldEnum protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object DateRangeFieldEnum {
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.DateRangeFieldEnum")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.DateRangeFieldEnum.Month")
      @js.native
      def Month: DateRangeFieldEnum = js.native
      inline def Month_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.DateRangeFieldEnum.Period")
      @js.native
      def Period: DateRangeFieldEnum = js.native
      inline def Period_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.DateRangeFieldEnum.Quarter")
      @js.native
      def Quarter: DateRangeFieldEnum = js.native
      inline def Quarter_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.DateRangeFieldEnum.Week")
      @js.native
      def Week: DateRangeFieldEnum = js.native
      inline def Week_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.DateRangeFieldEnum.Year")
      @js.native
      def Year: DateRangeFieldEnum = js.native
      inline def Year_=(x: DateRangeFieldEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-button relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportButton")
    @js.native
    open class ReportButton protected () extends Widget {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportButton")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      inline def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidget(container: DataView): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderFooterWidgets(container: DataView): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderWidget(container: DataView): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderWidgets(container: DataView): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDivContainerUnderWidget(container: DivContainer): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDivContainerUnderWidgets(container: DivContainer): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidget(container: GroupBox): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInGroupBoxUnderWidgets(container: GroupBox): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidget(container: Header): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderLeftWidgets(container: Header): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidget(container: Header): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderRightWidgets(container: Header): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutUnderWidget(container: Layout): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutUnderWidgets(container: Layout): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewUnderWidget(container: ListView): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewUnderWidgets(container: ListView): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderParameterWidget(container: ReportPane): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderReportWidget(container: ReportPane): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSnippetUnderWidget(container: Snippet): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInSnippetUnderWidgets(container: Snippet): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTabPageUnderWidget(container: TabPage): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTabPageUnderWidgets(container: TabPage): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTableCellUnderWidget(container: TableCell): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTableCellUnderWidgets(container: TableCell): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /**
        * Creates and returns a new ReportButton instance in the SDK and on the server.
        * The new ReportButton will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      inline def createInWidgetValueUnderWidgets(container: WidgetValue): ReportButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportButton]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportButton.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportButton.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/report-chart relevant document}
      *
      * In version 9.0.1: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChart")
    @js.native
    open class ReportChart protected () extends ReportWidget {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChart")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      inline def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidget(container: DataView): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidgets(container: DataView): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderWidget(container: DataView): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInDataViewUnderWidgets(container: DataView): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDivContainerUnderWidget(container: DivContainer): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInDivContainerUnderWidgets(container: DivContainer): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidget(container: GroupBox): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidgets(container: GroupBox): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidget(container: Header): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidgets(container: Header): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidget(container: Header): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidgets(container: Header): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutUnderWidget(container: Layout): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutUnderWidgets(container: Layout): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewUnderWidget(container: ListView): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInListViewUnderWidgets(container: ListView): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 to 9.0.0
        */
      /* static member */
      inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 to 9.0.0
        */
      /* static member */
      inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderParameterWidget(container: ReportPane): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderReportWidget(container: ReportPane): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSnippetUnderWidget(container: Snippet): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInSnippetUnderWidgets(container: Snippet): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTabPageUnderWidget(container: TabPage): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInTabPageUnderWidgets(container: TabPage): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTableCellUnderWidget(container: TableCell): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInTableCellUnderWidgets(container: TableCell): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 9.0.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 to 9.0.0
        */
      /* static member */
      inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /**
        * Creates and returns a new ReportChart instance in the SDK and on the server.
        * The new ReportChart will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 to 9.0.0
        */
      /* static member */
      inline def createInWidgetValueUnderWidgets(container: WidgetValue): ReportChart = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChart]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChart.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChart.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.0.1: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChartSeries")
    @js.native
    open class ReportChartSeries protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChartSeries")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportChartSeries = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportChartSeries]
      
      /**
        * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
        * The new ReportChartSeries will be automatically stored in the 'seriess' property
        * of the parent ReportChart element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 9.0.0
        */
      /* static member */
      inline def createIn(container: ReportChart): ReportChartSeries = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ReportChartSeries]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChartSeries.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportChartSeries.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/date-range-field relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeField")
    @js.native
    open class ReportDateRangeField protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeField")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportDateRangeField = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeField]
      
      /**
        * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
        * The new ReportDateRangeField will be automatically stored in the 'fields' property
        * of the parent ReportDateRangeSelector element passed as argument.
        */
      /* static member */
      inline def createIn(container: ReportDateRangeSelector): ReportDateRangeField = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeField]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeField.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeField.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-date-parameter relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeSelector")
    @js.native
    open class ReportDateRangeSelector protected () extends ReportParameter {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeSelector")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      inline def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidget(container: DataView): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderFooterWidgets(container: DataView): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderWidget(container: DataView): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderWidgets(container: DataView): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDivContainerUnderWidget(container: DivContainer): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDivContainerUnderWidgets(container: DivContainer): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidget(container: GroupBox): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInGroupBoxUnderWidgets(container: GroupBox): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidget(container: Header): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderLeftWidgets(container: Header): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidget(container: Header): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderRightWidgets(container: Header): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutUnderWidget(container: Layout): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutUnderWidgets(container: Layout): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewUnderWidget(container: ListView): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewUnderWidgets(container: ListView): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderParameterWidget(container: ReportPane): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderReportWidget(container: ReportPane): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSnippetUnderWidget(container: Snippet): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInSnippetUnderWidgets(container: Snippet): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTabPageUnderWidget(container: TabPage): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTabPageUnderWidgets(container: TabPage): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTableCellUnderWidget(container: TableCell): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTableCellUnderWidgets(container: TableCell): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /**
        * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
        * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      inline def createInWidgetValueUnderWidgets(container: WidgetValue): ReportDateRangeSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDateRangeSelector]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeSelector.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDateRangeSelector.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/report-parameter relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDropDown")
    @js.native
    open class ReportDropDown protected () extends ReportParameter {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDropDown")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.7.0 to 7.14.0
        */
      /* static member */
      inline def createInBuildingBlockUnderWidget(container: BuildingBlock): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.BuildingBlock element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidget(container: DataView): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderFooterWidgets(container: DataView): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDataViewUnderWidget(container: DataView): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDataViewUnderWidgets(container: DataView): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInDivContainerUnderWidget(container: DivContainer): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInDivContainerUnderWidgets(container: DivContainer): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidget(container: GroupBox): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInGroupBoxUnderWidgets(container: GroupBox): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidget(container: Header): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderLeftWidgets(container: Header): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidget(container: Header): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInHeaderUnderRightWidgets(container: Header): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInLayoutUnderWidget(container: Layout): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInLayoutUnderWidgets(container: Layout): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInListViewUnderWidget(container: ListView): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInListViewUnderWidgets(container: ListView): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.MasterDetailRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.1.0 to 7.14.0
        */
      /* static member */
      inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.23.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'sidebarWidgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.5.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.NativeLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'headerWidget' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent nativepages.NativeLayout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.21.0 to 7.23.0
        */
      /* static member */
      inline def createInNativeLayoutUnderWidgets(container: NativeLayout): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderParameterWidget(container: ReportPane): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderReportWidget(container: ReportPane): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSnippetUnderWidget(container: Snippet): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInSnippetUnderWidgets(container: Snippet): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 to 7.23.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTabPageUnderWidget(container: TabPage): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTabPageUnderWidgets(container: TabPage): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTableCellUnderWidget(container: TableCell): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTableCellUnderWidgets(container: TableCell): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.15.0 and higher
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.14.0
        */
      /* static member */
      inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent pages.WebLayoutContent element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /**
        * Creates and returns a new ReportDropDown instance in the SDK and on the server.
        * The new ReportDropDown will be automatically stored in the 'widgets' property
        * of the parent customwidgets.WidgetValue element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.2.0 and higher
        */
      /* static member */
      inline def createInWidgetValueUnderWidgets(container: WidgetValue): ReportDropDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportDropDown]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDropDown.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportDropDown.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide6/report-pane relevant section in reference guide}
      *
      * In version 6.10.0: deleted
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportPane")
    @js.native
    open class ReportPane protected () extends Widget {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportPane")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'footerWidget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.7.0 to 6.9.0
        */
      /* static member */
      inline def createInDataViewUnderFooterWidget(container: DataView): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.DataView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInDataViewUnderWidget(container: DataView): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.DivContainer element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInDivContainerUnderWidget(container: DivContainer): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.GroupBox element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInGroupBoxUnderWidget(container: GroupBox): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'leftWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInHeaderUnderLeftWidget(container: Header): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'rightWidget' property
        * of the parent pages.Header element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInHeaderUnderRightWidget(container: Header): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.LayoutCallArgument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.LayoutGridColumn element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.Layout element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInLayoutUnderWidget(container: Layout): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.ListViewTemplate element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.ListView element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInListViewUnderWidget(container: ListView): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.NavigationListItem element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInNavigationListItemUnderWidget(container: NavigationListItem): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'parameterWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderParameterWidget(container: ReportPane): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'reportWidget' property
        * of the parent ReportPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInReportPaneUnderReportWidget(container: ReportPane): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.ScrollContainerRegion element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.Snippet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInSnippetUnderWidget(container: Snippet): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'firstWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInSplitPaneUnderFirstWidget(container: SplitPane): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'secondWidget' property
        * of the parent pages.SplitPane element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInSplitPaneUnderSecondWidget(container: SplitPane): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.TabPage element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInTabPageUnderWidget(container: TabPage): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.TableCell element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInTableCellUnderWidget(container: TableCell): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widget' property
        * of the parent pages.TemplateGridContents element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /**
        * Creates and returns a new ReportPane instance in the SDK and on the server.
        * The new ReportPane will be automatically stored in the 'widgets' property
        * of the parent pages.VerticalFlow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 6.9.0
        */
      /* static member */
      inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReportPane = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[ReportPane]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportPane.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportPane.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportParameter")
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/report-widgets relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportWidget")
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportWidget")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportWidget.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportWidget.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomInfo")
    @js.native
    open class ReportZoomInfo protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomInfo")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportZoomInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportZoomInfo]
      
      /**
        * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
        * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
        * of the parent BasicReport element passed as argument.
        */
      /* static member */
      inline def createIn(container: BasicReport): ReportZoomInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ReportZoomInfo]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomInfo.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomInfo.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomMapping")
    @js.native
    open class ReportZoomMapping protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ReportZoomMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ReportZoomMapping]
      
      /**
        * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
        * The new ReportZoomMapping will be automatically stored in the 'mappings' property
        * of the parent ReportZoomInfo element passed as argument.
        */
      /* static member */
      inline def createIn(container: ReportZoomInfo): ReportZoomMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ReportZoomMapping]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/reports", "reports.ReportZoomMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
  }
}
