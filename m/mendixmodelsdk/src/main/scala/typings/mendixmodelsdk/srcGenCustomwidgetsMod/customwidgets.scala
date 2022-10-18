package typings.mendixmodelsdk.srcGenCustomwidgetsMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenClientMod.client.SupportedPlatform
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.srcGenPagesMod.pages.ClientAction
import typings.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.ConditionalEditabilitySettings
import typings.mendixmodelsdk.srcGenPagesMod.pages.ConditionalVisibilitySettings
import typings.mendixmodelsdk.srcGenPagesMod.pages.DataSource
import typings.mendixmodelsdk.srcGenPagesMod.pages.DataView
import typings.mendixmodelsdk.srcGenPagesMod.pages.DatabaseSourceBase
import typings.mendixmodelsdk.srcGenPagesMod.pages.DivContainer
import typings.mendixmodelsdk.srcGenPagesMod.pages.EditableEnum
import typings.mendixmodelsdk.srcGenPagesMod.pages.EntityWidget
import typings.mendixmodelsdk.srcGenPagesMod.pages.GroupBox
import typings.mendixmodelsdk.srcGenPagesMod.pages.Header
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typings.mendixmodelsdk.srcGenPagesMod.pages.Icon
import typings.mendixmodelsdk.srcGenPagesMod.pages.Layout
import typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.srcGenPagesMod.pages.ListView
import typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.MasterDetailRegion
import typings.mendixmodelsdk.srcGenPagesMod.pages.NativeLayoutContent
import typings.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable
import typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.srcGenPagesMod.pages.Snippet
import typings.mendixmodelsdk.srcGenPagesMod.pages.SplitPane
import typings.mendixmodelsdk.srcGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.srcGenPagesMod.pages.TableCell
import typings.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.srcGenPagesMod.pages.VerticalFlow
import typings.mendixmodelsdk.srcGenPagesMod.pages.WebLayoutContent
import typings.mendixmodelsdk.srcGenPagesMod.pages.Widget
import typings.mendixmodelsdk.srcGenPagesMod.pages.XPathSourceBase
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.srcGenTextsMod.texts.Text
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
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
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidget")
  @js.native
  open class CustomWidget protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    /**
      * In version 8.1.0: introduced
      */
    def conditionalEditabilitySettings: ConditionalEditabilitySettings | Null = js.native
    def conditionalEditabilitySettings_=(newValue: ConditionalEditabilitySettings | Null): Unit = js.native
    
    /**
      * In version 8.1.0: introduced
      */
    def conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
    def conditionalVisibilitySettings_=(newValue: ConditionalVisibilitySettings | Null): Unit = js.native
    
    /**
      * In version 8.1.0: introduced
      */
    def editable: EditableEnum = js.native
    def editable_=(newValue: EditableEnum): Unit = js.native
    
    /**
      * In version 8.1.0: introduced
      */
    def labelTemplate: ClientTemplate | Null = js.native
    def labelTemplate_=(newValue: ClientTemplate | Null): Unit = js.native
    
    def `object`: WidgetObject | Null = js.native
    def object_=(newValue: WidgetObject | Null): Unit = js.native
    
    def `type`: CustomWidgetType | Null = js.native
    def type_=(newValue: CustomWidgetType | Null): Unit = js.native
  }
  object CustomWidget {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.7.0 to 7.14.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidget(container: BuildingBlock): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidget(container: DataView): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDataViewUnderWidget(container: DataView): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInDivContainerUnderWidget(container: DivContainer): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidget(container: GroupBox): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidget(container: Header): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidget' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidget(container: Header): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInLayoutUnderWidget(container: Layout): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInListViewUnderWidget(container: ListView): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.MasterDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'sidebarWidgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NativeLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'headerWidget' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent nativepages.NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: NativeLayout): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidget(container: NavigationListItem): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'parameterWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderParameterWidget(container: ReportPane): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'reportWidget' property
      * of the parent reports.ReportPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 6.9.0
      */
    /* static member */
    inline def createInReportPaneUnderReportWidget(container: ReportPane): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSnippetUnderWidget(container: Snippet): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidget(container: SplitPane): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidget' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidget(container: SplitPane): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTabPageUnderWidget(container: TabPage): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTableCellUnderWidget(container: TableCell): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widget' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.15.0 and higher
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.VerticalFlow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.14.0
      */
    /* static member */
    inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent pages.WebLayoutContent element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /**
      * Creates and returns a new CustomWidget instance in the SDK and on the server.
      * The new CustomWidget will be automatically stored in the 'widgets' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.2.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderWidgets(container: WidgetValue): CustomWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidget]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidget.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidget.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType")
  @js.native
  open class CustomWidgetAssociationType protected () extends AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAssociationType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType.Reference")
    @js.native
    def Reference: CustomWidgetAssociationType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType.ReferenceSet")
    @js.native
    def ReferenceSet: CustomWidgetAssociationType = js.native
    inline def ReferenceSet_=(x: CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    inline def Reference_=(x: CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType")
  @js.native
  open class CustomWidgetAttributeType protected () extends AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object CustomWidgetAttributeType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.AutoNumber")
    @js.native
    def AutoNumber: CustomWidgetAttributeType = js.native
    inline def AutoNumber_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AutoNumber")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Binary")
    @js.native
    def Binary: CustomWidgetAttributeType = js.native
    inline def Binary_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Boolean")
    @js.native
    def Boolean: CustomWidgetAttributeType = js.native
    inline def Boolean_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Currency")
    @js.native
    def Currency: CustomWidgetAttributeType = js.native
    inline def Currency_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Currency")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.DateTime")
    @js.native
    def DateTime: CustomWidgetAttributeType = js.native
    inline def DateTime_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Decimal")
    @js.native
    def Decimal: CustomWidgetAttributeType = js.native
    inline def Decimal_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Enum")
    @js.native
    def Enum: CustomWidgetAttributeType = js.native
    inline def Enum_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enum")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Float")
    @js.native
    def Float: CustomWidgetAttributeType = js.native
    inline def Float_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.HashString")
    @js.native
    def HashString: CustomWidgetAttributeType = js.native
    inline def HashString_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HashString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Integer")
    @js.native
    def Integer: CustomWidgetAttributeType = js.native
    inline def Integer_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.Long")
    @js.native
    def Long: CustomWidgetAttributeType = js.native
    inline def Long_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAttributeType.String")
    @js.native
    def String: CustomWidgetAttributeType = js.native
    inline def String_=(x: CustomWidgetAttributeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetDatabaseSource")
  @js.native
  open class CustomWidgetDatabaseSource protected () extends DatabaseSourceBase {
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
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetDatabaseSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetDatabaseSource]
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInEntityWidgetUnderDataSource(container: EntityWidget): CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetDatabaseSource]
    
    /**
      * Creates and returns a new CustomWidgetDatabaseSource instance in the SDK and on the server.
      * The new CustomWidgetDatabaseSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderDataSource(container: WidgetValue): CustomWidgetDatabaseSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetDatabaseSource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetDatabaseSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetDatabaseSource.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType")
  @js.native
  open class CustomWidgetType protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def containerAsCustomWidget: CustomWidget = js.native
    
    def description: String = js.native
    def description_=(newValue: String): Unit = js.native
    
    /**
      * In version 7.1.0: deleted
      * In version 7.0.0: introduced
      */
    def experimentalApi: Boolean = js.native
    def experimentalApi_=(newValue: Boolean): Unit = js.native
    
    /**
      * In version 8.3.0: introduced
      */
    def helpUrl: String = js.native
    def helpUrl_=(newValue: String): Unit = js.native
    
    /**
      * In version 8.0.0: deleted
      * In version 7.23.0: introduced
      */
    def labeled: Boolean = js.native
    def labeled_=(newValue: Boolean): Unit = js.native
    
    def name: String = js.native
    def name_=(newValue: String): Unit = js.native
    
    def needsEntityContext: Boolean = js.native
    def needsEntityContext_=(newValue: Boolean): Unit = js.native
    
    def objectType: WidgetObjectType = js.native
    def objectType_=(newValue: WidgetObjectType): Unit = js.native
    
    def offlineCapable: Boolean = js.native
    def offlineCapable_=(newValue: Boolean): Unit = js.native
    
    def phoneGapEnabled: Boolean = js.native
    def phoneGapEnabled_=(newValue: Boolean): Unit = js.native
    
    /**
      * In version 7.19.0: introduced
      */
    def pluginWidget: Boolean = js.native
    def pluginWidget_=(newValue: Boolean): Unit = js.native
    
    /**
      * In version 9.4.0: introduced
      */
    def studioCategory: String = js.native
    def studioCategory_=(newValue: String): Unit = js.native
    
    /**
      * In version 9.4.0: introduced
      */
    def studioProCategory: String = js.native
    def studioProCategory_=(newValue: String): Unit = js.native
    
    /**
      * In version 8.0.0: introduced
      */
    def supportedPlatform: SupportedPlatform = js.native
    def supportedPlatform_=(newValue: SupportedPlatform): Unit = js.native
    
    def widgetId: String = js.native
    def widgetId_=(newValue: String): Unit = js.native
  }
  object CustomWidgetType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetType]
    
    /**
      * Creates and returns a new CustomWidgetType instance in the SDK and on the server.
      * The new CustomWidgetType will be automatically stored in the 'type' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    inline def createIn(container: CustomWidget): CustomWidgetType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetType.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.5.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetXPathSource")
  @js.native
  open class CustomWidgetXPathSource protected () extends XPathSourceBase {
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
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetXPathSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetXPathSource]
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent pages.EntityWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInEntityWidgetUnderDataSource(container: EntityWidget): CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetXPathSource]
    
    /**
      * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
      * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
      * of the parent WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.5.0 and higher
      */
    /* static member */
    inline def createInWidgetValueUnderDataSource(container: WidgetValue): CustomWidgetXPathSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderDataSource")(container.asInstanceOf[js.Any]).asInstanceOf[CustomWidgetXPathSource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetXPathSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetXPathSource.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath")
  @js.native
  open class IsPath protected () extends AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object IsPath {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath.No")
    @js.native
    def No: IsPath = js.native
    inline def No_=(x: IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath.Optional")
    @js.native
    def Optional: IsPath = js.native
    inline def Optional_=(x: IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optional")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath.Yes")
    @js.native
    def Yes: IsPath = js.native
    inline def Yes_=(x: IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.PathType")
  @js.native
  open class PathType protected () extends AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object PathType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.PathType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.PathType.None")
    @js.native
    def None: PathType = js.native
    inline def None_=(x: PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.PathType.Reference")
    @js.native
    def Reference: PathType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.PathType.ReferenceSet")
    @js.native
    def ReferenceSet: PathType = js.native
    inline def ReferenceSet_=(x: PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
    
    inline def Reference_=(x: PathType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.SystemPropertyEnum")
  @js.native
  open class SystemPropertyEnum protected () extends AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SystemPropertyEnum {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.SystemPropertyEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.SystemPropertyEnum.Editability")
    @js.native
    def Editability: SystemPropertyEnum = js.native
    inline def Editability_=(x: SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Editability")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.SystemPropertyEnum.Label")
    @js.native
    def Label: SystemPropertyEnum = js.native
    inline def Label_=(x: SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.SystemPropertyEnum.Name")
    @js.native
    def Name: SystemPropertyEnum = js.native
    inline def Name_=(x: SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Name")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.SystemPropertyEnum.TabIndex")
    @js.native
    def TabIndex: SystemPropertyEnum = js.native
    inline def TabIndex_=(x: SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabIndex")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.SystemPropertyEnum.Visibility")
    @js.native
    def Visibility: SystemPropertyEnum = js.native
    inline def Visibility_=(x: SystemPropertyEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Visibility")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetEnumerationValue")
  @js.native
  open class WidgetEnumerationValue protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def caption: String = js.native
    def caption_=(newValue: String): Unit = js.native
    
    def containerAsWidgetValueType: WidgetValueType = js.native
    
    def key: String = js.native
    def key_=(newValue: String): Unit = js.native
  }
  object WidgetEnumerationValue {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetEnumerationValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetEnumerationValue]
    
    /**
      * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
      * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: WidgetValueType): WidgetEnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetEnumerationValue]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetEnumerationValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetEnumerationValue.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject")
  @js.native
  open class WidgetObject protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def containerAsCustomWidget: CustomWidget = js.native
    
    def containerAsWidgetValue: WidgetValue = js.native
    
    /**
      * In version 8.1.0: deleted
      * In version 7.23.0: introduced
      */
    def labelTemplate: ClientTemplate | Null = js.native
    def labelTemplate_=(newValue: ClientTemplate | Null): Unit = js.native
    
    def properties: IList[WidgetProperty] = js.native
    
    /**
      * In version 7.13.0: added optional
      */
    def `type`: WidgetObjectType | Null = js.native
    def type_=(newValue: WidgetObjectType | Null): Unit = js.native
  }
  object WidgetObject {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetObject]
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'object' property
      * of the parent CustomWidget element passed as argument.
      */
    /* static member */
    inline def createInCustomWidgetUnderObject(container: CustomWidget): WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderObject")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetObject]
    
    /**
      * Creates and returns a new WidgetObject instance in the SDK and on the server.
      * The new WidgetObject will be automatically stored in the 'objects' property
      * of the parent WidgetValue element passed as argument.
      */
    /* static member */
    inline def createInWidgetValueUnderObjects(container: WidgetValue): WidgetObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderObjects")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetObject]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObject.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObjectType")
  @js.native
  open class WidgetObjectType protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def containerAsCustomWidgetType: CustomWidgetType = js.native
    
    def containerAsWidgetValueType: WidgetValueType = js.native
    
    def propertyTypes: IList[WidgetPropertyType] = js.native
  }
  object WidgetObjectType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetObjectType]
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent CustomWidgetType element passed as argument.
      */
    /* static member */
    inline def createInCustomWidgetTypeUnderObjectType(container: CustomWidgetType): WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetObjectType]
    
    /**
      * Creates and returns a new WidgetObjectType instance in the SDK and on the server.
      * The new WidgetObjectType will be automatically stored in the 'objectType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createInWidgetValueTypeUnderObjectType(container: WidgetValueType): WidgetObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueTypeUnderObjectType")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetObjectType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetObjectType.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetProperty")
  @js.native
  open class WidgetProperty protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def containerAsWidgetObject: WidgetObject = js.native
    
    /**
      * In version 7.13.0: added optional
      */
    def `type`: WidgetPropertyType | Null = js.native
    def type_=(newValue: WidgetPropertyType | Null): Unit = js.native
    
    /**
      * In version 7.13.0: added optional
      */
    def value: WidgetValue | Null = js.native
    def value_=(newValue: WidgetValue | Null): Unit = js.native
  }
  object WidgetProperty {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetProperty")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetProperty]
    
    /**
      * Creates and returns a new WidgetProperty instance in the SDK and on the server.
      * The new WidgetProperty will be automatically stored in the 'properties' property
      * of the parent WidgetObject element passed as argument.
      */
    /* static member */
    inline def createIn(container: WidgetObject): WidgetProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetProperty]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetProperty.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetProperty.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType")
  @js.native
  open class WidgetPropertyType protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def caption: String = js.native
    def caption_=(newValue: String): Unit = js.native
    
    def category: String = js.native
    def category_=(newValue: String): Unit = js.native
    
    def containerAsWidgetObjectType: WidgetObjectType = js.native
    
    def description: String = js.native
    def description_=(newValue: String): Unit = js.native
    
    def isDefault: Boolean = js.native
    def isDefault_=(newValue: Boolean): Unit = js.native
    
    def key: String = js.native
    def key_=(newValue: String): Unit = js.native
    
    /**
      * In version 7.13.0: added optional
      */
    def valueType: WidgetValueType | Null = js.native
    def valueType_=(newValue: WidgetValueType | Null): Unit = js.native
  }
  object WidgetPropertyType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetPropertyType]
    
    /**
      * Creates and returns a new WidgetPropertyType instance in the SDK and on the server.
      * The new WidgetPropertyType will be automatically stored in the 'propertyTypes' property
      * of the parent WidgetObjectType element passed as argument.
      */
    /* static member */
    inline def createIn(container: WidgetObjectType): WidgetPropertyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetPropertyType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetPropertyType.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnType")
  @js.native
  open class WidgetReturnType protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def containerAsWidgetValueType: WidgetValueType = js.native
    
    def entityProperty: String = js.native
    def entityProperty_=(newValue: String): Unit = js.native
    
    def isList: Boolean = js.native
    def isList_=(newValue: Boolean): Unit = js.native
    
    def `type`: WidgetReturnTypeEnum = js.native
    def type_=(newValue: WidgetReturnTypeEnum): Unit = js.native
  }
  object WidgetReturnType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetReturnType]
    
    /**
      * Creates and returns a new WidgetReturnType instance in the SDK and on the server.
      * The new WidgetReturnType will be automatically stored in the 'returnType' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: WidgetValueType): WidgetReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetReturnType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnType.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum")
  @js.native
  open class WidgetReturnTypeEnum protected () extends AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetReturnTypeEnum {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.Boolean")
    @js.native
    def Boolean: WidgetReturnTypeEnum = js.native
    inline def Boolean_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.DateTime")
    @js.native
    def DateTime: WidgetReturnTypeEnum = js.native
    inline def DateTime_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.Decimal")
    @js.native
    def Decimal: WidgetReturnTypeEnum = js.native
    inline def Decimal_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.Float")
    @js.native
    def Float: WidgetReturnTypeEnum = js.native
    inline def Float_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.Integer")
    @js.native
    def Integer: WidgetReturnTypeEnum = js.native
    inline def Integer_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.Object")
    @js.native
    def Object: WidgetReturnTypeEnum = js.native
    inline def Object_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.String")
    @js.native
    def String: WidgetReturnTypeEnum = js.native
    inline def String_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetReturnTypeEnum.Void")
    @js.native
    def Void: WidgetReturnTypeEnum = js.native
    inline def Void_=(x: WidgetReturnTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Void")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetTranslation")
  @js.native
  open class WidgetTranslation protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def containerAsWidgetValueType: WidgetValueType = js.native
    
    def languageCode: String = js.native
    def languageCode_=(newValue: String): Unit = js.native
    
    def text: String = js.native
    def text_=(newValue: String): Unit = js.native
  }
  object WidgetTranslation {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetTranslation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetTranslation]
    
    /**
      * Creates and returns a new WidgetTranslation instance in the SDK and on the server.
      * The new WidgetTranslation will be automatically stored in the 'translations' property
      * of the parent WidgetValueType element passed as argument.
      */
    /* static member */
    inline def createIn(container: WidgetValueType): WidgetTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetTranslation]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetTranslation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetTranslation.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue")
  @js.native
  open class WidgetValue protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    /**
      * In version 7.19.0: introduced
      */
    def action: ClientAction = js.native
    def action_=(newValue: ClientAction): Unit = js.native
    
    /**
      * The value of this property is conceptually of type paths.LegacyAttributePath.
      *
      * In version 7.11.0: deleted
      */
    def attributePath: String = js.native
    def attributePath_=(newValue: String): Unit = js.native
    
    /**
      * In version 7.11.0: introduced
      */
    def attributeRef: AttributeRef | Null = js.native
    def attributeRef_=(newValue: AttributeRef | Null): Unit = js.native
    
    def containerAsWidgetProperty: WidgetProperty = js.native
    
    /**
      * In version 8.3.0: introduced
      */
    def dataSource: DataSource | Null = js.native
    def dataSource_=(newValue: DataSource | Null): Unit = js.native
    
    /**
      * The value of this property is conceptually of type paths.LegacyEntityPath.
      *
      * In version 7.11.0: deleted
      */
    def entityPath: String = js.native
    def entityPath_=(newValue: String): Unit = js.native
    
    /**
      * In version 7.11.0: introduced
      */
    def entityRef: EntityRef | Null = js.native
    def entityRef_=(newValue: EntityRef | Null): Unit = js.native
    
    /**
      * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
      *
      * In version 8.0.0: introduced
      */
    def expression: String = js.native
    def expression_=(newValue: String): Unit = js.native
    
    /**
      * In version 8.0.0: introduced
      */
    def icon: Icon | Null = js.native
    def icon_=(newValue: Icon | Null): Unit = js.native
    
    def image: IImage | Null = js.native
    
    def imageQualifiedName: String | Null = js.native
    
    def image_=(newValue: IImage | Null): Unit = js.native
    
    def microflow: IMicroflow | Null = js.native
    
    def microflowQualifiedName: String | Null = js.native
    
    def microflow_=(newValue: IMicroflow | Null): Unit = js.native
    
    /**
      * In version 7.13.0: introduced
      */
    def nanoflow: INanoflow | Null = js.native
    
    def nanoflowQualifiedName: String | Null = js.native
    
    def nanoflow_=(newValue: INanoflow | Null): Unit = js.native
    
    def objects: IList[WidgetObject] = js.native
    
    def page: IPage | Null = js.native
    
    def pageQualifiedName: String | Null = js.native
    
    def page_=(newValue: IPage | Null): Unit = js.native
    
    def primitiveValue: String = js.native
    def primitiveValue_=(newValue: String): Unit = js.native
    
    /**
      * In version 8.8.0: introduced
      */
    def sourceVariable: PageVariable | Null = js.native
    def sourceVariable_=(newValue: PageVariable | Null): Unit = js.native
    
    /**
      * In version 7.23.0: introduced
      */
    def textTemplate: ClientTemplate | Null = js.native
    def textTemplate_=(newValue: ClientTemplate | Null): Unit = js.native
    
    def translatableValue: Text | Null = js.native
    def translatableValue_=(newValue: Text | Null): Unit = js.native
    
    def `type`: WidgetValueType = js.native
    def type_=(newValue: WidgetValueType): Unit = js.native
    
    /**
      * In version 8.2.0: introduced
      */
    def widgets: IList[Widget] = js.native
    
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    def xPathConstraint: String = js.native
    def xPathConstraint_=(newValue: String): Unit = js.native
  }
  object WidgetValue {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetValue]
    
    /**
      * Creates and returns a new WidgetValue instance in the SDK and on the server.
      * The new WidgetValue will be automatically stored in the 'value' property
      * of the parent WidgetProperty element passed as argument.
      */
    /* static member */
    inline def createIn(container: WidgetProperty): WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetValue]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType")
  @js.native
  open class WidgetValueType protected () extends Element[IModel] {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
    
    def allowNonPersistableEntities: Boolean = js.native
    def allowNonPersistableEntities_=(newValue: Boolean): Unit = js.native
    
    /**
      * In version 9.12.0: introduced
      */
    def associationTypes: IList[CustomWidgetAssociationType] = js.native
    
    def attributeTypes: IList[CustomWidgetAttributeType] = js.native
    
    def containerAsWidgetPropertyType: WidgetPropertyType = js.native
    
    /**
      * In version 8.4.0: introduced
      */
    def dataSourceProperty: String = js.native
    def dataSourceProperty_=(newValue: String): Unit = js.native
    
    def defaultValue: String = js.native
    def defaultValue_=(newValue: String): Unit = js.native
    
    def entityProperty: String = js.native
    def entityProperty_=(newValue: String): Unit = js.native
    
    def enumerationValues: IList[WidgetEnumerationValue] = js.native
    
    def isList: Boolean = js.native
    def isList_=(newValue: Boolean): Unit = js.native
    
    def isPath: IsPath = js.native
    def isPath_=(newValue: IsPath): Unit = js.native
    
    def multiline: Boolean = js.native
    def multiline_=(newValue: Boolean): Unit = js.native
    
    def objectType: WidgetObjectType | Null = js.native
    def objectType_=(newValue: WidgetObjectType | Null): Unit = js.native
    
    /**
      * In version 8.0.0: introduced
      */
    def onChangeProperty: String = js.native
    def onChangeProperty_=(newValue: String): Unit = js.native
    
    def parameterIsList: Boolean = js.native
    def parameterIsList_=(newValue: Boolean): Unit = js.native
    
    def pathType: PathType = js.native
    def pathType_=(newValue: PathType): Unit = js.native
    
    def required: Boolean = js.native
    def required_=(newValue: Boolean): Unit = js.native
    
    def returnType: WidgetReturnType | Null = js.native
    def returnType_=(newValue: WidgetReturnType | Null): Unit = js.native
    
    /**
      * In version 9.12.0: introduced
      */
    def selectableObjectsProperty: String = js.native
    def selectableObjectsProperty_=(newValue: String): Unit = js.native
    
    def translations: IList[WidgetTranslation] = js.native
    
    def `type`: WidgetValueTypeEnum = js.native
    def type_=(newValue: WidgetValueTypeEnum): Unit = js.native
    
    /**
      * In version 9.12.0: deleted
      * In version 9.10.0: introduced
      */
    def universeDataSourceProperty: String = js.native
    def universeDataSourceProperty_=(newValue: String): Unit = js.native
  }
  object WidgetValueType {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetValueType]
    
    /**
      * Creates and returns a new WidgetValueType instance in the SDK and on the server.
      * The new WidgetValueType will be automatically stored in the 'valueType' property
      * of the parent WidgetPropertyType element passed as argument.
      */
    /* static member */
    inline def createIn(container: WidgetPropertyType): WidgetValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetValueType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueType.versionInfo")
    @js.native
    def versionInfo: StructureVersionInfo = js.native
    inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum")
  @js.native
  open class WidgetValueTypeEnum protected () extends AbstractEnum {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object WidgetValueTypeEnum {
    
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Action")
    @js.native
    def Action: WidgetValueTypeEnum = js.native
    inline def Action_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Action")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Association")
    @js.native
    def Association: WidgetValueTypeEnum = js.native
    inline def Association_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Association")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Attribute")
    @js.native
    def Attribute: WidgetValueTypeEnum = js.native
    inline def Attribute_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Attribute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Boolean")
    @js.native
    def Boolean: WidgetValueTypeEnum = js.native
    inline def Boolean_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.DataSource")
    @js.native
    def DataSource: WidgetValueTypeEnum = js.native
    inline def DataSource_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSource")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Decimal")
    @js.native
    def Decimal: WidgetValueTypeEnum = js.native
    inline def Decimal_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Entity")
    @js.native
    def Entity: WidgetValueTypeEnum = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.EntityConstraint")
    @js.native
    def EntityConstraint: WidgetValueTypeEnum = js.native
    inline def EntityConstraint_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EntityConstraint")(x.asInstanceOf[js.Any])
    
    inline def Entity_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Entity")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Enumeration")
    @js.native
    def Enumeration: WidgetValueTypeEnum = js.native
    inline def Enumeration_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enumeration")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Expression")
    @js.native
    def Expression: WidgetValueTypeEnum = js.native
    inline def Expression_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expression")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.File")
    @js.native
    def File: WidgetValueTypeEnum = js.native
    inline def File_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Form")
    @js.native
    def Form: WidgetValueTypeEnum = js.native
    inline def Form_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Icon")
    @js.native
    def Icon: WidgetValueTypeEnum = js.native
    inline def Icon_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Icon")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Image")
    @js.native
    def Image: WidgetValueTypeEnum = js.native
    inline def Image_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Integer")
    @js.native
    def Integer: WidgetValueTypeEnum = js.native
    inline def Integer_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Microflow")
    @js.native
    def Microflow: WidgetValueTypeEnum = js.native
    inline def Microflow_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Microflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Nanoflow")
    @js.native
    def Nanoflow: WidgetValueTypeEnum = js.native
    inline def Nanoflow_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nanoflow")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Object")
    @js.native
    def Object: WidgetValueTypeEnum = js.native
    inline def Object_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.String")
    @js.native
    def String: WidgetValueTypeEnum = js.native
    inline def String_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.System")
    @js.native
    def System: WidgetValueTypeEnum = js.native
    inline def System_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("System")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.TextTemplate")
    @js.native
    def TextTemplate: WidgetValueTypeEnum = js.native
    inline def TextTemplate_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.TranslatableString")
    @js.native
    def TranslatableString: WidgetValueTypeEnum = js.native
    inline def TranslatableString_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TranslatableString")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValueTypeEnum.Widgets")
    @js.native
    def Widgets: WidgetValueTypeEnum = js.native
    inline def Widgets_=(x: WidgetValueTypeEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Widgets")(x.asInstanceOf[js.Any])
  }
}
