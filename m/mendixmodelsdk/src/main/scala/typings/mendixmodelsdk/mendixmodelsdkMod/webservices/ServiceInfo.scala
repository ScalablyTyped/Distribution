package typings.mendixmodelsdk.mendixmodelsdkMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.ServiceInfo")
@js.native
class ServiceInfo protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.ServiceInfo {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "webservices.ServiceInfo")
@js.native
object ServiceInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservices.ServiceInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * The new ServiceInfo will be automatically stored in the 'services' property
    * of the parent WsdlDescription element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservices.WsdlDescription): typings.mendixmodelsdk.distGenWebservicesMod.webservices.ServiceInfo = js.native
}

