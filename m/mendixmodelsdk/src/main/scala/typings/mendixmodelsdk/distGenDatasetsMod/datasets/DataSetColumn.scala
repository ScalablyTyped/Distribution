package typings.mendixmodelsdk.distGenDatasetsMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetColumn")
@js.native
class DataSetColumn protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataSetColumn: IModel = js.native
  /**
    * In version 7.9.0: introduced
    */
  def columnType(): DataType = js.native
  def columnType(newValue: DataType): js.Any = js.native
  def containerAsJavaDataSetSource(): JavaDataSetSource = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`(): String = js.native
  def `type`(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetColumn")
@js.native
object DataSetColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetColumn = js.native
  /**
    * Creates and returns a new DataSetColumn instance in the SDK and on the server.
    * The new DataSetColumn will be automatically stored in the 'columns' property
    * of the parent JavaDataSetSource element passed as argument.
    */
  def createIn(container: JavaDataSetSource): DataSetColumn = js.native
}

