package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.pagesMod.pages.DataView
import typings.mendixmodelsdk.pagesMod.pages.DivContainer
import typings.mendixmodelsdk.pagesMod.pages.EntityWidget
import typings.mendixmodelsdk.pagesMod.pages.GroupBox
import typings.mendixmodelsdk.pagesMod.pages.Header
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
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customwidgets {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `CustomWidgets`.
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget")
  @js.native
  class CustomWidget protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidget {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInBuildingBlockUnderWidget")
    @js.native
    def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInDataViewUnderFooterWidget")
    @js.native
    def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInDataViewUnderWidget")
    @js.native
    def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInDivContainerUnderWidget")
    @js.native
    def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInGroupBoxUnderWidget")
    @js.native
    def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInHeaderUnderLeftWidget")
    @js.native
    def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInHeaderUnderRightWidget")
    @js.native
    def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInLayoutCallArgumentUnderWidget")
    @js.native
    def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInLayoutGridColumnUnderWidget")
    @js.native
    def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInLayoutUnderWidget")
    @js.native
    def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInListViewTemplateUnderWidget")
    @js.native
    def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInListViewUnderWidget")
    @js.native
    def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInMasterDetailRegionUnderWidget")
    @js.native
    def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInNativeLayoutContentUnderSidebarWidgets")
    @js.native
    def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInNativeLayoutContentUnderWidgets")
    @js.native
    def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInNavigationListItemUnderWidget")
    @js.native
    def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'parameterWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInReportPaneUnderParameterWidget")
    @js.native
    def createInReportPaneUnderParameterWidget(container: ReportPane): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'reportWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInReportPaneUnderReportWidget")
    @js.native
    def createInReportPaneUnderReportWidget(container: ReportPane): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInScrollContainerRegionUnderWidget")
    @js.native
    def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInSnippetUnderWidget")
    @js.native
    def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInSplitPaneUnderFirstWidget")
    @js.native
    def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInSplitPaneUnderSecondWidget")
    @js.native
    def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInTabPageUnderWidget")
    @js.native
    def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInTableCellUnderWidget")
    @js.native
    def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInTemplateGridContentsUnderWidget")
    @js.native
    def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInVerticalFlowUnderWidgets")
    @js.native
    def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInWebLayoutContentUnderWidgets")
    @js.native
    def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.createInWidgetValueUnderWidgets")
    @js.native
    def createInWidgetValueUnderWidgets(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidget.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType")
  @js.native
  class CustomWidgetAttributeType protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAttributeType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.AutoNumber")
    @js.native
    def AutoNumber: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def AutoNumber_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AutoNumber")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Binary")
    @js.native
    def Binary: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Binary_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Boolean")
    @js.native
    def Boolean: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Boolean_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Currency")
    @js.native
    def Currency: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Currency_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Currency")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.DateTime")
    @js.native
    def DateTime: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def DateTime_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Decimal")
    @js.native
    def Decimal: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Decimal_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Enum")
    @js.native
    def Enum: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Enum_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Float")
    @js.native
    def Float: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Float_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.HashString")
    @js.native
    def HashString: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def HashString_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HashString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Integer")
    @js.native
    def Integer: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Integer_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Long")
    @js.native
    def Long: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def Long_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.String")
    @js.native
    def String: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    @scala.inline
    def String_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource")
  @js.native
  class CustomWidgetDatabaseSource protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetDatabaseSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource.createInEntityWidgetUnderDataSource")
    @js.native
    def createInEntityWidgetUnderDataSource(container: EntityWidget): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource.createInWidgetValueUnderDataSource")
    @js.native
    def createInWidgetValueUnderDataSource(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetDatabaseSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType")
  @js.native
  class CustomWidgetType protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType = js.native
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * The new CustomWidgetType will be automatically stored in the 'type' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
  @js.native
  class CustomWidgetXPathSource protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CustomWidgetXPathSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource.createInEntityWidgetUnderDataSource")
    @js.native
    def createInEntityWidgetUnderDataSource(container: EntityWidget): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource.createInWidgetValueUnderDataSource")
    @js.native
    def createInWidgetValueUnderDataSource(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.IsPath")
  @js.native
  class IsPath protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object IsPath {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.IsPath")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.IsPath.No")
    @js.native
    def No: typings.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath = js.native
    @scala.inline
    def No_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.IsPath.Optional")
    @js.native
    def Optional: typings.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath = js.native
    @scala.inline
    def Optional_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optional")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.IsPath.Yes")
    @js.native
    def Yes: typings.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath = js.native
    @scala.inline
    def Yes_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.PathType")
  @js.native
  class PathType protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.PathType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object PathType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.PathType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.PathType.None")
    @js.native
    def None: typings.mendixmodelsdk.customwidgetsMod.customwidgets.PathType = js.native
    @scala.inline
    def None_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.PathType.Reference")
    @js.native
    def Reference: typings.mendixmodelsdk.customwidgetsMod.customwidgets.PathType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.PathType.ReferenceSet")
    @js.native
    def ReferenceSet: typings.mendixmodelsdk.customwidgetsMod.customwidgets.PathType = js.native
    @scala.inline
    def ReferenceSet_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Reference_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.SystemPropertyEnum")
  @js.native
  class SystemPropertyEnum protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SystemPropertyEnum {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.SystemPropertyEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Editability")
    @js.native
    def Editability: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Editability_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editability")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Label")
    @js.native
    def Label: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Label_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Name")
    @js.native
    def Name: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Name_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Name")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.SystemPropertyEnum.TabIndex")
    @js.native
    def TabIndex: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def TabIndex_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabIndex")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Visibility")
    @js.native
    def Visibility: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    @scala.inline
    def Visibility_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue")
  @js.native
  class WidgetEnumerationValue protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetEnumerationValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetEnumerationValue {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetEnumerationValue = js.native
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetEnumerationValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject")
  @js.native
  class WidgetObject protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetObject {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'object' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject.createInCustomWidgetUnderObject")
    @js.native
    def createInCustomWidgetUnderObject(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'objects' property
      * of the parent WidgetValue element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject.createInWidgetValueUnderObjects")
    @js.native
    def createInWidgetValueUnderObjects(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObject.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType")
  @js.native
  class WidgetObjectType protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetObjectType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent CustomWidgetType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType.createInCustomWidgetTypeUnderObjectType")
    @js.native
    def createInCustomWidgetTypeUnderObjectType(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType.createInWidgetValueTypeUnderObjectType")
    @js.native
    def createInWidgetValueTypeUnderObjectType(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetObjectType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty")
  @js.native
  class WidgetProperty protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetProperty {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty = js.native
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * The new WidgetProperty will be automatically stored in the 'properties' property
      * of the parent WidgetObject element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetProperty.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType")
  @js.native
  class WidgetPropertyType protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetPropertyType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType = js.native
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
      * of the parent WidgetObjectType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObjectType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetPropertyType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnType")
  @js.native
  class WidgetReturnType protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetReturnType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnType = js.native
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * The new WidgetReturnType will be automatically stored in the 'returnType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnType.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum")
  @js.native
  class WidgetReturnTypeEnum protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetReturnTypeEnum {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Boolean")
    @js.native
    def Boolean: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Boolean_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.DateTime")
    @js.native
    def DateTime: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def DateTime_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Decimal")
    @js.native
    def Decimal: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Decimal_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Float")
    @js.native
    def Float: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Float_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Integer")
    @js.native
    def Integer: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Integer_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Object")
    @js.native
    def Object: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Object_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.String")
    @js.native
    def String: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def String_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Void")
    @js.native
    def Void: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    @scala.inline
    def Void_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Void")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetTranslation")
  @js.native
  class WidgetTranslation protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetTranslation {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetTranslation {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetTranslation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetTranslation.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetTranslation = js.native
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * The new WidgetTranslation will be automatically stored in the 'translations' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetTranslation.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetTranslation = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetTranslation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetTranslation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue")
  @js.native
  class WidgetValue protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetValue {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue = js.native
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * The new WidgetValue will be automatically stored in the 'value' property
      * of the parent WidgetProperty element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueType")
  @js.native
  class WidgetValueType protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WidgetValueType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType = js.native
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * The new WidgetValueType will be automatically stored in the 'valueType' property
      * of the parent WidgetPropertyType element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueType.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType): typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum")
  @js.native
  class WidgetValueTypeEnum protected ()
    extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetValueTypeEnum {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Action")
    @js.native
    def Action: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Action_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Attribute")
    @js.native
    def Attribute: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Attribute_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Boolean")
    @js.native
    def Boolean: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Boolean_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.DataSource")
    @js.native
    def DataSource: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def DataSource_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Decimal")
    @js.native
    def Decimal: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Decimal_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Entity")
    @js.native
    def Entity: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.EntityConstraint")
    @js.native
    def EntityConstraint: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def EntityConstraint_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EntityConstraint")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Entity_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Entity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Enumeration")
    @js.native
    def Enumeration: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Enumeration_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumeration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Expression")
    @js.native
    def Expression: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Expression_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expression")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.File")
    @js.native
    def File: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def File_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Form")
    @js.native
    def Form: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Form_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Icon")
    @js.native
    def Icon: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Icon_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Image")
    @js.native
    def Image: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Image_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Integer")
    @js.native
    def Integer: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Integer_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Microflow")
    @js.native
    def Microflow: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Microflow_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Microflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Nanoflow")
    @js.native
    def Nanoflow: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Nanoflow_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nanoflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Object")
    @js.native
    def Object: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Object_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.String")
    @js.native
    def String: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def String_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.System")
    @js.native
    def System: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def System_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("System")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.TextTemplate")
    @js.native
    def TextTemplate: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def TextTemplate_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.TranslatableString")
    @js.native
    def TranslatableString: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def TranslatableString_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TranslatableString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Widgets")
    @js.native
    def Widgets: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    @scala.inline
    def Widgets_=(x: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Widgets")(x.asInstanceOf[js.Any])
  }
}
