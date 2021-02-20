package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.navigationMod.navigation.NativeNavigationProfile
import typings.mendixmodelsdk.pagesMod.pages.ActionButton
import typings.mendixmodelsdk.pagesMod.pages.ActionItem
import typings.mendixmodelsdk.pagesMod.pages.AssociationWidget
import typings.mendixmodelsdk.pagesMod.pages.AttributeWidget
import typings.mendixmodelsdk.pagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.pagesMod.pages.DataView
import typings.mendixmodelsdk.pagesMod.pages.DivContainer
import typings.mendixmodelsdk.pagesMod.pages.DynamicImageViewer
import typings.mendixmodelsdk.pagesMod.pages.GridActionButton
import typings.mendixmodelsdk.pagesMod.pages.GroupBox
import typings.mendixmodelsdk.pagesMod.pages.Header
import typings.mendixmodelsdk.pagesMod.pages.Layout
import typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.pagesMod.pages.ListView
import typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.pagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector
import typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.pagesMod.pages.Snippet
import typings.mendixmodelsdk.pagesMod.pages.SplitPane
import typings.mendixmodelsdk.pagesMod.pages.StaticImageViewer
import typings.mendixmodelsdk.pagesMod.pages.TabPage
import typings.mendixmodelsdk.pagesMod.pages.TableCell
import typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativepages {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `NativePages`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.BottomBarItem")
  @js.native
  class BottomBarItem protected ()
    extends typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BottomBarItem {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.BottomBarItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.BottomBarItem.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
    
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
      * of the parent navigation.NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.BottomBarItem.createIn")
    @js.native
    def createIn(container: NativeNavigationProfile): typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.BottomBarItem.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.BottomBarItem.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayout")
  @js.native
  class NativeLayout protected ()
    extends typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object NativeLayout {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayout.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayout.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayout.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayoutCallArgument")
  @js.native
  class NativeLayoutCallArgument protected ()
    extends typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativeLayoutCallArgument {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayoutCallArgument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayoutCallArgument.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
    
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayoutCallArgument.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.nativepagesMod.nativepages.NativePage): typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayoutCallArgument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativeLayoutCallArgument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePage")
  @js.native
  class NativePage protected ()
    extends typings.mendixmodelsdk.nativepagesMod.nativepages.NativePage {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object NativePage {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePage.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePage = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction")
  @js.native
  class NativePageClientAction protected ()
    extends typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativePageClientAction {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInActionButtonUnderAction")
    @js.native
    def createInActionButtonUnderAction(container: ActionButton): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInActionItemUnderAction")
    @js.native
    def createInActionItemUnderAction(container: ActionItem): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInAssociationWidgetUnderOnChangeAction")
    @js.native
    def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnChangeAction")
    @js.native
    def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnEnterAction")
    @js.native
    def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInAttributeWidgetUnderOnLeaveAction")
    @js.native
    def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInDynamicImageViewerUnderClickAction")
    @js.native
    def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInGridActionButtonUnderAction")
    @js.native
    def createInGridActionButtonUnderAction(container: GridActionButton): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInListViewUnderClickAction")
    @js.native
    def createInListViewUnderClickAction(container: ListView): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInMenuItemUnderAction")
    @js.native
    def createInMenuItemUnderAction(container: MenuItem): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInReferenceSetSelectorUnderOnChangeAction")
    @js.native
    def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInStaticImageViewerUnderClickAction")
    @js.native
    def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.createInWidgetValueUnderAction")
    @js.native
    def createInWidgetValueUnderAction(container: WidgetValue): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePageClientAction = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePageClientAction.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder")
  @js.native
  class NativePlaceholder protected ()
    extends typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativePlaceholder {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInBuildingBlockUnderWidgets")
    @js.native
    def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInDataViewUnderFooterWidgets")
    @js.native
    def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInDataViewUnderWidgets")
    @js.native
    def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInDivContainerUnderWidgets")
    @js.native
    def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInGroupBoxUnderWidgets")
    @js.native
    def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInHeaderUnderLeftWidgets")
    @js.native
    def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInHeaderUnderRightWidgets")
    @js.native
    def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInLayoutCallArgumentUnderWidgets")
    @js.native
    def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInLayoutGridColumnUnderWidgets")
    @js.native
    def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInLayoutUnderWidgets")
    @js.native
    def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInListViewTemplateUnderWidgets")
    @js.native
    def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInListViewUnderWidgets")
    @js.native
    def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInNativeLayoutCallArgumentUnderWidgets")
    @js.native
    def createInNativeLayoutCallArgumentUnderWidgets(container: typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayoutCallArgument): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInNativeLayoutUnderHeaderWidget")
    @js.native
    def createInNativeLayoutUnderHeaderWidget(container: typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInNativeLayoutUnderWidgets")
    @js.native
    def createInNativeLayoutUnderWidgets(container: typings.mendixmodelsdk.nativepagesMod.nativepages.NativeLayout): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInNavigationListItemUnderWidgets")
    @js.native
    def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInScrollContainerRegionUnderWidgets")
    @js.native
    def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInSnippetUnderWidgets")
    @js.native
    def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInSplitPaneUnderFirstWidgets")
    @js.native
    def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInSplitPaneUnderSecondWidgets")
    @js.native
    def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInTabPageUnderWidgets")
    @js.native
    def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInTableCellUnderWidgets")
    @js.native
    def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.createInTemplateGridContentsUnderWidgets")
    @js.native
    def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.nativepagesMod.nativepages.NativePlaceholder = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "nativepages.NativePlaceholder.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.nativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
