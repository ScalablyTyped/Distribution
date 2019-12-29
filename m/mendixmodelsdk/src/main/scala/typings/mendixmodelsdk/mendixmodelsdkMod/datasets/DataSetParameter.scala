package typings.mendixmodelsdk.mendixmodelsdkMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetParameter")
@js.native
class DataSetParameter protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets.DataSetParameter {
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
@JSImport("mendixmodelsdk", "datasets.DataSetParameter")
@js.native
object DataSetParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter = js.native
  /**
    * Creates and returns a new DataSetParameter instance in the SDK and on the server.
    * The new DataSetParameter will be automatically stored in the 'parameters' property
    * of the parent DataSet element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSet): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter = js.native
}

