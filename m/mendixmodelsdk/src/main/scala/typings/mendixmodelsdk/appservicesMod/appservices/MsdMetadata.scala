package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata")
@js.native
class MsdMetadata protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsdMetadata: IModel = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsMsd(): Msd = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def headerAuthentication(): String = js.native
  def headerAuthentication(newValue: String): js.Any = js.native
  def image(): String = js.native
  def image(newValue: String): js.Any = js.native
  def instanceGuid(): String = js.native
  def instanceGuid(newValue: String): js.Any = js.native
  def microflows(): IList[MsdMicroflow] = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def publishDateTime(): String = js.native
  def publishDateTime(newValue: String): js.Any = js.native
  def serviceGuid(): String = js.native
  def serviceGuid(newValue: String): js.Any = js.native
  def supportedProtocols(): IList[String] = js.native
  def version(): Double = js.native
  def version(newValue: Double): js.Any = js.native
  def versionGuid(): String = js.native
  def versionGuid(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMetadata")
@js.native
object MsdMetadata extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdMetadata = js.native
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * The new MsdMetadata will be automatically stored in the 'metadata' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: Msd): MsdMetadata = js.native
}

