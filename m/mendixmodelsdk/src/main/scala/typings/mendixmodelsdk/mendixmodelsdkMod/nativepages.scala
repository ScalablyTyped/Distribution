package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.distGenNavigationMod.navigation.NativeNavigationProfile
import typings.mendixmodelsdk.distGenPagesMod.pages.ActionButton
import typings.mendixmodelsdk.distGenPagesMod.pages.ActionItem
import typings.mendixmodelsdk.distGenPagesMod.pages.AssociationWidget
import typings.mendixmodelsdk.distGenPagesMod.pages.AttributeWidget
import typings.mendixmodelsdk.distGenPagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.distGenPagesMod.pages.DataView
import typings.mendixmodelsdk.distGenPagesMod.pages.DivContainer
import typings.mendixmodelsdk.distGenPagesMod.pages.DynamicImageViewer
import typings.mendixmodelsdk.distGenPagesMod.pages.GridActionButton
import typings.mendixmodelsdk.distGenPagesMod.pages.GroupBox
import typings.mendixmodelsdk.distGenPagesMod.pages.Header
import typings.mendixmodelsdk.distGenPagesMod.pages.Layout
import typings.mendixmodelsdk.distGenPagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.distGenPagesMod.pages.ListView
import typings.mendixmodelsdk.distGenPagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSetSelector
import typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.distGenPagesMod.pages.Snippet
import typings.mendixmodelsdk.distGenPagesMod.pages.SplitPane
import typings.mendixmodelsdk.distGenPagesMod.pages.StaticImageViewer
import typings.mendixmodelsdk.distGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.distGenPagesMod.pages.TableCell
import typings.mendixmodelsdk.distGenPagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "nativepages")
@js.native
object nativepages extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  @js.native
  class BottomBarItem protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.nativepages.BottomBarItem {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  class NativeLayout protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.nativepages.NativeLayout {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativeLayoutCallArgument protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.nativepages.NativeLayoutCallArgument {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @js.native
  class NativePage protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.nativepages.NativePage {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePageClientAction protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.nativepages.NativePageClientAction {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePlaceholder protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.nativepages.NativePlaceholder {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object BottomBarItem extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem = js.native
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
      * of the parent navigation.NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createIn(container: NativeNavigationProfile): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.BottomBarItem = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayout extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayoutCallArgument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createIn(container: typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePage): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument = js.native
  }
  
  /* static members */
  @js.native
  object NativePage extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePage = js.native
  }
  
  /* static members */
  @js.native
  object NativePageClientAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionButtonUnderAction(container: ActionButton): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInActionItemUnderAction(container: ActionItem): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGridActionButtonUnderAction(container: GridActionButton): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderClickAction(container: ListView): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInMenuItemUnderAction(container: MenuItem): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInWidgetValueUnderAction(container: WidgetValue): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePageClientAction = js.native
  }
  
  /* static members */
  @js.native
  object NativePlaceholder extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayoutCallArgument): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderHeaderWidget(container: typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNativeLayoutUnderWidgets(container: typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativeLayout): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.distGenNativepagesMod.nativepages.NativePlaceholder = js.native
  }
  
}

