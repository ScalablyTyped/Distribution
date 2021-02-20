package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout
import typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.reportsMod.reports.ReportPane
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/reference-set-selector relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector")
@js.native
class ReferenceSetSelector protected () extends ColumnGrid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def constrainedBy: IList[String] = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def constrainedByRefs: IList[EntityRef] = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def onChangeAction: ClientAction = js.native
  def onChangeAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onChangeMicroflowSettings: MicroflowSettings = js.native
  def onChangeMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeAllFromContext: Boolean = js.native
  def removeAllFromContext_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    */
  def removeFromContextEntities: IList[IEntity] = js.native
  
  def removeFromContextEntitiesQualifiedNames: js.Array[String] = js.native
  
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint: String = js.native
  def xPathConstraint_=(newValue: String): Unit = js.native
}
object ReferenceSetSelector {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.create")
  @js.native
  def create(model: IModel): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInBuildingBlockUnderWidget")
  @js.native
  def createInBuildingBlockUnderWidget(container: BuildingBlock): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInBuildingBlockUnderWidgets")
  @js.native
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'footerWidget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInDataViewUnderFooterWidget")
  @js.native
  def createInDataViewUnderFooterWidget(container: DataView): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInDataViewUnderFooterWidgets")
  @js.native
  def createInDataViewUnderFooterWidgets(container: DataView): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInDataViewUnderWidget")
  @js.native
  def createInDataViewUnderWidget(container: DataView): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInDataViewUnderWidgets")
  @js.native
  def createInDataViewUnderWidgets(container: DataView): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInDivContainerUnderWidget")
  @js.native
  def createInDivContainerUnderWidget(container: DivContainer): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInDivContainerUnderWidgets")
  @js.native
  def createInDivContainerUnderWidgets(container: DivContainer): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInGroupBoxUnderWidget")
  @js.native
  def createInGroupBoxUnderWidget(container: GroupBox): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInGroupBoxUnderWidgets")
  @js.native
  def createInGroupBoxUnderWidgets(container: GroupBox): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'leftWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInHeaderUnderLeftWidget")
  @js.native
  def createInHeaderUnderLeftWidget(container: Header): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInHeaderUnderLeftWidgets")
  @js.native
  def createInHeaderUnderLeftWidgets(container: Header): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'rightWidget' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInHeaderUnderRightWidget")
  @js.native
  def createInHeaderUnderRightWidget(container: Header): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInHeaderUnderRightWidgets")
  @js.native
  def createInHeaderUnderRightWidgets(container: Header): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInLayoutCallArgumentUnderWidget")
  @js.native
  def createInLayoutCallArgumentUnderWidget(container: LayoutCallArgument): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInLayoutCallArgumentUnderWidgets")
  @js.native
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInLayoutGridColumnUnderWidget")
  @js.native
  def createInLayoutGridColumnUnderWidget(container: LayoutGridColumn): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInLayoutGridColumnUnderWidgets")
  @js.native
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInLayoutUnderWidget")
  @js.native
  def createInLayoutUnderWidget(container: Layout): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInLayoutUnderWidgets")
  @js.native
  def createInLayoutUnderWidgets(container: Layout): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInListViewTemplateUnderWidget")
  @js.native
  def createInListViewTemplateUnderWidget(container: ListViewTemplate): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInListViewTemplateUnderWidgets")
  @js.native
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInListViewUnderWidget")
  @js.native
  def createInListViewUnderWidget(container: ListView): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInListViewUnderWidgets")
  @js.native
  def createInListViewUnderWidgets(container: ListView): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent MasterDetailRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.1.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInMasterDetailRegionUnderWidget")
  @js.native
  def createInMasterDetailRegionUnderWidget(container: MasterDetailRegion): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInNativeLayoutCallArgumentUnderWidgets")
  @js.native
  def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInNativeLayoutContentUnderSidebarWidgets")
  @js.native
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInNativeLayoutContentUnderWidgets")
  @js.native
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'headerWidget' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInNativeLayoutUnderHeaderWidget")
  @js.native
  def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent nativepages.NativeLayout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInNativeLayoutUnderWidgets")
  @js.native
  def createInNativeLayoutUnderWidgets(container: NativeLayout): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInNavigationListItemUnderWidget")
  @js.native
  def createInNavigationListItemUnderWidget(container: NavigationListItem): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInNavigationListItemUnderWidgets")
  @js.native
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'parameterWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInReportPaneUnderParameterWidget")
  @js.native
  def createInReportPaneUnderParameterWidget(container: ReportPane): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'reportWidget' property
    * of the parent reports.ReportPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.9.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInReportPaneUnderReportWidget")
  @js.native
  def createInReportPaneUnderReportWidget(container: ReportPane): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInScrollContainerRegionUnderWidget")
  @js.native
  def createInScrollContainerRegionUnderWidget(container: ScrollContainerRegion): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInScrollContainerRegionUnderWidgets")
  @js.native
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInSnippetUnderWidget")
  @js.native
  def createInSnippetUnderWidget(container: Snippet): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInSnippetUnderWidgets")
  @js.native
  def createInSnippetUnderWidgets(container: Snippet): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'firstWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInSplitPaneUnderFirstWidget")
  @js.native
  def createInSplitPaneUnderFirstWidget(container: SplitPane): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'firstWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInSplitPaneUnderFirstWidgets")
  @js.native
  def createInSplitPaneUnderFirstWidgets(container: SplitPane): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'secondWidget' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInSplitPaneUnderSecondWidget")
  @js.native
  def createInSplitPaneUnderSecondWidget(container: SplitPane): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'secondWidgets' property
    * of the parent SplitPane element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 7.23.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInSplitPaneUnderSecondWidgets")
  @js.native
  def createInSplitPaneUnderSecondWidgets(container: SplitPane): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInTabPageUnderWidget")
  @js.native
  def createInTabPageUnderWidget(container: TabPage): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInTabPageUnderWidgets")
  @js.native
  def createInTabPageUnderWidgets(container: TabPage): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInTableCellUnderWidget")
  @js.native
  def createInTableCellUnderWidget(container: TableCell): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInTableCellUnderWidgets")
  @js.native
  def createInTableCellUnderWidgets(container: TableCell): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widget' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInTemplateGridContentsUnderWidget")
  @js.native
  def createInTemplateGridContentsUnderWidget(container: TemplateGridContents): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInTemplateGridContentsUnderWidgets")
  @js.native
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent VerticalFlow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInVerticalFlowUnderWidgets")
  @js.native
  def createInVerticalFlowUnderWidgets(container: VerticalFlow): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInWebLayoutContentUnderWidgets")
  @js.native
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): ReferenceSetSelector = js.native
  
  /**
    * Creates and returns a new ReferenceSetSelector instance in the SDK and on the server.
    * The new ReferenceSetSelector will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.2.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.createInWidgetValueUnderWidgets")
  @js.native
  def createInWidgetValueUnderWidgets(container: WidgetValue): ReferenceSetSelector = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSetSelector.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
