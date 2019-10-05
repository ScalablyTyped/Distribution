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

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess")
@js.native
class DataSetParameterAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val constraintAccessList: IList[DataSetConstraintAccess] = js.native
  val containerAsDataSetModuleRoleAccess: DataSetModuleRoleAccess = js.native
  @JSName("model")
  var model_DataSetParameterAccess: IModel = js.native
  var parameterName: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess")
@js.native
object DataSetParameterAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetParameterAccess = js.native
  /**
    * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
    * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
    * of the parent DataSetModuleRoleAccess element passed as argument.
    */
  def createIn(container: DataSetModuleRoleAccess): DataSetParameterAccess = js.native
}

