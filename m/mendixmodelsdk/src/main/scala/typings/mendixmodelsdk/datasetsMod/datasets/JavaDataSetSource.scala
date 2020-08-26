package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource")
@js.native
class JavaDataSetSource protected () extends DataSetSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FJavaDataSetSource: IModel = js.native
  def columns: IList[DataSetColumn] = js.native
  /**
    * In version 8.0.0: introduced
    */
  def useLegacyCodeGeneration: Boolean = js.native
  def useLegacyCodeGeneration_=(newValue: Boolean): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource")
@js.native
object JavaDataSetSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): JavaDataSetSource = js.native
  /**
    * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
    * The new JavaDataSetSource will be automatically stored in the 'source' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: DataSet): JavaDataSetSource = js.native
}

