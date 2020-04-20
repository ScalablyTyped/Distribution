package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource")
@js.native
class OqlDataSetSource protected () extends DataSetSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FOqlDataSetSource: IModel = js.native
  def ignoreErrorsInQuery: Boolean = js.native
  def ignoreErrorsInQuery(newValue: Boolean): js.Any = js.native
  /**
    * The value of this property is conceptually of type oql.OqlQuery.
    */
  def query: String = js.native
  def query(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource")
@js.native
object OqlDataSetSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OqlDataSetSource = js.native
  /**
    * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
    * The new OqlDataSetSource will be automatically stored in the 'source' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: DataSet): OqlDataSetSource = js.native
}

