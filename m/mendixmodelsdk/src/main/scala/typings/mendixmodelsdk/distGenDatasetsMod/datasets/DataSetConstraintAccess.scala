package typings.mendixmodelsdk.distGenDatasetsMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess")
@js.native
class DataSetConstraintAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var constraintText: String = js.native
  val containerAsDataSetParameterAccess: DataSetParameterAccess = js.native
  var enabled: Boolean = js.native
  @JSName("model")
  var model_DataSetConstraintAccess: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess")
@js.native
object DataSetConstraintAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetConstraintAccess = js.native
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
    * of the parent DataSetParameterAccess element passed as argument.
    */
  def createIn(container: DataSetParameterAccess): DataSetConstraintAccess = js.native
}

