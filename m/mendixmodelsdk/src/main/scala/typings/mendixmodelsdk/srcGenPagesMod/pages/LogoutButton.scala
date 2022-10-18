package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenReportsMod.reports.ReportPane
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/button-widgets relevant section in reference guide}
  *
  * In version 7.1.0: deleted
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.LogoutButton")
@js.native
open class LogoutButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LogoutButton {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.LogoutButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.0.2
    */
  /* static member */
  inline def createInDataViewUnderFooterWidget(container: DataView): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInDataViewUnderWidget(container: DataView): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInDivContainerUnderWidget(container: DivContainer): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInGroupBoxUnderWidget(container: GroupBox): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInHeaderUnderLeftWidget(container: Header): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInHeaderUnderRightWidget(container: Header): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInLayoutUnderWidget(container: Layout): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInListViewTemplateUnderWidget(container: ListViewTemplate): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInListViewUnderWidget(container: ListView): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInNavigationListItemUnderWidget(container: NavigationListItem): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderParameterWidget(container: ReportPane): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderParameterWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  inline def createInReportPaneUnderReportWidget(container: ReportPane): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportPaneUnderReportWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInSnippetUnderWidget(container: Snippet): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInSplitPaneUnderFirstWidget(container: SplitPane): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInSplitPaneUnderSecondWidget(container: SplitPane): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInTabPageUnderWidget(container: TabPage): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInTableCellUnderWidget(container: TableCell): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /**
    * Creates and returns a new LogoutButton instance in the SDK and on the server.
    * The new LogoutButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.2
    */
  /* static member */
  inline def createInVerticalFlowUnderWidgets(container: VerticalFlow): LogoutButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVerticalFlowUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[LogoutButton]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.LogoutButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.LogoutButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
