package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/sort-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.GridSortBar")
@js.native
class GridSortBar protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.GridSortBar {
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
@JSImport("mendixmodelsdk", "pages.GridSortBar")
@js.native
object GridSortBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent DropDownSearchField element passed as argument.
    */
  def createInDropDownSearchFieldUnderSortBar(container: typings.mendixmodelsdk.distGenPagesMod.pages.DropDownSearchField): typings.mendixmodelsdk.distGenPagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.2.0 and higher
    */
  def createInSelectorDatabaseSourceUnderSortBar(container: typings.mendixmodelsdk.distGenPagesMod.pages.SelectorDatabaseSource): typings.mendixmodelsdk.distGenPagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SelectorXPathSource element passed as argument.
    */
  def createInSelectorXPathSourceUnderSortBar(container: typings.mendixmodelsdk.distGenPagesMod.pages.SelectorXPathSource): typings.mendixmodelsdk.distGenPagesMod.pages.GridSortBar = js.native
  /**
    * Creates and returns a new GridSortBar instance in the SDK and on the server.
    * The new GridSortBar will be automatically stored in the 'sortBar' property
    * of the parent SortableEntityPathSource element passed as argument.
    */
  def createInSortableEntityPathSourceUnderSortBar(container: typings.mendixmodelsdk.distGenPagesMod.pages.SortableEntityPathSource): typings.mendixmodelsdk.distGenPagesMod.pages.GridSortBar = js.native
}

