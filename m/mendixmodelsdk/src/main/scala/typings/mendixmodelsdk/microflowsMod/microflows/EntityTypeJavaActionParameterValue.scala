package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.8.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.EntityTypeJavaActionParameterValue")
@js.native
class EntityTypeJavaActionParameterValue protected () extends JavaActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityTypeJavaActionParameterValue: IModel = js.native
  def entity(): js.Any = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName: String | Null = js.native
  @JSName("entity")
  def entity_Union: IEntity | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.EntityTypeJavaActionParameterValue")
@js.native
object EntityTypeJavaActionParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityTypeJavaActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityTypeJavaActionParameterValue = js.native
  /**
    * Creates and returns a new EntityTypeJavaActionParameterValue instance in the SDK and on the server.
    * The new EntityTypeJavaActionParameterValue will be automatically stored in the 'value' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.8.0 to 7.20.0
    */
  def createIn(container: JavaActionParameterMapping): EntityTypeJavaActionParameterValue = js.native
}

