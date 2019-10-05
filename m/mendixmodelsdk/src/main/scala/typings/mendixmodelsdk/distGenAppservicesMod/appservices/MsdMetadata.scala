package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  var caption: String = js.native
  val containerAsMsd: Msd = js.native
  var description: String = js.native
  var documentation: String = js.native
  var headerAuthentication: String = js.native
  var image: String = js.native
  var instanceGuid: String = js.native
  val microflows: IList[MsdMicroflow] = js.native
  @JSName("model")
  var model_MsdMetadata: IModel = js.native
  var name: String = js.native
  var publishDateTime: String = js.native
  var serviceGuid: String = js.native
  val supportedProtocols: IList[String] = js.native
  var version: Double = js.native
  var versionGuid: String = js.native
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

