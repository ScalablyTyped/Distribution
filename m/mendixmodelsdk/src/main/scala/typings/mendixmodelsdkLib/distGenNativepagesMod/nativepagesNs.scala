package typings
package mendixmodelsdkLib.distGenNativepagesMod

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
    * In version 7.21.0: introduced
    */
  @js.native
  trait INativeLayout
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.IFormBase
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.23.0: introduced
    */
  @js.native
  trait INativeLayoutParameter
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    @JSName("model")
    val model_INativeLayoutParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  @js.native
  trait INativePage
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.IFormBase
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativeLayout because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class NativeLayout protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.FormBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * In version 7.22.0: introduced
      */
    var headerWidget: mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget | scala.Null = js.native
    val widgets: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.23.0: introduced
    */
  @js.native
  class NativeLayoutCallArgument protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsNativePage: NativePage = js.native
    @JSName("model")
    var model_NativeLayoutCallArgument: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var parameter: INativeLayoutParameter = js.native
    val parameterQualifiedName: java.lang.String = js.native
    val widgets: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget] = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.23.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativeLayoutParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined name, asLoaded, load, load, load, load */ @js.native
  class NativeLayoutParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("model")
    var model_NativeLayoutParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativePage because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class NativePage protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.FormBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.23.0: introduced
      */
    val arguments: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[NativeLayoutCallArgument] = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var layout: INativeLayout = js.native
    val layoutQualifiedName: java.lang.String = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePageClientAction protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.ClientAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var page: INativePage | scala.Null = js.native
    val pageQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.23.0: introduced
    */
  @js.native
  class NativePlaceholder protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.PlaceholderBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* static members */
  @js.native
  object NativeLayout extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativeLayout unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayout = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayoutCallArgument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument = js.native
    /**
      * Creates and returns a new NativeLayoutCallArgument instance in the SDK and on the server.
      * The new NativeLayoutCallArgument will be automatically stored in the 'arguments' property
      * of the parent NativePage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePage): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument = js.native
  }
  
  /* static members */
  @js.native
  object NativeLayoutParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeLayoutParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayoutParameter = js.native
  }
  
  /* static members */
  @js.native
  object NativePage extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new NativePage unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePage = js.native
  }
  
  /* static members */
  @js.native
  object NativePageClientAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInActionButtonUnderAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ActionButton): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.ActionItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInActionItemUnderAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ActionItem): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AssociationWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInAssociationWidgetUnderOnChangeAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.AssociationWidget): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInAttributeWidgetUnderOnChangeAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.AttributeWidget): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onEnterAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInAttributeWidgetUnderOnEnterAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.AttributeWidget): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onLeaveAction' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInAttributeWidgetUnderOnLeaveAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.AttributeWidget): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.DynamicImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInDynamicImageViewerUnderClickAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DynamicImageViewer): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent pages.GridActionButton element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInGridActionButtonUnderAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GridActionButton): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInListViewUnderClickAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInMenuItemUnderAction(container: mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItem): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'onChangeAction' property
      * of the parent pages.ReferenceSetSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInReferenceSetSelectorUnderOnChangeAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ReferenceSetSelector): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'clickAction' property
      * of the parent pages.StaticImageViewer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInStaticImageViewerUnderClickAction(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.StaticImageViewer): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
    /**
      * Creates and returns a new NativePageClientAction instance in the SDK and on the server.
      * The new NativePageClientAction will be automatically stored in the 'action' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInWidgetValueUnderAction(container: mendixmodelsdkLib.distGenCustomwidgetsMod.customwidgetsNs.WidgetValue): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePageClientAction = js.native
  }
  
  /* static members */
  @js.native
  object NativePlaceholder extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNativepagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.BuildingBlock element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInBuildingBlockUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'footerWidgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInDataViewUnderFooterWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DataView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInDataViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.DivContainer element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInDivContainerUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.GroupBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInGroupBoxUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'leftWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInHeaderUnderLeftWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'rightWidgets' property
      * of the parent pages.Header element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInHeaderUnderRightWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInLayoutCallArgumentUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.LayoutGridColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInLayoutGridColumnUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Layout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInLayoutUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListViewTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInListViewTemplateUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ListView element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInListViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayoutCallArgument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInNativeLayoutCallArgumentUnderWidgets(container: mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayoutCallArgument): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'headerWidget' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInNativeLayoutUnderHeaderWidget(container: mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayout): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent NativeLayout element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInNativeLayoutUnderWidgets(container: mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativeLayout): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.NavigationListItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInNavigationListItemUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.ScrollContainerRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInScrollContainerRegionUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.Snippet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInSnippetUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'firstWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInSplitPaneUnderFirstWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'secondWidgets' property
      * of the parent pages.SplitPane element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInSplitPaneUnderSecondWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TabPage element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInTabPageUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TableCell element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInTableCellUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
    /**
      * Creates and returns a new NativePlaceholder instance in the SDK and on the server.
      * The new NativePlaceholder will be automatically stored in the 'widgets' property
      * of the parent pages.TemplateGridContents element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.23.0 and higher
      */
    def createInTemplateGridContentsUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.NativePlaceholder = js.native
  }
  
}

