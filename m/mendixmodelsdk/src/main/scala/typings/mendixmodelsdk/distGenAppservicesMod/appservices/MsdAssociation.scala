package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.DataAssociation
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation")
@js.native
class MsdAssociation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var associationKind: String = js.native
  var associationOwner: String = js.native
  var associationType: String = js.native
  var childDeleteBehavior: String = js.native
  var childEntityName: String = js.native
  var childX: Double = js.native
  var childY: Double = js.native
  val containerAsDataAssociation: DataAssociation = js.native
  val containerAsMsdDomainModel: MsdDomainModel = js.native
  var guid: String = js.native
  @JSName("model")
  var model_MsdAssociation: IModel = js.native
  var name: String = js.native
  var parentDeleteBehavior: String = js.native
  var parentEntityName: String = js.native
  var parentX: Double = js.native
  var parentY: Double = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAssociation")
@js.native
object MsdAssociation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdAssociation = js.native
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * The new MsdAssociation will be automatically stored in the 'associationByContract' property
    * of the parent webservices.DataAssociation element passed as argument.
    */
  def createInDataAssociationUnderAssociationByContract(container: DataAssociation): MsdAssociation = js.native
  /**
    * Creates and returns a new MsdAssociation instance in the SDK and on the server.
    * The new MsdAssociation will be automatically stored in the 'associations' property
    * of the parent MsdDomainModel element passed as argument.
    */
  def createInMsdDomainModelUnderAssociations(container: MsdDomainModel): MsdAssociation = js.native
}

