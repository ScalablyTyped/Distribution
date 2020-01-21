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
  * In version 7.18.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow")
@js.native
class OnClickMicroflow protected () extends OnClickBehavior {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FOnClickMicroflow: IModel = js.native
  def microflowSettings(): MicroflowSettings = js.native
  def microflowSettings(newValue: MicroflowSettings): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.OnClickMicroflow")
@js.native
object OnClickMicroflow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OnClickMicroflow = js.native
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * The new OnClickMicroflow will be automatically stored in the 'onClickBehavior' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  def createIn(container: DynamicImageViewer): OnClickMicroflow = js.native
}

