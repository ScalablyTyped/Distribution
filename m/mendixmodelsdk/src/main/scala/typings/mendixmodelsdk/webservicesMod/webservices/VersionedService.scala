package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.appservicesMod.appservices.MsdEnumerationContainer
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
@js.native
class VersionedService protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FVersionedService: IModel = js.native
  def appServiceState(): AppServiceState = js.native
  def appServiceState(newValue: AppServiceState): js.Any = js.native
  def caption(): String = js.native
  def caption(newValue: String): js.Any = js.native
  def containerAsPublishedServiceBase(): PublishedServiceBase = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def documentation(): String = js.native
  def documentation(newValue: String): js.Any = js.native
  def enumerationsByContract(): js.Any = js.native
  def enumerationsByContract(newValue: MsdEnumerationContainer): js.Any = js.native
  @JSName("enumerationsByContract")
  def enumerationsByContract_Union(): MsdEnumerationContainer | Null = js.native
  def headerAuthentication(): HeaderAuthentication = js.native
  def headerAuthentication(newValue: HeaderAuthentication): js.Any = js.native
  def headerImportMapping(): js.Any = js.native
  def headerImportMapping(newValue: IImportMapping): js.Any = js.native
  def headerImportMappingQualifiedName(): String | Null = js.native
  @JSName("headerImportMapping")
  def headerImportMapping_Union(): IImportMapping | Null = js.native
  def headerMicroflow(): js.Any = js.native
  def headerMicroflow(newValue: IMicroflow): js.Any = js.native
  def headerMicroflowQualifiedName(): String | Null = js.native
  @JSName("headerMicroflow")
  def headerMicroflow_Union(): IMicroflow | Null = js.native
  def image(): js.Any = js.native
  def image(newValue: IImage): js.Any = js.native
  def imageQualifiedName(): String | Null = js.native
  @JSName("image")
  def image_Union(): IImage | Null = js.native
  def isLockedByContract(): Boolean = js.native
  def isLockedByContract(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def objectHandlingBackup(): ObjectHandlingBackupEnum = js.native
  def objectHandlingBackup(newValue: ObjectHandlingBackupEnum): js.Any = js.native
  def operations(): IList[PublishedOperation] = js.native
  /**
    * In version 7.13.0: introduced
    */
  def optimizedXml(): Boolean = js.native
  def optimizedXml(newValue: Boolean): js.Any = js.native
  def targetNamespace(): String = js.native
  def targetNamespace(newValue: String): js.Any = js.native
  def validate(): Boolean = js.native
  def validate(newValue: Boolean): js.Any = js.native
  def versionNumber(): Double = js.native
  def versionNumber(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.VersionedService")
@js.native
object VersionedService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): VersionedService = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * The new VersionedService will be automatically stored in the 'versionedServices' property
    * of the parent PublishedServiceBase element passed as argument.
    */
  def createIn(container: PublishedServiceBase): VersionedService = js.native
}

