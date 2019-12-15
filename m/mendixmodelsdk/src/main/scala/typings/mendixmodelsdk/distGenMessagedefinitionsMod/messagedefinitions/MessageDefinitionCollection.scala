package typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.IMessageDefinitionCollection because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined messageDefinitions */ @JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
@js.native
class MessageDefinitionCollection protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("messageDefinitions")
  val messageDefinitions_FMessageDefinitionCollection: IList[IMessageDefinition] = js.native
  @JSName("model")
  var model_FMessageDefinitionCollection: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMessageDefinitionCollection(): FolderBase = js.native
  def messageDefinitions(): IList[MessageDefinition] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/messagedefinitions", "messagedefinitions.MessageDefinitionCollection")
@js.native
object MessageDefinitionCollection extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): MessageDefinitionCollection = js.native
}

