package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide7/button-widgets relevant section in reference guide}
  *
  * In version 7.3.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton")
@js.native
class LinkButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def address: StaticOrDynamicString = js.native
  def address_=(newValue: StaticOrDynamicString): Unit = js.native
  
  def linkType: LinkType = js.native
  def linkType_=(newValue: LinkType): Unit = js.native
}
object LinkButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.create")
  @js.native
  def create(model: IModel): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): LinkButton = js.native
  
  /**
    * Creates and returns a new LinkButton instance in the SDK and on the server.
    * The new LinkButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.2.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): LinkButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LinkButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
