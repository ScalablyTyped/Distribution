package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile
import typings.mendixmodelsdk.srcGenPagesMod.pages.ActionButton
import typings.mendixmodelsdk.srcGenPagesMod.pages.ActionItem
import typings.mendixmodelsdk.srcGenPagesMod.pages.AssociationWidget
import typings.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget
import typings.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock
import typings.mendixmodelsdk.srcGenPagesMod.pages.DataView
import typings.mendixmodelsdk.srcGenPagesMod.pages.DivContainer
import typings.mendixmodelsdk.srcGenPagesMod.pages.DynamicImageViewer
import typings.mendixmodelsdk.srcGenPagesMod.pages.GridActionButton
import typings.mendixmodelsdk.srcGenPagesMod.pages.GroupBox
import typings.mendixmodelsdk.srcGenPagesMod.pages.Header
import typings.mendixmodelsdk.srcGenPagesMod.pages.Layout
import typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument
import typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn
import typings.mendixmodelsdk.srcGenPagesMod.pages.ListView
import typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem
import typings.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector
import typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion
import typings.mendixmodelsdk.srcGenPagesMod.pages.Snippet
import typings.mendixmodelsdk.srcGenPagesMod.pages.SplitPane
import typings.mendixmodelsdk.srcGenPagesMod.pages.StaticImageViewer
import typings.mendixmodelsdk.srcGenPagesMod.pages.TabPage
import typings.mendixmodelsdk.srcGenPagesMod.pages.TableCell
import typings.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.BottomBarItem")
  @js.native
  open class BottomBarItem protected ()
    extends typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.BottomBarItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem]
    
    /**
      * Creates and returns a new BottomBarItem instance in the SDK and on the server.
      * The new BottomBarItem will be automatically stored in the 'bottomBarItems' property
      * of the parent navigation.NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createIn(container: NativeNavigationProfile): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.BottomBarItem.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.BottomBarItem.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayout")
  @js.native
  open class NativeLayout protected ()
    extends typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object NativeLayout {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayout")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayout.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayout.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayoutCallArgument")
  @js.native
  open class NativeLayoutCallArgument protected ()
    extends typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayoutCallArgument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument]
    
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePage): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayoutCallArgument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativeLayoutCallArgument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.21.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePage")
  @js.native
  open class NativePage protected ()
    extends typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePage {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object NativePage {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePage]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePageClientAction")
  @js.native
  open class NativePageClientAction protected ()
    extends typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePageClientAction")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInActionButtonUnderAction(container: ActionButton): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInActionItemUnderAction(container: ActionItem): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInActionItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInGridActionButtonUnderAction(container: GridActionButton): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridActionButtonUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInListViewUnderClickAction(container: ListView): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInMenuItemUnderAction(container: MenuItem): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderClickAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInWidgetValueUnderAction(container: WidgetValue): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAction")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePageClientAction]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePageClientAction.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePageClientAction.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.0.0: deleted
    * In version 7.23.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePlaceholder")
  @js.native
  open class NativePlaceholder protected ()
    extends typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePlaceholder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInBuildingBlockUnderWidgets(container: BuildingBlock): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInDataViewUnderFooterWidgets(container: DataView): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInDataViewUnderWidgets(container: DataView): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInDivContainerUnderWidgets(container: DivContainer): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInGroupBoxUnderWidgets(container: GroupBox): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInHeaderUnderLeftWidgets(container: Header): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInHeaderUnderRightWidgets(container: Header): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInLayoutUnderWidgets(container: Layout): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInListViewTemplateUnderWidgets(container: ListViewTemplate): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInListViewUnderWidgets(container: ListView): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutCallArgumentUnderWidgets(container: typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayoutCallArgument): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderHeaderWidget(container: typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderHeaderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNativeLayoutUnderWidgets(container: typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativeLayout): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInNavigationListItemUnderWidgets(container: NavigationListItem): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInSnippetUnderWidgets(container: Snippet): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderFirstWidgets(container: SplitPane): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderFirstWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInSplitPaneUnderSecondWidgets(container: SplitPane): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSplitPaneUnderSecondWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInTabPageUnderWidgets(container: TabPage): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInTableCellUnderWidgets(container: TableCell): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 to 7.23.0
      */
    /* static member */
    inline def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.NativePlaceholder]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePlaceholder.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "nativepages.NativePlaceholder.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNativepagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
