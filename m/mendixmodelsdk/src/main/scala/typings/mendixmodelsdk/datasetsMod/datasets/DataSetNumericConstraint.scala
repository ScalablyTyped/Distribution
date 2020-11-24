package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint")
@js.native
class DataSetNumericConstraint protected () extends DataSetParameterConstraint {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def applyBegin: Boolean = js.native
  def applyBegin_=(newValue: Boolean): Unit = js.native
  
  def applyEnd: Boolean = js.native
  def applyEnd_=(newValue: Boolean): Unit = js.native
  
  def begin: String = js.native
  def begin_=(newValue: String): Unit = js.native
  
  def end: String = js.native
  def end_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint")
@js.native
object DataSetNumericConstraint extends js.Object {
  
  /**
    * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataSetNumericConstraint = js.native
  
  /**
    * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
    * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: DataSetParameter): DataSetNumericConstraint = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
