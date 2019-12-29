package typings.mendixmodelsdk.mendixmodelsdkMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetColumn")
@js.native
class DataSetColumn protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets.DataSetColumn {
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
@JSImport("mendixmodelsdk", "datasets.DataSetColumn")
@js.native
object DataSetColumn extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetColumn instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetColumn = js.native
  /**
    * Creates and returns a new DataSetColumn instance in the SDK and on the server.
    * The new DataSetColumn will be automatically stored in the 'columns' property
    * of the parent JavaDataSetSource element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDatasetsMod.datasets.JavaDataSetSource): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetColumn = js.native
}

