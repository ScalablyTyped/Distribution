package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.Msd
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.WsdlDescription")
@js.native
class WsdlDescription protected ()
  extends typings.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.WsdlDescription")
@js.native
object WsdlDescription extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription = js.native
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    */
  def createInImportedWebServiceUnderWsdlDescription(container: typings.mendixmodelsdk.distGenWebservicesMod.webservices.ImportedWebService): typings.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription = js.native
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent appservices.Msd element passed as argument.
    */
  def createInMsdUnderWsdlDescription(container: Msd): typings.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription = js.native
}

