package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
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
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.Appearance")
@js.native
open class Appearance protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.Appearance {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Appearance {
  
  @JSImport("mendixmodelsdk", "pages.Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInControlBarButtonUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInGridColumnUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.GridColumn): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutGridColumnUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridColumnUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutGridRowUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.LayoutGridRow): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutGridRowUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInLayoutUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Layout): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLayoutUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInNavigationListItemUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.NavigationListItem): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationListItemUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInPageTemplateUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.PageTemplate): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageTemplateUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInPageUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Page): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInScrollContainerRegionUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerRegionUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInTableCellUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.TableCell): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInTableRowUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.TableRow): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableRowUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInWidgetUnderAppearance(container: typings.mendixmodelsdk.srcGenPagesMod.pages.Widget): typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetUnderAppearance")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenPagesMod.pages.Appearance]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
