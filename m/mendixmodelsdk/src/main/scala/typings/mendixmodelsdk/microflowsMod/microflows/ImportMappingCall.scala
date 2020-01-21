package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
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
  @JSName("model")
  var model_FImportMappingCall: IModel = js.native
  /**
    * In version 7.18.0: introduced
    */
  def commit(): CommitEnum = js.native
  def commit(newValue: CommitEnum): js.Any = js.native
  def containerAsResultHandling(): ResultHandling = js.native
  /**
    * In version 7.6.0: introduced
    */
  def contentType(): ContentType = js.native
  def contentType(newValue: ContentType): js.Any = js.native
  /**
    * In version 7.8.0: introduced
    */
  def forceSingleOccurrence(): Boolean = js.native
  def forceSingleOccurrence(newValue: Boolean): js.Any = js.native
  def mapping(): js.Any = js.native
  def mapping(newValue: IImportMapping): js.Any = js.native
  def mappingArgumentVariableName(): String = js.native
  def mappingArgumentVariableName(newValue: String): js.Any = js.native
  def mappingQualifiedName(): String | Null = js.native
  @JSName("mapping")
  def mapping_Union(): IImportMapping | Null = js.native
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackup(): ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup(newValue: ObjectHandlingBackupEnum): js.Any = js.native
  def range(): Range = js.native
  def range(newValue: Range): js.Any = js.native
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

