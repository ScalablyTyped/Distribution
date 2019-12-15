package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/exclusive-split relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExclusiveSplit")
@js.native
class ExclusiveSplit protected () extends MicroflowObject {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FExclusiveSplit: IModel = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def errorHandlingType(): ErrorHandlingType = js.native
  def errorHandlingType(newValue: ErrorHandlingType): js.Any = js.native
  def splitCondition(): SplitCondition = js.native
  def splitCondition(newValue: SplitCondition): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExclusiveSplit")
@js.native
object ExclusiveSplit extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ExclusiveSplit = js.native
  /**
    * Creates and returns a new ExclusiveSplit instance in the SDK and on the server.
    * The new ExclusiveSplit will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: MicroflowObjectCollection): ExclusiveSplit = js.native
}

