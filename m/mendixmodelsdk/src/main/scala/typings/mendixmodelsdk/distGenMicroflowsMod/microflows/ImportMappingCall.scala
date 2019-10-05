package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ImportMappingCall")
@js.native
class ImportMappingCall protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 7.18.0: introduced
    */
  var commit: CommitEnum = js.native
  val containerAsResultHandling: ResultHandling = js.native
  /**
    * In version 7.6.0: introduced
    */
  var contentType: ContentType = js.native
  /**
    * In version 7.8.0: introduced
    */
  var forceSingleOccurrence: Boolean = js.native
  var mapping: IImportMapping | Null = js.native
  var mappingArgumentVariableName: String = js.native
  val mappingQualifiedName: String | Null = js.native
  @JSName("model")
  var model_ImportMappingCall: IModel = js.native
  /**
    * In version 7.17.0: introduced
    */
  var objectHandlingBackup: ObjectHandlingBackupEnum = js.native
  var range: Range = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ImportMappingCall")
@js.native
object ImportMappingCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ImportMappingCall = js.native
  /**
    * Creates and returns a new ImportMappingCall instance in the SDK and on the server.
    * The new ImportMappingCall will be automatically stored in the 'importMappingCall' property
    * of the parent ResultHandling element passed as argument.
    */
  def createIn(container: ResultHandling): ImportMappingCall = js.native
}

