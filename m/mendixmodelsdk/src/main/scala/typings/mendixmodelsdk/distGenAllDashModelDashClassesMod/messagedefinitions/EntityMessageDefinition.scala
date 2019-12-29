package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition")
@js.native
class EntityMessageDefinition protected ()
  extends typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "messagedefinitions.EntityMessageDefinition")
@js.native
object EntityMessageDefinition extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition = js.native
  /**
    * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
    * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
    * of the parent MessageDefinitionCollection element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createIn(
    container: typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.MessageDefinitionCollection
  ): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition = js.native
}

