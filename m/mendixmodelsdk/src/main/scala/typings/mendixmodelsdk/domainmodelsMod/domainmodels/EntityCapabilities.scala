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
  * In version 8.12.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntityCapabilities because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEntity */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityCapabilities")
@js.native
class EntityCapabilities protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsEntity")
  val containerAsEntity_FEntityCapabilities: IEntity = js.native
  @JSName("model")
  var model_FEntityCapabilities: IModel = js.native
  def containerAsEntity: Entity = js.native
  def countable: Boolean = js.native
  def countable_=(newValue: Boolean): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityCapabilities")
@js.native
object EntityCapabilities extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityCapabilities instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityCapabilities = js.native
  /**
    * Creates and returns a new EntityCapabilities instance in the SDK and on the server.
    * The new EntityCapabilities will be automatically stored in the 'capabilities' property
    * of the parent Entity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  def createIn(container: Entity): EntityCapabilities = js.native
}

