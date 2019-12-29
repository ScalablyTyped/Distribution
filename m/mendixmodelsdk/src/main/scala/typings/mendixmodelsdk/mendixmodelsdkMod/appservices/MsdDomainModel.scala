package typings.mendixmodelsdk.mendixmodelsdkMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdDomainModel")
@js.native
class MsdDomainModel protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices.MsdDomainModel {
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
@JSImport("mendixmodelsdk", "appservices.MsdDomainModel")
@js.native
object MsdDomainModel extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdDomainModel = js.native
  /**
    * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
    * The new MsdDomainModel will be automatically stored in the 'domainModel' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenAppservicesMod.appservices.Msd): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdDomainModel = js.native
}

