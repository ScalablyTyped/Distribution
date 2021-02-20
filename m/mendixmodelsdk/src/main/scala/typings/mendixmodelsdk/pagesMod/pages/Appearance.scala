package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance")
@js.native
class Appearance protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def `class`: String = js.native
  def class_=(newValue: String): Unit = js.native
  
  def containerAsControlBarButton: ControlBarButton = js.native
  
  def containerAsGridColumn: GridColumn = js.native
  
  def containerAsLayout: Layout = js.native
  
  def containerAsLayoutGridColumn: LayoutGridColumn = js.native
  
  def containerAsLayoutGridRow: LayoutGridRow = js.native
  
  def containerAsNavigationListItem: NavigationListItem = js.native
  
  def containerAsPage: Page = js.native
  
  def containerAsPageTemplate: PageTemplate = js.native
  
  def containerAsScrollContainerRegion: ScrollContainerRegion = js.native
  
  def containerAsTableCell: TableCell = js.native
  
  def containerAsTableRow: TableRow = js.native
  
  def containerAsWidget: Widget = js.native
  
  def designProperties: IList[DesignPropertyValue] = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.13.0: introduced
    */
  def dynamicClasses: String = js.native
  def dynamicClasses_=(newValue: String): Unit = js.native
  
  def style: String = js.native
  def style_=(newValue: String): Unit = js.native
}
object Appearance {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.create")
  @js.native
  def create(model: IModel): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInControlBarButtonUnderAppearance")
  @js.native
  def createInControlBarButtonUnderAppearance(container: ControlBarButton): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInGridColumnUnderAppearance")
  @js.native
  def createInGridColumnUnderAppearance(container: GridColumn): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInLayoutGridColumnUnderAppearance")
  @js.native
  def createInLayoutGridColumnUnderAppearance(container: LayoutGridColumn): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInLayoutGridRowUnderAppearance")
  @js.native
  def createInLayoutGridRowUnderAppearance(container: LayoutGridRow): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInLayoutUnderAppearance")
  @js.native
  def createInLayoutUnderAppearance(container: Layout): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInNavigationListItemUnderAppearance")
  @js.native
  def createInNavigationListItemUnderAppearance(container: NavigationListItem): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInPageTemplateUnderAppearance")
  @js.native
  def createInPageTemplateUnderAppearance(container: PageTemplate): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInPageUnderAppearance")
  @js.native
  def createInPageUnderAppearance(container: Page): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInScrollContainerRegionUnderAppearance")
  @js.native
  def createInScrollContainerRegionUnderAppearance(container: ScrollContainerRegion): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInTableCellUnderAppearance")
  @js.native
  def createInTableCellUnderAppearance(container: TableCell): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInTableRowUnderAppearance")
  @js.native
  def createInTableRowUnderAppearance(container: TableRow): Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.createInWidgetUnderAppearance")
  @js.native
  def createInWidgetUnderAppearance(container: Widget): Appearance = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Appearance.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
