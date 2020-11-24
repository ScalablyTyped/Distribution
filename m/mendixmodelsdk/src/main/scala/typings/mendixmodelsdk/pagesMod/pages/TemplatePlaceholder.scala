package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.13.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplatePlaceholder")
@js.native
class TemplatePlaceholder protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplatePlaceholder")
@js.native
object TemplatePlaceholder extends js.Object {
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent BuildingBlock element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInBuildingBlockUnderWidgets(container: BuildingBlock): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'footerWidgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInDataViewUnderFooterWidgets(container: DataView): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent DataView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInDataViewUnderWidgets(container: DataView): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInDivContainerUnderWidgets(container: DivContainer): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent GroupBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInGroupBoxUnderWidgets(container: GroupBox): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'leftWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInHeaderUnderLeftWidgets(container: Header): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'rightWidgets' property
    * of the parent Header element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInHeaderUnderRightWidgets(container: Header): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent LayoutCallArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInLayoutCallArgumentUnderWidgets(container: LayoutCallArgument): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInLayoutGridColumnUnderWidgets(container: LayoutGridColumn): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ListViewTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInListViewTemplateUnderWidgets(container: ListViewTemplate): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInListViewUnderWidgets(container: ListView): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'sidebarWidgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInNativeLayoutContentUnderSidebarWidgets(container: NativeLayoutContent): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent NativeLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInNativeLayoutContentUnderWidgets(container: NativeLayoutContent): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInNavigationListItemUnderWidgets(container: NavigationListItem): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInScrollContainerRegionUnderWidgets(container: ScrollContainerRegion): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent Snippet element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInSnippetUnderWidgets(container: Snippet): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInTabPageUnderWidgets(container: TabPage): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInTableCellUnderWidgets(container: TableCell): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent TemplateGridContents element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInTemplateGridContentsUnderWidgets(container: TemplateGridContents): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInWebLayoutContentUnderWidgets(container: WebLayoutContent): TemplatePlaceholder = js.native
  
  /**
    * Creates and returns a new TemplatePlaceholder instance in the SDK and on the server.
    * The new TemplatePlaceholder will be automatically stored in the 'widgets' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  def createInWidgetValueUnderWidgets(container: WidgetValue): TemplatePlaceholder = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
