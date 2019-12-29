package typings.mendixmodelsdk.mendixmodelsdkMod.messagedefinitions

import typings.mendixmodelsdk.distGenMessagedefinitionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
@js.native
class MessageDefinitionCollection protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.messagedefinitions.MessageDefinitionCollection {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
@js.native
object MessageDefinitionCollection extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.MessageDefinitionCollection = js.native
}

