package typings.mendixmodelsdk.mendixmodelsdkMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.VersionedService
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer")
@js.native
class MsdEnumerationContainer protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices.MsdEnumerationContainer {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "appservices.MsdEnumerationContainer")
@js.native
object MsdEnumerationContainer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumerationContainer = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * The new MsdEnumerationContainer will be automatically stored in the 'enumerations' property
    * of the parent Msd element passed as argument.
    */
  def createInMsdUnderEnumerations(container: typings.mendixmodelsdk.distGenAppservicesMod.appservices.Msd): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumerationContainer = js.native
  /**
    * Creates and returns a new MsdEnumerationContainer instance in the SDK and on the server.
    * The new MsdEnumerationContainer will be automatically stored in the 'enumerationsByContract' property
    * of the parent webservices.VersionedService element passed as argument.
    */
  def createInVersionedServiceUnderEnumerationsByContract(container: VersionedService): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdEnumerationContainer = js.native
}

