package typings.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.13.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.TemplatePlaceholder")
@js.native
open class TemplatePlaceholder protected ()
  extends typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object TemplatePlaceholder {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.TemplatePlaceholder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInBuildingBlockUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.BuildingBlock): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderFooterWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.DataView): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInDataViewUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.DataView): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInDivContainerUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.DivContainer): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInGroupBoxUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.GroupBox): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderLeftWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Header): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInHeaderUnderRightWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Header): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInLayoutCallArgumentUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInLayoutGridColumnUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInListViewTemplateUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInListViewUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ListView): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderSidebarWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInNativeLayoutContentUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInNavigationListItemUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInScrollContainerRegionUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInSnippetUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Snippet): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInTabPageUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.TabPage): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInTableCellUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.TableCell): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInTemplateGridContentsUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInWebLayoutContentUnderWidgets(container: typings.mendixmodelsdk.srcGenPagesMod.pages.WebLayoutContent): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.TemplatePlaceholder]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.TemplatePlaceholder.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.TemplatePlaceholder.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
