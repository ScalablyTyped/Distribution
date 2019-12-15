package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/search-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchBar")
@js.native
class SearchBar protected () extends ControlBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSearchBar: IModel = js.native
  def `type`(): SearchBarTypeEnum = js.native
  def `type`(newValue: SearchBarTypeEnum): js.Any = js.native
  def waitForSearch(): Boolean = js.native
  def waitForSearch(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SearchBar")
@js.native
object SearchBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SearchBar = js.native
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * The new SearchBar will be automatically stored in the 'searchBar' property
    * of the parent GridBaseSource element passed as argument.
    */
  def createInGridBaseSourceUnderSearchBar(container: GridBaseSource): SearchBar = js.native
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * The new SearchBar will be automatically stored in the 'searchBar' property
    * of the parent GridDatabaseSource element passed as argument.
    */
  def createInGridDatabaseSourceUnderSearchBar(container: GridDatabaseSource): SearchBar = js.native
}

