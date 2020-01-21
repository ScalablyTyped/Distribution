package typings.mendixmodelsdk.mod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess")
@js.native
class DataSetParameterAccess protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetParameterAccess {
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
@JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess")
@js.native
object DataSetParameterAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = js.native
  /**
    * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
    * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
    * of the parent DataSetModuleRoleAccess element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess): typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = js.native
}

