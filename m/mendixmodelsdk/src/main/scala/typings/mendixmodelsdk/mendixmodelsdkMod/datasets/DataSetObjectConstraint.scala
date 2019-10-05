package typings.mendixmodelsdk.mendixmodelsdkMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
@js.native
class DataSetObjectConstraint protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets.DataSetObjectConstraint {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
@js.native
object DataSetObjectConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetObjectConstraint = js.native
  /**
    * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
    * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetObjectConstraint = js.native
}

