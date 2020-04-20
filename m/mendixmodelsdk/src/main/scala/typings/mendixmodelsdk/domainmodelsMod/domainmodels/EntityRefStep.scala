package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRefStep")
@js.native
class EntityRefStep protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityRefStep: IModel = js.native
  def association: IAssociationBase = js.native
  def association(newValue: IAssociationBase): js.Any = js.native
  def associationQualifiedName: String = js.native
  def containerAsIndirectEntityRef: IndirectEntityRef = js.native
  def destinationEntity: IEntity = js.native
  def destinationEntity(newValue: IEntity): js.Any = js.native
  def destinationEntityQualifiedName: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRefStep")
@js.native
object EntityRefStep extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityRefStep instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityRefStep = js.native
  /**
    * Creates and returns a new EntityRefStep instance in the SDK and on the server.
    * The new EntityRefStep will be automatically stored in the 'steps' property
    * of the parent IndirectEntityRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createIn(container: IndirectEntityRef): EntityRefStep = js.native
}

