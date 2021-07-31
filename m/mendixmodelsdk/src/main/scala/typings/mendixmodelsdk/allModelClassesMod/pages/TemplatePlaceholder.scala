package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.13.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TemplatePlaceholder")
@js.native
class TemplatePlaceholder protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder {
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
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TemplatePlaceholder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInBuildingBlockUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.BuildingBlock): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBuildingBlockUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderFooterWidgets(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderFooterWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataViewUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.DataView): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDivContainerUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.DivContainer): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDivContainerUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInGroupBoxUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.GroupBox): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderLeftWidgets(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderLeftWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInHeaderUnderRightWidgets(container: typings.mendixmodelsdk.pagesMod.pages.Header): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHeaderUnderRightWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInLayoutCallArgumentUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.LayoutCallArgument): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutCallArgumentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInLayoutGridColumnUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewTemplateUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.ListViewTemplate): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewTemplateUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInListViewUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.ListView): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutContentUnderSidebarWidgets(container: typings.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderSidebarWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNativeLayoutContentUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.NativeLayoutContent): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNativeLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInNavigationListItemUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.NavigationListItem): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInScrollContainerRegionUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInSnippetUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.Snippet): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTabPageUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.TabPage): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTableCellUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.TableCell): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInTemplateGridContentsUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.TemplateGridContents): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateGridContentsUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWebLayoutContentUnderWidgets(container: typings.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebLayoutContentUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @scala.inline
  def createInWidgetValueUnderWidgets(container: WidgetValue): typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderWidgets")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.TemplatePlaceholder]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TemplatePlaceholder.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.TemplatePlaceholder.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
