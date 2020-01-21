package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.appservicesMod.appservices.MsdAssociation
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAssociation")
@js.native
class DataAssociation protected () extends DataEntityBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataAssociation: IModel = js.native
  def association(): js.Any = js.native
  def association(newValue: IAssociationBase): js.Any = js.native
  def associationByContract(): js.Any = js.native
  def associationByContract(newValue: MsdAssociation): js.Any = js.native
  @JSName("associationByContract")
  def associationByContract_Union(): MsdAssociation | Null = js.native
  def associationQualifiedName(): String | Null = js.native
  @JSName("association")
  def association_Union(): IAssociationBase | Null = js.native
  /**
    * In version 8.5.0: introduced
    */
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def exposedAssociationName(): String = js.native
  def exposedAssociationName(newValue: String): js.Any = js.native
  /**
    * In version 8.5.0: introduced
    */
  def summary(): String = js.native
  def summary(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAssociation")
@js.native
object DataAssociation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataAssociation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataAssociation = js.native
  /**
    * Creates and returns a new DataAssociation instance in the SDK and on the server.
    * The new DataAssociation will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  def createIn(container: DataEntityBase): DataAssociation = js.native
}

