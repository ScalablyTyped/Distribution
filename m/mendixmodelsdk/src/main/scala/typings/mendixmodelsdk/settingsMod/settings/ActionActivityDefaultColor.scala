package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.ActionActivityColor
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Settings`.
  */
/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ActionActivityDefaultColor")
@js.native
class ActionActivityDefaultColor protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FActionActivityDefaultColor: IModel = js.native
  def actionActivityType: String = js.native
  def actionActivityType(newValue: String): js.Any = js.native
  def backgroundColor: ActionActivityColor = js.native
  def backgroundColor(newValue: ActionActivityColor): js.Any = js.native
  def containerAsModelerSettings: ModelerSettings = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.ActionActivityDefaultColor")
@js.native
object ActionActivityDefaultColor extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ActionActivityDefaultColor = js.native
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * The new ActionActivityDefaultColor will be automatically stored in the 'actionActivityDefaultColors' property
    * of the parent ModelerSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createIn(container: ModelerSettings): ActionActivityDefaultColor = js.native
}

