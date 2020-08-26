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
  * See: {@link https://docs.mendix.com/refguide7/activities relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ActionActivity")
@js.native
class ActionActivity protected () extends Activity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FActionActivity: IModel = js.native
  def action: MicroflowAction | Null = js.native
  def action_=(newValue: MicroflowAction | Null): Unit = js.native
  def autoGenerateCaption: Boolean = js.native
  def autoGenerateCaption_=(newValue: Boolean): Unit = js.native
  def backgroundColor: ActionActivityColor = js.native
  def backgroundColor_=(newValue: ActionActivityColor): Unit = js.native
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ActionActivity")
@js.native
object ActionActivity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ActionActivity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ActionActivity = js.native
  /**
    * Creates and returns a new ActionActivity instance in the SDK and on the server.
    * The new ActionActivity will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: MicroflowObjectCollection): ActionActivity = js.native
}

