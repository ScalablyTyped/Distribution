package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
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
  * In version 7.17.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton")
@js.native
class NewButton protected () extends Button {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 6.3.0: deleted
    */
  def entity: IEntity | Null = js.native
  
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    * In version 6.3.0: introduced
    */
  def entityPath: String = js.native
  def entityPath_=(newValue: String): Unit = js.native
  
  def entityQualifiedName: String | Null = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def entityRef: EntityRef | Null = js.native
  def entityRef_=(newValue: EntityRef | Null): Unit = js.native
  
  def entity_=(newValue: IEntity | Null): Unit = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
}
object NewButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.create")
  @js.native
  def create(model: IModel): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.16.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NewButton = js.native
  
  /**
    * Creates and returns a new NewButton instance in the SDK and on the server.
    * The new NewButton will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): NewButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.NewButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
