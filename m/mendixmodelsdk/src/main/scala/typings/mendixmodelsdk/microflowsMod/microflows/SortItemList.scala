package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItemList")
@js.native
class SortItemList protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSortItemList: IModel = js.native
  def containerAsDatabaseRetrieveSource(): DatabaseRetrieveSource = js.native
  def containerAsSort(): Sort = js.native
  def items(): IList[SortItem] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.SortItemList")
@js.native
object SortItemList extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SortItemList = js.native
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  def createInDatabaseRetrieveSourceUnderSortItemList(container: DatabaseRetrieveSource): SortItemList = js.native
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent Sort element passed as argument.
    */
  def createInSortUnderSortItemList(container: Sort): SortItemList = js.native
}

