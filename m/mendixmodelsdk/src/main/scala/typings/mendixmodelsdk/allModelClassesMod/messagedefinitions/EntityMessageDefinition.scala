package typings.mendixmodelsdk.allModelClassesMod.messagedefinitions

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.messagedefinitionsMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition")
@js.native
class EntityMessageDefinition protected ()
  extends typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition")
@js.native
object EntityMessageDefinition extends js.Object {
  
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition = js.native
  
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
    * of the parent MessageDefinitionCollection element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createIn(
    container: typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.MessageDefinitionCollection
  ): typings.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
