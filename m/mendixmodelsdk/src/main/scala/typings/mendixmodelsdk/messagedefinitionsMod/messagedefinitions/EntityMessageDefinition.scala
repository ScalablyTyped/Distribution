package typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IMessageDefinition because Already inherited
- typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.IEntityMessageDefinition because var conflicts: containerAsMessageDefinitionCollection, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
@js.native
class EntityMessageDefinition protected () extends MessageDefinition {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityMessageDefinition: IModel = js.native
  @JSName("containerAsMessageDefinitionCollection")
  def containerAsMessageDefinitionCollection_MEntityMessageDefinition: MessageDefinitionCollection = js.native
  def exposedEntity: ExposedEntity | Null = js.native
  def exposedEntity_=(newValue: ExposedEntity | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.EntityMessageDefinition")
@js.native
object EntityMessageDefinition extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityMessageDefinition = js.native
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
    * of the parent MessageDefinitionCollection element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createIn(container: MessageDefinitionCollection): EntityMessageDefinition = js.native
}

