package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.VersionedService
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer")
@js.native
class MsdEnumerationContainer protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsdEnumerationContainer: IModel = js.native
  def containerAsMsd(): Msd = js.native
  def containerAsVersionedService(): VersionedService = js.native
  def enumerations(): IList[MsdEnumeration] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationContainer")
@js.native
object MsdEnumerationContainer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdEnumerationContainer = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
    * of the parent Msd element passed as argument.
    */
  def createInMsdUnderEnumerations(container: Msd): MsdEnumerationContainer = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
    * of the parent webservices.VersionedService element passed as argument.
    */
  def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): MsdEnumerationContainer = js.native
}

