package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/loop relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LoopedActivity")
@js.native
class LoopedActivity protected () extends Activity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FLoopedActivity: IModel = js.native
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  def errorHandlingType: ErrorHandlingType = js.native
  def errorHandlingType_=(newValue: ErrorHandlingType): Unit = js.native
  def iteratedListVariableName: String = js.native
  def iteratedListVariableName_=(newValue: String): Unit = js.native
  def loopVariableName: String = js.native
  def loopVariableName_=(newValue: String): Unit = js.native
  def objectCollection: MicroflowObjectCollection = js.native
  def objectCollection_=(newValue: MicroflowObjectCollection): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.LoopedActivity")
@js.native
object LoopedActivity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LoopedActivity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LoopedActivity = js.native
  /**
    * Creates and returns a new LoopedActivity instance in the SDK and on the server.
    * The new LoopedActivity will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: MicroflowObjectCollection): LoopedActivity = js.native
}

