package typings.mendixmodelsdk.mendixmodelsdkMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
@js.native
class DataSetDateTimeConstraint protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.datasets.DataSetDateTimeConstraint {
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
@JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
@js.native
object DataSetDateTimeConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDatasetsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetDateTimeConstraint = js.native
  /**
    * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
    * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetDateTimeConstraint = js.native
}

