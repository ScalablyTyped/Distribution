package typings.mendixmodelsdk.distGenNativepagesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue
import typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItem
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.BottomBarItem
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.INativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.INativePage
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayout
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativePage
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativePageClientAction
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.NativePlaceholder
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.NativeNavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ActionButton
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ActionItem
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.AssociationWidget
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.AttributeWidget
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DataView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.DynamicImageViewer
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.FormBase
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GridActionButton
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Header
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IFormBase
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ILayoutParameter
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Icon
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Layout
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.LayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.LayoutGridColumn
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ListView
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ListViewTemplate
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.NavigationListItem
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ReferenceSetSelector
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.ScrollContainerRegion
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Snippet
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.SplitPane
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.StaticImageViewer
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TableCell
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.TemplateGridContents
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.Widget
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenTextsMod.textsNs.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/nativepages", "nativepages")
@js.native
object nativepagesNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  @js.native
  class BottomBarItem protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var action: ClientAction = js.native
    var caption: Text = js.native
    val containerAsNativeNavigationProfile: NativeNavigationProfile = js.native
    var icon: Icon | Null = js.native
    @JSName("model")
    var model_BottomBarItem: IModel = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  trait INativeLayout extends IFormBase
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  trait INativePage extends IFormBase
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.INativeLayout because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class NativeLayout protected () extends FormBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * In version 7.22.0: introduced
      */
    var headerWidget: Widget | Null = js.native
    val widgets: IList[Widget] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativeLayoutCallArgument protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsNativePage: NativePage = js.native
    @JSName("model")
    var model_NativeLayoutCallArgument: IModel = js.native
    var parameter: ILayoutParameter = js.native
    val parameterQualifiedName: String = js.native
    val widgets: IList[Widget] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.INativePage because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class NativePage protected () extends FormBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.23.0: introduced
      */
    val arguments: IList[NativeLayoutCallArgument] = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var layout: INativeLayout = js.native
    val layoutQualifiedName: String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePageClientAction protected () extends ClientAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var page: INativePage | Null = js.native
    val pageQualifiedName: String | Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePlaceholder protected () extends Widget {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object BottomBarItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BottomBarItem = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
      * of the parent navigation.NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: NativeNavigationProfile): BottomBarItem = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayout extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): NativeLayout = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayoutCallArgument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NativeLayoutCallArgument = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createIn(container: NativePage): NativeLayoutCallArgument = js.native
  }
  
  /* static members */
  @js.native
  object NativePage extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): NativePage = js.native
  }
  
  /* static members */
  @js.native
  object NativePageClientAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionButtonUnderAction(container: ActionButton): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionItemUnderAction(container: ActionItem): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGridActionButtonUnderAction(container: GridActionButton): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderClickAction(container: ListView): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInMenuItemUnderAction(container: MenuItem): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInWidgetValueUnderAction(container: WidgetValue): NativePageClientAction = js.native
  }
  
  /* static members */
  @js.native
  object NativePlaceholder extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderFooterWidgets(container: DataView): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderWidgets(container: DataView): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDivContainerUnderWidgets(container: DivContainer): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderLeftWidgets(container: Header): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderRightWidgets(container: Header): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderWidgets(container: ListView): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: NativeLayoutCallArgument): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: NativeLayout): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: NativeLayout): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSnippetUnderWidgets(container: Snippet): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTabPageUnderWidgets(container: TabPage): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTableCellUnderWidgets(container: TableCell): NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): NativePlaceholder = js.native
  }
  
}

