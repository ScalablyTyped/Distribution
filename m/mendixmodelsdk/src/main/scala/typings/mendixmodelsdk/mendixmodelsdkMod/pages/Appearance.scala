package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.Appearance")
@js.native
class Appearance protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.Appearance {
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
@JSImport("mendixmodelsdk", "pages.Appearance")
@js.native
object Appearance extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInControlBarButtonUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.ControlBarButton): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInGridColumnUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutGridColumnUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutGridRowUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.LayoutGridRow): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInLayoutUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.Layout): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNavigationListItemUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.NavigationListItem): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInPageTemplateUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.PageTemplate): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInPageUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.Page): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInScrollContainerRegionUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInTableCellUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.TableCell): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInTableRowUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.TableRow): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWidgetUnderAppearance(container: typings.mendixmodelsdk.distGenPagesMod.pages.Widget): typings.mendixmodelsdk.distGenPagesMod.pages.Appearance = js.native
}

