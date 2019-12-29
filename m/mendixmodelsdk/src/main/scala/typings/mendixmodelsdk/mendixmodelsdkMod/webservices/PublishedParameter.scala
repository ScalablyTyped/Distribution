package typings.mendixmodelsdk.mendixmodelsdkMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.PublishedParameter")
@js.native
class PublishedParameter protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.PublishedParameter {
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
@JSImport("mendixmodelsdk", "webservices.PublishedParameter")
@js.native
object PublishedParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter = js.native
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * The new PublishedParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedOperation element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedOperation): typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter = js.native
}

