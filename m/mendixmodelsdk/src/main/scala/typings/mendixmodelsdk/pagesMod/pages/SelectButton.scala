package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectButton")
@js.native
class SelectButton protected () extends GridControlBarButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSelectButton: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectButton")
@js.native
object SelectButton extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SelectButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SelectButton = js.native
  /**
    * Creates and returns a new SelectButton instance in the SDK and on the server.
    * The new SelectButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  def createIn(container: ControlBar): SelectButton = js.native
}

