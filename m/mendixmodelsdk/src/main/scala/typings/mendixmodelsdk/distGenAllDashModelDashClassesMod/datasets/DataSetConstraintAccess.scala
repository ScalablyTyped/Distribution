package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess")
@js.native
class DataSetConstraintAccess protected ()
  extends typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetConstraintAccess {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetConstraintAccess")
@js.native
object DataSetConstraintAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetConstraintAccess = js.native
  /**
    * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
    * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
    * of the parent DataSetParameterAccess element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameterAccess): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetConstraintAccess = js.native
}

