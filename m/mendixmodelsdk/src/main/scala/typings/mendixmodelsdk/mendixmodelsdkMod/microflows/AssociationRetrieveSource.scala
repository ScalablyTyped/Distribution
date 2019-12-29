package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource")
@js.native
class AssociationRetrieveSource protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.AssociationRetrieveSource {
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
@JSImport("mendixmodelsdk", "microflows.AssociationRetrieveSource")
@js.native
object AssociationRetrieveSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.AssociationRetrieveSource = js.native
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * The new AssociationRetrieveSource will be automatically stored in the 'retrieveSource' property
    * of the parent RetrieveAction element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RetrieveAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.AssociationRetrieveSource = js.native
}

