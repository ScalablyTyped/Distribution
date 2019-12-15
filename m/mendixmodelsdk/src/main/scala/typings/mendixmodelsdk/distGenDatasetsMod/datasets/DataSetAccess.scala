package typings.mendixmodelsdk.distGenDatasetsMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetAccess")
@js.native
class DataSetAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataSetAccess: IModel = js.native
  def containerAsDataSet(): DataSet = js.native
  def moduleRoleAccessList(): IList[DataSetModuleRoleAccess] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetAccess")
@js.native
object DataSetAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetAccess = js.native
  /**
    * Creates and returns a new DataSetAccess instance in the SDK and on the server.
    * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: DataSet): DataSetAccess = js.native
}

