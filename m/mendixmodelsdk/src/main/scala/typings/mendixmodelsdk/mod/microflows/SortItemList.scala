package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.SortItemList")
@js.native
class SortItemList protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.SortItemList {
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
@JSImport("mendixmodelsdk", "microflows.SortItemList")
@js.native
object SortItemList extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.SortItemList = js.native
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  def createInDatabaseRetrieveSourceUnderSortItemList(container: typings.mendixmodelsdk.microflowsMod.microflows.DatabaseRetrieveSource): typings.mendixmodelsdk.microflowsMod.microflows.SortItemList = js.native
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent Sort element passed as argument.
    */
  def createInSortUnderSortItemList(container: typings.mendixmodelsdk.microflowsMod.microflows.Sort): typings.mendixmodelsdk.microflowsMod.microflows.SortItemList = js.native
}

