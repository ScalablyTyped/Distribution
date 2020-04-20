package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewSearch")
@js.native
class ListViewSearch protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FListViewSearch: IModel = js.native
  def containerAsListViewDatabaseSource: ListViewDatabaseSource = js.native
  def containerAsListViewXPathSource: ListViewXPathSource = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def searchPaths: IList[String] = js.native
  /**
    * In version 7.11.0: introduced
    */
  def searchRefs: IList[AttributeRef] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewSearch")
@js.native
object ListViewSearch extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ListViewSearch = js.native
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewDatabaseSource element passed as argument.
    */
  def createInListViewDatabaseSourceUnderSearch(container: ListViewDatabaseSource): ListViewSearch = js.native
  /**
    * Creates and returns a new ListViewSearch instance in the SDK and on the server.
    * The new ListViewSearch will be automatically stored in the 'search' property
    * of the parent ListViewXPathSource element passed as argument.
    */
  def createInListViewXPathSourceUnderSearch(container: ListViewXPathSource): ListViewSearch = js.native
}

