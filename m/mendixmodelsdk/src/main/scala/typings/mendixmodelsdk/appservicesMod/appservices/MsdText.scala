package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText")
@js.native
class MsdText protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsdText: IModel = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsMsdEnumerationValue(): MsdEnumerationValue = js.native
  def languageCode(): String = js.native
  def languageCode(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdText")
@js.native
object MsdText extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdText instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdText = js.native
  /**
    * Creates and returns a new MsdText instance in the SDK and on the server.
    * The new MsdText will be automatically stored in the 'translations' property
    * of the parent MsdEnumerationValue element passed as argument.
    */
  def createIn(container: MsdEnumerationValue): MsdText = js.native
}

