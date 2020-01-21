package typings.mendixmodelsdk.allModelClassesMod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint")
@js.native
class DataSetNumericConstraint protected ()
  extends typings.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datasets.DataSetNumericConstraint")
@js.native
object DataSetNumericConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = js.native
  /**
    * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
    * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = js.native
}

