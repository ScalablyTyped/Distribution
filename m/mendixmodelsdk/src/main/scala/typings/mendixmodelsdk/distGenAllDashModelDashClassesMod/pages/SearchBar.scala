package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/search-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.SearchBar")
@js.native
class SearchBar protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.SearchBar {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.SearchBar")
@js.native
object SearchBar extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.SearchBar = js.native
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * The new SearchBar will be automatically stored in the 'searchBar' property
    * of the parent GridBaseSource element passed as argument.
    */
  def createInGridBaseSourceUnderSearchBar(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridBaseSource): typings.mendixmodelsdk.distGenPagesMod.pages.SearchBar = js.native
  /**
    * Creates and returns a new SearchBar instance in the SDK and on the server.
    * The new SearchBar will be automatically stored in the 'searchBar' property
    * of the parent GridDatabaseSource element passed as argument.
    */
  def createInGridDatabaseSourceUnderSearchBar(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridDatabaseSource): typings.mendixmodelsdk.distGenPagesMod.pages.SearchBar = js.native
}

