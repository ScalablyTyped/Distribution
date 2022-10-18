package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.srcGenPagesMod.pages.DataView
import typings.mendixmodelsdk.srcGenPagesMod.pages.DivContainer
import typings.mendixmodelsdk.srcGenPagesMod.pages.EntityWidget
import typings.mendixmodelsdk.srcGenPagesMod.pages.GroupBox
import typings.mendixmodelsdk.srcGenPagesMod.pages.Header
import typings.mendixmodelsdk.srcGenPagesMod.pages.Layout
import typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.srcGenPagesMod.pages.ListView
import typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.MasterDetailRegion
import typings.mendixmodelsdk.srcGenPagesMod.pages.NativeLayoutContent
import typings.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.srcGenPagesMod.pages.Snippet
import typings.mendixmodelsdk.srcGenPagesMod.pages.SplitPane
import typings.mendixmodelsdk.srcGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.srcGenPagesMod.pages.TableCell
import typings.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.srcGenPagesMod.pages.VerticalFlow
import typings.mendixmodelsdk.srcGenPagesMod.pages.WebLayoutContent
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customwidgets {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `CustomWidgets`.
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidget")
  @js.native
  open class CustomWidget protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'parameterWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: ReportPane): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'reportWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: ReportPane): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidget.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAssociationType")
  @js.native
  open class CustomWidgetAssociationType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAssociationType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAssociationType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAssociationType.Reference")
    @js.native
    def Reference: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAssociationType.ReferenceSet")
    @js.native
    def ReferenceSet: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType = js.native
    inline def ReferenceSet_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    inline def Reference_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType")
  @js.native
  open class CustomWidgetAttributeType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAttributeType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.AutoNumber")
    @js.native
    def AutoNumber: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def AutoNumber_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AutoNumber")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Binary")
    @js.native
    def Binary: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Binary_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Boolean")
    @js.native
    def Boolean: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Boolean_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Currency")
    @js.native
    def Currency: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Currency_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Currency")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.DateTime")
    @js.native
    def DateTime: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def DateTime_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Decimal")
    @js.native
    def Decimal: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Decimal_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Enum")
    @js.native
    def Enum: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Enum_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Float")
    @js.native
    def Float: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Float_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.HashString")
    @js.native
    def HashString: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def HashString_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HashString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Integer")
    @js.native
    def Integer: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Integer_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.Long")
    @js.native
    def Long: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def Long_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetAttributeType.String")
    @js.native
    def String: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType = js.native
    inline def String_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource")
  @js.native
  open class CustomWidgetDatabaseSource protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource]
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInEntityWidgetUnderDataSource(container: EntityWidget): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource]
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderDataSource(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetDatabaseSource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetDatabaseSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetType")
  @js.native
  open class CustomWidgetType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType]
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * The new CustomWidgetType will be automatically stored in the 'type' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
  @js.native
  open class CustomWidgetXPathSource protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInEntityWidgetUnderDataSource(container: EntityWidget): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderDataSource(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetXPathSource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.IsPath")
  @js.native
  open class IsPath protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object IsPath {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.IsPath")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.IsPath.No")
    @js.native
    def No: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath = js.native
    inline def No_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.IsPath.Optional")
    @js.native
    def Optional: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath = js.native
    inline def Optional_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optional")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.IsPath.Yes")
    @js.native
    def Yes: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath = js.native
    inline def Yes_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.PathType")
  @js.native
  open class PathType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object PathType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.PathType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.PathType.None")
    @js.native
    def None: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType = js.native
    inline def None_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.PathType.Reference")
    @js.native
    def Reference: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.PathType.ReferenceSet")
    @js.native
    def ReferenceSet: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType = js.native
    inline def ReferenceSet_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    inline def Reference_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.SystemPropertyEnum")
  @js.native
  open class SystemPropertyEnum protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SystemPropertyEnum {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.SystemPropertyEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Editability")
    @js.native
    def Editability: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Editability_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editability")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Label")
    @js.native
    def Label: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Label_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Name")
    @js.native
    def Name: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Name_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Name")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.SystemPropertyEnum.TabIndex")
    @js.native
    def TabIndex: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def TabIndex_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabIndex")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.SystemPropertyEnum.Visibility")
    @js.native
    def Visibility: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum = js.native
    inline def Visibility_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetEnumerationValue")
  @js.native
  open class WidgetEnumerationValue protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetEnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue]
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetEnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetEnumerationValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject")
  @js.native
  open class WidgetObject protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'object' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    inline def createInCustomWidgetUnderObject(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderObject")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'objects' property
      * of the parent WidgetValue element passed as argument.
      */
    /* static member */
    inline def createInWidgetValueUnderObjects(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderObjects")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObject.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType")
  @js.native
  open class WidgetObjectType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent CustomWidgetType element passed as argument.
      */
    /* static member */
    inline def createInCustomWidgetTypeUnderObjectType(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidgetType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createInWidgetValueTypeUnderObjectType(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetObjectType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetProperty")
  @js.native
  open class WidgetProperty protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty]
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * The new WidgetProperty will be automatically stored in the 'properties' property
      * of the parent WidgetObject element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetProperty.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetProperty.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetPropertyType")
  @js.native
  open class WidgetPropertyType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetPropertyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType]
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
      * of the parent WidgetObjectType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObjectType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetPropertyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetPropertyType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnType")
  @js.native
  open class WidgetReturnType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType]
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * The new WidgetReturnType will be automatically stored in the 'returnType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum")
  @js.native
  open class WidgetReturnTypeEnum protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetReturnTypeEnum {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Boolean")
    @js.native
    def Boolean: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Boolean_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.DateTime")
    @js.native
    def DateTime: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def DateTime_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Decimal")
    @js.native
    def Decimal: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Decimal_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Float")
    @js.native
    def Float: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Float_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Integer")
    @js.native
    def Integer: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Integer_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Object")
    @js.native
    def Object: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Object_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.String")
    @js.native
    def String: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def String_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetReturnTypeEnum.Void")
    @js.native
    def Void: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum = js.native
    inline def Void_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Void")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetTranslation")
  @js.native
  open class WidgetTranslation protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetTranslation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation]
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * The new WidgetTranslation will be automatically stored in the 'translations' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetTranslation]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetTranslation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetTranslation.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValue")
  @js.native
  open class WidgetValue protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue]
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * The new WidgetValue will be automatically stored in the 'value' property
      * of the parent WidgetProperty element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetProperty): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValue.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueType")
  @js.native
  open class WidgetValueType protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType]
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * The new WidgetValueType will be automatically stored in the 'valueType' property
      * of the parent WidgetPropertyType element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetPropertyType): typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum")
  @js.native
  open class WidgetValueTypeEnum protected ()
    extends typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetValueTypeEnum {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Action")
    @js.native
    def Action: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Action_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Association")
    @js.native
    def Association: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Association_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Association")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Attribute")
    @js.native
    def Attribute: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Attribute_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Boolean")
    @js.native
    def Boolean: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Boolean_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.DataSource")
    @js.native
    def DataSource: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def DataSource_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Decimal")
    @js.native
    def Decimal: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Decimal_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Entity")
    @js.native
    def Entity: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.EntityConstraint")
    @js.native
    def EntityConstraint: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def EntityConstraint_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EntityConstraint")(x.asInstanceOf[js.Any])
    
    inline def Entity_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Entity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Enumeration")
    @js.native
    def Enumeration: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Enumeration_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumeration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Expression")
    @js.native
    def Expression: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Expression_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expression")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.File")
    @js.native
    def File: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def File_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Form")
    @js.native
    def Form: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Form_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Icon")
    @js.native
    def Icon: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Icon_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Image")
    @js.native
    def Image: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Image_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Integer")
    @js.native
    def Integer: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Integer_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Microflow")
    @js.native
    def Microflow: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Microflow_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Microflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Nanoflow")
    @js.native
    def Nanoflow: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Nanoflow_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nanoflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Object")
    @js.native
    def Object: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Object_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.String")
    @js.native
    def String: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def String_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.System")
    @js.native
    def System: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def System_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("System")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.TextTemplate")
    @js.native
    def TextTemplate: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def TextTemplate_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.TranslatableString")
    @js.native
    def TranslatableString: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def TranslatableString_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TranslatableString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "customwidgets.WidgetValueTypeEnum.Widgets")
    @js.native
    def Widgets: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum = js.native
    inline def Widgets_=(x: typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Widgets")(x.asInstanceOf[js.Any])
  }
}
