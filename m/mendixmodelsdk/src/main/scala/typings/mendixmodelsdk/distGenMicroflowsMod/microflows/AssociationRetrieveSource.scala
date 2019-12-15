package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AssociationRetrieveSource")
@js.native
class AssociationRetrieveSource protected () extends RetrieveSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAssociationRetrieveSource: IModel = js.native
  def association(): IAssociationBase | Null = js.native
  def association(newValue: IAssociationBase): js.Any = js.native
  def associationQualifiedName(): String | Null = js.native
  @JSName("association")
  def association_Any(): js.Any = js.native
  def startVariableName(): String = js.native
  def startVariableName(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AssociationRetrieveSource")
@js.native
object AssociationRetrieveSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AssociationRetrieveSource = js.native
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * The new AssociationRetrieveSource will be automatically stored in the 'retrieveSource' property
    * of the parent RetrieveAction element passed as argument.
    */
  def createIn(container: RetrieveAction): AssociationRetrieveSource = js.native
}

