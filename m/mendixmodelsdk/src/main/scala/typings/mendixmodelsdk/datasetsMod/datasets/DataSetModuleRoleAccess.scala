package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess")
@js.native
class DataSetModuleRoleAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataSetModuleRoleAccess: IModel = js.native
  def containerAsDataSetAccess: DataSetAccess = js.native
  def moduleRole(): js.Any = js.native
  def moduleRole(newValue: IModuleRole): js.Any = js.native
  def moduleRoleQualifiedName: String | Null = js.native
  @JSName("moduleRole")
  def moduleRole_Union: IModuleRole | Null = js.native
  def parameterAccessList: IList[DataSetParameterAccess] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess")
@js.native
object DataSetModuleRoleAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetModuleRoleAccess = js.native
  /**
    * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
    * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
    * of the parent DataSetAccess element passed as argument.
    */
  def createIn(container: DataSetAccess): DataSetModuleRoleAccess = js.native
}

