package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/reference-selector relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector")
@js.native
class ReferenceSelector protected () extends AssociationWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.2.0: introduced
    */
  def emptyOptionCaption: Text = js.native
  def emptyOptionCaption_=(newValue: Text): Unit = js.native
  
  def formattingInfo: FormattingInfo = js.native
  def formattingInfo_=(newValue: FormattingInfo): Unit = js.native
  
  def gotoPageSettings: PageSettings = js.native
  def gotoPageSettings_=(newValue: PageSettings): Unit = js.native
  
  def renderMode: ReferenceSelectorRenderModeType = js.native
  def renderMode_=(newValue: ReferenceSelectorRenderModeType): Unit = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def required: Boolean = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def requiredMessage: Text = js.native
  def requiredMessage_=(newValue: Text): Unit = js.native
  
  def required_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def validation: WidgetValidation = js.native
  def validation_=(newValue: WidgetValidation): Unit = js.native
}
object ReferenceSelector {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.create")
  @js.native
  def create(model: IModel): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReferenceSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSelector instance in the SDK and on the server.
    * The new ReferenceSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): ReferenceSelector = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelector.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
